-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-09-2014 a las 05:16:50
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `db_mecaut`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autos`
--

CREATE TABLE IF NOT EXISTS `autos` (
  `aut_placa` varchar(8) NOT NULL,
  `aut_ciudad` varchar(10) NOT NULL,
  `aut_modelo` varchar(4) NOT NULL,
  `aut_marca` varchar(10) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `cli_apellidos` varchar(20) NOT NULL,
  PRIMARY KEY (`aut_placa`),
  KEY `cli_id` (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `autos`
--

INSERT INTO `autos` (`aut_placa`, `aut_ciudad`, `aut_modelo`, `aut_marca`, `cli_id`, `cli_nombre`, `cli_apellidos`) VALUES
('1111sss', 'Pereira', '1982', 'Chevrolet', '3086544', 'Gerall', 'Giraldo'),
('345sf', 'Medellin', '1983', 'Chevrolet', '3086544', 'Gerall', 'Giraldo'),
('445gg', 'Medellin', '1981', 'Chevrolet', '9393939', 'sergio', 'lldskdsjf'),
('45sdf', 'Armenia', '1981', 'Toyota', '34534565', 'Cecilia', 'Baena'),
('678', 'Medellin', '1982', 'Hyundai', '3086544', 'Gerall', 'Giraldo'),
('df45', 'Medellin', '1982', 'Chevrolet', '546', 'gfh', 'fgh'),
('dfg345', 'Medellin', '1981', 'Hyundai', '30404844', 'Adriana', 'Avila'),
('shjd435', 'Manizales', '1982', 'Chevrolet', '101010', 'ssergio', 'sdf');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `cli_apellidos` varchar(20) NOT NULL,
  `cli_telefono` varchar(10) NOT NULL,
  `cli_direccion` varchar(25) NOT NULL,
  PRIMARY KEY (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cli_id`, `cli_nombre`, `cli_apellidos`, `cli_telefono`, `cli_direccion`) VALUES
