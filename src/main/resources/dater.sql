
drop database if exists dating;
create database if not exists dating;
use dating 

create table dater(
	user_id INTEGER NOT NULL AUTO_INCREMENT,
	gender int not null,
	first_name varchar(20) NOT NULL ,
	last_name varchar(20) NOT NULL ,
	birth_date DATE,
	joining_date DATE,
	religion varchar(20),
	mother_tongue varchar(20),
	country varchar(20),
	city varchar(20),
	mobile_number varchar(20),
	enabled INTEGER comment 'can be 0-disabled, 1-Enabled',
	paid_membership int  comment 'can be 0-NotPaid, 1-Gold, 2-Silver',
	payment_date DATETIME,
	username varchar(20),
	password varchar(20),
	
	primary key( user_id )
);

create index idx_userid on dater(user_id);

create table daters(

        user_id INTEGER NOT NULL,
        date_id INTEGER NOT null,
        is_blockedby integer comment 'which one blocked , if empty or null , means can communicate',
        foreign key (user_id) references dater(user_id)
);


create table daters_message(

        user_id INTEGER NOT NULL,
        date_id INTEGER NOT null,
		message varchar(64000),
        foreign key (user_id) references dater(user_id)
);

insert into dater(user_id,gender,first_name,last_name,birth_date,
joining_date,religion,mother_tongue,country,city,mobile_number,enabled, paid_membership, payment_date, username,password)
values
(1,1,'Mamuka','Arabuli',str_to_date('04-01-1976', '%d-%m-%Y'),str_to_date('01-01-2020', '%d-%m-%Y'),'Christian',
'Georgian', 'USA', 'Jersey City', '+1234567890',1,0, now(), 'marabuli', 'secretdate');


insert into dater(user_id,gender,first_name,last_name,birth_date,
joining_date,religion,mother_tongue,country,city,mobile_number,enabled, paid_membership, payment_date, username,password)
values
(2,1,'Melissa','Swarowsky',str_to_date('08-02-1978', '%d-%m-%Y'),str_to_date('04-03-2020', '%d-%m-%Y'),'Christian',
'American', 'USA', 'Miami', '+123452345',1,0, now(), 'mswarowsky', 'passcode');


insert into daters_message(user_id, date_id, message) values (1,2,'hello dear');
