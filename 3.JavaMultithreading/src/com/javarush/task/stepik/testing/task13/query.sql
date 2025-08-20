use testing1;

select * from testing
join attempt on attempt.attempt_id = testing.attempt_id
where attempt.attempt_id = 8;

select * from attempt;
select * from testing;
select * from answer;

UPDATE attempt SET result =
(select (ROUND(sum(is_correct/3*100), 0))
from testing join answer on answer.answer_id = testing.answer_id
where testing.attempt_id = attempt.attempt_id)
where attempt.attempt_id = 8;