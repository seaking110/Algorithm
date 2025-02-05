-- 코드를 입력하세요
SELECT year(s.sales_date), month(s.sales_date), count(distinct s.user_id),
round((count(distinct s.user_id)/(SELECT COUNT(*) FROM USER_INFO WHERE YEAR(JOINED) = 2021)),1)
from user_info u join online_sale s on u.user_id = s.user_id 
where u.joined like '2021%'
group by 1 ,2