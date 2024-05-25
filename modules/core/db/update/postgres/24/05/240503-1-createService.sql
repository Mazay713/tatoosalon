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
);