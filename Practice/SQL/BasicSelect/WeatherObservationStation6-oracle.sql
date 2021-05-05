select city from STATION where substr(city, 1, 1) in('A','E','I','O','U');
-- substr은 a에서부터 몇개이므로 위의 경우 1번째 인덱스에서 1개를 의미