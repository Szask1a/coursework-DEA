-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 26, 2020 at 02:26 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `website`
--

-- --------------------------------------------------------

--
-- Table structure for table `sellertbl`
--

CREATE TABLE `sellertbl` (
  `id` int(50) NOT NULL,
  `uname` varchar(200) NOT NULL,
  `pword` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `price` int(50) NOT NULL,
  `keyword` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sellertbl`
--

INSERT INTO `sellertbl` (`id`, `uname`, `pword`, `image`, `name`, `price`, `keyword`) VALUES
(1, 'rishan', 'abc', 'a1.PNG', 'Lightning Headphone', 5, 'headphones'),
(2, 'rishan', 'abc', 'a2.PNG', 'Portable SD CardReader', 10, 'card'),
(3, 'umayanga', '123', 'a3.PNG', 'Earbuts', 23, 'earbut'),
(4, 'abi', '123', 'abi.jpg', 'Gaming Headphones', 1000, 'headphones');

-- --------------------------------------------------------

--
-- Table structure for table `user_data`
--

CREATE TABLE `user_data` (
  `name` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `roll_no` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sellertbl`
--
ALTER TABLE `sellertbl`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sellertbl`
--
ALTER TABLE `sellertbl`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
