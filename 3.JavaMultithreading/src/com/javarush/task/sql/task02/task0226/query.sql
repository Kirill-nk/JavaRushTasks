-- Write your code here:
select name, prod_year, count(name) cnt
from cars
where prod_year = 2021
group by name