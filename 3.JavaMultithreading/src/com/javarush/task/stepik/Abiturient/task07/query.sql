select department.name_department
     , program.name_program
     , program.plan
     , count(program_enrollee.enrollee_id) 'Количество'
     , round(count(program_enrollee.enrollee_id) / program.plan, 2) as 'Конкурс'
from department
join program on program.department_id = department.department_id
join program_enrollee on program.program_id = program_enrollee.program_id
group by department.name_department
       , program.name_program
       , program.plan
order by round(count(program_enrollee.enrollee_id) / program.plan, 2) desc;

select * from program_enrollee
