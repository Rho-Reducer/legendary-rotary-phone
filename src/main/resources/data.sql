DROP TABLE IF EXISTS articles;

create table articles (
	id int primary key,
	title varchar(250) NOT NULL,
	content varchar(2500) NOT NULL
);

insert into articles (id, title, content) values
	(1, 'Test Article 1', 'Some testing data.'),
	(2, 'Test Article 2', 'Some other date.'),
	(3, 'Test Article 3', 'Yet another set of data.');