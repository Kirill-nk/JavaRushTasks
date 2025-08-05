-- Write your code here:
select a.full_name, count(title) books
from book
join library.author a on a.id = book.author_id
group by book.author_id
having books > 1