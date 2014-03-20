/*
SQLyog Community Edition- MySQL GUI v8.2 
MySQL - 5.0.27-community-nt : Database - taxmanagement
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`taxmanagement` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `taxmanagement`;

/*Table structure for table `basic_salary_details` */

DROP TABLE IF EXISTS `basic_salary_details`;

CREATE TABLE `basic_salary_details` (
  `sl_no` int(11) NOT NULL auto_increment,
  `user_id` varchar(10) NOT NULL,
  `job_description` varchar(20) NOT NULL,
  `gross_salary` varchar(10) NOT NULL,
  `da` varchar(10) NOT NULL,
  `allowance` varchar(10) NOT NULL,
  `medical` varchar(10) NOT NULL,
  `servant` varchar(10) NOT NULL,
  `transport` varchar(10) NOT NULL,
  PRIMARY KEY  (`sl_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `basic_salary_details` */

insert  into `basic_salary_details`(`sl_no`,`user_id`,`job_description`,`gross_salary`,`da`,`allowance`,`medical`,`servant`,`transport`) values (2,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(3,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(4,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(5,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(6,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(7,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(8,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(9,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(10,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(11,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(12,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(13,'sheetam123','jhvjhvjh','vjhvjh','vjhvjh','vhv','jhvjhv','jhvjh','null'),(14,'sheetam123','','','','','','','null'),(15,'sheetam123','','','','','','','null');

/*Table structure for table `income_tax_details` */

DROP TABLE IF EXISTS `income_tax_details`;

CREATE TABLE `income_tax_details` (
  `sl_no` int(11) NOT NULL auto_increment,
  `user_id` varchar(10) NOT NULL,
  `assesment_year` varchar(10) NOT NULL,
  `paid_incometax` int(11) NOT NULL,
  PRIMARY KEY  (`sl_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `income_tax_details` */

insert  into `income_tax_details`(`sl_no`,`user_id`,`assesment_year`,`paid_incometax`) values (1,'sheetam123','12/02/1990',2000),(2,'sheetam123','12/02/1990',2000),(3,'sheetam123','12/02/1990',2000),(4,'sheetam123','dfgbdfb',0),(5,'sheetam123','dfgbdfb',0),(6,'sheetam123','dfgbdfb',0),(7,'sheetam123','dfgbdfb',0),(8,'sheetam123','dfgbdfb',0),(9,'sheetam123','dfgbdfb',0),(10,'sheetam123','dfgbdfb',0);

/*Table structure for table `perquisites_details` */

DROP TABLE IF EXISTS `perquisites_details`;

CREATE TABLE `perquisites_details` (
  `sl_no` int(11) NOT NULL auto_increment,
  `user_id` varchar(10) NOT NULL,
  `free_housing` varchar(10) NOT NULL,
  PRIMARY KEY  (`sl_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `perquisites_details` */

insert  into `perquisites_details`(`sl_no`,`user_id`,`free_housing`) values (1,'sheetam123','123'),(2,'sheetam123','123');

/*Table structure for table `user_details` */

DROP TABLE IF EXISTS `user_details`;

CREATE TABLE `user_details` (
  `id` int(10) NOT NULL auto_increment,
  `username` varchar(50) collate utf8_bin NOT NULL,
  `password` varchar(50) collate utf8_bin NOT NULL,
  `fullname` varchar(50) collate utf8_bin NOT NULL,
  `pancard_no` varchar(50) collate utf8_bin NOT NULL,
  `voter_id` varchar(50) collate utf8_bin NOT NULL,
  `fax_no` varchar(50) collate utf8_bin default NULL,
  `phone_no` varchar(15) collate utf8_bin default NULL,
  `mobile_no` varchar(15) collate utf8_bin default NULL,
  `address` varchar(100) collate utf8_bin default NULL,
  `email_id` varchar(50) collate utf8_bin NOT NULL,
  `status` varchar(10) collate utf8_bin NOT NULL,
  `user_type` varchar(10) collate utf8_bin NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user_details` */

insert  into `user_details`(`id`,`username`,`password`,`fullname`,`pancard_no`,`voter_id`,`fax_no`,`phone_no`,`mobile_no`,`address`,`email_id`,`status`,`user_type`) values (1,'sheetam123','sheetam','sheetam','sheetam','sheetam','sheetam','sheetam','sheetam','sheetam','sheetam','A','ADMIN');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
