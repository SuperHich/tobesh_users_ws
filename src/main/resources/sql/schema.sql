CREATE TABLE IF NOT EXISTS users (
                                     id                     VARCHAR(60)  DEFAULT RANDOM_UUID() PRIMARY KEY,
                                     title                  VARCHAR      NOT NULL,
                                     first_name              VARCHAR      NOT NULL,
                                     last_name               VARCHAR      NOT NULL,
                                     email                  VARCHAR      NOT NULL,
                                     picture                VARCHAR      NOT NULL,
                                     date_of_birth            VARCHAR,
                                     gender                 VARCHAR,
                                     phone                  VARCHAR
);