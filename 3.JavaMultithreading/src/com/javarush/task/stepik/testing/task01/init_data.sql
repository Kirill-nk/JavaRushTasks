CREATE DATABASE IF NOT EXISTS testing1;
DROP DATABASE testing1;
USE testing1;

CREATE TABLE IF NOT EXISTS attempt
(
    attempt_id   int not null auto_increment primary key,
    student_id   int not null,
    subject_id   int,
    date_attempt date,
    result       int
);

INSERT INTO attempt (student_id, subject_id, date_attempt, result)
values (1, 2, '2020-03-23', 67),
       (3, 1, '2020-03-23', 100),
       (4, 2, '2020-03-26', 0),
       (1, 1, '2020-04-15', 33),
       (3, 1, '2020-04-15', 67),
       (4, 2, '2020-04-21', 100),
       (3, 1, '2020-05-17', 33),
       (1, 2, '2020-06-12', null);
select *
from attempt;

CREATE TABLE IF NOT EXISTS testing
(
    testing_id  int not null auto_increment primary key,
    attempt_id  int,
    question_id int,
    answer_id   int
);
INSERT INTO testing (attempt_id, question_id, answer_id)
VALUES (1, 9, 25),
       (1, 7, 19),
       (1, 6, 17),
       (2, 3, 9),
       (2, 1, 2),
       (2, 4, 11),
       (3, 6, 18),
       (3, 8, 24),
       (3, 9, 28),
       (4, 1, 2),
       (4, 5, 16),
       (4, 3, 10),
       (5, 2, 6),
       (5, 1, 2),
       (5, 4, 12),
       (6, 6, 17),
       (6, 8, 22),
       (6, 7, 21),
       (7, 1, 3),
       (7, 4, 11),
       (7, 5, 16),
       (8, 7, 19),
       (8, 6, 17),
       (8, 8, 22);
select *
from testing;

CREATE TABLE if not exists answer
(
    answer_id   int not null auto_increment primary key,
    name_answer varchar(50),
    question_id int not null,
    is_correct  boolean
);
INSERT INTO answer (name_answer, question_id, is_correct)
VALUES ('UPDATE                                            ', 1, 0),
       ('SELECT                                            ', 1, 1),
       ('INSERT                                            ', 1, 0),
       ('GROUP BY                                          ', 2, 0),
       ('FROM                                              ', 2, 0),
       ('WHERE                                             ', 2, 1),
       ('SELECT                                            ', 2, 0),
       ('SORT                                              ', 3, 0),
       ('ORDER BY                                          ', 3, 1),
       ('RANG BY                                           ', 3, 0),
       ('SELECT * FROM student                             ', 4, 1),
       ('SELECT student                                    ', 4, 0),
       ('INNER JOIN                                        ', 5, 1),
       ('LEFT JOIN                                         ', 5, 0),
       ('RIGHT JOIN                                        ', 5, 0),
       ('CROSS JOIN                                        ', 5, 0),
       ('совокупность данных, организованныхпо определенным', 6, 1),
       ('совокупность программ для хранения иобработки ... ', 6, 0),
       ('строка                                            ', 7, 0),
       ('столбец                                           ', 7, 0),
       ('таблица                                           ', 7, 1),
       ('обобщенное представление пользователей о данных   ', 8, 1),
       ('описание представления данных в памяти компьютера ', 8, 0),
       ('база данных                                       ', 8, 0),
       ('file                                              ', 9, 1),
       ('INT                                               ', 9, 0),
       ('VARCHAR                                           ', 9, 0),
       ('DATE                                              ', 9, 0);

select * from testing;

CREATE TABLE IF NOT EXISTS student(
    student_id int not null auto_increment primary key,
    name_student varchar(30)
);
INSERT INTO student (name_student) VALUES
    ('Баранов Павел'),
    ('Абрамова Катя'),
    ('Семенов Иван'),
    ('Яковлева Галина');
select * from student;

drop table subject;
CREATE TABLE IF NOT EXISTS subject(
    subject_id int not null auto_increment primary key,
    name_subject varchar(20)
);
INSERT INTO subject (name_subject) VALUES
    ('Основы SQL'),
    ('Основы баз данных'),
    ('Физика');
select * from subject;