('101010', 'ssergioooo', 'sdf', '238495', 'dsfsdf'),
('30404844', 'Adrianaaaa', 'Avila', '8768167', 'Armenia'),
('3086544', 'Geralllll', 'Giraldo', '4356167', 'Guajira'),
('34534565', 'Cecilia', 'Baena', '8965145', 'Bogota'),
('3797865', 'Paolo', 'Cansas', '4565467', 'Manizales'),
('45008900', 'Eliana', 'carranza', '3305678', 'Cali'),
('546', 'gfh', 'fgh', '565', 'gfh'),
('9393939', 'sergioooooo', 'lldskdsjf', '8458548', 'sdfnds');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE IF NOT EXISTS `cuentas` (
  `cue_usuario` varchar(20) NOT NULL,
  `cue_contrasena` varchar(20) NOT NULL,
  PRIMARY KEY (`cue_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cue_usuario`, `cue_contrasena`) VALUES
('admin', 'admin'),
('sena', 'sena'),
('sergio', 'sergio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos`
--

CREATE TABLE IF NOT EXISTS `mantenimientos` (
  `man_codigo` int(10) NOT NULL AUTO_INCREMENT,
  `man_tipo` varchar(35) NOT NULL,
  `man_fecha` date NOT NULL,
  `man_descripcion` varchar(50) NOT NULL,
  `man_costo` varchar(8) NOT NULL,
  `aut_placa` varchar(8) NOT NULL,
  `mec_id` varchar(15) NOT NULL,
  PRIMARY KEY (`man_codigo`),
  KEY `aut_placa` (`aut_placa`),
  KEY `mec_id` (`mec_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Volcado de datos para la tabla `mantenimientos`
--

INSERT INTO `mantenimientos` (`man_codigo`, `man_tipo`, `man_fecha`, `man_descripcion`, `man_costo`, `aut_placa`, `mec_id`) VALUES
(5, 'Cambio de llantas', '2014-09-06', 'ninguna	', '345567', '1111sss', '45456564'),
(6, 'Reparación sistema de encendido', '2014-09-06', 'ninguna', '457', '445gg', '5656767'),
(7, 'Cambio de llantassss', '2014-09-03', 'ng', '66', '45sdf', '5656767');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanicos`
--

CREATE TABLE IF NOT EXISTS `mecanicos` (
  `mec_id` varchar(15) NOT NULL,
  `mec_nombre` varchar(20) NOT NULL,
  `mec_apellidos` varchar(20) NOT NULL,
  `mec_telefono` varchar(10) NOT NULL,
  `mec_direccion` varchar(25) NOT NULL,
  `mec_salario` varchar(10) NOT NULL,
  PRIMARY KEY (`mec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mecanicos`
--

INSERT INTO `mecanicos` (`mec_id`, `mec_nombre`, `mec_apellidos`, `mec_telefono`, `mec_direccion`, `mec_salario`) VALUES
('45456564', 'Gerardo', 'Giraldo', '45456167', 'Guajira', '300000'),
('5656767', 'Francisco', 'Torrez', '2343', 'Cali', '100000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE IF NOT EXISTS `proveedores` (
  `prov_nit` varchar(15) NOT NULL,
  `prov_nombre` varchar(20) NOT NULL,
  `prov_direccion` varchar(25) NOT NULL,
  `prov_telefono` varchar(10) NOT NULL,
  `prov_descripcion` varchar(50) NOT NULL,
  PRIMARY KEY (`prov_nit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`prov_nit`, `prov_nombre`, `prov_direccion`, `prov_telefono`, `prov_descripcion`) VALUES
('34567', 'FORD', 'Popayan', '456565', 'Proveedor de repuestos FORD'),
('44', 'd', 'd', '3', 'dd'),
('45345', 'CHEVROLET', 'Bogota', '34534653', 'Proveedor de repuestos CHEVROLET'),
('45564', 'MAZDA', 'Cali', '345656', 'Proveedor de repuestos MAZDA'),
('67534', 'RENAULT', 'Manizales', '8975034', 'Proveedor de repuestos RENAULT'),
('67867', 'fgh', 'gfgh', '768', 'fgh'),
('890', 'fggh', 'fh', '6576', 'dfgf');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuestos`
--

CREATE TABLE IF NOT EXISTS `repuestos` (
  `rep_codigo` varchar(8) NOT NULL,
  `rep_tipo` varchar(20) NOT NULL,
  `rep_marca` varchar(10) NOT NULL,
  `rep_cantidad` varchar(5) NOT NULL,
  `rep_precio` varchar(8) NOT NULL,
  `prov_nit` varchar(15) NOT NULL,
  `prov_nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`rep_codigo`),
  KEY `prov_nit` (`prov_nit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `repuestos`
--

INSERT INTO `repuestos` (`rep_codigo`, `rep_tipo`, `rep_marca`, `rep_cantidad`, `rep_precio`, `prov_nit`, `prov_nombre`) VALUES
('1', 'Batería', 'maa', '6', '5656', '34567', 'FORD'),
('2', 'Motor', 'ass', '3', '333', '34567', 'FORD'),
('23f', 'Motor', 'fd', '4', '4', '44', 'd'),
('33', 'Motor', 'fd', '4', 'fdg', '45345', 'CHEVROLET'),
('456', 'Motor', 'erter', '456', '555', '45345', 'CHEVROLET'),
('65', 'Radiador', 'dgh', '6', 'ghdf', '67534', 'RENAULT'),
('7786', 'Llanta', 'ffh', '6', 'fghf', '45345', 'CHEVROLET'),
('98', 'Rin', 'fghj', '6', '78', '67867', 'fgh');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `autos`
--
ALTER TABLE `autos`
  ADD CONSTRAINT `cli_id` FOREIGN KEY (`cli_id`) REFERENCES `clientes` (`cli_id`);

--
-- Filtros para la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  ADD CONSTRAINT `aut_placa` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`),
  ADD CONSTRAINT `mec_id` FOREIGN KEY (`mec_id`) REFERENCES `mecanicos` (`mec_id`);

--
-- Filtros para la tabla `repuestos`
--
ALTER TABLE `repuestos`
  ADD CONSTRAINT `prov_nit` FOREIGN KEY (`prov_nit`) REFERENCES `proveedores` (`prov_nit`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
