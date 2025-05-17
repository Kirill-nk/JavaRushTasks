-- Write your code here:
select released, count(*) total
from lego_set
where number < 30000 -- при условии 10000 ни одной записи а так 3
group by released
order by total desc;
