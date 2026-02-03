# Write your MySQL query statement below
SELECT a.actor_id AS actor_id, a.director_id AS director_id
FROM actordirector a
GROUP BY a.actor_id, a.director_id
HAVING COUNT(*) >= 3;