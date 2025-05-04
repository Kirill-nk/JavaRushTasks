-- Write your code here:
with tempTable as (select avg(grossed) averageGrossed from films),
tempTable2 as (select avg(year_released) averageYearReleased from films)

select title, genre, year_released, grossed from films, tempTable, tempTable2
where films.grossed > tempTable.averageGrossed
and films.year_released > tempTable2.averageYearReleased
group by films.year_released, title, genre, grossed
