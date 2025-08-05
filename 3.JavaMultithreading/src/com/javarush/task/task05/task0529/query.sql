-- Write your code here:

select a.full_name, count(distinct p.name) publishers
from author a
         join book b on a.id = b.author_id
         join publisher p on p.id = b.publisher_id
group by a.id