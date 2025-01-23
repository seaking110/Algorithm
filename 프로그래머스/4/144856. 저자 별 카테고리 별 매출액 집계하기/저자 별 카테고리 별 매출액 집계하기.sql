-- 코드를 입력하세요
SELECT b. author_id, a.author_name, b.category, b.total_sales from (
    SELECT b.author_id, b.category, sum (s.sales * b.price) as total_sales
    from book b join book_sales s on b.book_id = s.book_id
    where s.sales_date like '2022-01%'
    group by b.author_id, b.category
) as b join author a on b.author_id = a.author_id 
order by author_id, b.category desc
