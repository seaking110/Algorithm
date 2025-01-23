-- 코드를 입력하세요
select f.flavor  from first_half f join 
    (select * , sum (total_order) as total from july 
        group by flavor) as a on f.shipment_id = a.shipment_id 
        group by 1
        order by sum (f.total_order + total) desc limit 3