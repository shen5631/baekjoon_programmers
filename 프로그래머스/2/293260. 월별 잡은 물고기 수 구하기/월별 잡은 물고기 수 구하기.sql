-- 코드를 작성해주세요
select count(*) ,MONTH(TIME) from fish_info group by MONTH(time) order by MONTH(time);