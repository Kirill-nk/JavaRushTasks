-- Write your code here:
select DAYOFYEAR(date) from event
where type = 'REGISTRATION'
group by date