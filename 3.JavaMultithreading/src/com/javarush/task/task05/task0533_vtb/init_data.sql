CREATE DATABASE IF NOT EXISTS vtb_test;

USE vtb_test;

DROP TABLE IF EXISTS test2;

CREATE TABLE test2
(
    `id` int NOT NULL,
    `code` int not NULL
);

INSERT INTO test2
VALUES (10, 4),
       (10, 4),
       (50, 2),
       (10, 3),
       (50, 5);

DROP TABLE IF EXISTS merchant_info;

CREATE TABLE merchant_info
(
    `Merch_id`        int NOT NULL primary key,
    `Mcc_code`        int DEFAULT NULL,
    `Mcc_name`        varchar(100) DEFAULT NULL
);

INSERT INTO merchant_info
VALUES (8234, 15, 'Продукты'),
       (10454, 2, 'Снятие наличных в банкомате'),
       (35475, 33, 'Заработная плата'),
       (262343, 12, 'Снятие наличных в кассе');

DROP TABLE IF EXISTS cred_potential;

CREATE TABLE cred_potential
(
    `client_dk`   int NOT NULL PRIMARY KEY,
    `Crd_potential` int DEFAULT NULL
);

INSERT INTO cred_potential
VALUES (507851886, 100000),
       (267188214, 250000),
       (148849526, 1000000),
       (613898474, 50000);