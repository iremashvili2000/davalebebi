/*
	yuradgeba sanam gaushvebt e diskze sheqmenit test1 faili da radgan me e diski mqonda d nacvlad e 
	aris mititebashi amitom tu e diskis magivrad d gaqvt mashin chasworet


*/

if exists(select name from sys.databases
where name='test1')
drop database test1
go

create database test1
on primary
(
name='test1',
filename='e:\test1\test1.mdf',
size=5mb,
maxsize=100mb,
filegrowth=5mb
),
filegroup gr2
(
name='test2',
filename='e:\test1\test2.ndf',
size=5mb,
maxsize=100mb,
filegrowth=5mb
)
log on
(
name='test1log',
filename='e:\test1\test1.ldf',
size=5mb,
maxsize=100mb,
filegrowth=5mb
)
go

if OBJECT_ID('Teacher','u')
is not null
drop table Teacher
go

create table Teacher
(test1_id int IDENTITY primary key,
test1_name  nvarchar(30) not null,
test1_lname nvarchar(30)not null,
test1_Gender nvarchar(20)check(test1_Gender in(N'მამრობითი',N'მდედრობითი')),
test1_Subject nvarchar(30)
)

if OBJECT_ID('Pupil','u')
is not null
drop table Pupil
go

create table Pupil
(
test1_IDI int IDENTITY primary key,
test1_Name nvarchar(30) not null,
test1_Lname nvarchar(30) not null,
test1_Gender nvarchar(20)check(test1_Gender in(N'მამრობითი',N'მდედრობითი')),
test1_class nvarchar(30)
)

if OBJECT_ID('Sherteba','u')
is not null
drop table Sherteba
go

create table Sherteba
(
test1_idi int foreign key references Teacher(test1_id),
test1_id int foreign key references Pupil(test1_IDI)
)









