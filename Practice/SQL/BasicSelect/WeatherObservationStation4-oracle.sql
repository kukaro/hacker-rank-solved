select
(select count(city) from station) -
(select count(distinct city) from station)
from dual;

-- select로 값 출력할려면 dual테이블 써야함
-- dual은 더미임
-- 이때 굳이 dual아니더라도 table에 column하나고 값하나면 다됨