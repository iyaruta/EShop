INSERT INTO CATALOG (NAME)
VALUES ('cosmetics');

INSERT INTO CATALOG (NAME)
VALUES ('TV');

INSERT INTO CATALOG (NAME)
VALUES ('sport');

INSERT INTO CATALOG (NAME)
VALUES ('for car');

INSERT INTO CATEGORY(NAME, CATALOG_ID)
VALUES ('NIVEA', 1);

INSERT INTO CATEGORY(NAME, CATALOG_ID)
VALUES ('SAMSUNG', 2);

INSERT INTO SECTION (CATEGORY_ID, NAME)
VALUES (1, 'cream')

INSERT INTO SECTION (CATEGORY_ID, NAME)
VALUES (1, 'mask')

INSERT INTO SECTION (CATEGORY_ID, NAME)
VALUES (4, 'phone')

INSERT INTO PRODUCT(section_Id, name, description, price, quantity, discount)
VALUES (1, 'for face', 'moisturizing', 50.25, 10, 0)

INSERT INTO PRODUCT(section_Id, name, description, price, quantity, discount)
VALUES (1, 'for hand', 'moisturizing', 10.25, 20, 0)

INSERT INTO PRODUCT(section_Id, name, description, price, quantity, discount)
VALUES (5, 'samsungC5', 'text', 150, 5, 0)