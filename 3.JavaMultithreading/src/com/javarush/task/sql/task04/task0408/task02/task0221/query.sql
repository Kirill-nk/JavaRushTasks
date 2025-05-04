-- Write your code here:
select prod_year, count(*) cnt
from cars
group by  cars.prod_year