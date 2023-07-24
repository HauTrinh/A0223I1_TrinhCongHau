USE demo_ss2;
-- Hiện thị danh sách các lớp có học viên theo học và số lượng học viên của mỗi lớp
SELECT c.name as class_name, COUNT(s.id) as num_students
FROM class c
INNER JOIN student s ON c.id = s.class_id
GROUP BY c.id;

-- Tính điểm lớn nhất của mỗi các lớp
SELECT c.name as class_name, MAX(s.point) as max_point
FROM class c
INNER JOIN student s ON c.id = s.class_id
GROUP BY c.id;

-- Tình điểm trung bình  của từng lớp
SELECT c.name as class_name, AVG(s.point) as avg_point
FROM class c
INNER JOIN student s ON c.id = s.class_id
GROUP BY c.id;

--   Lấy ra toàn bộ tên và ngày sinh các instructor và student
SELECT name, birthday
FROM student
UNION ALL
SELECT name, birthday
FROM instructor;

-- 
SELECT name, point
FROM student
ORDER BY point DESC
LIMIT 3;

--
SELECT *
FROM student
WHERE point = (SELECT MAX(point) FROM student);