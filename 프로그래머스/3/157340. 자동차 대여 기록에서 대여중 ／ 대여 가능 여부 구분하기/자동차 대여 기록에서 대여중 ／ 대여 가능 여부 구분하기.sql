-- 코드를 입력하세요
SELECT car_id,
case when max('2022-10-16' between start_date and end_date) = 1 then '대여중'
        else '대여 가능'
        end as availabilty
from car_rental_company_rental_history 
group by car_id 
order by car_id desc