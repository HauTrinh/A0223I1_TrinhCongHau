USE QuanLySinhVien;

-- 1. Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select *
from student s
where substring_index(s.StudentName, " ", -1) like 'h%';

-- 2.Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12 
select * 
from class c
where month(c.StartDate) = 12;

-- 3. Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5
select * 
from subject
where Credit between 3 and 5;

-- 4. Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
SET SQL_SAFE_UPDATES = 0;
update student
set ClassId = 2
where StudentName = 'Hung';

-- 5. Hiển thị các thông tin: StudentName, SubName, Mark. 
-- Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần
select s.StudentName, m.Mark, sub.SubName
from student s 
join mark m on s.StudentId = m. StudentId
join subject sub on m.SubId = sub.SubId
order by m.Mark desc, s.StudentName ASC