-- 코드를 입력하세요
SELECT places.id, places.name, places.host_id from places join (select * from places group by host_id having count(*) > 1 ) as a on
places.host_id = a.host_id
order by places.id