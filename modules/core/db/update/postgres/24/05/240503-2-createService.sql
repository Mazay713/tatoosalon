alter table TATOOSALON_SERVICE add constraint FK_TATOOSALON_SERVICE_ON_SERVICE_CATEGORY foreign key (SERVICE_CATEGORY_ID) references TATOOSALON_SERVICE_CATEGORY(ID);
alter table TATOOSALON_SERVICE add constraint FK_TATOOSALON_SERVICE_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references TATOOSALON_EMPLOYEE(ID);
create index IDX_TATOOSALON_SERVICE_ON_SERVICE_CATEGORY on TATOOSALON_SERVICE (SERVICE_CATEGORY_ID);
create index IDX_TATOOSALON_SERVICE_ON_EMPLOYEE on TATOOSALON_SERVICE (EMPLOYEE_ID);
