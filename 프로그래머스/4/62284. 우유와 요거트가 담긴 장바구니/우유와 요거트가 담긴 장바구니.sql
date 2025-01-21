-- 코드를 입력하세요
select cart_id from cart_products c 
where c.name = 'Yogurt' or c.name = 'Milk'
group by cart_id
having count(distinct name) > 1
order by cart_id