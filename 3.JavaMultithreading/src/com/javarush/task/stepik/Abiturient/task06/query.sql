use abiturient;

select enrollee.name_enrollee, coalesce(sum(achievement.bonus),0) Бонус
from enrollee_achievement
    right join enrollee on enrollee.enrollee_id = enrollee_achievement.enrollee_id
    left join achievement on achievement.achievement_id = enrollee_achievement.achievement_id
group by enrollee.name_enrollee
order by enrollee.name_enrollee

