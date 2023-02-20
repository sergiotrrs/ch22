-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bank_jh
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idcliente` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `email` varchar(150) NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `idsucursal` int unsigned DEFAULT NULL,
  PRIMARY KEY (`idcliente`),
  KEY `fk_cliente_has_sucursal_idx` (`idsucursal`),
  CONSTRAINT `fk_cliente_has_sucursal` FOREIGN KEY (`idsucursal`) REFERENCES `sucursal` (`idsucursal`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Christian','Siruguet','tian@ibero.mx','2003-12-05',1),(2,'Fernanda','Gancedo','ferganoso@ibero.mx','2001-03-15',1),(3,'Daniel','Ruiz','danyloops@cfe.mx','1993-10-11',3),(4,'Juan','Herrera','juanverdadero@generation.mx','1995-04-18',1),(5,'Gianna','Del Fabbro','gibebe@bloquearq.mx','1997-08-26',3),(6,'Sergio','Torres','serge@generation.mx','1983-12-08',1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente_has_tipotarjeta`
--

DROP TABLE IF EXISTS `cliente_has_tipotarjeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente_has_tipotarjeta` (
  `cliente_idcliente` int unsigned NOT NULL,
  `tipotarjeta_idtarjeta` int unsigned NOT NULL,
  PRIMARY KEY (`cliente_idcliente`,`tipotarjeta_idtarjeta`),
  KEY `fk_cliente_has_tipotarjeta_tipotarjeta1_idx` (`tipotarjeta_idtarjeta`),
  KEY `fk_cliente_has_tipotarjeta_cliente1_idx` (`cliente_idcliente`),
  CONSTRAINT `fk_cliente_has_tipotarjeta_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`),
  CONSTRAINT `fk_cliente_has_tipotarjeta_tipotarjeta1` FOREIGN KEY (`tipotarjeta_idtarjeta`) REFERENCES `tipotarjeta` (`idtarjeta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_has_tipotarjeta`
--

LOCK TABLES `cliente_has_tipotarjeta` WRITE;
/*!40000 ALTER TABLE `cliente_has_tipotarjeta` DISABLE KEYS */;
INSERT INTO `cliente_has_tipotarjeta` VALUES (1,1),(2,1),(6,1),(4,3),(3,4),(5,4),(6,5);
/*!40000 ALTER TABLE `cliente_has_tipotarjeta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contrato`
--

DROP TABLE IF EXISTS `contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contrato` (
  `idcontrato` int unsigned NOT NULL AUTO_INCREMENT,
  `numerocontrato` varchar(100) NOT NULL,
  `fecha` date DEFAULT NULL,
  `idcliente` int unsigned DEFAULT NULL,
  PRIMARY KEY (`idcontrato`),
  KEY `fk-contrato-has-cliente_idx` (`idcliente`),
  CONSTRAINT `fk-contrato-has-cliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
INSERT INTO `contrato` VALUES (1,'806','2022-12-15',1),(2,'757','2021-04-01',2),(3,'121','2013-11-14',3),(4,'154','2014-04-21',4),(5,'267','2016-07-30',5),(6,'1','2010-06-01',6);
/*!40000 ALTER TABLE `contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursal`
--

DROP TABLE IF EXISTS `sucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sucursal` (
  `idsucursal` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `direccion` varchar(200) DEFAULT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idsucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursal`
--

LOCK TABLES `sucursal` WRITE;
/*!40000 ALTER TABLE `sucursal` DISABLE KEYS */;
INSERT INTO `sucursal` VALUES (1,'Zavaleta','Calzada Zavaleta #184','Puebla'),(2,'Angelopolis','Blvd. del niño Poblano #15','Puebla'),(3,'Tlaxcalancingo','14 Oriente #2102','Cholula');
/*!40000 ALTER TABLE `sucursal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipotarjeta`
--

DROP TABLE IF EXISTS `tipotarjeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipotarjeta` (
  `idtarjeta` int unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `ingresos_min` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`idtarjeta`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipotarjeta`
--

LOCK TABLES `tipotarjeta` WRITE;
/*!40000 ALTER TABLE `tipotarjeta` DISABLE KEYS */;
INSERT INTO `tipotarjeta` VALUES (1,'Flex',1000.00),(2,'Plata',5000.00),(3,'Oro',10000.00),(4,'Diamante',40000.00),(5,'Platino',100000.00);
/*!40000 ALTER TABLE `tipotarjeta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-20 12:22:15
