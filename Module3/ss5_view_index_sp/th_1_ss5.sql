USE `classicmodels`;
-- 1.
SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 

-- 2.
EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 

-- 3.add index cho bảng
ALTER TABLE customers ADD INDEX idx_customerName(customerName);

EXPLAIN SELECT * FROM customers WHERE customerName = 'Land of Toys Inc.'; 

-- 4. add index theo cặp
ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);

EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';

drop index idx_customerName on customers;

ALTER TABLE customers DROP INDEX idx_full_name;

