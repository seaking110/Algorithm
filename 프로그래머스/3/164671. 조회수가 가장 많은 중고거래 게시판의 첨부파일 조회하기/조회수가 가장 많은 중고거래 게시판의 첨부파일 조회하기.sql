-- 코드를 입력하세요
SELECT concat("/home/grep/src/",a.board_id,"/",f.file_id,f.file_name,f.file_ext) as file_path
FROM (
    SELECT *, 
           RANK() OVER (ORDER BY views DESC) AS ranking
    FROM used_goods_board
) AS a join used_goods_file f on a.board_id = f.board_id
where ranking = 1
order by f.file_id desc