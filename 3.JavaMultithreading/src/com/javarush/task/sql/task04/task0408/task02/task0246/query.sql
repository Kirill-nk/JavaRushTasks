-- Write your code here:
select name, count(name) car_count
from cars
group by name
having car_count < 3