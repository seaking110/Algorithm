-- 코드를 입력하세요
select cart_id from (SELECT name, cart_id from cart_products c 
group by cart_id, name having c.name = 'Yogurt' or c.name = 'Milk') as a
group by cart_id having count(*) > 1;