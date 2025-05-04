-- Write your code here:
with tempTale as ( select avg(year_born) averageDOB from film_directors)

select film_directors.id, film_directors.full_name, film_directors.year_born,
       tempTale.averageDOB
from film_directors, tempTale
where film_directors.year_born < tempTale.averageDOB