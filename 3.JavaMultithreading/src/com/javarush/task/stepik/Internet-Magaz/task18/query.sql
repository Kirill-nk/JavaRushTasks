use internet_magaz;

select * from buy_step
where buy_id = 5;

update buy_step
set date_step_end = '2020-04-13'
where buy_id = 5
and step_id = (select step_id from step where name_step = 'Оплата')
and date_step_end is null;

update buy_step
set date_step_beg = '2020-04-13'
where buy_id = 5
and step_id = (select step_id from step where name_step = 'Упаковка')
and date_step_beg is null;

