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
