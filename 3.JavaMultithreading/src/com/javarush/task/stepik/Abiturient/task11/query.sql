use abiturient;
DROP TABLE applicant;
CREATE TABLE applicant AS
select program.program_id
     , enrollee.enrollee_id
     , sum(enrollee_subject.result) as itog

from enrollee join program_enrollee on program_enrollee.enrollee_id = enrollee.enrollee_id
              join program on program_enrollee.program_id=program.program_id
              join program_subject on program.program_id = program_subject.program_id
              join subject on subject.subject_id = program_subject.subject_id
              join enrollee_subject on subject.subject_id = enrollee_subject.subject_id
    and enrollee_subject.enrollee_id = enrollee.enrollee_id
group by program.program_id,enrollee.enrollee_id
ORDER BY
    program.program_id,
    itog DESC;
select * from applicant;
select * from enrollee_subject;