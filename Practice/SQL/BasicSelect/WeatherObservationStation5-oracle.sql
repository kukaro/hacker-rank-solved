select *
from(
    select CITY , length(CITY)
    from STATION
    order by length(CITY), CITY
)
where ROWNUM = 1;

select *
from(
    select CITY , length(CITY)
    from STATION
    order by length(CITY) desc, CITY
)
where ROWNUM = 1;
