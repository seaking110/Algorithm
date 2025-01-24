-- 코드를 입력하세요
select case when start_date like '2022-08%' then 8
when start_date like '2022-09%' then 9
when start_date like '2022-10%' then 10
end as month , car_id,count(car_id) as records
from car_rental_company_rental_history 
where  start_date BETWEEN '2022-08-01' AND '2022-10-31' and car_id in (select car_id from car_rental_company_rental_history 
          where start_date between '2022-08-01'and '2022-10-31'
            group by car_id
            having count(car_id) >= 5
          )
group by car_id, month
order by month, car_id desc


