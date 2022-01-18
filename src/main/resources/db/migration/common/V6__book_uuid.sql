CREATE TABLE `book_uuid` (
  `id` binary(16) NOT NULL,
  `isbn` varchar(255),
  `publisher` varchar(255),
  `title` varchar(255),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;
