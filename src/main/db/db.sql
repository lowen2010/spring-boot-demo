DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` varchar(64) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO t_user (id, NAME, age)
VALUES
	('1', '张三', '11'),
	('2', '李四', '12'),
	('3', 'test1', '13'),
	('4', 'test2', '14'),
	('5', 'test3', '15'),
	('6', 'test4', '16'),
	('7', 'test5', '17'),
	('8', 'test6', '18'),
	('9', 'test7', '19'),
	('10', 'test8', '20'),
	('11', 'test9', '21'),
	('12', 'test10', '22'),
	('13', 'test11', '23');
