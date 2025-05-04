-- Write your code here:
-- Ifnull не работает, как написано в описании.
select *,
case when ifnull(cars.euro, 6) > 5 then 'best'
when cars.euro = 5 then 'good'
else 'bad' end  as estimation
from cars