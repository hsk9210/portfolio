CREATE TABLE `person` (

  `idx` int(11) NOT NULL AUTO_INCREMENT,

  `name` varchar(45) CHARACTER SET utf8 DEFAULT NULL,

  `age` int(11) NOT NULL DEFAULT '0',

  `create_at` datetime DEFAULT NULL,

  PRIMARY KEY (`idx`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8;



출처: https://onecellboy.tistory.com/349 [신불사 - 신현호라 불리는 사나이]