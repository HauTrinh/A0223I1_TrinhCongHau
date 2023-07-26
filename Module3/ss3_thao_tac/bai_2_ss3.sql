use e_store;
-- 1.Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oID, ODate, oTotalPrice
from `order` ;

-- 2.Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c.cName, p.pName 
from customer c 
join `order` o on c.cID = o.cID
join orderdetail od on o.oID = od.oID
join product p on od.pID = p.pID;

-- 3.Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select cName
from customer 
where customer.cID not in (
      select cID
      from `order`
);

-- 4.Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán 
-- của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select o.oID, o.ODate, sum(od.odQTY * p.pPrice) AS TOTAL 
from `order` o 
join orderdetail od on o.oID = od.oID
join product p on od.pID = p.pID
group by o.oID;
