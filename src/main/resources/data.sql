insert into passenger(id, firstname, lastname, frequent_flyer) values(1000, 'Natasha', 'Doe', 5780);
insert into passenger(id, firstname, lastname, frequent_flyer) values(1200, 'Nat', 'Doen', 8690);
insert into passenger(id, firstname, lastname, frequent_flyer) values(3000, 'Asha', 'Doer', 1580);
insert into passenger(id, firstname, lastname, frequent_flyer) values(4000, 'Tash', 'Doet', 5120);
insert into passenger(id, firstname, lastname, frequent_flyer) values(5000, 'Ash', 'Doem', 65011);

insert into flight (id, number, destination, departure) values (1000, 'FLW.896', 'Brussels', 'Bali');
insert into flight (id, number, destination, departure) values (2000, 'GRL.256', 'Eindhoven', 'Kreta');
insert into flight (id, number, destination, departure) values (3000, 'RKL.125', 'Charleroi', 'Tokyo');
insert into flight (id, number, destination, departure) values (4000, 'LGM.854', 'Londen', 'Cambodja');
insert into flight (id, number, destination, departure) values (5000, 'GE.258', 'Parijs', 'New york');

insert into ticket(id, price, passenger_id, flight_id) values(1000, 3500, 1000, 2000);
insert into ticket(id, price, passenger_id, flight_id) values(2000, 7850, 1200, 1000);
insert into ticket(id, price, passenger_id, flight_id) values(3000, 200, 3000, 3000);
insert into ticket(id, price, passenger_id, flight_id) values(4000, 150, 4000, 4000);