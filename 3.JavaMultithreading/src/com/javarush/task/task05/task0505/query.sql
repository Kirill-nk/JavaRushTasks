-- Write your code here:
select  * from space.object;

insert into space.object (name, type, discoverer, discovery_date)
VALUES ('2020 XL5','астероид','Pan-STARRS 1','2020-12-12'),
       ('Moon','спутник Земли',null,null),
       ('Jupiter','planet',null,null),
       ('C/1910 A1','комета','Robert T. A.','1910-01-17')