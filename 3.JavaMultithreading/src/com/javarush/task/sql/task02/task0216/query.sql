-- Write your code here:
select case position
           when 'backend developer' then 'yes'
           when 'frontend developer' then 'yes'
           else 'no'
           end as 'post'
from employee
where employee.department = 'cool devs'