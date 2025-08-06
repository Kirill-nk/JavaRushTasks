CREATE DATABASE IF NOT EXISTS internet_magaz;

USE internet_magaz;

DROP TABLE IF EXISTS genre;
CREATE TABLE genre
(
    genre_id int not null primary key,
    name_genre varchar(15)
);
INSERT INTO genre VALUES (1, 'Роман'),
                         (2, 'Поэзия'),
                         (3, 'Приключения');
select * from genre;

DROP TABLE IF EXISTS author;
CREATE TABLE author
(
    author_id int not null primary key,
    name_author varchar(20)
);
INSERT INTO author VALUES (1, 'Булгаков М.А.'),
                          (2, 'Достоевский Ф.М.'),
                          (3, 'Есенин С.А.'),
                          (4, 'Пастернак Б.Л.'),
                          (5, 'Лермонтов М.Ю.');
select * from author;

DROP TABLE IF EXISTS book;
CREATE TABLE book (
    book_id int not null primary key,
    title varchar(30),
    author_id int,
    genre_id int,
    price double,
    amount int
);
INSERT INTO book VALUES
        (1, 'Мастер и Маргарита', 1, 1, 670.99, 3),
        (2, 'Белая гвардия', 1, 1, 540.50, 5),
        (3, 'Идиот', 2, 1, 460.00, 10),
        (4, 'Братья Карамазовы', 2, 1, 799.01, 3),
        (5, 'Игрок', 2, 1, 480.50, 10),
        (6, 'Стихотворения и поэмы', 3, 2, 650.00, 15),
        (7, 'Черный человек', 3, 2, 570.20, 6),
        (8, 'Лирика', 4, 2, 518.99, 2);

DROP TABLE IF EXISTS city;
CREATE TABLE city(
    city_id int PRIMARY KEY AUTO_INCREMENT,
    name_city varchar(30),
    days_delivery int
);
INSERT INTO city (name_city, days_delivery) VALUES
                     ('Москва', 5),
                     ('Санкт-Петербург', 3),
                     ('Владивосток', 12);
select * from city;

DROP TABLE IF EXISTS client;
CREATE TABLE client (
    client_id int AUTO_INCREMENT PRIMARY KEY,
    name_client varchar(30),
    city_id int,
    email varchar(30)
);
INSERT INTO client (name_client, city_id, email) VALUES
            ('Баранов Павел', 3, 'baranov@test'),
            ('Абрамова Катя', 1, 'abramova@test'),
            ('Семенонов Иван', 2, 'semenov@test'),
            ('Яковлева Галина', 1, 'yakovleva@test');
select * from client;

DROP TABLE IF EXISTS buy;
CREATE TABLE buy(
    buy_id int auto_increment primary key,
    buy_description varchar(100),
    client_id int
);
INSERT INTO buy (buy_description, client_id) VALUES
       ('Доставка только вечером', 1),
       ('', 3),
       ('Упаковать каждую книгу по отдельности', 2),
       ('', 1);
select * from buy;

DROP TABLE IF EXISTS buy_book;
CREATE TABLE buy_book(
    buy_book_id int PRIMARY KEY AUTO_INCREMENT,
    buy_id int,
    book_id int,
    amount int
);
INSERT INTO buy_book (buy_id,book_id,amount) VALUES
            (1,1,1),
            (1,7,2),
            (1,3,1),
            (2,8,2),
            (3,3,2),
            (3,2,1),
            (3,1,1),
            (4,5,1);
select * from buy_book;

DROP TABLE IF EXISTS step;
CREATE TABLE step(
    step_id int primary key auto_increment,
    name_step varchar(20)
);
INSERT INTO step (name_step) VALUES
        ('Оплата'),
        ('Упаковка'),
        ('Транспортировка'),
        ('Доставка');
select  * from step;

DROP TABLE IF EXISTS buy_step;
CREATE TABLE buy_step(
    buy_step_id int primary key auto_increment,
    buy_id int,
    step_id int,
    date_step_beg DATE,
    date_step_end DATE
);
INSERT INTO buy_step (buy_id, step_id, date_step_beg, date_step_end) VALUES
    (1,1,'2020-02-20','2020-02-20'),
    (1,2,'2020-02-20','2020-02-21'),
    (1,3,'2020-02-22','2020-03-07'),
    (1,4,'2020-03-08','2020-03-08'),
    (2,1,'2020-02-28','2020-02-28'),
    (2,2,'2020-02-29','2020-03-01'),
    (2,3,'2020-03-02',null),
    (2,4,null,null),
    (3,1,'2020-03-05','2020-03-05'),
    (3,2,'2020-03-05','2020-03-06'),
    (3,3,'2020-03-06','2020-03-10'),
    (3,4,'2020-03-11',null),
    (4,1,'2020-03-20',null),
    (4,2,null,null),
    (4,3,null,null),
    (4,4,null,null);

select * from buy_step;

DROP TABLE IF EXISTS buy_archive;
CREATE TABLE buy_archive (
    buy_archive_id int not null auto_increment primary key,
    buy_id int not null,
    client_id int not null,
    book_id int not null,
    date_payment date,
    price double,
    amount int
);

INSERT INTO buy_archive (buy_id, client_id, book_id, date_payment, price, amount) VALUES
(2,1,1,'2019-02-21',670.60,2),
(2,1,3,'2019-02-21',450.90,1),
(1,2,2,'2019-02-10',520.30,2),
(1,2,4,'2019-02-10',780.90,3),
(1,2,3,'2019-02-10',450.90,1),
(3,4,4,'2019-03-05',780.90,4),
(3,4,5,'2019-03-05',480.90,2),
(4,1,6,'2019-03-12',650.00,1),
(5,2,1,'2019-03-18',670.60,2),
(5,2,4,'2019-03-18',780.90,1);

select * from buy_archive;