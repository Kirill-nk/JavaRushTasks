-- Write your code here:
select distinct p.name from book b
join author a on a.id = b.author_id
join publisher p on p.id = b.publisher_id
        where a.id in (select id from author where a.full_name = 'Mark Twain');
