USE internet_magaz;
with t as (
select buy_id, client_id, book_id, date_payment, amount, price
from buy_archive
UNION ALL
select buy.buy_id
     , buy.client_id
     , book.book_id
     , buy_step.date_step_end
     , buy_book.amount
     , book.price
from buy_book
         join book on book.book_id = buy_book.book_id
         join buy on buy.buy_id = buy_book.buy_id
         join buy_step on buy_step.buy_id = buy.buy_id
         join step on step.step_id = buy_step.step_id
where buy_step.date_step_end is not null
   and step.name_step = 'Оплата'
order by client_id),
t1 as (
select year(date_payment) Год,
       monthname(date_payment) as Месяц,
       amount * price as asw
from t)
-- group by client_id, year(date_payment), monthname(date_payment))

select Год, Месяц, sum(asw) Сумма
from t1
group by Год, Месяц;
