-- Write your code here:
select YEAR(prod_date) prod_year, MONTH(prod_date) prod_month, count(*)
from cars
group by prod_year, prod_month