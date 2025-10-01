use abiturient;

select program.name_program, count(program.name_program)
from program
join program_subject on program_subject.program_id = program.program_id
join subject on subject.subject_id = program_subject.subject_id
where subject.name_subject IN ('Информатика','Математика')
group by program.name_program
HAVING COUNT(subject.name_subject) = 2
order by program.name_program
;

-- 1. Выбираем программы Математика и информатика:
with t as(
    select program.name_program, subject.name_subject
    from program
    join program_subject on program_subject.program_id = program.program_id
    join subject on subject.subject_id = program_subject.subject_id
    where name_subject in ('Математика','Информатика')
)
-- Группируем, считаем 2 и сортируем:
select name_program-- , count(name_program)
from t
group by name_program
having count(name_program) = 2
order by name_program;

-- Решение Exists
select program.name_program
from program
where exists(
    select 1
    from program_subject
    join subject on program_subject.subject_id = subject.subject_id
    where program_subject.program_id = program.program_id
      and subject.name_subject in ('Информатика','Математика')
)
/*
  and exists(
    select 1
    from program_subject
    join subject on program_subject.subject_id = subject.subject_id
    where program.program_id = program_subject.program_id
    and subject.name_subject = 'Математика'
) */
order by program.name_program;
