-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 06-10-2014 a las 18:02:11
-- Versión del servidor: 5.5.16
-- Versión de PHP: 5.3.8

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

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cli_id`, `cli_nombre`, `cli_apellidos`, `cli_sexo`, `cli_telefono`, `cli_direccion`, `cli_correo`) VALUES
('1053844273', 'Daniel Mauricio', 'Sánchez Ávila', 'Masculino', '8769164', 'Solferino', 'dmsanchez86@misena.edu.co'),
('950630', 'Angie Camila', 'Giraldo Gomez', 'Femenino', '3104258312', 'Villahermosa', 'angie@misena.edu.co');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE IF NOT EXISTS `cuentas` (
  `cue_id` int(11) NOT NULL AUTO_INCREMENT,
  `cue_usuario` varchar(30) NOT NULL,
  `cue_contrasena` varchar(20) NOT NULL,
  `cue_tipoUsuario` varchar(20) NOT NULL,
  PRIMARY KEY (`cue_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cue_id`, `cue_usuario`, `cue_contrasena`, `cue_tipoUsuario`) VALUES
(1, 'admin', 'admin', 'administrador'),
(2, 'dany123', 'dany', 'cliente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE IF NOT EXISTS `empleados` (
  `emp_id` varchar(15) NOT NULL,
  `emp_nombre` varchar(20) NOT NULL,
  `emp_apellidos` varchar(20) NOT NULL,
  `emp_tipo` varchar(20) NOT NULL,
  `emp_telefono` varchar(10) NOT NULL,
  `emp_direccion` varchar(25) NOT NULL,
  `emp_salario` varchar(10) NOT NULL,
  `emp_correo` varchar(50) NOT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  `emp_id` varchar(15) NOT NULL,
  PRIMARY KEY (`man_codigo`),
  KEY `aut_placa` (`aut_placa`),
  KEY `mec_id` (`emp_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

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
  `prov_nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`rep_codigo`),
  KEY `prov_nit` (`prov_nit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  ADD CONSTRAINT `mantenimientos_ibfk_2` FOREIGN KEY (`emp_id`) REFERENCES `empleados` (`emp_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mantenimientos_ibfk_1` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `repuestos`
--
ALTER TABLE `repuestos`
  ADD CONSTRAINT `prov_nit` FOREIGN KEY (`prov_nit`) REFERENCES `proveedores` (`prov_nit`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
