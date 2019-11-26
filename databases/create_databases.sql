DROP DATABASE IF EXISTS shopping_item_dev;
DROP DATABASE IF EXISTS shopping_cart_dev;
DROP DATABASE IF EXISTS shopping_item_test;
DROP DATABASE IF EXISTS shopping_cart_test;

CREATE USER IF NOT EXISTS 'shopping'@'localhost'
  identified by '';
GRANT ALL PRIVILEGES ON *.* TO 'shopping' @'localhost';

CREATE DATABASE shopping_item_dev;
CREATE DATABASE shopping_cart_dev;
CREATE DATABASE shopping_item_test;
CREATE DATABASE shopping_cart_test;

