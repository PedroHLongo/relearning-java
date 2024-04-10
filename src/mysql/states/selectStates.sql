SELECT * FROM states

SELECT name, acronym, zone FROM states
WHERE zone = 'South'

SELECT name, zone, population FROM states
WHERE population >= 10
ORDER BY population