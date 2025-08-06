USE internet_magaz;

WITH t1 as (
    select sum(buy_book.amount) as "Количество"
          , genre.name_genre
    from buy_book
             join book on book.book_id = buy_book.book_id
             join genre on genre.genre_id = book.genre_id
    group by genre.name_genre)


select t1.name_genre
      ,t1.Количество
from t1
where t1.Количество >= all (select t1.Количество from t1);
