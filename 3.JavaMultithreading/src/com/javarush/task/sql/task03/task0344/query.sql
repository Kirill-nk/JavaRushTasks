-- Write your code here:
select f.title
 from films f
    left join (select id, last_name
               from film_directors
               where last_name = 'Spielberg') director
        on f.director_id = director.id