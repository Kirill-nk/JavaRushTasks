-- Write your code here:
select distinct b.title
from book b
join author a on a.id = b.author_id
where a.full_name = 'Edgar Allan Poe';
