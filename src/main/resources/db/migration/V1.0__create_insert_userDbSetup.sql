DROP TABLE IF EXISTS library;



CREATE TABLE `user` (
  `userId` INT NOT NULL AUTO_INCREMENT,
 `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NULL,
  `user_service_type` VARCHAR(50) NULL,
  PRIMARY KEY (`userId`));

INSERT INTO user (first_name, last_name, user_service_type) VALUES
  ('vijay', 'raghavan', 'library'),
  ('ajay', 'ratra', 'laboratory'),
  ('sanjay', 'singh', 'all');
  
