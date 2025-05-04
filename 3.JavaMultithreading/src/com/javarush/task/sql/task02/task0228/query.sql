-- Write your code here:
select department, count(department) number_of_employees
from employee
group by department