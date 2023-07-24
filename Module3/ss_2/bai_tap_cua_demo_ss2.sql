USE demo_ss2;

-- 1 Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào.
select s.id, s.name, s.point, c.name
from student s
join class c on s.class_id = c.id;

-- 2. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào và cả các bạn đã đăng ký nhưng chưa có lớp học.
select s.id, s.name, s.point, c.name
from student s
left join class c on s.class_id = c.id;

-- 3 Lấy thông tin của các học viên tên “Hai” và 'Huynh’
SELECT *
FROM student
WHERE name LIKE '%Hai%' OR name LIKE '%Huynh%';
-- Lấy thông tin của các học viên có tên bắt đầu bằng H
SELECT *
FROM student
WHERE SUBSTRING_INDEX(name, ' ', -1) LIKE 'H%';

-- 4 Lấy ra học viên có điểm lớn hơn 5 
select * 
from student s
where s.point > 5;

-- 5 Lấy ra học viên có họ là “nguyen” 
select *
from student
where substring_index(name, ' ', 1) = 'nguyen';

-- 6. Thông kế số lượng học sinh theo từng loại điểm.
select point, count(*) as "số lượng học viên"
from student
group by point;

-- 8. Thông kế số lượng học sinh theo điểm và điểm phải lớn hơn 5
select s.point, count(*) as "số lượng học viên"
from student s
where s.point > 5
group by s.point;
-- 9. Thông kế số lượng học sinh theo điểm lớn hơn 5 và chỉ hiện thị với số lượng>=2
select point, count(*) as "số lượng học viên"
from student
where point > 5
group by point
having count(*) >= 2;
