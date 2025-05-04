-- Write your code here:
select *
from event
where YEAR(date_time) = YEAR(CURDATE())
  AND MONTH(date_time) = MONTH(CURDATE())