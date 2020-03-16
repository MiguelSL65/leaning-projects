SELECT a.name, b.book_name
FROM authors AS a, books AS b
WHERE a.id = b.author_id AND a.name = 'Tolstoi';

SELECT COUNT(*)
FROM books
WHERE available = 'NO';

SELECT p.name
FROM books AS b, publishers AS p
WHERE b.publisher_id = p.id AND b.book_name = 'O Primo Basílio';

SELECT u.name, b.book_name, b.published_year, bl.loan_date
FROM users AS u, book_loans AS bl, books AS b 
WHERE u.id = bl.user_id AND b.id = bl.book_id AND b.published_year < 1974;    