-- Write your code here:
select name, prod_year,count(prod_year) as cnt
from cars
where name = 'Blue Car'
group by name, prod_year