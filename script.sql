INSERT INTO authors (id, name) VALUES (1, 'Tolstoi');
INSERT INTO authors (id, name) VALUES (2, 'Eça de Queirós');
INSERT INTO authors (id, name) VALUES (3, 'Gogol');
INSERT INTO authors (id, name) VALUES (4, 'Carl Sagan');
INSERT INTO authors (id, name) VALUES (5, 'Saramago');

INSERT INTO publishers (id, name) VALUES (1,'Saída de Emergência');
INSERT INTO publishers (id, name) VALUES (2,'Porto Editora');
INSERT INTO publishers (id, name) VALUES (3,'Assírio & Alvim');
INSERT INTO publishers (id, name) VALUES (4,'Editorial Planeta');

INSERT INTO books (id, author_id, publisher_id, book_name, published_year, available) VALUES (1, 1, 1, 'Guerra e Paz', 2017, 'NO');
INSERT INTO books (id, author_id, publisher_id, book_name, published_year, available) VALUES (2, 2, 2, 'O Primo Basílio', 1878, 'NO');
INSERT INTO books (id, author_id, publisher_id, book_name, published_year, available) VALUES (3, 3, 3, 'O Retrato', 2003, 'NO');
INSERT INTO books (id, author_id, publisher_id, book_name, published_year, available) VALUES (4, 4, 4, 'Cosmos', 2019, 'NO');
INSERT INTO books (id, author_id, publisher_id, book_name, published_year, available) VALUES (5, 5, 2, 'O Memorial do Convento', 2019, 'YES');
INSERT INTO books (id, author_id, publisher_id, book_name, published_year, available) VALUES (6, 2, 2, 'O Crime do Padre Amaro', 2019, 'YES');

INSERT INTO users (id, name, city, birthday) VALUES (1,'Ricardo', 'Viana do Castelo', '1982-05-29');
INSERT INTO users (id, name, city, birthday) VALUES (2,'Pedro', 'Leça da Palmeira', '1975-02-21');
INSERT INTO users (id, name, city, birthday) VALUES (3,'Rodrigo', 'Pêra', '1999-12-22');
INSERT INTO users (id, name, city, birthday) VALUES (4,'Miguel', 'Felgueiras', '1994-01-14');

INSERT INTO book_loans (user_id, book_id, loan_date) VALUES (1, 2, '2020-03-16');
INSERT INTO book_loans (user_id, book_id, loan_date) VALUES (2, 3, '2020-03-15');
INSERT INTO book_loans (user_id, book_id, loan_date) VALUES (3, 4, '2020-03-14');
INSERT INTO book_loans (user_id, book_id, loan_date) VALUES (4, 1, '2020-03-12');
INSERT INTO book_loans (user_id, book_id, loan_date) VALUES (4, 5, '2018-03-13');