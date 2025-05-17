-- Write your code here:
select b.title
from book b
join author a on a.id = b.author_id
where a.id in (select id from author where full_name = 'Edgar Allan Poe');

select * from author