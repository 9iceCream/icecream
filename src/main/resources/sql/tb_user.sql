use db_icecream;
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`(
	`id` INT AUTO_INCREMENT,
	`username` VARCHAR(12) NOT NULL,
	`password` VARCHAR(128) NOT NULL,
	`email` VARCHAR(48),
	`phone` INT(11),
	`intro` VARCHAR(128),
	`qq` INT,
	`wechat` VARCHAR(16),
	`address` VARCHAR(64),
	`hobby` VARCHAR(48),
	`role` INT(2),
	`create_time` TIME,
	`update_time` TIME,
	`birthday` DATE,
	`state` INT(2),
	PRIMARY KEY(`id`),
	UNIQUE index_user (email),
	UNIQUE index_email (username),
	UNIQUE index_phone (phone),
	INDEX index_user_email (email,username)  
)ENGINE=InnoDB DEFAULT CHARSET=utf8;