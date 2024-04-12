SELECT * FROM cities;

INSERT INTO cities (name, area, state_id)
VALUES ('Campinas', 795, 133);

INSERT INTO cities (name, area, state_id)
VALUES ('Niterói', 133.9, 127);

INSERT INTO cities (name, area, state_id)
VALUES 
    ('Caruaru', 920.6, 
        (SELECT id FROM states WHERE acronym = 'PE')
    );

INSERT INTO cities (name, area, state_id)
VALUES 
    ('Juazeiro do Norte', 248.2, 
        (SELECT id FROM states WHERE acronym = 'CE')
    );