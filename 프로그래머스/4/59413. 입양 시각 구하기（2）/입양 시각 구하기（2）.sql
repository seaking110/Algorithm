-- 코드를 입력하세요
with recursive rc
AS (
    select 0 as n
    union all
    select n+1 as num
    from rc
    where n < 23
)
select rc.n, count(animal_id) from rc left join animal_outs o on rc.n = HOUR(datetime)
group by rc.n
order by rc.n