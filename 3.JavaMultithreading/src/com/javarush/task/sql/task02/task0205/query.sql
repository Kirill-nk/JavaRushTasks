-- Write your code here:
select id,
    IF(salary > 1000, 'yes', 'no')
from employee
where id < 5