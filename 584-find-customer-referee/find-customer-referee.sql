# Write your MySQL query statement below
SELECT e.name AS name
FROM customer e
JOIN customer e1
ON e.id = e1.id
WHERE e.referee_id != 2 OR e.referee_id IS NULL;