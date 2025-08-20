-- Write your code here:
select * from event
where date_time between now() and date_sub(curdate(), interval 2 week)
