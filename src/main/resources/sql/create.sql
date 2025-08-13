DROP TABLE IF EXISTS items;

CREATE TABLE items (
	id bigserial NOT NULL,
	title varchar(255) NULL,
	description varchar(255) NULL,
	created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
);





