-- Write your code here:
select YEAR(date_of_birth), MONTH(date_of_birth)
from employee
where MONTH(date_of_birth) in (1,2,12)