
-- 1 По каждому клиенту найти кол-во дней (с начала 2019г. до конца июня 2019г.),
-- которое ему потребовалось, чтобы совершить транзакций (расходных операций) на сумму не меньшую,
-- чем его кредитный потенциал. Если он так и не потратил его, то вывести по клиенту значение = 200

with t0 as (
  select Trx_id
  ,min(Trx_dt) mindt
  ,max(Trx_dt) maxdt
  from daily_trx
group by Trx_id
),

t1 as (select client_dk
               ,sum(trx_amt) as sum_amt
            from daily_trx
            where Trx_dt between '2019-01-01' and '2019-06-30'
            and Trx_type = 'C'
            group by client_dk),
t2 as(
    select a1.client_dk
    ,a1.sum_amt
    ,pot.crd_potential
    from t1 as a1
    join cred_potential as pot on a1.client_dk = pot.client_dk
),
t3 as (
    select client_dk
    ,case when sum_amt <= Crd_potential then sum_amt
        else 200 end as cnt_dt
    from t2
)
select * from t3;

select client_dk
     ,sum(trx_amt) as sum_amt
    -- ,first_value() over (partition by client_dk)
from daily_trx
where Trx_dt between '2019-01-01' and '2019-06-30'
  and Trx_type = 'C'
group by client_dk ;

-- 2.Все то же самое, но теперь учитывать только транзакции в подгруппах mcc кодов, в названиях которых содержится слово «снятие»
with t1 as (select dt.client_dk
                 ,sum(trx_amt) as sum_amt
                 ,count(Trx_dt) as cnt
            from daily_trx dt
            join cred_potential.merchant_info mi on dt.Merch_id = mi.Merch_id
            where Trx_dt between '2019-01-01' and '2019-06-30'
            and Trx_type = 'C'
            and mi.Mcc_name like '%снятие%'
            group by client_dk),

t2 as(
    select a1.client_dk
    ,a1.sum_amt
    ,a1.cnt
    ,pot.crd_potential
    from t1 as a1
    join cred_potential as pot on a1.client_dk = pot.client_dk
),
t3 as (
    select client_dk
    ,case when sum_amt <= Crd_potential then cnt
        else 200 end as cnt_dt
    from t2
)
select * from t3

-- 3. Бизнес-кейс Заказчик просит выделить в клиентской базе Банка клиентов, которых можно привлечь в экосистему Банка (Самокат, Сбермаркет). Определить признаки, которые помогут найти «склонных» клиентов.
/*
1. Выбрать пользователей, которые оплачивают товары онлайн, но не пользуются Самокатом, Сбермаркетом, категория товаров Продукты, Техника, и пр.
2. Выбрать клиентов, которые совершают переводы другим лицам, но не пользуются Самокатом, Сбермаркетом от суммы например 2000 рублей. Умеют пользоваться приложениями, легко разобраться.
3. Выбрать клиентов, которые пользуются биометрией, но не пользуются Самокатом, Сбермаркетом. Человек любит новое - целевая аудитория.
4. Клиенты получающие ЗП в Банке. Повышенное доверие.
5. Клиенты проживающие в городах присутствия доставок,
6. Клиенты по поло-возрастной группе, уровню дохода.
7. Наличие семьи, детей.
 */