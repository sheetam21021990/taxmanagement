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

insert  into `basic_salary_details`(`sl_no`,`user_id`,`job_description`,`gross_salary`,`da`,`allowance`,`medical`,`servant`,`transport`) values (2,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(3,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(4,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(5,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(6,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(7,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(8,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(9,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(10,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(11,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(12,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null'),(13,'sheetam123','jhvjhvjh','500000','vjhvjh','vhv','jhvjhv','jhvjh','null');

/*Table structure for table `income_tax_details` */

DROP TABLE IF EXISTS `income_tax_details`;

CREATE TABLE `income_tax_details` (
  `sl_no` int(11) NOT NULL auto_increment,
  `user_id` varchar(10) NOT NULL,
  `assesment_year` date NOT NULL,
  `paid_month` varchar(10) NOT NULL,
  `paid_incometax` int(11) NOT NULL,
  PRIMARY KEY  (`sl_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `income_tax_details` */

insert  into `income_tax_details`(`sl_no`,`user_id`,`assesment_year`,`paid_month`,`paid_incometax`) values (1,'sheetam123','2014-01-01','MARCH',2000),(2,'sheetam123','2014-01-01','APRIL',5000),(3,'sheetam123','2014-01-01','MAY',7000),(12,'sheetam123','2014-01-01','AUGUST',10000),(15,'sheetam123','2014-01-01','MAY',3000);

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

/*Table structure for table `tax_rates` */

DROP TABLE IF EXISTS `tax_rates`;

CREATE TABLE `tax_rates` (
  `id` int(10) NOT NULL auto_increment,
  `income_min` int(10) default NULL,
  `income_max` int(10) default NULL,
  `age_min` int(10) default NULL,
  `age_max` int(10) default NULL,
  `tax_percentage` decimal(10,2) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `tax_rates` */

insert  into `tax_rates`(`id`,`income_min`,`income_max`,`age_min`,`age_max`,`tax_percentage`) values (1,0,200000,0,60,'0.00'),(2,0,200000,60,80,'0.00'),(3,0,200000,80,NULL,'0.00'),(4,200001,250000,0,60,'10.00'),(5,200001,250000,60,80,'0.00'),(6,200001,250000,80,NULL,'0.00'),(7,250001,500000,0,60,'10.00'),(8,250001,500000,60,80,'10.00'),(9,250001,500000,80,NULL,'0.00'),(10,500001,1000000,NULL,60,'20.00'),(11,500001,1000000,60,80,'20.00'),(12,500001,1000000,80,NULL,'20.00'),(13,1000000,NULL,NULL,60,'30.00'),(14,1000000,NULL,60,80,'30.00'),(15,1000000,NULL,80,NULL,'30.00');

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
  `dob` date NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `user_details` */

insert  into `user_details`(`id`,`username`,`password`,`fullname`,`pancard_no`,`voter_id`,`fax_no`,`phone_no`,`mobile_no`,`address`,`email_id`,`status`,`user_type`,`dob`) values (1,'sheetam123','sheetam','','sheetam','sheetam','sheetam','sheetam','sheetam','sheetam','sheetam','A','USER','1990-02-21'),(2,'wbnfwgnb','ihgb','uiogbuyhb','uyhb','uyhb','uyhb','uyh','bvuyh','buyhb','uyhb','null','USER','1990-02-21');

/* Function  structure for function  `taxcalculator` */

/*!50003 DROP FUNCTION IF EXISTS `taxcalculator` */;
DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` FUNCTION `taxcalculator`(income int,dob DATE) RETURNS decimal(10,0)
    DETERMINISTIC
BEGIN 
  DECLARE taxpercentage DECIMAL;
  DECLARE taxammount DECIMAL;
  DECLARE age int;
	
	SELECT TIMESTAMPDIFF(YEAR,dob,CURDATE()) into age;
	
	SELECT tax_percentage INTO taxpercentage FROM tax_rates 
	WHERE income > income_min AND IF(income_max IS NULL, TRUE ,income <= income_max)
	AND age > age_min AND IF(age_max IS NULL, TRUE ,age <= age_max);
  
	
	set taxammount = (taxpercentage*income)/100;
  
  
  RETURN taxammount;
END */$$
DELIMITER ;

/* Procedure structure for procedure `p_taxcalculation` */

/*!50003 DROP PROCEDURE IF EXISTS  `p_taxcalculation` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `p_taxcalculation`(
	in i_user_id varchar(50),
	in i_assessment_year date,
	out o_tax int(10),
	OUT o_gross_salary int(10)
)
BEGIN
select distinct taxcalculator(gross_salary,ud.dob),gross_salary into o_tax, o_gross_salary
FROM basic_salary_details bsd, user_details ud
WHERE ud.username = bsd.user_id
AND bsd.user_id = i_user_id;
select 'NOT PAID' AS paid_month,(o_tax - sum(paid_incometax)) AS paid_incometax
FROM income_tax_details itd
WHERE user_id = i_user_id
AND assesment_year = i_assessment_year
union
SELECT DISTINCT paid_month,paid_incometax
FROM income_tax_details itd
WHERE user_id = i_user_id
AND assesment_year = i_assessment_year;
END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
