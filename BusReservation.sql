--User Table:
create table users
( 
  username varchar2(100),
  password varchar2(100) NOT NULL,
  name varchar2(100),
  email varchar2(100) NOT NULL,
  phonenumber number(10) NOT NULL
);

--Bus_ROUTE Table:
create table bus_route
(
  routeid number(10),
  source varchar2(50) NOT null,
  destination varchar2(50) not null,
  price NUMBER(6,2) NOT NULL,
  departure_time VARCHAR2(20) NOT NULL,
  arrival_time VARCHAR2(20) NOT NULL
  );  


insert into bus_route values(100,'Atlanta','Columbus',20.00,'12:00PM','02:00PM');
insert into bus_route values(101,'Atlanta','Columbus',20.00,'10:00AM','12:00PM');
insert into bus_route values(102,'Columbus','Atlanta',20.00,'04:00PM','06:00PM');
insert into bus_route values(103,'Columbus','Atlanta',20.00,'08:00PM','10:00PM');
insert into bus_route values(104,'Dallas','Austin',25.00,'05:00PM','10:00PM');
insert into bus_route values(105,'Dallas','Austin',36.00,'06:00PM','11:00PM');
insert into bus_route values(106,'Dallas','Chicago',40.00,'07:00PM','11:00PM');
insert into bus_route values(107,'Dallas','San Antanio',50.00,'08:00PM','12:00PM');
insert into bus_route values(108,'Dallas','San Antanio',65.00,'09:00PM','01:00PM');
insert into bus_route values(109,'Dallas','Houston',32.00,'10:00PM','04:00AM');
insert into bus_route values(110,'Dallas','Houston',48.00,'11:00PM','10:00PM');
insert into bus_route values(111,'San Fransico','Berkely',47.00,'12:00AM','10:00PM');
insert into bus_route values(112,'San Fransico','San Diego',31.00,'01:00AM','10:00PM');
insert into bus_route values(113,'San Fransico','Phoneix',29.00,'02:00PM','10:00PM');
insert into bus_route values(114,'New York','Washington',22.00,'03:00PM','10:00PM');
insert into bus_route values(115,'New York','Atlanta',70.00,'04:00AM','10:00PM');
insert into bus_route values(116,'New York','Charlotte',40.00,'05:00AM','10:00PM');
insert into bus_route values(117,'New York','Grenville',50.00,'06:00AM','10:00PM');
insert into bus_route values(118,'Houston','Dallas',28.00,'07:00AM','10:00AM');
insert into bus_route values(119,'Houston','Austin',29.00,'08:00AM','10:00AM');
insert into bus_route values(120,'Nashville','Atlanta',21.00,'09:00AM','10:00PM');
insert into bus_route values(121,'Nashville','Atlanta',31.00,'10:00AM','03:00PM');
insert into bus_route values(122,'Nashville','Atlanta',34.00,'11:00AM','04:00PM');
insert into bus_route values(123,'Columbus','Nashville',44.00,'12:00AM','08:00PM');
insert into bus_route values(124,'Columbus','Nashville',44.00,'01:00AM','06:00AM');
insert into bus_route values(125,'Columbus','Birmingham',38.00,'02:00PM','10:00PM');
insert into bus_route values(126,'Columbus','Montegomery',25.00,'03:00PM','10:00PM');
insert into bus_route values(127,'Knoxville','Atlanta',37.00,'04:00PM','10:00PM');
insert into bus_route values(128,'Atlanta','Knoxville',49.00,'05:00PM','10:00PM');
insert into bus_route values(129,'Birmingham','Columbus',37.00,'06:00PM','10:00PM');



create table ticket
(
  TicketID Number(8),
  routeid number(10),
  username varchar2(100),
  name varchar2(100),
  travel_date DATE,
  seat_no NUMBER(10),
  price  NUMBER(6,2) NOT NULL
);  


create sequence ticketid_seq
START WITH 10000
INCREMENT BY 1;
