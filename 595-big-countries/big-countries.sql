# Write your MySQL query statement below
SELECT e.name AS name, e.population AS population, e.area AS area
FROM world e
WHERE e.area >= 3000000 OR e.population >= 25000000; 