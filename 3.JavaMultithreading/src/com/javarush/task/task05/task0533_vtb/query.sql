-- 1. Перечислите операторы класса DML.
-- Select, Insert, Update, Delete;

-- 2. Подсчитайте количество уникальных Code для каждого ID.
DROP TABLE IF EXISTS test2;
CREATE TABLE t
(
    `id` int NOT NULL,
    `code` int not NULL
);
INSERT INTO t
VALUES (10, 4),
       (10, 4),
       (50, 2),
       (30, 3),
       (30, 8),
       (30, 4),
       (10, 3),
       (50, 5);

-- решение 2
select id, count(distinct code) as cnt_code
from t
group by id;


-- 3. Получите все ID для которых сумма по полю IDD меньше или равна средней
-- сумме по всем IDD. Предполагается, что таблицы могут иметь неограниченное кол-во строк.
DROP TABLE IF EXISTS t1;
CREATE TABLE t1
(
    `ID` int NOT NULL,
    `IDD` int not NULL
);
INSERT INTO t1
VALUES (10, 4),
       (20, 4),
       (30, 2),
       (40, 3),
       (50, 5);

INSERT INTO t1 values (10, 6);

with tbl1 as (
select id, sum(IDD) as sum_idd
from t1
group by id),

tbl2 as (
    select avg(IDD) avg_idd from t1
    )
   -- select id from tbl1 where sum_idd <= (select avg(sum_idd) from tbl1);
select * from tbl1 join tbl2
where tbl1.sum_idd <= tbl2.avg_idd;

-- 4. Объедините результаты выполнения 2-х запросов к таблицам T и T1 в один,
   -- исключив при этом повторения.
   -- Предполагается, что таблицы могут иметь неограниченное кол-во строк.
select id, count(distinct code) as cnt_code
from t
group by id
union
(with tbl1 as (
    select id, sum(IDD) as sum_idd
    from t1
    group by id)
select id, null as cnt_code from tbl1 where sum_idd <= (select avg(sum_idd) from tbl1));

-- 5. Получите все записи с ID и Продукт, которые повторяются в таблице.
-- Предполагается, что таблицы могут иметь неограниченное кол-во строк.
DROP TABLE IF EXISTS t5;
CREATE TABLE t5
(
    `ID` int NOT NULL,
    `PROD` int not NULL
);
INSERT INTO t5
VALUES (10, 4),
       (10, 4),
       (30, 2),
       (40, 3),
       (50, 5);

INSERT INTO t5 values (50, 6);

SELECT id, prod -- , COUNT(*) as duplicate_count
FROM t5
GROUP BY id, prod
HAVING COUNT(*) > 1;

-- 6. Напишите запрос, который выведет все строки таблицы, которые удовлетворяют всем следующим условиям сразу:
 -- продукт равен 5
 -- дата больше 01.02.2010 или сумма больше 400.
DROP TABLE IF EXISTS t6;
CREATE TABLE t6
(
    `ID` int NOT NULL,
    `PROD` int not NULL,
    `DATA` date not NULL,
    `Sum` int not NULL
);
INSERT INTO t6
VALUES (10, 4, '2010-01-01',100),
       (20, 5, '2010-02-01', 500),
       (30, 2, '2010-03-01', 300),
       (40, 3, '2010-04-01', 400),
       (50, 5, '2010-05-01', 500);

Select *
From t6
Where Prod=5
  And (Data > 2010-02-01 or Sum > 400);

/* 7. Есть пара таблиц. Code – поле для связывания.
     Напишите запрос, который выводит:
1)	все данные из таблицы Т1 с указанием названий продуктов
2)	все данные из таблицы Т1, причем Код продукта из Т1 должен быть в Т2 */
DROP TABLE IF EXISTS t1;
CREATE TABLE t1
(
    `ID` int NOT NULL,
    `Code` int not NULL
);
INSERT INTO t1
VALUES (1, 133),
       (2, 101),
       (3, 96),
       (4, 201),
       (5, 555);

DROP TABLE IF EXISTS t2;
CREATE TABLE t2
(
    `Code` int not NULL,
    `Name` varchar(20) NOT NULL
);
INSERT INTO t2
VALUES (133, 'Карты'),
       (101, 'КМБ'),
       (90, 'Овердрафт'),
       (80, 'Кредиты наличными'),
       (1, 'Ипотека');
-- 1)	все данные из таблицы Т1 с указанием названий продуктов
select t1.id, t2.Name
from t1
    left join vtb_test.t2 on t1.Code = t2.Code;

-- 2) все данные из таблицы Т1, причем Код продукта из Т1 должен быть в Т2
select t1.id,t1.Code
from t1
    right join t2 on t1.Code = t2.Code;

select t1.id,t1.Code
from t1
         on  t2 on t1.Code = t2.Code;

-- 8. Есть пара таблиц. Code – поле для связывания.
/* Предполагается, что таблицы могут иметь неограниченное кол-во строк.
Присвойте (обновите) полю ID в Т1 значение «100» для Кода продукта =133,
причем код продукта должен быть в таблице Т2 и зафиксируйте изменения */
DROP TABLE IF EXISTS t81;
CREATE TABLE t81
(
    `ID` int NOT NULL,
    `Code` int not NULL
);
INSERT INTO t81
VALUES (1, 133),
       (2, 101),
       (3, 96),
       (4, 201),
       (5, 555);

DROP TABLE IF EXISTS t82;
CREATE TABLE t82
(
    `Code` int not NULL,
    `Name` varchar(20) NOT NULL

);
INSERT INTO t82
VALUES (133, 'Карты'),
       (101, 'КМБ'),
       (96, 'Овердрафт'),
       (201, 'Кредиты наличными'),
       (555, 'Ипотека');

-- Присвойте (обновите) полю ID в Т1 значение «100» для Кода продукта =133,
-- причем код продукта должен быть в таблице Т2 и зафиксируйте изменения
update t81 set id = 100
where code = 133
and exists(SELECT 1 FROM t82 WHERE t82.Code = t81.Code);
select * from t81;



-- 9. Напишите запрос вычисляющий долю продаж каждого продукта
   -- в общем объеме с использованием аналитических оконных функций.
DROP TABLE IF EXISTS t9;
CREATE TABLE t9
(
    `Продукт` varchar(20) NOT NULL,
    `Продажи` int not NULL
);
INSERT INTO t9
VALUES ('Карты', 100),
       ('КМБ', 100),
       ('Овердрафт', 200),
       ('Кредиты наличными', 200);

select Продукт
,Продажи
,ROUND(Продажи * 100.0 / SUM(Продажи) OVER (), 2) AS "Доля_продаж_%"
from t9