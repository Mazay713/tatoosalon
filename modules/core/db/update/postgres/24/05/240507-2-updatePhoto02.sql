alter table TATOOSALON_PHOTO rename column name to name__u64380 ;
alter table TATOOSALON_PHOTO drop constraint FK_TATOOSALON_PHOTO_ON_NAME ;
alter table TATOOSALON_PHOTO add column NAME varchar(255) ;
