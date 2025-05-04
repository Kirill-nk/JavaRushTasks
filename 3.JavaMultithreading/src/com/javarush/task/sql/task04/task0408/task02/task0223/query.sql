-- Write your code here:
select employee.department, count(department)
from employee
group by department