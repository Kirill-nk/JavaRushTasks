use abiturient;

UPDATE
    applicant

SET itog = itog - (select coalesce(sum(achievement.bonus),0)
                   from enrollee_achievement
                            right join enrollee on enrollee.enrollee_id = enrollee_achievement.enrollee_id
                            left join achievement on achievement.achievement_id = enrollee_achievement.achievement_id
                   group by enrollee.name_enrollee);

select * from applicant;