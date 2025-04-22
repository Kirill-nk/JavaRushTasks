-- Write your code here:
select gym.location, person.location
from gyms gym, customers person
where person.location not in ('London')
group by gym.location, person.location