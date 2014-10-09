-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-10-2014 a las 16:08:03
-- Versión del servidor: 5.5.34
-- Versión de PHP: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
  `aut_tipo` enum('Camioneta','Deportivo','Campero','Camion','Bus, Buseta','Volqueta','Motocicleta','Moto-Carro') NOT NULL,
  `aut_modelo` varchar(4) NOT NULL,
  `aut_marca` varchar(10) NOT NULL,
  `aut_kilometraje` varchar(10) NOT NULL,
  `aut_combustible` varchar(20) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  PRIMARY KEY (`aut_placa`),
  KEY `cli_id` (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `cli_apellidos` varchar(20) NOT NULL,
  `cli_sexo` varchar(15) NOT NULL,
  `cli_telefono` varchar(10) NOT NULL,
  `cli_direccion` varchar(25) NOT NULL,
  `cli_correo` varchar(50) NOT NULL,
  PRIMARY KEY (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE IF NOT EXISTS `cuentas` (
  `cue_numero` int(11) NOT NULL AUTO_INCREMENT,
  `cue_usuario` varchar(30) NOT NULL,
  `cue_contrasena` varchar(20) NOT NULL,
  `cue_tipoUsuario` varchar(20) NOT NULL,
  PRIMARY KEY (`cue_numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles`
--

CREATE TABLE IF NOT EXISTS `detalles` (
  `man_codigo` int(11) NOT NULL,
  `man_tipo` varchar(50) NOT NULL,
  `man_descripcion` text NOT NULL,
  `man_fechaFin` date NOT NULL,
  `aut_placa` varchar(8) NOT NULL,
  `emp_id` varchar(15) NOT NULL,
  `emp_nombre` varchar(30) NOT NULL,
  `rep_codigo` varchar(8) NOT NULL,
  `rep_nombre` varchar(30) NOT NULL,
  `rep_cantidad` int(11) NOT NULL,
  KEY `man_codigo` (`man_codigo`),
  KEY `aut_placa` (`aut_placa`),
  KEY `emp_id` (`emp_id`),
  KEY `rep_codigo` (`rep_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE IF NOT EXISTS `empleados` (
  `emp_id` varchar(15) NOT NULL,
  `emp_nombre` varchar(20) NOT NULL,
  `emp_apellidos` varchar(20) NOT NULL,
  `emp_sexo` varchar(20) NOT NULL,
  `emp_tipo` varchar(20) NOT NULL,
  `emp_telefono` varchar(10) NOT NULL,
  `emp_direccion` varchar(25) NOT NULL,
  `emp_salario` varchar(10) NOT NULL,
  `emp_correo` varchar(50) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupoclientes`
--

CREATE TABLE IF NOT EXISTS `grupoclientes` (
  `gru_codigo` varchar(10) NOT NULL,
  `gru_nombre` enum('Habitual','Ocasional','Potencial') NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_estado` enum('Activo','Inactivo') NOT NULL,
  PRIMARY KEY (`gru_codigo`),
  KEY `cli_id` (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialmantenimientos`
--

CREATE TABLE IF NOT EXISTS `historialmantenimientos` (
  `aut_placa` varchar(8) NOT NULL,
  `man_codigo` int(11) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  KEY `aut_placa` (`aut_placa`),
  KEY `man_codigo` (`man_codigo`),
  KEY `cli_id` (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos`
--

CREATE TABLE IF NOT EXISTS `mantenimientos` (
  `man_codigo` int(11) NOT NULL AUTO_INCREMENT,
  `man_fechaInicio` date NOT NULL,
  `man_estado` enum('Pendiente','Rechazado','Realizado','') NOT NULL,
  `man_costo` varchar(20) NOT NULL,
  `man_observaciones` text NOT NULL,
  PRIMARY KEY (`man_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
  PRIMARY KEY (`rep_codigo`),
  KEY `prov_nit` (`prov_nit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE IF NOT EXISTS `reservas` (
  `res_codigo` int(11) NOT NULL AUTO_INCREMENT,
  `res_fecha` date NOT NULL,
  `res_estado` enum('Pendiente','Finalizada','Aceptada','Rechazada') NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `aut_placa` varchar(8) NOT NULL,
  `emp_id` varchar(15) NOT NULL,
  `emp_nombre` varchar(50) NOT NULL,
  `res_observaciones` text NOT NULL,
  PRIMARY KEY (`res_codigo`),
  KEY `cli_id` (`cli_id`),
  KEY `aut_placa` (`aut_placa`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `autos`
--
ALTER TABLE `autos`
  ADD CONSTRAINT `autos_ibfk_1` FOREIGN KEY (`cli_id`) REFERENCES `clientes` (`cli_id`);

--
-- Filtros para la tabla `detalles`
--
ALTER TABLE `detalles`
  ADD CONSTRAINT `detalles_ibfk_1` FOREIGN KEY (`man_codigo`) REFERENCES `mantenimientos` (`man_codigo`),
  ADD CONSTRAINT `detalles_ibfk_2` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`),
  ADD CONSTRAINT `detalles_ibfk_3` FOREIGN KEY (`emp_id`) REFERENCES `empleados` (`emp_id`),
  ADD CONSTRAINT `detalles_ibfk_4` FOREIGN KEY (`rep_codigo`) REFERENCES `repuestos` (`rep_codigo`);

--
-- Filtros para la tabla `grupoclientes`
--
ALTER TABLE `grupoclientes`
  ADD CONSTRAINT `grupoclientes_ibfk_1` FOREIGN KEY (`cli_id`) REFERENCES `clientes` (`cli_id`);

--
-- Filtros para la tabla `historialmantenimientos`
--
ALTER TABLE `historialmantenimientos`
  ADD CONSTRAINT `historialmantenimientos_ibfk_1` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`),
  ADD CONSTRAINT `historialmantenimientos_ibfk_2` FOREIGN KEY (`man_codigo`) REFERENCES `mantenimientos` (`man_codigo`),
  ADD CONSTRAINT `historialmantenimientos_ibfk_3` FOREIGN KEY (`cli_id`) REFERENCES `clientes` (`cli_id`);

--
-- Filtros para la tabla `repuestos`
--
ALTER TABLE `repuestos`
  ADD CONSTRAINT `repuestos_ibfk_1` FOREIGN KEY (`prov_nit`) REFERENCES `proveedores` (`prov_nit`);

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`cli_id`) REFERENCES `clientes` (`cli_id`),
  ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`),
  ADD CONSTRAINT `reservas_ibfk_3` FOREIGN KEY (`emp_id`) REFERENCES `empleados` (`emp_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
