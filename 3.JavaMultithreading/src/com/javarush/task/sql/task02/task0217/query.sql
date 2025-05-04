-- Write your code here:
select *,
case when cars.euro > 5 then 'best'
when cars.euro = 5 then 'good'
else 'bad' end  as 'class'
from cars;

select * from cars