CREATE TABLE items (
  id bigint(20) NOT NULL auto_increment,
  name VARCHAR(250),
  PRIMARY KEY (id)
)
engine = innodb
DEFAULT charset = utf8;

CREATE TABLE shopping_carts (
  id bigint(20) NOT NULL auto_increment,

  PRIMARY KEY (id)
)
engine = innodb
DEFAULT charset = utf8;

CREATE TABLE item_shopping_cart_relations(
    item_id bigint(20) NOT NULL,
    shopping_cart_id bigint(20) NOT NULL,
    FOREIGN KEY (item_id) REFERENCES items(id),
    FOREIGN KEY (shopping_cart_id) REFERENCES shopping_carts(id),
    UNIQUE (item_id, shopping_cart_id)
);