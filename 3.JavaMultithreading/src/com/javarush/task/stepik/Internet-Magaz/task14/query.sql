DROP TABLE if exists buy_pay;

create table buy_pay (title varchar(20),
                      name_author varchar(20),
                      price decimal(10,2),
                      amount int,
                      Стоимость decimal(10,2))
select title,
       author.name_author,
       book.price,
       buy_book.amount,
       buy_book.amount * book.price as 'Стоимость'
from buy_book
join book on book.book_id = buy_book.book_id
join author on book.author_id = author.author_id
where buy_id = 5
order by book.title;

select * from buy_pay;
select * from buy_book;