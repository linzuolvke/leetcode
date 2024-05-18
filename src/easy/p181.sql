SELECT e.`name` AS Employee FROM Employee as e inner join
(SELECT id,salary FROM Employee) es ON e.managerId = es.id
WHERE e.salary > es.salary