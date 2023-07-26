USE QuanLySinhVien;

-- 1.Hiển thị số lượng sinh viên ở từng nơi
select Address, count(*) as 'Số lượng sv'
from student
group by Address;
-- 2.Tính điểm trung bình các môn học của mỗi học viên
SELECT S.StudentId,S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;
-- 3.Hiển thị những bạn học viên có điểm trung bình các môn học lớn hơn 15
SELECT S.StudentId,S.StudentName, AVG(Mark) as 'Điểm TB'
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
having AVG(Mark) > 15;
-- 4.Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId);