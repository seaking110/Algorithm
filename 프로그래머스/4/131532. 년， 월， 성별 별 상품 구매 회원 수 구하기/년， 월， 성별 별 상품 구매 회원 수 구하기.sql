-- 코드를 입력하세요
select year(o.sales_date) year , month(o.sales_date) month, u.gender, count(DISTINCT u.user_id) users 
from online_sale o join user_info u on o.user_id = u.user_id
where u.gender is not null
group by 1,2,3
order by 1,2,3
