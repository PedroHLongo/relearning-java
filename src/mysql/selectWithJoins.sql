SELECT * FROM cities c
INNER JOIN mayors m
	ON c.id = m.city_id;
    
SELECT * FROM cities c
LEFT JOIN mayors m
	ON c.id = m.city_id
ORDER BY m.id;

SELECT * FROM cities c
RIGHT JOIN mayors m
	ON c.id = m.city_id;
    
SELECT * FROM cities c
FULL JOIN mayors m
	ON c.id = m.city_id;