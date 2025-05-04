-- Write your code here:
select *
from film_directors
right join (select director_id, title from films where year_released > 1990) film
on film_directors.id = film.director_id
where film_directors.country = 'USA'