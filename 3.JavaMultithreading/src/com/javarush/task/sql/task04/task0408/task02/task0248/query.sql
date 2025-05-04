-- Write your code here:
select department, position, count(*) total
from employee
group by department, position
having total between 2 and 3