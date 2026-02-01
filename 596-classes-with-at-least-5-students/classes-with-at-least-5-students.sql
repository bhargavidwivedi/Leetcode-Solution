# Write your MySQL query statement below
SELECT c.class AS class
FROM courses c
GROUP BY c.class
HAVING COUNT(student) >= 5;