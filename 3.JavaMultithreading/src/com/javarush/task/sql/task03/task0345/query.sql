-- Write your code here:
select *
from film_directors
left join (select director_id, films.grossed from films where grossed > 100) film
on film_directors.id = film.director_id
where film_directors.country = 'UK'