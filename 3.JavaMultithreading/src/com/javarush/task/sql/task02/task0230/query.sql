-- Write your code here:
select department department_name, count(department) count
from employee
where position = 'frontend developer'
group by department