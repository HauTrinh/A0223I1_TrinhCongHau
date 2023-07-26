USE QuanLySinhVien;

-- 1.Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select  *
from subject
where credit = (select max(Credit) from subject);
-- 2.Hiển thị các thông tin môn học có điểm thi lớn nhất.
select sub.*, m.Mark
from subject sub 
join mark m on sub.SubId = m.SubId
where m.Mark = (select max(Mark) from mark);
-- 3.Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
SELECT S.*, AVG(Mark) as 'Điểm TB'
FROM Student S 
join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
order by AVG(Mark) desc