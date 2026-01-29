# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary fROM Employee 
WHERE salary < (SELECT MAX(salary) FROM Employee);