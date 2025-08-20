use abiturient;
select subject.name_subject, count(enrollee_subject.subject_id) "Количество"
    , max(enrollee_subject.result) "Максимум"
    , min(enrollee_subject.result) "Минимум"
    , round(avg(enrollee_subject.result),1) "Среднее"
    from subject
    join enrollee_subject on subject.subject_id = enrollee_subject.subject_id
group by subject.name_subject
order by subject.name_subject asc