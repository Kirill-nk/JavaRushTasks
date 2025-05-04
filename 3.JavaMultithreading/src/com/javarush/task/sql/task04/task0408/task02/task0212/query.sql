-- Write your code here:
select *,
--       IF(position = 'manager' and salary > 10000, 'good', IF(position != 'manager' and salary > 5000, 'good',
--                                                              IF(position = 'manager' and salary <= 10000, 'bad',
--                                                                 IF(position != 'manager' and salary <= 5000, 'bad', 'bad'))))

-- if(position = 'manager', if(salary > 10000, 'good', 'bad'), if(salary>5000, 'good', 'bad'))

IF((position='manager' AND salary > 10000) OR (position != 'manager' AND  salary > 5000), 'good', 'bad')

from employee
where city = 'London'


