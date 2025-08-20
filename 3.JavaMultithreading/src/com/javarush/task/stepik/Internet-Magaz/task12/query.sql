insert into buy_book (buy_id, book_id, amount)
select 5, book.book_id, 2
from book
join author on author.author_id = book.author_id
where author.name_author = 'Пастернак Б.Л.' and book.title = 'Лирика';

insert into buy_book (buy_id, book_id, amount)
select 5, book.book_id, 1
from book
         join author on author.author_id = book.author_id
where author.name_author = 'Булгаков М.А.' and book.title = 'Белая гвардия';


select * from book;
select * from buy_book;
select * from buy;
select * from author;