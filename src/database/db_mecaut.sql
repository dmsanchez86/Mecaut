-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-11-2014 a las 23:05:12
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
  `aut_ciudad` varchar(30) NOT NULL,
  `aut_tipo` enum('Camioneta','Deportivo','Campero','Camion','Bus, Buseta','Volqueta','Motocicleta','Moto-Carro') NOT NULL,
  `aut_modelo` varchar(5) NOT NULL,
  `aut_marca` varchar(20) NOT NULL,
  `aut_kilometraje` varchar(10) NOT NULL,
  `aut_combustible` varchar(20) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`aut_placa`),
  KEY `cli_id` (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `autos`
--

INSERT INTO `autos` (`aut_placa`, `aut_ciudad`, `aut_tipo`, `aut_modelo`, `aut_marca`, `aut_kilometraje`, `aut_combustible`, `cli_id`, `cli_nombre`) VALUES
('23321', 'Arauca', 'Camion', '1997', 'Kia', 'Gas', '456km', '33321321', 'Luz Adriana'),
('23frg', 'Armenia', 'Deportivo', '2012', 'Hyundai', 'gas', '34', '6700874', 'Oscar Eduardo'),
('300ZVA', 'Bogotá', 'Camion', '2011', 'Hyundai', 'Gasolina', '30000km', '7789654', 'Paula Andrea'),
('877GTH', 'Bucaramanga', 'Deportivo', '2015', 'Ford', 'Gas', '0Km', '1053844273', 'Mauricio');

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
('1053', 'DAniel', 'Sanchez', 'Masculino', '2323', 'Solferino', 'dmsanchez@misena.du.co'),
('1053844273', 'Mauricio', 'Sánchez', 'Masculino', '3203768421', 'Pereira', 'dmsanchez86@misena.edu.co'),
('33321321', 'Luz Adriana', 'Ávila', 'Femenino', '8765643', 'Armenia', 'adri.32@outlook.com'),
('6700874', 'Oscar Eduardo', 'Perez', 'Masculino', '8762323', 'Peralonso', 'os_eduar89@gmail.com'),
('7789654', 'Paula Andrea', 'Giraldo', 'Femenino', '3134258230', 'Los Cedros', 'pao-345@yahoo.es'),
('9506', 'Felipe', 'Piolin', 'Masculino', '8918060', 'Altos de Granada', 'fel_piolin@gamil.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE IF NOT EXISTS `cuentas` (
  `cue_numero` int(11) NOT NULL AUTO_INCREMENT,
  `cue_usuario` varchar(30) NOT NULL,
  `cue_contrasena` varchar(255) NOT NULL,
  `cue_tipoUsuario` varchar(20) NOT NULL,
  PRIMARY KEY (`cue_numero`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cue_numero`, `cue_usuario`, `cue_contrasena`, `cue_tipoUsuario`) VALUES
(1, 'dany', '202cb962ac59075b964b07152d234b70', 'administrador'),
(7, '232323', '2467d3744600858cc9026d5ac6005305', 'empleado'),
(12, 'solfe', '1b9fc02e98389d29c1506fe944b07d16', 'administrador'),
(14, '222', 'bcbe3365e6ac95ea2c0343a2395834dd', 'cliente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallefactura`
--

CREATE TABLE IF NOT EXISTS `detallefactura` (
  `fac_numero` varchar(15) NOT NULL DEFAULT '',
  `rep_codigo` varchar(10) NOT NULL DEFAULT '',
  `rep_tipo` varchar(20) NOT NULL DEFAULT '',
  `rep_marca` varchar(10) NOT NULL DEFAULT '',
  `rep_cantidad` varchar(5) NOT NULL DEFAULT '',
  `rep_precio` varchar(8) NOT NULL DEFAULT '',
  KEY `FK_detallefactura_1` (`fac_numero`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detallefactura`
--

INSERT INTO `detallefactura` (`fac_numero`, `rep_codigo`, `rep_tipo`, `rep_marca`, `rep_cantidad`, `rep_precio`) VALUES
('001', '1', 'Batería', 'michelln', '4', '100000'),
('001', '2', 'Motor', 'michellin', '3', '1200000'),
('001', '3', 'Amortiguador', 'michellin', '2', '80000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallesmantenimientos`
--

CREATE TABLE IF NOT EXISTS `detallesmantenimientos` (
  `man_codigo` int(11) NOT NULL,
  `man_tipo` varchar(50) NOT NULL,
  `man_descripcion` text NOT NULL,
  `man_fechaFin` varchar(50) NOT NULL,
  `aut_placa` varchar(8) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `emp_id` varchar(15) NOT NULL,
  `emp_nombre` varchar(30) NOT NULL,
  `rep_codigo` varchar(8) NOT NULL,
  `rep_tipo` varchar(30) NOT NULL,
  `rep_cantidad` varchar(11) NOT NULL,
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

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`emp_id`, `emp_nombre`, `emp_apellidos`, `emp_sexo`, `emp_tipo`, `emp_telefono`, `emp_direccion`, `emp_salario`, `emp_correo`) VALUES
('111', 'Jeremiasss', 'Vallejo', 'Masculino', 'Mécanico', '8918060', 'Comuneros', '550100', 'jer-111@yahoo.es'),
('232323', 'Felipe', 'Mejía', 'Masculino', 'Mécanico', '333333', 'San Sebastián', '340000', 'fel-6656@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `fac_numero` varchar(15) NOT NULL DEFAULT '',
  `fac_fecha` varchar(15) NOT NULL DEFAULT '0000-00-00',
  `cli_id` varchar(15) NOT NULL DEFAULT '',
  `cli_nombre` varchar(20) NOT NULL DEFAULT '',
  `fac_total` varchar(15) NOT NULL DEFAULT '',
  PRIMARY KEY (`fac_numero`),
  KEY `FK_factura_1` (`cli_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`fac_numero`, `fac_fecha`, `cli_id`, `cli_nombre`, `fac_total`) VALUES
('001', '2014-11-02', '1053', 'DAniel', '4160000.0');

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

--
-- Volcado de datos para la tabla `grupoclientes`
--

INSERT INTO `grupoclientes` (`gru_codigo`, `gru_nombre`, `cli_id`, `cli_estado`) VALUES
('233', 'Potencial', '1053', 'Activo'),
('444', 'Habitual', '33321321', 'Activo'),
('544', 'Potencial', '1053844273', 'Activo'),
('878', 'Habitual', '7789654', 'Activo'),
('890', 'Ocasional', '7789654', 'Activo');

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
  `man_fechaInicio` varchar(50) NOT NULL,
  `man_estado` enum('Pendiente','Rechazado','Realizado','') NOT NULL,
  `man_costo` varchar(20) NOT NULL,
  `man_observaciones` text NOT NULL,
  PRIMARY KEY (`man_codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `mantenimientos`
--

INSERT INTO `mantenimientos` (`man_codigo`, `man_fechaInicio`, `man_estado`, `man_costo`, `man_observaciones`) VALUES
(1, 'Wed Oct 29 01:14:20 COT 2014', 'Pendiente', '365000', 'Miercoles 29'),
(2, 'Sat Oct 04 15:43:22 COT 2014', 'Pendiente', '123000', 'ninguna');

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
('134', 'cd', 'arnjuez', '8787', 'ninguna'),
('234', 'Renaultttt', 'Manizales', '8786564', 'Proveedor de Repuestos Renault'),
('888', 'michel', 'liborio', '7477', 'ninguna');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuestos`
--

CREATE TABLE IF NOT EXISTS `repuestos` (
  `rep_codigo` varchar(10) NOT NULL DEFAULT '',
  `rep_tipo` varchar(20) NOT NULL,
  `rep_marca` varchar(10) NOT NULL,
  `rep_cantidad` varchar(5) NOT NULL,
  `rep_precio` varchar(8) NOT NULL,
  `prov_nit` varchar(15) NOT NULL,
  PRIMARY KEY (`rep_codigo`),
  KEY `prov_nit` (`prov_nit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `repuestos`
--

INSERT INTO `repuestos` (`rep_codigo`, `rep_tipo`, `rep_marca`, `rep_cantidad`, `rep_precio`, `prov_nit`) VALUES
('1', 'Batería', 'michelln', '3', '100000', '134'),
('2', 'Motor', 'michellin', '6', '1200000', '134'),
('3', 'Amortiguador', 'michellin', '2', '80000', '134');

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
-- Filtros para la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
  ADD CONSTRAINT `FK_detallefactura_1` FOREIGN KEY (`fac_numero`) REFERENCES `factura` (`fac_numero`);

--
-- Filtros para la tabla `detallesmantenimientos`
--
ALTER TABLE `detallesmantenimientos`
  ADD CONSTRAINT `detallesmantenimientos_ibfk_2` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`),
  ADD CONSTRAINT `detallesmantenimientos_ibfk_3` FOREIGN KEY (`emp_id`) REFERENCES `empleados` (`emp_id`),
  ADD CONSTRAINT `detallesmantenimientos_ibfk_4` FOREIGN KEY (`rep_codigo`) REFERENCES `repuestos` (`rep_codigo`);

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `FK_factura_1` FOREIGN KEY (`cli_id`) REFERENCES `clientes` (`cli_id`);

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
