-- Write your code here:
select g.location, person.name, person.email, person.telephone
from gyms g, customers person
where person.name = 'Hulk'