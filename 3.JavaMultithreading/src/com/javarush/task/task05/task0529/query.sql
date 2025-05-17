-- Write your code here:
select a.full_name, coalesce(count(p.name), 0) publishers
from book b join author a on a.id = b.author_id
join publisher p on p.id = b.publisher_id
group by a.full_name

