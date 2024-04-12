SELECT 
    s.name as 'State', 
    c.name as 'City', 
    s.zone as 'Zone' 
FROM states s, cities c
WHERE s.id = c.state_id;

SELECT
    c.name as City,
    s.name as State,
    s.zone as Zone
FROM states s
INNER JOIN cities c
    ON s.id = c.state_id
