-- Решение задачи: По каждому клиенту найти кол-во дней (с начала 2019г. до конца июня 2019г.), 
-- которое ему потребовалось, чтобы совершить транзакций (расходных операций) на сумму не меньшую, 
-- чем его кредитный потенциал. Если он так и не потратил его, то вывести по клиенту значение = 200

-- Часть 1: Все расходные операции
WITH cumulative_spending AS (
    SELECT 
        dt.client_dk,
        dt.Trx_dt,
        dt.Trx_amt,
        cp.Crd_potential,
        SUM(dt.Trx_amt) OVER (
            PARTITION BY dt.client_dk 
            ORDER BY dt.Trx_dt 
            ROWS UNBOUNDED PRECEDING
        ) AS running_total
    FROM cred_potential.daily_trx dt
    JOIN cred_potential.cred_potential cp ON dt.client_dk = cp.client_dk
    WHERE dt.Trx_type = 'C'
      AND dt.Trx_dt BETWEEN '2019-01-01' AND '2019-06-30'
),
days_to_reach AS (
    SELECT 
        client_dk,
        Crd_potential,
        MIN(DATEDIFF(Trx_dt, '2019-01-01') + 1) AS days_needed
    FROM cumulative_spending
    WHERE running_total >= Crd_potential
    GROUP BY client_dk, Crd_potential
)
SELECT 
    cp.client_dk,
    cp.Crd_potential,
    COALESCE(dtr.days_needed, 200) AS days_to_reach_potential
FROM cred_potential.cred_potential cp
LEFT JOIN days_to_reach dtr ON cp.client_dk = dtr.client_dk
ORDER BY cp.client_dk;

-- Часть 2: Только транзакции со словом "снятие" в названии
WITH withdrawal_transactions AS (
    SELECT 
        dt.client_dk,
        dt.Trx_dt,
        dt.Trx_amt,
        cp.Crd_potential,
        SUM(dt.Trx_amt) OVER (
            PARTITION BY dt.client_dk 
            ORDER BY dt.Trx_dt 
            ROWS UNBOUNDED PRECEDING
        ) AS running_total
    FROM cred_potential.daily_trx dt
    JOIN cred_potential.merchant_info mi ON dt.Merch_id = mi.Merch_id
    JOIN cred_potential.cred_potential cp ON dt.client_dk = cp.client_dk
    WHERE dt.Trx_type = 'C'
      AND dt.Trx_dt BETWEEN '2019-01-01' AND '2019-06-30'
      AND mi.Mcc_name LIKE '%снятие%'
),
days_to_reach_withdrawal AS (
    SELECT 
        client_dk,
        Crd_potential,
        MIN(DATEDIFF(Trx_dt, '2019-01-01') + 1) AS days_needed
    FROM withdrawal_transactions
    WHERE running_total >= Crd_potential
    GROUP BY client_dk, Crd_potential
)
SELECT 
    cp.client_dk,
    cp.Crd_potential,
    COALESCE(dtr.days_needed, 200) AS days_to_reach_potential_withdrawal_only
FROM cred_potential.cred_potential cp
LEFT JOIN days_to_reach_withdrawal dtr ON cp.client_dk = dtr.client_dk
ORDER BY cp.client_dk; 