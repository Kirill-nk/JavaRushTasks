-- Write your code here:
select IF(age<=12, 'child', IF(age >=20, 'adult', 'teenager')) as "metrics"
     from customers
 LIMIT 5