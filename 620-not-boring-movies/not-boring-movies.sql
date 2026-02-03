# Write your MySQL query statement below
SELECT c.id AS id,
c.movie AS movie, 
c.description AS description, c.rating AS rating
FROM cinema c
WHERE c.id % 2 != 0 AND c.description != "boring"
ORDER BY rating DESC;