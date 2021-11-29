create sequence "products_maker-id_seq"
	as integer;

alter sequence "products_maker-id_seq" owner to postgres;

create table products
(
	ean_code text not null
		constraint products_pk
			primary key,
	product_name text,
	description text,
	maker_id integer default nextval('store."products_maker-id_seq"'::regclass) not null,
	category_id serial,
	sell_price double precision,
	remaining integer,
	purchase_price integer
);

alter table products owner to postgres;

alter sequence "products_maker-id_seq" owned by products.maker_id;

create table categories
(
	id serial,
	parent_id integer,
	category_name text
);

alter table categories owner to postgres;

create table makers
(
	id serial,
	maker_name text
);

alter table makers owner to postgres;

create table sales
(
	id serial,
	product_id text,
	sell_price double precision,
	sell_date timestamp,
	receipt_id integer,
	quantity integer
);

alter table sales owner to postgres;

create table purchases
(
	id serial,
	product_id text,
	purchase_price integer,
	purchase_date timestamp
);

alter table purchases owner to postgres;

create table receipts
(
	id serial,
	receipt_date timestamp,
	sum_price double precision
);

alter table receipts owner to postgres;

