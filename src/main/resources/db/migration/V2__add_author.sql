DROP TABLE if EXISTS `author`;

CREATE TABLE `author` (
  `id` bigint NOT NULL,
  `first_name` varchar(255),
  `last_name` varchar(255),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;