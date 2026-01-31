# Write your MySQL query statement below
SELECT e1.id AS Id 
FROM Weather e1
JOIN Weather e2
ON e1.recordDate = DATE_ADD(e2.recordDate, INTERVAL 1 DAY)
WHERE e1.temperature > e2.temperature ;
