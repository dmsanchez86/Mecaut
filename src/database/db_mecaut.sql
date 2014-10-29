-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 29-10-2014 a las 17:46:30
-- Versión del servidor: 5.6.20
-- Versión de PHP: 5.5.15

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
  `aut_ciudad` varchar(30) NOT NULL,
  `aut_tipo` enum('Camioneta','Deportivo','Campero','Camion','Bus, Buseta','Volqueta','Motocicleta','Moto-Carro') NOT NULL,
  `aut_modelo` varchar(5) NOT NULL,
  `aut_marca` varchar(20) NOT NULL,
  `aut_kilometraje` varchar(10) NOT NULL,
  `aut_combustible` varchar(20) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL
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
  `cli_correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cli_id`, `cli_nombre`, `cli_apellidos`, `cli_sexo`, `cli_telefono`, `cli_direccion`, `cli_correo`) VALUES
('1053', 'DAni', 'Sanchez', 'Masculino', '2323', 'Solferino', 'dmsanchez@misena.du.co'),
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
`cue_numero` int(11) NOT NULL,
  `cue_usuario` varchar(30) NOT NULL,
  `cue_contrasena` varchar(255) NOT NULL,
  `cue_tipoUsuario` varchar(20) NOT NULL
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
  `rep_cantidad` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detallesmantenimientos`
--

INSERT INTO `detallesmantenimientos` (`man_codigo`, `man_tipo`, `man_descripcion`, `man_fechaFin`, `aut_placa`, `cli_nombre`, `emp_id`, `emp_nombre`, `rep_codigo`, `rep_tipo`, `rep_cantidad`) VALUES
(1, 'Item 4', 'Viernes 31', 'Fri Oct 31 01:02:32 COT 2014', '877GTH', 'Mauricio', '232323', 'Felipe', '45gt', 'Bateria', '1'),
(1, 'Item 2', 'Jueves 30', 'Thu Oct 30 01:02:32 COT 2014', '877GTH', 'Mauricio', '111', 'Jeremias', '12', 'Llanta', '4'),
(1, 'Item 3', 'Noviembre 1', 'Sat Nov 01 01:11:12 COT 2014', '877GTH', 'Mauricio', '232323', 'Felipe', '45gt', 'Bateria', '1');

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
  `emp_correo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`emp_id`, `emp_nombre`, `emp_apellidos`, `emp_sexo`, `emp_tipo`, `emp_telefono`, `emp_direccion`, `emp_salario`, `emp_correo`) VALUES
('111', 'Jeremias', 'Vallejo', 'Masculino', 'Mécanico', '8918060', 'Comuneros', '550100', 'jer-111@yahoo.es'),
('232323', 'Felipe', 'Mejía', 'Masculino', 'Mécanico', '333333', 'San Sebastián', '340000', 'fel-6656@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupoclientes`
--

CREATE TABLE IF NOT EXISTS `grupoclientes` (
  `gru_codigo` varchar(10) NOT NULL,
  `gru_nombre` enum('Habitual','Ocasional','Potencial') NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_estado` enum('Activo','Inactivo') NOT NULL
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
  `cli_id` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos`
--

CREATE TABLE IF NOT EXISTS `mantenimientos` (
`man_codigo` int(11) NOT NULL,
  `man_fechaInicio` varchar(50) NOT NULL,
  `man_estado` enum('Pendiente','Rechazado','Realizado','') NOT NULL,
  `man_costo` varchar(20) NOT NULL,
  `man_observaciones` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `mantenimientos`
--

INSERT INTO `mantenimientos` (`man_codigo`, `man_fechaInicio`, `man_estado`, `man_costo`, `man_observaciones`) VALUES
(1, 'Wed Oct 29 01:14:20 COT 2014', 'Pendiente', '365000', 'Miercoles 29');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE IF NOT EXISTS `proveedores` (
  `prov_nit` varchar(15) NOT NULL,
  `prov_nombre` varchar(20) NOT NULL,
  `prov_direccion` varchar(25) NOT NULL,
  `prov_telefono` varchar(10) NOT NULL,
  `prov_descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`prov_nit`, `prov_nombre`, `prov_direccion`, `prov_telefono`, `prov_descripcion`) VALUES
('234', 'Renault', 'Manizales', '8786564', 'Proveedor de Repuestos Renault');

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
  `prov_nit` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `repuestos`
--

INSERT INTO `repuestos` (`rep_codigo`, `rep_tipo`, `rep_marca`, `rep_cantidad`, `rep_precio`, `prov_nit`) VALUES
('12', 'Llanta', 'Michelin', '30', '135000', '234'),
('45gt', 'Bateria', 'Yamaha', '34', '89000', '234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE IF NOT EXISTS `reservas` (
`res_codigo` int(11) NOT NULL,
  `res_fecha` date NOT NULL,
  `res_estado` enum('Pendiente','Finalizada','Aceptada','Rechazada') NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `aut_placa` varchar(8) NOT NULL,
  `emp_id` varchar(15) NOT NULL,
  `emp_nombre` varchar(50) NOT NULL,
  `res_observaciones` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autos`
--
ALTER TABLE `autos`
 ADD PRIMARY KEY (`aut_placa`), ADD KEY `cli_id` (`cli_id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
 ADD PRIMARY KEY (`cli_id`);

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
 ADD PRIMARY KEY (`cue_numero`);

--
-- Indices de la tabla `detallesmantenimientos`
--
ALTER TABLE `detallesmantenimientos`
 ADD KEY `man_codigo` (`man_codigo`), ADD KEY `aut_placa` (`aut_placa`), ADD KEY `emp_id` (`emp_id`), ADD KEY `rep_codigo` (`rep_codigo`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
 ADD PRIMARY KEY (`emp_id`);

--
-- Indices de la tabla `grupoclientes`
--
ALTER TABLE `grupoclientes`
 ADD PRIMARY KEY (`gru_codigo`), ADD KEY `cli_id` (`cli_id`);

--
-- Indices de la tabla `historialmantenimientos`
--
ALTER TABLE `historialmantenimientos`
 ADD KEY `aut_placa` (`aut_placa`), ADD KEY `man_codigo` (`man_codigo`), ADD KEY `cli_id` (`cli_id`);

--
-- Indices de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
 ADD PRIMARY KEY (`man_codigo`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
 ADD PRIMARY KEY (`prov_nit`);

--
-- Indices de la tabla `repuestos`
--
ALTER TABLE `repuestos`
 ADD PRIMARY KEY (`rep_codigo`), ADD KEY `prov_nit` (`prov_nit`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
 ADD PRIMARY KEY (`res_codigo`), ADD KEY `cli_id` (`cli_id`), ADD KEY `aut_placa` (`aut_placa`), ADD KEY `emp_id` (`emp_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuentas`
--
ALTER TABLE `cuentas`
MODIFY `cue_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
MODIFY `man_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
MODIFY `res_codigo` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `autos`
--
ALTER TABLE `autos`
ADD CONSTRAINT `autos_ibfk_1` FOREIGN KEY (`cli_id`) REFERENCES `clientes` (`cli_id`);

--
-- Filtros para la tabla `detallesmantenimientos`
--
ALTER TABLE `detallesmantenimientos`
ADD CONSTRAINT `detallesmantenimientos_ibfk_2` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`),
ADD CONSTRAINT `detallesmantenimientos_ibfk_3` FOREIGN KEY (`emp_id`) REFERENCES `empleados` (`emp_id`),
ADD CONSTRAINT `detallesmantenimientos_ibfk_4` FOREIGN KEY (`rep_codigo`) REFERENCES `repuestos` (`rep_codigo`);

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
