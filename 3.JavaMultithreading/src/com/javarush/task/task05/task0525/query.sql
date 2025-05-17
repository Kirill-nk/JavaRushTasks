-- Write your code here:
select full_name, count(title) books
from book
join library.author a on a.id = book.author_id
group by full_name