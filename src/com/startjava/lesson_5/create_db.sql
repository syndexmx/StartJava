\c pacificrim;

DROP TABLE IF EXISTS jaegers CASCADE;
DROP TYPE IF EXISTS statustype;

CREATE TYPE statustype AS ENUM ('ACTIVE', 'DAMAGED', 'DESTROYED');
CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY,
    model_name VARCHAR(24) NOT NULL,
    mark INT,
    height FLOAT,
    weight NUMERIC,
    status statustype,
    origin VARCHAR(36),
    launch DATE,
    kaiju_kill INT
);

\ir 'init_db.sql';
\ir 'queries.sql'

