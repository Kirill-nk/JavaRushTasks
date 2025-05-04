-- Write your code here:
select prod_year, count(prod_year) cnt
from cars
group by  cars.prod_year