-- Write your code here:
select name car_name, count(name) car_count
from cars
group by name