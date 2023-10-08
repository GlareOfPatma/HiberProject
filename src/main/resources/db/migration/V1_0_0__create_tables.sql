CREATE TABLE IF NOT EXISTS persons(
    id int,
    surname varchar(255),
    nameMain varchar(255),
    secondName varchar(255),
    age int,
    driverLicense boolean,
    debt numeric,
    PRIMARY KEY(id)
);
CREATE TABLE IF NOT EXISTS accounts(
    accountNumber varchar(255),
    personId int,
    openingDate date,
    fullName varchar(255),
    balance numeric,
    PRIMARY KEY(accountNumber),
    FOREIGN KEY(personId) REFERENCES public.persons(id)
);