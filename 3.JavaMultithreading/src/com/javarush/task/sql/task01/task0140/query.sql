-- Write your code here:
select ip_from, ip_to, country_name from ip2country
order by ip_from desc
limit 10
offset 74
