create table product
(
    id         bigserial   not null,
    productname       varchar(50) not null,
    address       varchar(50) not null,
    price       real not null,
    type       varchar(50) not null,
    dateofcreate       varchar(50) not null,
    dateofchanging       varchar(50) not null,
    position       varchar(50) not null,
    primary key (id)
);

create table showcase
(
    id         bigserial   not null,
    name       varchar(50) not null,
    address       varchar(50) not null,
    type       varchar(50) not null,
    dt       varchar(50) not null,
    updating       varchar(50) not null,
    primary key (id)
);