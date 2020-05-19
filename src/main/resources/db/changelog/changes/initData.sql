
INSERT into address (actual_address, code, street, district, voivodeship, city, country, phone,
                     house_number, flat_number)
VALUES (true, '20-043', 'Al.Racławickie', 'Lublin', 'Lubelskie', 'Lublin', 'Polska','+48514312458','5',null);
INSERT into address (actual_address, code, street, district, voivodeship, city, country, phone,
                     house_number, flat_number)
VALUES (false, '20-043', 'ul.Lubomelska', 'Lublin', 'Lubelskie', 'Lublin', 'Polska','+48514312458','3','2');
INSERT into address (actual_address, code, street, district, voivodeship, city, country, phone,
                     house_number, flat_number)
VALUES (true, 'SW1-A11', 'Downing St.', '-', '-', 'London', 'UK','+443121212458','1',null);



INSERT into type_of_student (monthly_payment, description)
values (1000, 'Studia II stopnia');
INSERT into type_of_student (monthly_payment, description)
values (800, 'Studia I stopnia');
INSERT into type_of_student (monthly_payment, description)
values (1500, 'Studia Doktoranckie');
INSERT into type_of_student (monthly_payment, description)
values (500, 'Studia Podyplomowe');


INSERT into type_of_housing (cost, description)
values (350, 'Pokój 3-osobowy');
INSERT into type_of_housing (cost, description)
values (400, 'Pokój 2-osobowy');
INSERT into type_of_housing (cost, description)
values (500, 'Pokój 1-osobowy');
INSERT into type_of_housing (cost, description)
values (1, 'Stancja');

INSERT into student (name, surname, father_name, place_of_birth, country_of_birth, nationality,
                     nationality_of_birth, address_of_residence, actual_address, address_type, type_of_student)
values ('Adam', 'Nowak', 'Jan', 'Lublin', 'Polska', 'Polak', 'Polak',1,1,1,1);
INSERT into student (name, surname, father_name, place_of_birth, country_of_birth, nationality,
                     nationality_of_birth, address_of_residence, actual_address, address_type, type_of_student)
values ('Jan', 'Kowalski', 'Adam', 'London', 'UK', 'Polak', 'UK',1,3,2,2);
INSERT into student (name, surname, father_name, place_of_birth, country_of_birth, nationality,
                     nationality_of_birth, address_of_residence, actual_address, address_type, type_of_student)
values ('Bin', 'Tomczyk', 'Jerzy', 'Warszawa', 'Polska', 'Polak', 'Polak',1,3,2,2);

insert into payments_log (student_id, payout_amount, payment_date) VALUES
(1,256,'2020-03-25');
insert into payments_log (student_id, payout_amount, payment_date) VALUES
(1,5000,'2020-04-25');
insert into payments_log (student_id, payout_amount, payment_date) VALUES
(1,675,'2020-04-25');
insert into payments_log (student_id, payout_amount, payment_date) VALUES
(1,201,'2020-05-23');

insert into payments_log (student_id, payout_amount, payment_date) VALUES
(2,256,'2020-01-05');
insert into payments_log (student_id, payout_amount, payment_date) VALUES
(2,5000,'2020-02-03');
