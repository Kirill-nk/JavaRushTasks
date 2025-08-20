use testing1;

START TRANSACTION;
delete from attempt where date_attempt < '2020-05-01';
commit;

select * from attempt