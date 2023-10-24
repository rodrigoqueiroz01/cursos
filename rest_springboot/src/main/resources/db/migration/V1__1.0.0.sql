CREATE TABLE startup.person (
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(80)  NOT NULL,
    last_name  VARCHAR(80)  NOT NULL,
    document   VARCHAR(14)  NOT NULL UNIQUE,
    address    VARCHAR(100) NOT NULL,
    gender     VARCHAR(8)   NOT NULL
);