-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 22, 2020 at 06:34 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `online`
--

-- --------------------------------------------------------

--
-- Table structure for table `seller`
--

CREATE TABLE `seller` (
  `id` int(50) NOT NULL,
  `uname` varchar(100) NOT NULL,
  `pword` varchar(100) NOT NULL,
  `image` varchar(1000) NOT NULL,
  `name` varchar(200) NOT NULL,
  `price` double NOT NULL,
  `key` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `seller`
--

INSERT INTO `seller` (`id`, `uname`, `pword`, `image`, `name`, `price`, `key`) VALUES
(1, 'rishan', 'abc', 'a1.PNG', 'Headphone', 5, 'phone'),
(2, 'umayanga', '123', 'a2.PNG', 'USB Driver', 12, 'phone'),
(3, 'umayanga', '123', 'a3.PNG', 'Ear buts', 23, 'phone'),
(4, 'rishan', 'abc', 'a4.PNG', 'Silicon backcover', 5, 'phone'),
(5, 'rishan', 'abc', 'a5.PNG', 'MP3 Player', 14, 'mp3'),
(6, 'umayanga', '123', 'a6.PNG', 'Apple Watch', 200, 'watch'),
(7, 'umayanga', '123', 'a7.PNG', 'Drone', 55, 'electric'),
(8, 'rishan', 'abc', 'a8.PNG', 'Headset', 26, 'computer'),
(9, 'shenal', 'asdf', 'a9.PNG', 'Air buts', 125, 'phone');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `seller`
--
ALTER TABLE `seller`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `seller`
--
ALTER TABLE `seller`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
