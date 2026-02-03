# Write your MySQL query statement below
SELECT p.product_name 
AS product_name, s.year 
AS year, s.price 
AS price 
FROM sales s
JOIN product p
ON s.product_id = p.product_id;