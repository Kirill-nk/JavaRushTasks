-- Write your code here:
select prod_year,count(prod_year) as cnt
from cars
where name = 'Blue Car'
group by prod_year