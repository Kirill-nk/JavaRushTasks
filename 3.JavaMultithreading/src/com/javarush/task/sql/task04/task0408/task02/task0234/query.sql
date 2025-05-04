-- Write your code here:
select year(date_of_birth) year, count(*) year_of_birth
from employee
group by year(date_of_birth)