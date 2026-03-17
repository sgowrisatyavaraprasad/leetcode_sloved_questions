/* Write your PL/SQL query statement below */
SELECT m.name AS Employee  FROM
Employee e
JOIN
Employee m
ON e.id = m.managerId
WHERE m.salary > e.salary;