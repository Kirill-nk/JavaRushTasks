-- Write your code here:

select * from daily_trx;
select * from merchant_info;
select * from cred_potential;

select client_dk, sum(Trx_amt) qty_sum, cp.Crd_potential
from daily_trx
join cred_potential cp on daily_trx.client_dk = cp.client_dk
group by client_dk;

with t1 as (select daily_trx.client_dk
                 ,cred_potential.Crd_potential
                 ,sum(Trx_amt) as sumtrx
            #      ,daily_trx.Trx_dt
#      ,daily_trx.Trx_amt
#      ,merchant_info.Mcc_name
            from daily_trx
                     join merchant_info on daily_trx.Merch_id = merchant_info.Merch_id
                     join cred_potential on daily_trx.client_dk = cred_potential.client_dk
            where 1 = 1
              and Trx_type = 'C'
              and Trx_dt between '2019-01-01' and '2019-06-30'
            group by daily_trx.client_dk)
select *
from t1;

with cumsum as (select client_dk
                     ,trx_dt
                     ,sum(trx_amt)
                           over (partition by client_dk order by trx_dt rows between unbounded preceding and current row) as cumulative_sum
                     ,min(trx_dt) over (partition by client_dk)                                                          as min_dt
                from daily_trx
                where 1 = 1
                  and trx_type = 'C'
                  and trx_dt between '2019-01-01' and '2019-06-30'),

     first_value as (select cum.client_dk
                          ,min(cum.trx_dt - cum.min_dt) as days_target
                     from cumsum as cum
                              join cred_potential as cp
                                   on cum.client_dk = cp.client_dk
                     where 1 = 1
                       and cum.cumulative_sum >= cp.crd_potential
                     group by cum.client_dk)
select cp.client_dk
     , coalesce(fdt.days_target, 200) AS result_days
from first_value as fdt

         right join cred_potential as cp
                    on fdt.client_dk = cp.client_dk;

-- Решение Deepseek  от 24.07.2025г
/* 1 По каждому клиенту найти кол-во дней (с начала 2019г. до конца июня 2019г.),
   которое ему потребовалось, чтобы совершить транзакций (расходных операций)
   на сумму не меньшую, чем его кредитный потенциал.
   Если он так и не потратил его, то вывести по клиенту значение = 200 */

WITH client_spending AS (
    SELECT
        d.client_dk,
        c.Crd_potential,
        d.Trx_dt,
        SUM(d.Trx_amt) OVER (PARTITION BY d.client_dk ORDER BY d.Trx_dt) AS running_total
    FROM daily_trx d
             JOIN cred_potential c ON d.client_dk = c.client_dk
    WHERE d.Trx_type = 'C'
      AND d.Trx_dt BETWEEN DATE '2019-01-01' AND DATE '2019-06-30'
)

SELECT
    cp.client_dk,
    cp.Crd_potential
/*    COALESCE(
            (SELECT MIN(DATE_PART('day', cs.Trx_dt - DATE '2019-01-01') + 1)
             FROM client_spending cs
             WHERE cs.client_dk = cp.client_dk
               AND cs.running_total >= cp.Crd_potential),
            200
    ) AS days_to_reach_potential */
FROM cred_potential cp
ORDER BY cp.client_dk;