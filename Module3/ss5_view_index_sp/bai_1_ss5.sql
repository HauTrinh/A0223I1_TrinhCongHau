CREATE DATABASE demo;
USE demo;

CREATE TABLE Products (
  Id INT PRIMARY KEY,
  productCode VARCHAR(50) NOT NULL,
  productName VARCHAR(255) NOT NULL,
  productPrice DECIMAL(10,2) NOT NULL,
  productAmount INT NOT NULL,
  productDescription TEXT,
  productStatus VARCHAR(50) NOT NULL
);

INSERT INTO Products (Id, productCode, productName, productPrice, productAmount, productDescription, productStatus)
VALUES (1, 'P001', 'Product 1', 10.99, 100, 'Description 1', 'Active'),
       (2, 'P002', 'Product 2', 20.99, 50, 'Description 2', 'Active'),
       (3, 'P003', 'Product 3', 30.99, 200, 'Description 3', 'Inactive'),
       (4, 'P004', 'Product 4', 40.99, 75, 'Description 4', 'Active');
       
-- 1. Index
	-- a.Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
    CREATE UNIQUE INDEX idx_productCode ON Products (productCode);
	-- b.Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
    CREATE INDEX idx_productName_price ON Products (productName, productPrice);
	-- c.Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào?
    EXPLAIN SELECT * FROM Products WHERE productName = 'Product 1';

-- 2. VIEW
    -- a.Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
    create view ProductInfor  AS
	SELECT productCode, productName, productPrice, productStatus FROM Products;
    
    select * 
    from ProductInfor;
	-- b.Tiến hành sửa đổi view
     UPDATE ProductInfor
	 SET productName = 'Product002'
	 WHERE productCode = 'P002';
     
     select * 
    from ProductInfor;
	-- c.Tiến hành xoá view
    DROP VIEW ProductInfo;

-- 3. Store Procedure
	-- a.Store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
delimiter //
CREATE PROCEDURE GetAllProducts()
BEGIN
  SELECT * FROM  products;
end //
delimiter ;

call GetAllProducts();

	-- b.Store procedure thêm một sản phẩm mới
delimiter //
CREATE PROCEDURE AddProduct1(
  IN p_Id int,
  IN p_productCode VARCHAR(50),
  IN p_productName VARCHAR(255),
  IN p_productPrice DECIMAL(10,2),
  IN p_productAmount INT,
  IN p_productDescription TEXT,
  IN p_productStatus VARCHAR(50)
)
BEGIN
  INSERT INTO Products (Id, productCode, productName, productPrice, productAmount, productDescription, productStatus)
  VALUES (p_id, p_productCode, p_productName, p_productPrice, p_productAmount, p_productDescription, p_productStatus);
END //
delimiter ;

CALL AddProduct1(5,'P005', 'Product 5', 50.99, 150, 'Description 5', 'Active');

	-- c.Store procedure sửa thông tin sản phẩm theo id
 delimiter //   
CREATE PROCEDURE UpdateProduct(
  IN p_id INT,
  IN p_productName VARCHAR(255),
  IN p_productPrice DECIMAL(10,2),
  IN p_productAmount INT,
  IN p_productDescription TEXT,
  IN p_productStatus VARCHAR(50)
)
BEGIN
  UPDATE Products
  SET productName = p_productName,
     productPrice = p_productPrice,
      productAmount = p_productAmount,
      productDescription = p_productDescription,
      productStatus = p_productStatus
  WHERE Id = p_id;
END //
delimiter ;

CALL UpdateProduct(1, 'Product 1 Updated', 15.99, 200, 'Updated Description 1', 'Inactive');

-- d.Store procedure xoá sản phẩm theo id
delimiter //
CREATE PROCEDURE DeleteProduct(
  IN p_id INT
)
BEGIN
  DELETE FROM Products
  WHERE Id = p_id;
END //
delimiter ;

CALL DeleteProduct(5);