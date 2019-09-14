-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 31, 2018 at 08:45 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_koperasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_anggota` varchar(10) NOT NULL COMMENT 'Id Anggota',
  `nama_anggota` varchar(50) NOT NULL COMMENT 'Nama Lengkap',
  `tgl_lhr` date NOT NULL,
  `tpt_lhr` varchar(20) NOT NULL COMMENT 'Tempat lahir',
  `jenis_kelamin` varchar(10) NOT NULL COMMENT 'Jenis Kelamin',
  `no_ktp` varchar(30) NOT NULL COMMENT 'No KTP',
  `agama` varchar(10) NOT NULL COMMENT 'Agama',
  `pekerjaan` varchar(20) NOT NULL COMMENT 'Pekerjaan',
  `alamat` varchar(20) NOT NULL COMMENT 'alamat',
  `telepon` varchar(20) NOT NULL,
  `create_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id_anggota`, `nama_anggota`, `tgl_lhr`, `tpt_lhr`, `jenis_kelamin`, `no_ktp`, `agama`, `pekerjaan`, `alamat`, `telepon`, `create_date`) VALUES
('K01', 'Joni', '1997-08-07', 'Jakarta', 'L', '15010292931123', 'Islam', 'Tani', 'Jakarta Barat', '0812312323', '2018-08-25'),
('K02', 'Abdul Jaelani', '2018-08-25', 'Bandung', 'L', '921121202922', 'Islam', 'Wiraswasta', 'Tangerang', '0912311', '2018-08-31'),
('K03', 'Sumarni', '2018-08-15', 'Banten', 'P', '12313131', 'Islam', 'sales', 'banten', '0', '2018-08-31'),
('K04', 'Cha Faisal', '1993-06-27', 'Padang', 'P', '13033344556677', 'Islam', 'Karyawan', 'Tebet', '0876789876', '2018-08-04'),
('K05', 'Mersya Efendi', '1993-08-11', 'Parung', 'L', '133344556677', 'Islam', 'Karyawan', 'Parung, Bogor', '0988998877', '2018-08-04'),
('K06', 'Monica Adnan', '1992-08-05', 'Jakarta', 'P', '133344558899', 'Kristen', 'Wiraswasta', 'Tebet', '0877887766', '2018-08-01'),
('K07', 'Harianto Arbi', '1980-07-01', 'Bogor', 'L', '133322889977', 'Islam', 'Wiraswasta', 'Bogor', '0899889988', '2018-01-01'),
('K08', 'Prabowo Adi', '1980-08-04', 'Hambalang', 'L', '13339988990088', 'Islam', 'Wiraswasta', 'Hambalang , Bogor', '0899338877', '2018-02-01'),
('K09', 'Mia Aulia Zahir', '1990-08-07', 'Padang', 'P', '133300887799', 'Islam', 'Pegawai Negri', 'Jakarta Selatan', '0899776655', '2018-08-04'),
('K10', 'Zoni Antoni Makmur', '1991-08-01', 'Karawang', 'L', '1333009988223344', 'Islam', 'Karyawan Swasta', 'Bekasi', '0833778866', '2018-08-03'),
('K11', 'Gloria Sani', '1990-08-01', 'Jakarta', 'P', '1333998822003344', 'Kristen', 'Wiraswasta', 'Jakarta', '08776622556', '2018-08-03'),
('K12', 'Muhammad Dodi Putra', '1990-08-09', 'Payakumbuh', 'L', '1333344556677', 'Islam', 'Karyawan', 'Bekasi', '0899778899  ', '2018-08-03'),
('K13', 'Anka Ibra', '1997-08-03', 'Jonggol', 'L', '13339988776633', 'Islam', 'Karyawan', 'Jonggol', '08776655', '2018-08-03');

-- --------------------------------------------------------

--
-- Table structure for table `simpanan_pokok`
--

CREATE TABLE `simpanan_pokok` (
  `id_simp_pokok` varchar(5) NOT NULL COMMENT 'Id Simpanan Pokok',
  `id_anggota` varchar(10) NOT NULL COMMENT 'Id Anggota',
  `nama_anggota` varchar(50) NOT NULL COMMENT 'Nama anggota',
  `Jumlah_sp` int(11) NOT NULL COMMENT 'Jumlah simpanan pokok',
  `createDate` date NOT NULL COMMENT 'Tanggal Bayar',
  `forDate` date NOT NULL COMMENT 'Tanggal aktif'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `simpanan_pokok`
--

INSERT INTO `simpanan_pokok` (`id_simp_pokok`, `id_anggota`, `nama_anggota`, `Jumlah_sp`, `createDate`, `forDate`) VALUES
('SP01', 'K02', 'Abdul Jaelani', 100000, '2018-08-03', '2018-08-24'),
('SP02', 'K01', 'Joni', 100000, '2018-08-04', '2018-08-24'),
('SP03', 'K04', 'Cha Faisal', 100000, '2018-08-04', '2018-08-24'),
('SP04', 'K03', 'Sumarni', 100000, '2018-08-04', '2018-08-24'),
('SP05', 'K05', 'Mersya Efendi', 100000, '2018-08-03', '2018-08-24'),
('SP06', 'K13', 'Anka Ibra', 100000, '2018-08-22', '2018-08-24');

-- --------------------------------------------------------

--
-- Table structure for table `simpanan_wajib`
--

CREATE TABLE `simpanan_wajib` (
  `id_simp_wajib` varchar(5) NOT NULL COMMENT 'Id Simpanan Wajib',
  `id_anggota` varchar(10) NOT NULL COMMENT 'Id Anggota',
  `nama_anggota` varchar(50) NOT NULL COMMENT 'Nama anggota',
  `Jumlah_sw` int(11) NOT NULL COMMENT 'Jumlah simpanan wajib',
  `createDate` date NOT NULL COMMENT 'Tanggal Bayar',
  `forDate` date NOT NULL COMMENT 'Tanggal aktif'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `simpanan_wajib`
--

INSERT INTO `simpanan_wajib` (`id_simp_wajib`, `id_anggota`, `nama_anggota`, `Jumlah_sw`, `createDate`, `forDate`) VALUES
('SW01', 'K02', 'Abdul Jaelani', 25000, '2018-08-02', '2018-08-24'),
('SW02', 'K01', 'Joni', 25000, '2018-08-11', '2018-08-24'),
('SW03', 'K03', 'Sumarni', 25000, '2018-08-03', '2018-08-24'),
('SW04', 'K04', 'Cha Faisal', 25000, '2018-08-03', '2018-08-24');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `nama`, `username`, `password`) VALUES
(1, 'admin petugas', 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indexes for table `simpanan_pokok`
--
ALTER TABLE `simpanan_pokok`
  ADD PRIMARY KEY (`id_simp_pokok`),
  ADD KEY `id_anggota` (`id_anggota`);

--
-- Indexes for table `simpanan_wajib`
--
ALTER TABLE `simpanan_wajib`
  ADD PRIMARY KEY (`id_simp_wajib`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
