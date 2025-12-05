use abiturient;

select program.name_program
from program
join program_subject on program.program_id = program_subject.program_id
group by program.name_program
having min(program_subject.min_result) >=40;