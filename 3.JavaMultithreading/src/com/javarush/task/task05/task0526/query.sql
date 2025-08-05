-- Write your code here:
select b.publication_year, b.isbn, b.title, a.full_name author, p.name
    from book b
         join author a on a.id = b.author_id
         join publisher p on p.id = b.publisher_id;
