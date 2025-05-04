-- Write your code here:
with grossed_total as (select sum(grossed) total from films)
select avg(total) average_grossed from grossed_total