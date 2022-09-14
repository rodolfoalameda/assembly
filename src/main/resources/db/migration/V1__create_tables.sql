CREATE TABLE "assembly-db".tb_schedule (
	id bigserial NOT NULL,
	created_in timestamp NULL,
	details varchar(255) NULL,
	schedule varchar(255) NULL,
	CONSTRAINT tb_schedule_pkey PRIMARY KEY (id)
);

CREATE TABLE "assembly-db".tb_session (
	id bigserial NOT NULL,
	expires_in timestamp NULL,
	session_id int8 NULL,
	CONSTRAINT tb_session_pkey PRIMARY KEY (id),
	CONSTRAINT fkqds033g5xtwfja334bvqgu9eu FOREIGN KEY (session_id) REFERENCES "assembly-db".tb_schedule(id)
);

CREATE TABLE "assembly-db".tb_vote (
	id bigserial NOT NULL,
	cpf varchar(255) NULL,
	vote varchar(255) NULL,
	session_id int8 NULL,
	CONSTRAINT tb_vote_pkey PRIMARY KEY (id),
	CONSTRAINT fk8uopfp0bi2pjenefxff2nguod FOREIGN KEY (session_id) REFERENCES "assembly-db".tb_session(id)
);

