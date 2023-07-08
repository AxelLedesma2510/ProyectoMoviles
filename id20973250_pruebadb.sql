-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 08-07-2023 a las 06:21:25
-- Versión del servidor: 10.5.20-MariaDB
-- Versión de PHP: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `id20973250_pruebadb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Accesorio`
--

CREATE TABLE `Accesorio` (
  `IDAccesorio` bigint(20) NOT NULL,
  `IDComputadora` bigint(20) NOT NULL,
  `Tipo` varchar(100) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `Estado` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `Accesorio`
--

INSERT INTO `Accesorio` (`IDAccesorio`, `IDComputadora`, `Tipo`, `Descripcion`, `Estado`) VALUES
(1, 1, '1', 'Mouse Fino', 1),
(2, 1, '2', 'Teclado Fino', 1),
(3, 1, '3', 'Audifonos Finos', 0),
(4, 2, '1', 'Mouse alámbrico Radioshack, conexión usb, 1200 dpi, 3 botones, negro', 1),
(5, 2, '2', 'Teraware membrana KPT100', 1),
(6, 2, '3', 'Sony MDR-ZX110', 1),
(7, 3, '1', 'Mouse alambrico Teraware PJT-M218, conexión usb, 1000 dpi, 3 botones, negro', 1),
(8, 3, '2', 'Teraware HV-KB220BT', 1),
(9, 3, '3', 'Teraware Audifonos PJT-DEP472', 1),
(10, 5, '1', 'Mouse alambrico Teraware PJT-M218, conexión usb, 1000 dpi, 3 botones, negro', 1),
(11, 5, '2', 'Teraware HV-KB220BT', 1),
(12, 5, '3', 'Sony MDR-ZX110', 1),
(13, 6, '1', 'Mouse alambrico Teraware PJT-M218, conexión usb, 1000 dpi, 3 botones, negro', 1),
(14, 6, '2', 'Teraware membrana KPT100', 1),
(15, 6, '3', 'Logitech H111', 1),
(16, 7, '1', 'Mouse alambrico Radioshack, conexión usb, 1200 dpi, 3 botones, negro', 1),
(17, 7, '2', 'Teraware membrana K783E701-BK', 1),
(18, 7, '3', 'Teraware Audifonos PJT-DEP472', 1),
(19, 8, '1', 'Mouse alambrico Radioshack, conexión usb, 1200 dpi, 3 botones, negro', 1),
(20, 8, '2', 'Teraware HV-KB220BT', 1),
(21, 8, '3', 'Logitech H111', 1),
(22, 9, '1', 'Raton USB Essential 4Y50R20863 de Lenovo', 1),
(23, 9, '2', 'Teraware membrana KPT100', 1),
(24, 9, '3', 'Sony MDR-ZX110', 1),
(25, 10, '1', 'Mouse alambrico Radioshack, conexión usb, 1200 dpi, 3 botones, negro', 1),
(26, 10, '2', 'Teraware membrana K783E701-BK', 1),
(27, 10, '3', 'Teraware Audifonos PJT-DEP472', 1),
(28, 11, '1', 'Raton USB Essential 4Y50R20863 de Lenovo', 1),
(29, 11, '2', 'Teraware membrana K783E701-BK', 1),
(30, 11, '3', 'Sony MDR-ZX110', 1),
(31, 12, '1', 'Mouse alambrico Teraware PJT-M218, conexión usb, 1000 dpi, 3 botones, negro', 1),
(32, 12, '2', 'Teraware membrana K783E701-BK', 1),
(33, 12, '3', 'Logitech H111', 1),
(34, 13, '1', 'Mouse alambrico Radioshack, conexión usb, 1200 dpi, 3 botones, negro', 1),
(35, 13, '2', 'Teraware membrana KPT100', 1),
(36, 13, '3', 'Sony MDR-ZX110', 1),
(37, 14, '1', 'Raton USB Essential 4Y50R20863 de Lenovo', 1),
(38, 14, '2', 'Teraware HV-KB220BT', 1),
(39, 14, '3', 'Logitech H111', 1),
(40, 15, '1', 'Raton USB Essential 4Y50R20863 de Lenovo', 1),
(41, 15, '2', 'Teraware membrana KPT100', 1),
(42, 15, '3', 'Logitech H111', 1),
(43, 16, '1', 'Mouse alambrico Teraware PJT-M218, conexión usb, 1000 dpi, 3 botones, negro', 1),
(44, 16, '2', 'Teraware membrana K783E701-BK', 1),
(45, 16, '3', 'Sony MDR-ZX110', 1),
(46, 17, '1', 'Mouse alambrico Radioshack, conexión usb, 1200 dpi, 3 botones, negro', 1),
(47, 17, '2', 'Teraware membrana KPT100', 1),
(48, 17, '3', 'Teraware Audifonos PJT-DEP472', 1),
(49, 18, '1', 'Mouse alambrico Teraware PJT-M218, conexión usb, 1000 dpi, 3 botones, negro', 1),
(50, 18, '2', 'Teraware HV-KB220BT', 1),
(51, 18, '3', 'Sony MDR-ZX110', 1),
(52, 19, '1', 'Mouse alambrico Radioshack, conexión usb, 1200 dpi, 3 botones, negro', 1),
(53, 19, '2', 'Teraware membrana K783E701-BK', 1),
(54, 19, '3', 'Logitech H111', 1),
(55, 20, '1', 'Raton USB Essential 4Y50R20863 de Lenovo', 1),
(56, 20, '2', 'Teraware HV-KB220BT', 1),
(57, 20, '3', 'Logitech H111', 1),
(58, 21, '1', 'Raton USB Essential 4Y50R20863 de Lenovo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Ambiente`
--

CREATE TABLE `Ambiente` (
  `IDAmbiente` bigint(20) NOT NULL,
  `Descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `Ambiente`
--

INSERT INTO `Ambiente` (`IDAmbiente`, `Descripcion`) VALUES
(1, 'SALA A COMPUTO PISO - 5'),
(2, 'SALA B COMPUTO PISO - 5	'),
(3, 'SALA C COMPUTO PISO - 7'),
(4, 'SALA DE PROFESORES'),
(5, 'SALA DE COMPUTO'),
(6, 'pruebassss'),
(7, 'hhh');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Computadora`
--

CREATE TABLE `Computadora` (
  `IDComputadora` bigint(20) NOT NULL,
  `IDAmbiente` bigint(20) NOT NULL,
  `Modelo` varchar(100) NOT NULL,
  `Estado` int(11) NOT NULL DEFAULT 1,
  `FechaObtencion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `Computadora`
--

INSERT INTO `Computadora` (`IDComputadora`, `IDAmbiente`, `Modelo`, `Estado`, `FechaObtencion`) VALUES
(1, 1, 'Prueba', 1, '2023-06-20'),
(2, 1, 'Prueba2', 2, '2023-06-15'),
(3, 1, 'Prueba3', 1, '2023-05-10'),
(5, 1, 'Lenovo ThinkCentre M70q 3ra Gen Tiny', 1, '2023-06-01'),
(6, 1, 'Lenovo ThinkCentre M70q 3ra Gen Tiny', 1, '2023-06-01'),
(7, 2, 'DELL Optiplex 7010', 1, '2023-06-01'),
(8, 2, 'Lenovo ThinkStation P360 Tower', 1, '2023-06-01'),
(9, 2, 'PC de escritorio HP EliteDesk 800 G1 USFF - Intel Core i5-4570S 2.9GHz 8GB 500GB HDD DVDRW', 1, '2023-06-01'),
(10, 2, 'DELL Optiplex 7010', 1, '2023-06-01'),
(11, 2, 'Lenovo ThinkStation P360 Tower', 1, '2023-06-01'),
(12, 3, 'Lenovo ThinkCentre M70q 3ra Gen Tiny', 1, '2023-06-01'),
(13, 3, 'Lenovo ThinkStation P360 Tower', 1, '2023-06-01'),
(14, 3, 'Lenovo ThinkStation P360 Tower', 1, '2023-06-01'),
(15, 3, 'DELL Optiplex 7010', 1, '2023-06-01'),
(16, 3, 'DELL Optiplex 7010', 1, '2023-06-01'),
(17, 4, 'Lenovo ThinkCentre M70q 3ra Gen Tiny', 1, '2023-06-01'),
(18, 4, 'Lenovo ThinkCentre M70q 3ra Gen Tiny', 1, '2023-06-01'),
(19, 4, 'Lenovo ThinkStation P360 Tower', 1, '2023-06-01'),
(20, 4, 'PC de escritorio HP EliteDesk 800 G1 USFF - Intel Core i5-4570S 2.9GHz 8GB 500GB HDD DVDRW', 1, '2023-06-01'),
(21, 4, 'Lenovo ThinkCentre M70q 3ra Gen Tiny', 1, '2023-06-01');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Accesorio`
--
ALTER TABLE `Accesorio`
  ADD PRIMARY KEY (`IDAccesorio`),
  ADD KEY `IDComputadora` (`IDComputadora`);

--
-- Indices de la tabla `Ambiente`
--
ALTER TABLE `Ambiente`
  ADD PRIMARY KEY (`IDAmbiente`);

--
-- Indices de la tabla `Computadora`
--
ALTER TABLE `Computadora`
  ADD PRIMARY KEY (`IDComputadora`),
  ADD KEY `IDAmbiente` (`IDAmbiente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Accesorio`
--
ALTER TABLE `Accesorio`
  MODIFY `IDAccesorio` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT de la tabla `Ambiente`
--
ALTER TABLE `Ambiente`
  MODIFY `IDAmbiente` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `Computadora`
--
ALTER TABLE `Computadora`
  MODIFY `IDComputadora` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Accesorio`
--
ALTER TABLE `Accesorio`
  ADD CONSTRAINT `Accesorio_ibfk_1` FOREIGN KEY (`IDComputadora`) REFERENCES `Computadora` (`IDComputadora`);

--
-- Filtros para la tabla `Computadora`
--
ALTER TABLE `Computadora`
  ADD CONSTRAINT `Computadora_ibfk_1` FOREIGN KEY (`IDAmbiente`) REFERENCES `Ambiente` (`IDAmbiente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
