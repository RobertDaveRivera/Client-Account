DROP TABLE IF EXISTS CustomerTable;
CREATE SCHEMA Activity AUTHORIZATION sa;
CREATE TABLE CustomerTable (
     customer_number INT AUTO_INCREMENT PRIMARY KEY,
      customer_name VARCHAR(50) NOT NULL,
      customer_mobile VARCHAR(20) NOT NULL,
      customer_email VARCHAR(50) NOT NULL,
      address1 VARCHAR(100) NOT NULL,
      address2 VARCHAR(100),
      accountType VARCHAR(255) check(accountType in('SAVINGS','CHECKING'))
);
