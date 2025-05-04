-- Write your code here:
select
case when cars.euro > 5 then 'best'
when cars.euro = 5 then 'good'
else 'bad' end  as 'class'
from cars
where prod_year > 2020
order by price
limit 5;


select * from cars