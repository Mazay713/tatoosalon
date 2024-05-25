-- begin TATOOSALON_CLIENT
create table TATOOSALON_CLIENT (
    ID integer,
    UUID uuid,
    --
    EMAIL varchar(255),
    CARD boolean,
    FIRSTNAME varchar(255),
    LASTNAME varchar(255),
    MIDDLENAME varchar(255),
    PHONE varchar(255),
    --
    primary key (ID)
)^
-- end TATOOSALON_CLIENT
-- begin TATOOSALON_REGISTRATION
create table TATOOSALON_REGISTRATION (
    ID integer,
    UUID uuid,
    --
    DATE timestamp,
    CLIENT_ID integer,
    --
    primary key (ID)
)^
-- end TATOOSALON_REGISTRATION
-- begin TATOOSALON_EMPLOYEE
create table TATOOSALON_EMPLOYEE (
    ID integer,
    UUID uuid,
    --
    FIRSTNAME varchar(255),
    LASTNAME varchar(255),
    MIDDLENAME varchar(255),
    PHONE varchar(255),
    EXPERIENCE varchar(255),
    PASSPORT varchar(255),
    --
    primary key (ID)
)^
-- end TATOOSALON_EMPLOYEE
-- begin TATOOSALON_PORTFOLIO
create table TATOOSALON_PORTFOLIO (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    DESCRIPTION varchar(255),
    EMPLOYEE_ID integer,
    --
    primary key (ID)
)^
-- end TATOOSALON_PORTFOLIO
-- begin TATOOSALON_SERVICE_CATEGORY
create table TATOOSALON_SERVICE_CATEGORY (
    ID integer,
    UUID uuid,
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end TATOOSALON_SERVICE_CATEGORY
-- begin TATOOSALON_SERVICE
create table TATOOSALON_SERVICE (
    ID integer,
    UUID uuid,
    --
    PRICE integer,
    DESCRPTION varchar(255),
    NAME varchar(255),
    SERVICE_CATEGORY_ID integer,
    EMPLOYEE_ID integer,
    --
    primary key (ID)
)^
-- end TATOOSALON_SERVICE
-- begin TATOOSALON_FEEDBACK
create table TATOOSALON_FEEDBACK (
    ID integer,
    UUID uuid,
    --
    ESTIMATION integer,
    REGISTRATION_ID integer,
    CONTENT varchar(255),
    --
    primary key (ID)
)^
-- end TATOOSALON_FEEDBACK
-- begin TATOOSALON_REGISTRATION_SERVICE
create table TATOOSALON_REGISTRATION_SERVICE (
    ID integer,
    UUID uuid,
    --
    REGISTRATION_ID integer,
    SERVICE_ID integer,
    --
    primary key (ID)
)^
-- end TATOOSALON_REGISTRATION_SERVICE
-- begin TATOOSALON_PHOTO
create table TATOOSALON_PHOTO (
    ID integer,
    UUID uuid,
    --
    NAME uuid,
    PORTFOLIO_ID integer,
    --
    primary key (ID)
)^
-- end TATOOSALON_PHOTO
