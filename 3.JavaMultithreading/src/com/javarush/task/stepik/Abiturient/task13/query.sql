use abiturient;

UPDATE
    applicant
<<<<<<< HEAD

SET itog = itog - (select coalesce(sum(achievement.bonus),0)
=======
join
SET itog = itog - (select coalesce(sum(achievement.bonus),0) itog
>>>>>>> origin/master
                   from enrollee_achievement
                            right join enrollee on enrollee.enrollee_id = enrollee_achievement.enrollee_id
                            left join achievement on achievement.achievement_id = enrollee_achievement.achievement_id
                   group by enrollee.name_enrollee);

<<<<<<< HEAD
select * from applicant;
=======
select * from applicant;
select * from enrollee_achievement;
select * from enrollee;
select * from achievement;
select * from program;

select program.name_program, enrollee.name_enrollee, applicant.itog
from applicant
    join program on applicant.program_id = program.program_id
    join enrollee on enrollee.enrollee_id = applicant.enrollee_id
order by 2;


with t as(
select enrollee.enrollee_id, enrollee.name_enrollee, coalesce(sum(achievement.bonus),0) itogt
from enrollee_achievement
         right join enrollee on enrollee.enrollee_id = enrollee_achievement.enrollee_id
         left join achievement on achievement.achievement_id = enrollee_achievement.achievement_id
group by enrollee.enrollee_id)
UPDATE applicant
join t on t.enrollee_id = applicant.enrollee_id
SET itog = itog + itogt;

>>>>>>> origin/master
