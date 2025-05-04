-- Write your code here:
select if(cars.euro is null, 'good', 'bad')
from cars;

select
   case when cars.euro is null then 'good'
else 'bad' end
from cars;
