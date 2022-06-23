CREATE SEQUENCE customer_sequence START WITH 1 INCREMENT BY 50;

CREATE TABLE customers (
    id BIGINT DEFAULT NEXTVAL('customer_sequence') NOT NULL ,
    email VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
)