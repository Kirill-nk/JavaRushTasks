-- Write your code here:
select concat(number, ', ', name) full_name
from lego_set
order by char_length(name) asc