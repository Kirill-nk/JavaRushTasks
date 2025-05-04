-- Write your code here:
select department department_name, count(department) count
from employee
where position = 'frontend developer' or position = 'backend developer'
group by department