alter table TATOOSALON_PHOTO add constraint FK_TATOOSALON_PHOTO_ON_NAME foreign key (NAME) references SYS_FILE(ID);
