update book
join buy_book on buy_book.book_id = book.book_id
set book.amount = book.amount - buy_book.amount
where buy_book.buy_id = 5;

select * from book;
select * from buy_book;
select * from buy;
select * from author;