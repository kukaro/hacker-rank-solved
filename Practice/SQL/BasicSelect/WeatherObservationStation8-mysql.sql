select distinct CITY from STATION
where right(city, 1) in ('a','e','i','o','u')
and left(city, 1) in ('a','e','i','o','u');