-- Write your code here:
select *, DATEDIFF(CURDATE(), date_time) diff
from event
where DATEDIFF(CURDATE(), date_time) < 20
