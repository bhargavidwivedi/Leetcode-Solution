# Write your MySQL query statement below
SELECT e1.unique_id AS unique_id, e.name AS name
FROM employees e
LEFT JOIN employeeuni e1
ON e.id = e1.id;

