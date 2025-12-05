-- Write your code here:
select date_time, YEAR(date_time) y, MONTH(date_time) m, DAY(date_time) d, count(*) cnt
from event
group by YEAR(date_time), MONTH(date_time), DAY(date_time), date_time
having cnt > 5
