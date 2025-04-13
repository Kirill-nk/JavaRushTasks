-- Write your code here:
select * from parts
where 1=1
  and identifier is null
  and id between 7 and 23
limit 2
