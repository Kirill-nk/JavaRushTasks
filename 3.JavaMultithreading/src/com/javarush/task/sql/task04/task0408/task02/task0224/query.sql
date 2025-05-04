-- Write your code here:
select department, count(department) cnt
from employee
where position = 'backend developer'
group by department
