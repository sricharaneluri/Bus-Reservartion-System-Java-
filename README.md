
1.	Introduction	
The purpose of this document is to describe in detailed the design of the Online Bus Reservation System project. This document cover three main areas Application flow, technologies used and the detailed design of the project. 
2.	Purpose 
Buses are the most frequently available and most used vehicle for going from small distance trip to very long trip. They’re a no. of types of buses available in the market according to the private or public. What the problem here arises about the ticket is everyone has to take a card and want seats. But it’s not possible. The buses which will register on our system will have the option to give their customers an option to select the seats of the bus according to their wish as many places depending on the availability.
Making the system more useful unique tickets will be generated as its seats confirmed. Here we are with a system which can facilitate the users to which they can get their seats prior.

3.	Users and Stakeholders
Bus reservation system is made of the combination of modules which work with collaboration with each other and make it beneficial to accomplish the main aim of the scheme.
The main users of this application will be customers as it will enable them to book a seat in a bus by choosing the route, travel date and the available seats.
The Admin will have access to the route management, user management and balance sheets.
4.	System / Application Overview
There are two components in the online Bus Reservation System.
•	Admin Portal.
•	User Portal.

Scope of Admin Portal:
•	Admin Login
•	User Management
•	Route Management
•	Balance Sheet
•	Ticket Search.

Admin Login: Admin of the application can login from this page.
User Management: Admin of the application can manage the users such as edit the details of the users and delete the users.
Route Management: Admin can add routes, delete routes, edit routes and can view all the routes.
Balance Sheet: Admin can check for total sales happened in the specified date range.
Ticket Search: Admin of the application can get the all the tickets when specified by bus route and the journey start date.
 
Scope of User Portal:
•	User Registration
•	User Login.
•	Book Ticket
•	Cancel Ticket
•	Retrieve Ticket

User Registration: Customer needs to create an account in order to book a ticket.
User Login: Customers already registered can directly login from User Login.
Book Ticket: Once the customer logins he can book a ticket using the source, destination and date of journey fields, after that customer has a choice of choosing the seat.
Cancel Ticket:  Customer can cancel the ticket by giving the Ticket Id, Customer needs to give his/her ticket Id only in order to cancel a ticket. If the customer gives any other ticket ID it will show as invalid ticket ID.
Retrieve Ticket: Customer can retrieve the ticket of his booking by giving his/her ticket Id only in order to retrieve the ticket. If the customer gives any other ticket ID it will show as invalid ticket ID.
 

5.	Design Patterns Applied
Online Bus Reservation system application has been developed by using the MVC(Strategy, Observer and Composite) Design pattern.

MVC Design Pattern
The MVC design pattern is used to separate the application's concerns.
•	The Model represents the objects carrying the data and it also updates the controller if the data changes.
•	The View is used for the visualization of the data that the model contains.
•	The Controller acts on both, the model and view. It controls the data flow into the model object and updates the view whenever the data changes. It keeps the view and model separate.
For the MVC design pattern, the code is split into 3 different packages – Model, View, and Controller. 

Model : 
Model package has the following classes
•	Home
•	Bus
•	Ticket	
Home.java:  In this class we have the methods related to the Users attributes such register, Login, etc.
Bus.java:  In this Class we have methods related to the bus attributes such as source, destination, depratureTime, routeID, etc.
Ticket.java: In this class we have the methods related ticket attributes such as getSeatNo, getAmount, getDate, etc
			

View: 
View package has the user interfaces in it with the following classes.
•	AddRouteGUI.java : This UI is used by the admin to add the bus routes.
•	AdminLoginGUI.java: This UI is used for the admin login.
•	AdminRouteMgt.java: UI is used by admin, for the route management.
•	AdminUserMgt.java: UI used by admin, for the user management.
•	AllRoutesGUI.java: UI used by admin, to view all the available routes .
•	BalanceSheetGUI.java: UI used by admin, to check the ticket sales details
•	BookTicketGUI.java: UI used by the user, to book the ticket.
•	BusLayoutGUI.java: UI Used by the user, to choose the seat on the bus.
•	CancelHomeGUI.java: UI used by user, to enter the ticket id for cancelling the ticket.
•	CancelTicketGUI.java: UI used by the user to confirm the cancelation of the ticket.
•	EditRouteGUI.java: UI used by the admin, to edit the route details.
•	EditUserGUI.java: UI used by admin, to edit the user details.
•	HomeGUI.java: UI used by both user and admin in order to login into the application
•	PrintTicketGUI.java: UI used by user and admin for printing of the ticket.
•	RetrieveTicketGUI.java: UI used by both user in order to retrieve the ticket
•	TicketSearchGUI.java: UI Used by the admin to retrieve all the tickets.



Controller:
Controller package will connect to the database and handles the database operations. It also links the model with the view.
Controller package has the following interfaces and classes.
•	DDL_Interface.java
•	DML_Interface.java
•	DDL_Queries.java
•	DML_Queries.java
•	DB.java
•	BalanceSheetObj.java
•	TicketObj.java
•	BusObj.java
DB Interface has been created to encapsulate the DB login details to the client.
DDL_Interface and DML_Interface are created to encapsulate the classes in the Database. DDL_Queries and DML_Queries classes will handle the database operations.
BalanceSheetObj, TicketObj, BusObj these classes are created in order to handle the data when we need to fill the tables in GUI, so that other methods of database will be called only once .

6.	Application technology overview

S No.	Technology	Version
1	Windows	10
2	Java	1.8
3	Oracle Developer	11G
4	NetBeans	8.2

7.	External Interfaces
S No.
	Technology	Version	Comments
1	JCalendar	1.4	JCalendar is a Java date chooser bean for graphically picking a date. JCalendar is composed of several other Java beans, a JDayChooser, a JMonthChooser and a JYearChooser. Also part of the package is a JDateChooser, a bean composed of an IDateEditor (for direct date editing) and a button for opening a JCalendar for selecting the date.
2	OJDBC	1.4	Controller requires a Java Database Connectivity file (also known as a 'JDBC Thin Driver') to connect its several JAVA components with the database server.
