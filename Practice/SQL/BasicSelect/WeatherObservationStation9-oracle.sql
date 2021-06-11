select distinct city from STATION
where lower(substr(city, 1, 1)) not in ('a','e','i','o','u');
