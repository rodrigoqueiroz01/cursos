CREATE SEQUENCE person_seq;

CREATE TABLE person
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(80)  NOT NULL,
    last_name  VARCHAR(80)  NOT NULL,
    document   VARCHAR(15)  NOT NULL UNIQUE,
    address    VARCHAR(100) NOT NULL,
    gender     VARCHAR(8)   NOT NULL
);

ALTER TABLE person
    OWNER TO postgres;
