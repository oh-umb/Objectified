# Thing schema
 
# --- !Ups

CREATE TABLE thing (
    id SERIAL PRIMARY KEY,
    label varchar(255)
);
 
# --- !Downs 
DROP TABLE IF EXISTS thing;
