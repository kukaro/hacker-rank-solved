select city from STATION
where lower(substr(city, 1, 1)) in('a','e','i','o','u')
and substr(city, length(city), 1) in('a','e','i','o','u');
-- substr은 a에서부터 몇개이므로 위의 경우 1번째 인덱스에서 1개를 의미