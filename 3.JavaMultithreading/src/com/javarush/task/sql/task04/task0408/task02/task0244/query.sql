-- Write your code here:
select YEAR(prod_date) prod_year, MONTH(prod_date) prod_month, count(*)
from cars
where name = 'Black Car' and price > 99000
group by prod_year, prod_month