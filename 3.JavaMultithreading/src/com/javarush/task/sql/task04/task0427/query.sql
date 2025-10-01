-- Write your code here:
select *
from event
where DATEDIFF(CURDATE(), date_time) < 20
