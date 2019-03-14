/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50718
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-04-20 10:39:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `name` VARCHAR(20) DEFAULT NULL COMMENT 'name',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `user`(id,name) VALUES(1,'hello1');
INSERT INTO `user`(id,name) VALUES(2,'hello2');
INSERT INTO `user`(id,name) VALUES(3,'hello3');
INSERT INTO `user`(id,name) VALUES(4,'hello4');
INSERT INTO `user`(id,name) VALUES(5,'hello5');
INSERT INTO `user`(id,name) VALUES(6,'hello6');
INSERT INTO `user`(id,name) VALUES(7,'hello7');
INSERT INTO `user`(id,name) VALUES(8,'hello8');
INSERT INTO `user`(id,name) VALUES(9,'hello9');
INSERT INTO `user`(id,name) VALUES(10,'hello10');
INSERT INTO `user`(id,name) VALUES(11,'hello11');
INSERT INTO `user`(id,name) VALUES(12,'hello12');
INSERT INTO `user`(id,name) VALUES(13,'hello13');
INSERT INTO `user`(id,name) VALUES(14,'hello14');
INSERT INTO `user`(id,name) VALUES(15,'hello15');
INSERT INTO `user`(id,name) VALUES(16,'hello16');
INSERT INTO `user`(id,name) VALUES(17,'hello17');
INSERT INTO `user`(id,name) VALUES(18,'hello18');
INSERT INTO `user`(id,name) VALUES(19,'hello19');
INSERT INTO `user`(id,name) VALUES(20,'hello20');

