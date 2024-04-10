UPDATE states
SET name = 'Maranhão'
WHERE acronym = 'MA';

SELECT name FROM states WHERE acronym = 'MA';

UPDATE states
SET name = 'Paraná',
    population = 11.32
WHERE acronym = 'PR';

SELECT name, acronym, population
FROM states WHERE acronym = 'PR';