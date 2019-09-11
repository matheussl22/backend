CREATE TABLE temperature(
	id bigint NOT NULL,
	valor bigint NOT NULL,
	create_date timestamp NOT NULL,
	CONSTRAINT temperature_pk PRIMARY KEY (id)
);