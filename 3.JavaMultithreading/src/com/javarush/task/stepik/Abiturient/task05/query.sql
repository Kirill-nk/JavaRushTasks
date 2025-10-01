use abiturient;

select name_program, plan
from program
where plan = (select max(plan) from program);