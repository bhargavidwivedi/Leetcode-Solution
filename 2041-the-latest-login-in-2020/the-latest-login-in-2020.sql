# Write your MySQL query statement below
SELECT e.user_id AS user_id, MAX(e.time_stamp) AS last_stamp
FROM logins e
WHERE YEAR(e.time_stamp) = "2020%"
GROUP BY e.user_id;
