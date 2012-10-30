CREATE SEQUENCE product_id_seq;

CREATE TABLE products (
	id int not null default nextval('product_id_seq'),
	description varchar(255) not null default '',
	price numeric(15,2)
);

CREATE INDEX product_id_idx on products(id);
CREATE INDEX product_desc_idx on products(description);