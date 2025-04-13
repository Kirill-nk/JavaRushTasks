-- Write your code here:
select *
from parts
where description is not null
   or identifier is null