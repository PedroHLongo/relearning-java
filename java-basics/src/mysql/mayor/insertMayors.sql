SELECT * FROM mayors;

INSERT INTO mayors
    (name, city_id)
VALUES 
    ('Rodrigo Neves', (SELECT id FROM cities WHERE name = 'Campinas')),
    ('Raquel Lyra', (SELECT id FROM cities WHERE name = 'Caruaru')),
    ('Zenaldo Coutinho', null);

INSERT INTO mayors
    (name, city_id)
VALUES
    ('Rafael Greca', null);