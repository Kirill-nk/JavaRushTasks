-- Write your code here:
select rating, group_concat(name)
from employee
where rating > 2
group by rating