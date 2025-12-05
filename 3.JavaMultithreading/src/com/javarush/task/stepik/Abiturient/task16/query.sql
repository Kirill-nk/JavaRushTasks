use abiturient;

set @row_num := 0;
select *, (@row_num := @row_num + 1) as str_num
from applicant_order;

select * from applicant_order;

set @num_pr := 0;
set @row_num := 1;
select *,
       if(applicant_order.program_id = @num_pr, @row_num := @row_num + 1, @row_num := 1),
@num_pr := applicant_order.program_id as add_var
from applicant_order
