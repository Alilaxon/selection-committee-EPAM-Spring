
CREATE TABLE users
(
    id          SERIAL      NOT NULL,
    login       VARCHAR(50) NOT NULL,
    email       varchar(50) NOT NULL,
    password    VARCHAR     NOT NULL,
    first_name  VARCHAR(30) NOT NULL,
    second_name VARCHAR(30) NOT NULL,
    city        VARCHAR(30) NOT NULL,
    region      VARCHAR(30) NOT NULL,
    institution VARCHAR(64) NOT NULL,

);

CREATE TABLE titles
(
    id SERIAL PRIMARY KEY   NOT NULL,
    name        VARCHAR(50) NOT NULL ,
    description VARCHAR(50)

)

CREATE TABLE faculties
(
    id               SERIAL      NOT NULL,
    name             VARCHAR(50) NOT NULL,
    budget_places    INT         NOT NULL,
    all_places       INT         NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE subjects
(
    id      SERIAL      NOT NULL,
    name_en VARCHAR(50) NOT NULL,
    name_ru VARCHAR(50) NOT NULL,
    name_uk VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);