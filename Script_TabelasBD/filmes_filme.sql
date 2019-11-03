-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: filmes
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `filme`
--

DROP TABLE IF EXISTS `filme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `filme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `verba` double NOT NULL,
  `dtgravacaoinicio` date NOT NULL,
  `dtgravacaofim` date NOT NULL,
  `pro_id` int(11) NOT NULL,
  `dir_id` int(11) NOT NULL,
  `lon_id` int(11) DEFAULT NULL,
  `doc_id` int(11) DEFAULT NULL,
  `ato_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `prod_id_idx` (`pro_id`),
  KEY `dir_id_idx` (`dir_id`),
  KEY `lon_id_idx` (`lon_id`),
  KEY `doc_id_idx` (`doc_id`),
  KEY `ato_id_idx` (`ato_id`),
  CONSTRAINT `ato_id` FOREIGN KEY (`ato_id`) REFERENCES `ator` (`id`),
  CONSTRAINT `dir_id` FOREIGN KEY (`dir_id`) REFERENCES `diretor` (`id`),
  CONSTRAINT `doc_id` FOREIGN KEY (`doc_id`) REFERENCES `documentario` (`id`),
  CONSTRAINT `lon_id` FOREIGN KEY (`lon_id`) REFERENCES `longametragem` (`id`),
  CONSTRAINT `prod_id` FOREIGN KEY (`pro_id`) REFERENCES `produtor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `filme`
--

LOCK TABLES `filme` WRITE;
/*!40000 ALTER TABLE `filme` DISABLE KEYS */;
INSERT INTO `filme` VALUES (1,1000.24,'2019-01-03','2019-01-04',1,1,1,1,1);
/*!40000 ALTER TABLE `filme` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-03 14:24:40
