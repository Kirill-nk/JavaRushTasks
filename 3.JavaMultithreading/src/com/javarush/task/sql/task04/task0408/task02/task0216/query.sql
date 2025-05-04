-- Write your code here:
select case
           when position = 'backend developer' then 'yes'
           when position = 'frontend developer' then 'yes'
           else 'no'
           end as 'post'
from employee
where employee.department = 'cool devs'