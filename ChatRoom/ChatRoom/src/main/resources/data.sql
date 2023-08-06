CREATE TABLE users
(
    id       int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name     varchar(50),
    surname  varchar(50),
    username varchar(50),
    password varchar(100),
    enabled  int
);

CREATE TABLE authorities
(
    username  varchar(50),
    authority varchar(50)
);

insert into users (username, password, enabled)
values ('admin', '{noop}123', 1),
       ('cavid', '{noop}123', 1),
       ('hesen', '{noop}123', 1);