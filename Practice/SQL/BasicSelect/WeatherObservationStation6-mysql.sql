select CITY from STATION where left(city, 1) in ('a','e','i','o','u');
-- mysql은 대소문자 안가려서 위처럼해도됨

select CITY from STATION where BINARY(left(city, 1)) in ('A','E','I','O','U');
-- 대소문자를 정확히 가리려면 위처럼해야함