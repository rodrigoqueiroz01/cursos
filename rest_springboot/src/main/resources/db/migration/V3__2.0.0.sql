CREATE TABLE book
(
    id          SERIAL PRIMARY KEY,
    author      VARCHAR(80)      NOT NULL,
    launch_date DATE             NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    title       VARCHAR(250)     NOT NULL
);