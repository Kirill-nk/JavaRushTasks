-- Write your code here:
select released, count(*)
from lego_set
group by released ;

select *
from lego_set