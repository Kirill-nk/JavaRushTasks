-- Write your code here:
select *,
       CASE is_full_time
when 1 then 'true'
when 0 then 'false'
else 'unknown' end
from students