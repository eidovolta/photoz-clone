create table if not exists PHOTOZ(
	ID int primary key not null auto_increment,
	FILE_NAME varchar(255),
	CONTENT_TYPE varchar(255),
	DATA binary large object
);