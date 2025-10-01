use abiturient;
select enrollee.name_enrollee
from enrollee
join program_enrollee on program_enrollee.enrollee_id = enrollee.enrollee_id
join program on program.program_id = program_enrollee.program_id
where program.name_program = 'Мехатроника и робототехника'
order by enrollee.name_enrollee;