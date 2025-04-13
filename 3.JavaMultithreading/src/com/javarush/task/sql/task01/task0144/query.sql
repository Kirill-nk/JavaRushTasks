-- Write your code here:
select description from parts
order by required desc, identifier desc, description desc
limit 10
offset 23 -- по заданию 23, но их всего 18, поэтому оставил 13