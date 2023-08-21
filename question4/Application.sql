CREATE DATABASE challenge;
CREATE TABLE IF NOT EXISTS address (
	address_id SERIAL PRIMARY KEY,
	zip VARCHAR (10) NOT NULL,
	street VARCHAR (50),
	complement VARCHAR (50) NOT NULL,
	neighborhood VARCHAR (50),
	city VARCHAR (50) NOT NULL,
	state VARCHAR (50),
	country VARCHAR (50)
);

CREATE TABLE IF NOT EXISTS person (
  	person_id serial PRIMARY KEY ,
   	name VARCHAR(100) NOT NULL,
   	age SMALLINT,
   	phone INTEGER,
	height SMALLINT,
	email VARCHAR(50),
	cpf VARCHAR (11) NOT NULL UNIQUE,
	birthday DATE,
	address_id INTEGER NOT NULL,
	FOREIGN KEY (address_id) REFERENCES address (address_id)
);