USE internet_magaz;

select distinct client.name_client
from author
         join book on book.author_id = author.author_id
         join buy_book on buy_book.book_id = book.book_id
         left join buy on buy.buy_id = buy_book.buy_id
         left join client on client.client_id = buy.client_id
where author.name_author LIKE 'Достоевский%'
order by client.name_client asc;