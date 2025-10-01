use abiturient;

select * from applicant
order by program_id asc, itog desc;

CREATE TABLE applicant_order as
    select * from applicant
order by program_id asc, itog desc;
drop table applicant;

select * from applicant_order;
