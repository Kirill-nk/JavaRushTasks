-- Write your code here:
select *, YEAR(discovery_date) yy
from object
where YEAR(discovery_date) between 2010 and 2020;