-- 코드를 입력하세요
SELECT  car_id , round(avg(datediff(end_date, start_date)) + 1,1) as AVERAGE_DURATION 
from car_rental_company_rental_history
group by car_id
having AVERAGE_DURATION >= 7 
order by 2 desc, 1 desc