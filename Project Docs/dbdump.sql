-- MySQL dump 10.13  Distrib 5.1.45, for Win32 (ia32)
--
-- Host: localhost    Database: diagnostic
-- ------------------------------------------------------
-- Server version	5.1.45-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agent_details`
--

DROP TABLE IF EXISTS `agent_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agent_details` (
  `Agent_Id` varchar(2) NOT NULL,
  `Agent_Name` varchar(50) NOT NULL,
  `Street_Address` varchar(200) NOT NULL,
  `Mobile_Number` bigint(20) NOT NULL,
  `City` varchar(50) NOT NULL,
  `State` varchar(50) NOT NULL,
  `Zipcode` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agent_details`
--

LOCK TABLES `agent_details` WRITE;
/*!40000 ALTER TABLE `agent_details` DISABLE KEYS */;
INSERT INTO `agent_details` VALUES ('A1','Adam','Rd Street',4545641231,'Chennai','Tamil Nadu','600099'),('A2','Jack','Nehru street',121212312,'Bangalore','Karnataka','600055'),('A3','Nishan','HJY Street',5665565665,'Chennai','Tamil Nadu','600023'),('A4','Raghul','GVC Street',4542121,'Kerala','Kerala','600078');
/*!40000 ALTER TABLE `agent_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apply_checkup`
--

DROP TABLE IF EXISTS `apply_checkup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `apply_checkup` (
  `username` varchar(100) NOT NULL,
  `dob` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `country` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `pincode` varchar(100) NOT NULL,
  `plan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apply_checkup`
--

LOCK TABLES `apply_checkup` WRITE;
/*!40000 ALTER TABLE `apply_checkup` DISABLE KEYS */;
INSERT INTO `apply_checkup` VALUES ('sahil','2016-05-24','sahilsood@gmail.com','India','Uttar Pradesh','Chennai','123123','Executive Health check-up'),('sahil2','2016-05-11','sahil28sood@gmail.com','India','Uttar Pradesh','Chennai','123123','Basic Health check-up');
/*!40000 ALTER TABLE `apply_checkup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `health_checkup`
--

DROP TABLE IF EXISTS `health_checkup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `health_checkup` (
  `HealthPlan_ID` int(11) NOT NULL,
  `HealthPlanName` varchar(50) NOT NULL,
  `HealthPlanDetails` varchar(200) NOT NULL,
  `CheckupDetails` int(11) NOT NULL,
  `Price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `health_checkup`
--

LOCK TABLES `health_checkup` WRITE;
/*!40000 ALTER TABLE `health_checkup` DISABLE KEYS */;
INSERT INTO `health_checkup` VALUES (201,'Basic Health check-up','Complete Blood Count,ESR ,Blood Group & Rh Factor ',1,500),(202,'Executive Health check-up','Total Cholesterol,HDL Cholesterol,LDL Cholesterol,VLDL Cholesterol',2,500),(203,'Supreme Health check-up','Glucose Fasting,Glucose Postprandial,Glycosylated Hb/HbA1C',1,700);
/*!40000 ALTER TABLE `health_checkup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicareservice_master`
--

DROP TABLE IF EXISTS `medicareservice_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicareservice_master` (
  `Service_id` int(11) DEFAULT NULL,
  `Service_Name` varchar(200) DEFAULT NULL,
  `Service_Features` varchar(200) DEFAULT NULL,
  `Service_Benefits` varchar(200) DEFAULT NULL,
  `Service_Parameters` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicareservice_master`
--

LOCK TABLES `medicareservice_master` WRITE;
/*!40000 ALTER TABLE `medicareservice_master` DISABLE KEYS */;
INSERT INTO `medicareservice_master` VALUES (1000,'Digital X-Ray','To find issues in the bone and Body.','Complete check up ','Digital machines, Dental Radiography, Routine Radiography\n'),(1002,'Eye Check-up','To find issues in the Eyes.','Complete check up','Ophthalmic room, Qualified MS Doctors'),(1003,'Total Body Fat analysis','To find the total fat available in body.','Complete check up','Fat analyser from USA'),(1004,'3D Color Droppler','To evaluate normal and abnormal fetal hearts.','Complete check up','Latest machine from GE, Vaginal & Trans Rectal studies, Paediatric studies\n');
/*!40000 ALTER TABLE `medicareservice_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportdetails`
--

DROP TABLE IF EXISTS `reportdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reportdetails` (
  `reportId` varchar(2) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `mobileNo` bigint(10) DEFAULT NULL,
  `doctorname` varchar(20) DEFAULT NULL,
  `diagnosis` varchar(100) DEFAULT NULL,
  `result` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportdetails`
--

LOCK TABLES `reportdetails` WRITE;
/*!40000 ALTER TABLE `reportdetails` DISABLE KEYS */;
INSERT INTO `reportdetails` VALUES ('R1','X','1998-02-01','XCV@gmail.com',987415622,'Hari','Sugar Test,Blood Test','positive'),('R2','Y','1987-01-05','ABC@gmail.com',897645321,'Gopal','Sugar Test,Cholestrol Test','positive'),('R3','Z','1991-07-05','UBC@gmail.com',8972321111,'Priya','Blood Test,Cholestrol Test','negative');
/*!40000 ALTER TABLE `reportdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usermaster`
--

DROP TABLE IF EXISTS `usermaster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usermaster` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `dateofbirth` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usermaster`
--

LOCK TABLES `usermaster` WRITE;
/*!40000 ALTER TABLE `usermaster` DISABLE KEYS */;
INSERT INTO `usermaster` VALUES ('111111','sdfsdfsd','2016-05-12','aaaaa@sssss.com','Patient'),('222222','rthrthyrt','2016-05-20','qqqqq@wwwww.com','Patient'),('333333','fgsdfgdfg','2016-05-04','zzzzz@xxxxx.com','Patient'),('sahil','sahil','1993-04-28','sahil@gmail.com','Patient'),('doctor','doctor','1978-05-12','doctor@gmail.com','doctor'),('deepali','deepali','1993-02-08','deepali@gmail.com','Patient'),('3475345343','somepass','2016-05-17','kislaya@gmail.com','Patient'),('admin','admin','1992-11-28','admin@tricare.com','admin'),('doctor1234','doctor','2016-05-19','doctora@gmail.com','Doctor');
/*!40000 ALTER TABLE `usermaster` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-05 15:51:52
