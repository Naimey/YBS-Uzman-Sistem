-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.30-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ybs_ilac
--

CREATE DATABASE IF NOT EXISTS ybs_ilac;
USE ybs_ilac;

--
-- Definition of table `hastabilg`
--

DROP TABLE IF EXISTS `hastabilg`;
CREATE TABLE `hastabilg` (
  `idhastaid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `adi` varchar(45) NOT NULL,
  `soyadi` varchar(45) NOT NULL,
  `yasi` int(10) unsigned NOT NULL,
  PRIMARY KEY (`idhastaid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hastabilg`
--

/*!40000 ALTER TABLE `hastabilg` DISABLE KEYS */;
INSERT INTO `hastabilg` (`idhastaid`,`adi`,`soyadi`,`yasi`) VALUES 
 (1,'naime','yalcin',44),
 (2,'sfsd','fibs',43),
 (3,'vzd','sdv',22),
 (4,'asd','asdd',21),
 (5,'esdas','asd',22),
 (6,'asd','sda',22),
 (7,'adffa','asd',21),
 (8,'svds','asd',21);
/*!40000 ALTER TABLE `hastabilg` ENABLE KEYS */;


--
-- Definition of table `ilaclar`
--

DROP TABLE IF EXISTS `ilaclar`;
CREATE TABLE `ilaclar` (
  `ilac_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ilacadi` varchar(45) NOT NULL,
  `puani` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ilac_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ilaclar`
--

/*!40000 ALTER TABLE `ilaclar` DISABLE KEYS */;
INSERT INTO `ilaclar` (`ilac_id`,`ilacadi`,`puani`) VALUES 
 (1,'Parol',40),
 (2,'Majezik',50),
 (3,'Teraflu',35),
 (4,'Aferin',60),
 (5,'Sistenol',0);
/*!40000 ALTER TABLE `ilaclar` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
