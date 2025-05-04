-- Write your code here:
select department, position, count(*) total
from employee
group by department, position
having total > 1 and position = 'frontend developer'
limit 1