-- Write your code here:
select isbn, title
from author
join library.book b on author.id = b.author_id
where last_name like 'S%'