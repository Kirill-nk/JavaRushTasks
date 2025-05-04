-- Write your code here:
select date(now()), ADDDATE(now(), INTERVAL 3 DAY), SUBDATE(now(), INTERVAL 3 DAY)