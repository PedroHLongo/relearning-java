SELECT
    zone as 'Zone',
    sum(population) as 'Total' -- aggregate funcion
FROM states
GROUP BY zone -- when using group by collumn, it needs to select the collumn (line 2)
ORDER BY Total desc;

SELECT
    sum(population) as 'Total' -- aggregate funcion
FROM states;