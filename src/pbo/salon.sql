-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2020 at 08:51 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `salon`
--

-- --------------------------------------------------------

--
-- Table structure for table `bekerja`
--

CREATE TABLE `bekerja` (
  `id_pegawai` varchar(10) DEFAULT NULL,
  `pekerjaan_pegawai` char(100) DEFAULT NULL,
  `tempat` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bekerja`
--

INSERT INTO `bekerja` (`id_pegawai`, `pekerjaan_pegawai`, `tempat`) VALUES
('P1001', 'Bagian Pembayaran dan Jasa Menikur Pedikur', 'Lantai 1'),
('P1002', 'Bagian Pembayaran', 'Lantai 1'),
('P1003', 'Bagian Pembayaran dan Jasa Make Up', 'Lantai 1 dan Lantai 2'),
('P1004', 'Bagian Kebersihan Tempat Pelanggan, Merapikan Peralatan, dan Jasa Body and Spa', 'Lantai 1 dan Lantai 3'),
('L1001', 'Bagian Kebersihan Tempat Pegawai dan Jasa Perawatan Rambut', 'Lantai 2'),
('L1002', 'Bagian Kebersihan Tempat Pegawai dan Jasa Meditasi', 'Lantai 2'),
('L1003', 'Bagian Kebersihan Tempat Pelanggan dan Menjaga dan Mengontrol Keadaan Sekitar', 'Lantai 1'),
('L1004', 'Bagian Kebersihan Tempat Pelanggan dan Mengontrol Peralatan dan Bahan di Salon', 'Lantai 1 dan Lantai 3');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `id_jadwal` varchar(10) NOT NULL,
  `pekerjaan` char(100) DEFAULT NULL,
  `id_pegawai` varchar(10) DEFAULT NULL,
  `hari` char(50) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`id_jadwal`, `pekerjaan`, `id_pegawai`, `hari`, `time`) VALUES
('J001', 'Bagian Kebersihan Tempat Pelanggan', 'L1003', 'Senin dan Selasa', '08:00:00'),
('J002', 'Bagian Kebersihan Tempat Pelanggan', 'L1004', 'Rabu dan Kamis', '08:00:00'),
('J003', 'Bagian Kebersihan Tempat Pelanggan', 'P1004', 'Jumat dan Sabtu', '08:00:00'),
('J004', 'Bagian Kebersihan Tempat Pegawai', 'L1001', 'Senin, Selasa, Rabu', '09:00:00'),
('J005', 'Bagian Kebersihan Tempat Pegawai', 'L1002', 'Kamis, Jumat, Sabtu', '09:00:00'),
('J006', 'Bagian Pembayaran', 'P1001', 'Senin, Selasa, Rabu', '08:00:00'),
('J007', 'Bagian Pembayaran', 'P1002', 'Kamis', '13:00:00'),
('J008', 'Bagian Pembayaran', 'P1003', 'Jumat', '17:00:00'),
('J009', 'Merapikan Peralatan', 'P1004', 'Sabtu dan Minggu', '21:00:00'),
('J010', 'Menjaga dan Mengontrol Keadaan Sekitar', 'L1003', 'Setiap Hari', '10:00:00'),
('J011', 'Mengontrol Peralatan dan Bahan di Salon', 'L1004', 'Setiap Hari', '10:00:00'),
('J012', 'Jasa Menikur Pedikur', 'P1001', 'Kamis', '08:00:00'),
('J013', 'Jasa Make Up', 'P1003', 'Senin, Selasa, Rabu', '08:00:00'),
('J014', 'Jasa Meditasi', 'L1002', 'Senin, Selasa, Rabu, Minggu', '08:00:00'),
('J015', 'Jasa Body and Spa', 'P1004', 'Rabu dan Kamis', '08:00:00'),
('J016', 'Jasa Perawatan Rambut', 'L1001', 'Kamis, Jumat, Sabtu, Minggu', '08:00:00'),
('J017', 'Jasa Perawatan Wajah', 'P1001', 'Jumat', '08:00:00'),
('J018', 'Jasa Pijat dan Aroma Terapi', 'P1003', 'Kamis, Sabtu, Minggu', '08:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `jasa`
--

CREATE TABLE `jasa` (
  `jenis_jasa` char(100) NOT NULL,
  `peralatan` char(100) DEFAULT NULL,
  `jumlah_alat` int(10) DEFAULT NULL,
  `id_pegawai` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jasa`
--

INSERT INTO `jasa` (`jenis_jasa`, `peralatan`, `jumlah_alat`, `id_pegawai`) VALUES
('Body and Spa', 'Peralatan Paket D', 25, 'P1004'),
('Make Up', 'Peralatan Paket B', 30, 'P1003'),
('Meditasi', 'Peralatan Paket C', 20, 'L1002'),
('Menikur Pedikur', 'Peralatan Paket A', 50, 'P1001'),
('Perawatan Rambut', 'Peralatan Paket E', 60, 'L1001'),
('Perawatan Wajah', 'Peralatan Paket F', 100, 'P1001'),
('Pijat dan Aroma Terapi', 'Peralatan Paket G', 40, 'P1003');

-- --------------------------------------------------------

--
-- Table structure for table `keluhan`
--

CREATE TABLE `keluhan` (
  `keluhan` varchar(100) NOT NULL,
  `alasan` varchar(1000) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `keluhan`
--

INSERT INTO `keluhan` (`keluhan`, `alasan`, `date`) VALUES
('Bau', 'Kamar mandi bau, lantai kurang bersih, kurangnya ventilasi udara', '2020-05-14'),
('Keramahan', 'Beberapa pegawai ada yang kurang ramah dan sopan terhada pelanggan', '2020-05-15'),
('Kotor', 'Beberapa sudut ruangan masih kotor masih ada sisa sisa rambut', '2020-05-17');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` varchar(10) NOT NULL,
  `nama_pegawai` varchar(100) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `alamat`, `no_telp`) VALUES
('L1001', 'Budi Setiawan', 'Jalan Kedaton', '0811742007789'),
('L1002', 'Ariyanto Sudirman', 'Jalan Bumi Waras', '081272208999'),
('L1003', 'Rizki Kurniawan', 'Jalan Pahoman', '081289008999'),
('L1004', 'Bambang Wijaya', 'Jalan Kemiling', '0812722000000'),
('P1001', 'Vina Oktariana', 'Jalan Puskut', '0812722007789'),
('P1002', 'Annisa Dwi', 'Jalan Natar', '08127233307789'),
('P1003', 'Nazla Wijaya', 'Jalan Sukarame', '0812722006868'),
('P1004', 'Yuliana Sri', 'Jalan Teluk Betung', '0812722000011');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` varchar(10) NOT NULL,
  `nama_pelanggan` char(30) DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `jenis_jasa` char(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `no_telp`, `jenis_jasa`) VALUES
('PL101', 'Nia Ramadhani', '0812722000202', 'Perawatan Wajah'),
('PL102', 'Nagita Slavina', '0812722222202', 'Perawatan Rambut'),
('PL103', 'Yuki Kato', '0811342000202', 'Menikur Pedikur'),
('PL104', 'Syahrini', '0812111100202', 'Make Up'),
('PL105', 'Iqbal Dhiafakhri', '0812722009999', 'Meditasi'),
('PL106', 'Jefri Nichol', '0812722878702', 'Meditasi'),
('PL107', 'Dara Arafah', '0812722444202', 'Body and Spa'),
('PL108', 'Pamungkas', '0812722443322', 'Pijat dan Aroma Terapi'),
('PL109', 'Afgan Syahreza', '0812010443322', 'Perawatan Rambut'),
('PL110', 'Maudy Ayunda', '0813020443322', 'Pijat dan Aroma Terapi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`id_jadwal`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indexes for table `jasa`
--
ALTER TABLE `jasa`
  ADD PRIMARY KEY (`jenis_jasa`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indexes for table `keluhan`
--
ALTER TABLE `keluhan`
  ADD PRIMARY KEY (`keluhan`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`),
  ADD KEY `jenis_jasa` (`jenis_jasa`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `jadwal_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`);

--
-- Constraints for table `jasa`
--
ALTER TABLE `jasa`
  ADD CONSTRAINT `jasa_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`);

--
-- Constraints for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD CONSTRAINT `pelanggan_ibfk_1` FOREIGN KEY (`jenis_jasa`) REFERENCES `jasa` (`jenis_jasa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
