-- Write your code here:
select name, count(name) cnt
from cars
where prod_year = 2021
group by name