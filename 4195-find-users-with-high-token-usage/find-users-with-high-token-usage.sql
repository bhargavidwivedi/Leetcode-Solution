# Write your MySQL query statement below
SELECT t.user_id AS user_id, COUNT(*) AS prompt_count, ROUND(AVG(t.tokens), 2) AS avg_tokens
FROM prompts t
GROUP BY t.user_id
HAVING  COUNT(*) >= 3 AND MAX(t.tokens) > AVG(t.tokens)
ORDER BY avg_tokens DESC, user_id ASC;