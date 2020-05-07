--<ScriptOptions statementTerminator=";"/>


DROP DATABASE if EXISTS test1;

DROP DATABASE if EXISTS java;

CREATE DATABASE java;

CREATE TABLE java.test1 (Vorname VARCHAR(20),Nachname VARCHAR(20));

INSERT INTO java.test1 VALUES('Rita','Kluge'),('Hans','Schlau'),('Peter','Pommes');

SELECT * FROM java.test1; 


