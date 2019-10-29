/*SCHEMA user_service CREATED BY FLYWAY*/

CREATE TABLE IF NOT EXISTS user_service.kratera_user
(
   kratera_id bigserial NOT NULL,
   email varchar (200) NOT NULL UNIQUE,
   first_name varchar (100) NOT NULL,
   last_name varchar (100),
   password varchar (255) NOT NULL,
   role varchar(20) NOT NULL,
   verified int4 NOT NULL,
   PRIMARY KEY (kratera_id)
);
