-- Creating table states
create table states (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    acronym VARCHAR(2) NOT NULL,
    zone ENUM('North', 'North East', 'Midwest', 'South East', 'South') NOT NULL,
    population DECIMAL(5,2) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY (name),
    UNIQUE KEY (acronym)
);