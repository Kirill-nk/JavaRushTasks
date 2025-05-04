-- Write your code here:
select name, count(name) cnt
from cars
group by name