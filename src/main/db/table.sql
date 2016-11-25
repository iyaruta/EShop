CREATE TABLE CATALOG (
  id serial not null,
  name varchar(50) not null,
  CONSTRAINT CATALOG_PK PRIMARY KEY (id)
);

CREATE TABLE CATEGORY (
  id serial not null,
  name varchar(50) not null,
  CATALOG_ID BIGINT not null,
  CONSTRAINT brand_pk PRIMARY KEY (id)
)

alter table CATEGORY
  add constraint FK_CATALOG foreign key (CATALOG_ID)
  references CATALOG (ID)
  on delete restrict on update restrict;

CREATE TABLE ROLE
(
  ID serial NOT NULL,
  NAME VARCHAR (50) ,
  CONSTRAINT ROLE_PK PRIMARY KEY(ID)
);

INSERT INTO ROLE(ID, NAME) VALUES (1, 'ADMIN');
INSERT INTO ROLE(ID, NAME) VALUES (2, 'SUPERVISOR');
INSERT INTO ROLE(ID, NAME) VALUES (3, 'USER');
INSERT INTO ROLE(ID, NAME) VALUES (4, 'SOURSOP');

CREATE TABLE USERS (
  id serial not null,
  role_id bigint not null,
  first_name varchar(50) not null,
  last_name varchar(50) not null,
  BIRTHDAY DATE,
  CONSTRAINT USERS_PK PRIMARY KEY (id)
)

ALTER TABLE USERS
  ADD CONSTRAINT FK_ROLE FOREIGN KEY (ROLE_ID)
  REFERENCES ROLE (ID)
  ON DELETE RESTRICT ON UPDATE RESTRICT;

CREATE TABLE SECTION (
  id serial not null,
  category_id bigint not null,
  name varchar(50) not null,
  CONSTRAINT SECTION_PK PRIMARY KEY (id)
)

ALTER TABLE SECTION
  ADD CONSTRAINT FK_CATEGORY FOREIGN KEY (category_id)
  REFERENCES CATEGORY (ID)
  ON DELETE RESTRICT ON UPDATE RESTRICT;

CREATE TABLE PRODUCT(
  id SERIAL NOT NULL,
  section_Id BIGINT NOT NULL,
  name VARCHAR(50) NOT NULL,
  description VARCHAR(50) NOT NULL,
  price DECIMAL NOT NULL,
  quantity BIGINT  NOT NULL,
  discount DECIMAL NOT NULL,
  CONSTRAINT PRODUCT_PK PRIMARY KEY (id)
)
