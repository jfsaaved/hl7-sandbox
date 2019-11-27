CREATE TABLE items (
  id bigint(20) NOT NULL auto_increment,
  name VARCHAR(250),
  PRIMARY KEY (id)
)
engine = innodb
DEFAULT charset = utf8;
