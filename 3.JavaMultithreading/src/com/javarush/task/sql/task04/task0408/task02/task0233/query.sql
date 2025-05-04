-- Write your code here:
select year(date_of_birth) year, count(year(date_of_birth)) cnt_year
from employee
group by year(date_of_birth)