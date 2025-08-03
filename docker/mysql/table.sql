

create TABLE Persons (
    PersonID int UNIQUE AUTO_INCREMENT NOT NULL,
    Gender varchar(80) NOT NULL,
    Title varchar(255) NOT NULL,
    FirstName varchar(255) NOT NULL,
    LastName varchar(255) NOT NULL,
    Number varchar(255) NOT NULL,
    Street varchar(255) NOT NULL,
    City varchar(255) NOT NULL,
    Nat varchar(255) NOT NULL
);
insert into Persons (Gender,Title, FirstName, LastName, Number, Street, City,  Nat)
            values ('female','Mrs','Jane','Dak','8512','Makbruk','Glow','UK');



select * from Persons;


DESCRIBE Persons;
delete from Persons ;
drop table Persons;