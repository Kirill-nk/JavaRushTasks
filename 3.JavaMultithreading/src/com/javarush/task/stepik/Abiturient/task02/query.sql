use abiturient;
select program.name_program
from subject
join program_subject on subject.subject_id = program_subject.subject_id
join program on program.program_id = program_subject.program_id
where name_subject = 'Информатика'
order by program.name_program desc;
