--create database jaeger

CREATE TABLE Jaeger (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark INTEGER,
	height INTEGER,
	weight DOUBLE PRECISION,
	status TEXT,
	origin TEXT,
	launch INTEGER,
	kaijuKill INTEGER
);