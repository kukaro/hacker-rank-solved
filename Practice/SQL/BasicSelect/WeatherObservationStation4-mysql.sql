select (select count(city) from station) -
(select count(distinct city) from station);

-- mysql은 from안써도 됨..