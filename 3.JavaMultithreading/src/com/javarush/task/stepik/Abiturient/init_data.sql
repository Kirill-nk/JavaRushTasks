CREATE DATABASE IF NOT EXISTS abiturient;
DROP DATABASE abiturient;

USE abiturient;

CREATE TABLE IF NOT EXISTS program_enrollee (
    program_enrollee_id    int    not    null    auto_increment    primary    key,
    program_id    int    not    null,
    enrollee_id    int    not    null);

INSERT INTO program_enrollee (program_id, enrollee_id)
VALUES (3, 1),
       (4, 1),
       (1, 1),
       (2, 2),
       (1, 2),
       (1, 3),
       (2, 3),
       (4, 3),
       (3, 4),
       (3, 5),
       (4, 5),
       (2, 6),
       (3, 6),
       (4, 6);

select *
from program_enrollee;

CREATE TABLE IF NOT EXISTS department
(
    department_id int not null auto_increment primary key,
    name_department varchar(30) not null
    );
INSERT INTO department(name_department)
values ('Инженерная школа'),
       ('Школа естественных наук');
select *
from department;

create table program
(
    program_id    int not null auto_increment primary key,
    name_program  varchar(50) not null,
    department_id int,
    plan          int
);
INSERT INTO program (name_program, department_id, plan)
VALUES ('Прикладная математика и информатика', 2, 2),
       ('Математика и компьютерные науки', 2, 1),
       ('Прикладная механика', 1, 2),
       ('Мехатроника и робототехника', 1, 3);
select *
from program;

DROP TABLE enrollee;
CREATE TABLE enrollee
(
    enrollee_id   int primary key auto_increment,
    name_enrollee varchar(30)
);
INSERT INTO enrollee(name_enrollee)
values ('Баранов Павел'),
       ('Абрамова Катя'),
       ('Семенов Иван'),
       ('Яковлева Галина'),
       ('Попов Илья'),
       ('Степанова Дарья');
select *
from enrollee;

create table if not exists program_subject(
    program_subject_id int primary key auto_increment,
    program_id int,
    subject_id int,
    min_result int);
INSERT INTO program_subject (program_id, subject_id, min_result)
values (1, 1, 40),
       (1, 2, 50),
       (1, 4, 60),
       (2, 1, 30),
       (2, 2, 50),
       (2, 4, 60),
       (3, 1, 30),
       (3, 2, 45),
       (3, 3, 45),
       (4, 1, 40),
       (4, 2, 45),
       (4, 3, 45);
select *
from program_subject;

CREATE TABLE IF NOT EXISTS subject (
    subject_id int primary key auto_increment,
    name_subject varchar(50)
    );
INSERT INTO subject (name_subject)
values ('Русский язык'),
       ('Математика'),
       ('Физика'),
       ('Информатика');
select *
from subject;

CREATE TABLE IF NOT EXISTS enrollee_subject(enrollee_subject_id
    int    primary    key    auto_increment,
    enrollee_id    int,
    subject_id    int,
    result    int);
INSERT INTO enrollee_subject (enrollee_id, subject_id, result)
values (1, 1, 68),
       (1, 2, 70),
       (1, 3, 41),
       (1, 4, 75),
       (2, 1, 75),
       (2, 2, 70),
       (2, 4, 81),
       (3, 1, 85),
       (3, 2, 67),
       (3, 3, 90),
       (3, 4, 78),
       (4, 1, 82),
       (4, 2, 86),
       (4, 3, 70),
       (5, 1, 65),
       (5, 2, 67),
       (5, 3, 60),
       (6, 1, 90),
       (6, 2, 92),
       (6, 3, 88),
       (6, 4, 94);
select *
from enrollee_subject;

DROP TABLE achievement;
CREATE TABLE IF NOT EXISTS achievement
(
    achievement_id int auto_increment not    null    primary  key,
    name_achievement    varchar(    25),
    bonus int    );
INSERT INTO achievement (name_achievement, bonus)
values ('Золотая медаль', 5),
       ('Серебряная медаль', 3),
       ('Золотой значок ГТО', 3),
       ('Серебряный значок ГТО', 1);

select *
from achievement;

CREATE TABLE IF NOT EXISTS enrollee_achievement
(
    enrollee_achiev_id    int    not    null    auto_increment    primary    key,
    enrollee_id    int,
    achievement_id    int);

INSERT INTO enrollee_achievement (enrollee_id, achievement_id)
values (1, 2),
       (1, 3),
       (3, 1),
       (4, 4),
       (5, 1),
       (5, 3);

select *
from enrollee_achievement;