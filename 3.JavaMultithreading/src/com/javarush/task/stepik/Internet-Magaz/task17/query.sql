use internet_magaz;

update buy_step
set date_step_beg = '2020-04-12' where buy_id = 5 and buy_step_id = 17;


select * from buy_step where buy_id = 5;
select * from buy_book;