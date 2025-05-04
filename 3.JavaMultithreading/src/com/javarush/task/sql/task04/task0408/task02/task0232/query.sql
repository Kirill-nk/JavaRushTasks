-- Write your code here:
select is_full_time, count(is_full_time)
from students
group by is_full_time;
