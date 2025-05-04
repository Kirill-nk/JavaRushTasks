-- Write your code here:
select if(year(date_of_birth) < 2000, 'yes', 'no') experienced, MONTH(date_of_birth) month_of_birth
from employee