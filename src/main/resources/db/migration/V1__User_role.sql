create table role (
    id serial not null,
    name character varying(64) not null,
    primary key (id)
);

create table appuser (
	id serial NOT NULL,
	username character varying(64) NOT NULL,
	password character varying(64) NOT NULL,
	firstname character varying(64) NOT NULL,
	lastname character varying(64) NOT NULL,
	phone character varying(64) NOT NULL,
	image character varying(256),
	id_role integer NOT NULL,
	PRIMARY KEY(id),
    CONSTRAINT fk_appuser_idrole FOREIGN KEY (id_role) REFERENCES role(id)
);