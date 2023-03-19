DROP TABLE IF EXISTS articles;

create table articles (
	id int primary key,
	title varchar(250) NOT NULL,
	content varchar(2500) NOT NULL,
	summary varchar(500)
);

insert into articles (id, title, summary, content) values
	(1, 'Test Article 1', 'Some testing data.', 'placeholder'),
	(2, 'Test Article 2', 'Some other date.', 'placeholder'),
	(3, 'Test Article 3', 'Yet another set of data.', 'placeholder');