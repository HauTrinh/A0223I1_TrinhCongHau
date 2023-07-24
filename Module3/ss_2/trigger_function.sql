USE demo_ss2;

delimiter //
CREATE TRIGGER create_account_trigger
BEFORE INSERT ON student
FOR EACH ROW
BEGIN
    DECLARE account VARCHAR(50);
    SET account = CONCAT(LEFT(NEW.name, 1), RIGHT(NEW.name, LENGTH(NEW.name) - 1), '_', NEW.id);
    SET NEW.account = account;
    --  SET NEW.account = REPLACE(NEW.name, ' ', ''); Chỉ lấy tên
    -- INSERT INTO jame(account, password) VALUES (NEW.account, '123456');
    INSERT INTO jame(account, password) VALUES (account, '123456');
END//
delimiter ;
INSERT INTO student (name, birthday, gender, email, point, class_id) VALUES ('Nguyen Van A', '2000-01-01', true, 'nguyenvana@gmail.com', 8.5, 1);

