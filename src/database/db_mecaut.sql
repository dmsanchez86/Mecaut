-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 07-11-2014 a las 06:00:54
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
('111AAA', 'Barranquilla', 'Deportivo', '2015', 'Mazda', 'Gasolina', '0Km', '1053', 'DAniel'),
('232BHG', 'Cartagena ', 'Deportivo', '2015', 'Nissan', 'Gasolina', '0Km', '1060648721', 'Andres'),
('23321', 'Arauca', 'Camion', '1997', 'Kia', 'Gas', '456km', '33321321', 'Luz Adriana'),
('234GGT', 'Bucaramanga', 'Campero', '2011', 'Kia', 'Gasolina', '2000Km', '1053844273', 'Mauricio'),
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
('', '', '', '----------', '', '', ''),
('1053', 'DAniel', 'Sanchez', 'Masculino', '2323', 'Solferino', 'dmsanchez@misena.du.co'),
('1053843130', 'Yuliana', 'Ramirez', 'Femenino', '3232323', 'Sena', 'yuliana10@misena.edu.co'),
('1053844273', 'Mauricio', 'Sánchez', 'Masculino', '3203768421', 'Pereira', 'dmsanchez86@misena.edu.co'),
('1060648721', 'Andres', 'Zapata', 'Masculino', '3127185122', 'Villamaria', 'andres@gmail.com'),
('1212', 'Alexandra', 'Gutierrez', 'Femenino', '33333', 'Villahermosa', 'alexa@outlook.com'),
('12232', 'Yuliana', 'Valencia', 'Femenino', '454545', 'La Enea', 'yuli@yahoo.com'),
('23', 'Julian', 'Arias', 'Masculino', '232323', 'La Enea', 'juli@gmail.com'),
('23233', 'Esteban', 'Castaño', 'Masculino', '4444444', 'Solferino', 'este@outlook.com'),
('2332', 'Julian', 'Arias', 'Masculino', '232323', 'La Enea', 'juli@gmail.com'),
('33321321', 'Luz Adriana', 'Ávila', 'Femenino', '8765643', 'Armenia', 'adri.32@outlook.com'),
('50450778', 'Julian Camilo', 'Arias Gallo', 'Masculino', '8766767', 'La Enea', 'juli@gmail.co'),
('6700874', 'Oscar Eduardo', 'Perez', 'Masculino', '8762323', 'Peralonso', 'os_eduar89@gmail.com'),
('7789654', 'Paula Andrea', 'Giraldo', 'Femenino', '3134258230', 'Los Cedros', 'pao-345@yahoo.es'),
('9506', 'Felipe', 'Piolin', 'Masculino', '8918060', 'Altos de Granada', 'fel_piolin@gamil.com'),
('9606', 'Mauricio', 'Sánchez', 'Masculino', '3456789', 'La Italia', 'dmsanchez@misena.edu.co');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cotizacion`
--

CREATE TABLE IF NOT EXISTS `cotizacion` (
`cot_numero` int(11) NOT NULL,
  `cot_fecha` varchar(30) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(30) NOT NULL,
  `man_codigo` varchar(10) NOT NULL,
  `man_precio` varchar(30) NOT NULL,
  `man_precioFinal` varchar(20) NOT NULL,
  `cot_valor` varchar(20) NOT NULL,
  `cot_observaciones` varchar(200) NOT NULL,
  `cot_estado` varchar(30) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `cotizacion`
--

INSERT INTO `cotizacion` (`cot_numero`, `cot_fecha`, `cli_id`, `cli_nombre`, `man_codigo`, `man_precio`, `man_precioFinal`, `cot_valor`, `cot_observaciones`, `cot_estado`) VALUES
(1, '14-11-06', '1053844273', 'Mauricio', '1', '365000', '360000', '5000', 'ninguna', 'Pendiente'),
(2, '14-11-06', '1053844273', 'Mauricio', '25', '235000', '85000', '150000', 'abono 150 lucas', 'Pendiente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE IF NOT EXISTS `cuentas` (
`cue_numero` int(11) NOT NULL,
  `cue_usuario` varchar(30) NOT NULL,
  `cue_contrasena` varchar(255) NOT NULL,
  `cue_tipoUsuario` varchar(20) NOT NULL,
  `usu_id` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cue_numero`, `cue_usuario`, `cue_contrasena`, `cue_tipoUsuario`, `usu_id`) VALUES
(1, 'dany', '21232f297a57a5a743894a0e4a801fc3', 'administrador', '1053844273'),
(2, '23233', 'b515e49e1faaf698fb98bafb1105aa16', 'cliente', '23233'),
(4, '1212', 'a01610228fe998f515a72dd730294d87', 'cliente', '1212'),
(5, '34', 'e369853df766fa44e1ed0ff613f563bd', 'cliente', '34'),
(6, '23', '37693cfc748049e45d87b8c7d8b9aacd', 'empleado', '23'),
(7, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'administrador', '96063017168'),
(8, '', 'd41d8cd98f00b204e9800998ecf8427e', '', ''),
(9, '1053843130', '281c4775c00b9b54558064e4bd7e010c', 'cliente', '1053843130'),
(10, '1060648721', '5c6ce2a5574098384170ac8c8a3fb426', 'cliente', '1060648721'),
(11, '', 'd41d8cd98f00b204e9800998ecf8427e', 'empleado', ''),
(12, '', 'd41d8cd98f00b204e9800998ecf8427e', '', '');

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
  `rep_precio` varchar(8) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detallefactura`
--

INSERT INTO `detallefactura` (`fac_numero`, `rep_codigo`, `rep_tipo`, `rep_marca`, `rep_cantidad`, `rep_precio`) VALUES
('001', '1', 'Batería', 'michelln', '4', '100000'),
('001', '2', 'Motor', 'michellin', '3', '1200000'),
('001', '3', 'Amortiguador', 'michellin', '2', '80000'),
('1', '1', 'Batería', 'michelln', '3', '100000'),
('1', '2', 'Motor', 'michellin', '1', '1200000'),
('1', '2', 'Motor', 'michellin', '4', '1200000'),
('1', '1', 'Batería', 'michelln', '1', '100000');

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
(1, 'Cambio de Llantas', 'Se solicita cabio de las 2 llantas delanteras', 'Thu Nov 13 23:58:15 COT 2014', '234GGT', 'Mauricio', '111', 'Jeremiasss', '3', 'Amortiguador', '2'),
(4, 'Cambio de Aceite', 'edfgsdf', 'Fri Nov 14 11:16:33 COT 2014', '877GTH', 'Mauricio', '232323', 'Felipe', '4', 'Amortiguador', '1'),
(5, 'Cambio de Llantas', 'dfgas', '12/11/2014', '23321', 'Luz Adriana', '232323', 'Felipe', '3', 'Amortiguador', '1'),
(6, 'Cambio de Llantas', 'sdfasdfs', '14/11/2014', '877GTH', 'Mauricio', '232323', 'Felipe', '4', 'Amortiguador', '3'),
(7, 'Cambio de Llantas', '', '20/11/2014', '234GGT', 'Mauricio', '232323', 'Felipe', '2', 'Motor', '3'),
(10, 'Reparación de Frenos', 'dfsgsfdg', '15/11/2014', '300ZVA', 'Paula Andrea', '12', 'Casimiro', '3', 'Amortiguador', '3'),
(10, 'Reparación de Frenos', 'dfsgsfdg', '15/11/2014', '300ZVA', 'Paula Andrea', '12', 'Casimiro', '3', 'Amortiguador', '3'),
(11, 'Reparación de Frenos', 'fd', '28/11/2014', '23frg', 'Oscar Eduardo', '12', 'Casimiro', '2', 'Motor', '3'),
(10, 'Reparación de Frenos', 'dfsgsfdg', '15/11/2014', '300ZVA', 'Paula Andrea', '12', 'Casimiro', '3', 'Amortiguador', '3'),
(11, 'Reparación de Frenos', 'fd', '28/11/2014', '23frg', 'Oscar Eduardo', '12', 'Casimiro', '2', 'Motor', '3'),
(14, 'Reparación de Frenos', 'sdfgsdfg', '28/11/2014', '234GGT', 'Mauricio', '232323', 'Felipe', '4', 'Amortiguador', '9'),
(15, 'Reparación de Frenos', 'fdsg', '21/11/2014', '23321', 'Luz Adriana', '12', 'Casimiro', '3', 'Amortiguador', '1'),
(16, 'Cambio de Llantas', 'ksadf', '21/11/2014', '234GGT', 'Mauricio', '232323', 'Felipe', '3', 'Amortiguador', '3'),
(16, 'Cambio de Aceite', 'sdfasd', '21/11/2014', '234GGT', 'Mauricio', '232323', 'Felipe', '3', 'Amortiguador', '3'),
(16, 'Cambio de Aceite', 'sdfasd', '21/11/2014', '234GGT', 'Mauricio', '232323', 'Felipe', '3', 'Amortiguador', '3'),
(17, 'Reparación de Frenos', 'sfasd', '15/11/2014', '877GTH', 'Mauricio', '232323', 'Felipe', '2', 'Motor', '3'),
(24, 'Cambio de Aceite', 'asd', '20/11/2014', '234GGT', 'Mauricio', '12', 'Casimiro', '3', 'Amortiguador', '4'),
(24, 'Reparación de Frenos', 'asfa', '20/11/2014', '234GGT', 'Mauricio', '12', 'Casimiro', '3', 'Amortiguador', '3'),
(24, 'Cambio de Llantas', 'asf', '20/11/2014', '234GGT', 'Mauricio', '12', 'Casimiro', '3', 'Amortiguador', '3'),
(25, 'Cambio de Aceite', 'ninguna', '04/11/2014', '111AAA', 'DAniel', '12', 'Casimiro', '1', 'Batería', '1'),
(26, 'Cambio de Aceite', 'ninguna', '08/11/2014', '232BHG', 'Andres', '111', 'Jeremiasss', '1', 'Batería', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_ordenpedido`
--

CREATE TABLE IF NOT EXISTS `detalles_ordenpedido` (
  `ord_numero` int(11) NOT NULL,
  `rep_codigo` varchar(20) NOT NULL,
  `rep_nombre` varchar(20) NOT NULL,
  `rep_marca` varchar(20) NOT NULL,
  `rep_cantidad` varchar(10) NOT NULL,
  `rep_precio` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalles_ordenpedido`
--

INSERT INTO `detalles_ordenpedido` (`ord_numero`, `rep_codigo`, `rep_nombre`, `rep_marca`, `rep_cantidad`, `rep_precio`) VALUES
(2, '56', 'Bomba de gasolina', 'Yamaha', '6', '45000'),
(2, '2', 'Motor', 'michellin', '8', '1200000'),
(2, '1', 'Batería', 'Kia', '5', '132000');

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
('', '', '', '----------', '----------', '', '', '', ''),
('111', 'Jeremiasss', 'Vallejo', 'Masculino', 'Mécanico', '8918060', 'Comuneros', '550100', 'jer-111@yahoo.es'),
('12', 'Casimiro', 'Pelante', 'Femenino', 'Mécanico', '34234', 'La Plata', '230000', 'cas_34345@hotmail.com'),
('12312', 'Caliman', 'Sanchez', 'Femenino', 'Mécanico', '23243', 'La Enea', '120000', 'cali-12@gmail.com'),
('23', 'Calilo', 'Giraldo', 'Masculino', 'Mécanico', '232323', 'Solferino', '34000', 'calilito@gamil.com'),
('232323', 'Felipe', 'Mejía', 'Masculino', 'Mécanico', '333333', 'San Sebastián', '340000', 'fel-6656@gmail.com'),
('96063017168', 'Daniel Maurcio', 'Sánchez Ávila', 'Masculino', 'Administrador', '3203768421', 'Carrera 6E #52-09', 'admin', 'dmsanchez86@outlook.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
  `fac_numero` varchar(15) NOT NULL DEFAULT '',
  `fac_fecha` varchar(15) NOT NULL DEFAULT '0000-00-00',
  `cli_id` varchar(15) NOT NULL DEFAULT '',
  `cli_nombre` varchar(20) NOT NULL DEFAULT '',
  `fac_total` varchar(15) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`fac_numero`, `fac_fecha`, `cli_id`, `cli_nombre`, `fac_total`) VALUES
('001', '2014-11-02', '1053', 'DAniel', '4160000.0'),
('1', '2014-11-06', '9606', 'Mauricio', '6400000.0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ficha_recepcion_auto`
--

CREATE TABLE IF NOT EXISTS `ficha_recepcion_auto` (
  `fic_fechaRegistro` varchar(30) DEFAULT NULL,
  `fic_fechaActualizacion` varchar(30) DEFAULT NULL,
  `cli_id` varchar(20) NOT NULL,
  `aut_placa` varchar(20) NOT NULL,
  `aut_cilindraje` varchar(20) NOT NULL,
  `aut_frenos` varchar(20) NOT NULL,
  `aut_peso` varchar(20) NOT NULL,
  `aut_color` varchar(20) NOT NULL,
  `aut_motor` varchar(20) NOT NULL,
  `aut_potencia` varchar(20) NOT NULL,
  `aut_transmision` varchar(20) NOT NULL,
  `aut_largo` varchar(20) NOT NULL,
  `aut_ancho` varchar(20) NOT NULL,
  `aut_alto` varchar(20) NOT NULL,
  `aut_cojineria` varchar(20) NOT NULL,
  `aut_puertas` varchar(20) NOT NULL,
  `aut_farolas` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ficha_recepcion_auto`
--

INSERT INTO `ficha_recepcion_auto` (`fic_fechaRegistro`, `fic_fechaActualizacion`, `cli_id`, `aut_placa`, `aut_cilindraje`, `aut_frenos`, `aut_peso`, `aut_color`, `aut_motor`, `aut_potencia`, `aut_transmision`, `aut_largo`, `aut_ancho`, `aut_alto`, `aut_cojineria`, `aut_puertas`, `aut_farolas`) VALUES
(NULL, NULL, '1053844273', '234GGT', '2000', 'ABS', '1000', 'Rojo', 'Diesel', 'Diesel', 'Manual', '170', '210', '170', 'Regular', 'Buena', 'Buena');

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
('232', 'Potencial', '1060648721', 'Activo'),
('233', 'Potencial', '1053', 'Activo'),
('234', 'Potencial', '9606', 'Activo'),
('444', 'Habitual', '33321321', 'Inactivo'),
('544', 'Potencial', '1053844273', 'Activo'),
('666', 'Ocasional', '1212', 'Activo'),
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
  `his_fecha` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `historialmantenimientos`
--

INSERT INTO `historialmantenimientos` (`aut_placa`, `man_codigo`, `cli_id`, `his_fecha`) VALUES
('234GGT', 14, '1053844273', '28/11/2014'),
('23321', 15, '33321321', '29/11/2014'),
('234GGT', 16, '1053844273', '21/11/2014'),
('234GGT', 21, '1053844273', '22/11/2014'),
('877GTH', 22, '1053844273', '15/11/2014'),
('111AAA', 23, '1053', '14/11/2014'),
('234GGT', 24, '1053844273', '21/11/2014'),
('111AAA', 25, '1053', '14/11/2014'),
('232BHG', 26, '1060648721', '12/11/2014');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos`
--

CREATE TABLE IF NOT EXISTS `mantenimientos` (
`man_codigo` int(11) NOT NULL,
  `man_fechaInicio` varchar(50) NOT NULL,
  `man_estado` enum('Pendiente','Rechazado','Realizado','') NOT NULL,
  `man_costo` varchar(20) NOT NULL,
  `man_observaciones` text NOT NULL,
  `cli_id` varchar(15) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Volcado de datos para la tabla `mantenimientos`
--

INSERT INTO `mantenimientos` (`man_codigo`, `man_fechaInicio`, `man_estado`, `man_costo`, `man_observaciones`, `cli_id`) VALUES
(1, 'Wed Oct 29 01:14:20 COT 2014', 'Pendiente', '360000', 'Miercoles 29', '1053844273'),
(2, 'Sat Oct 04 15:43:22 COT 2014', 'Pendiente', '123000', 'ninguna', ''),
(3, 'Sat Nov 15 00:00:00 COT 2014', 'Pendiente', '300000', 'MAntenimiento de hoy', '1053844273'),
(4, 'Fri Nov 14 11:15:54 COT 2014', 'Pendiente', '20500', 'awdafad', ''),
(5, '14/11/2014', 'Pendiente', '1205000', 'dfbsdf', ''),
(6, '14/11/2014', 'Pendiente', '12000', 'asdfsdf', '1053844273'),
(7, '21/11/2014', 'Pendiente', '200000', 'kjnjkbj', ''),
(9, '26/11/2014', 'Pendiente', '23224', 'sdafasdf', ''),
(10, '21/11/2014', 'Pendiente', '21323', 'fdgasfg', ''),
(11, '21/11/2014', 'Pendiente', '23123', 'dfsgdg', ''),
(12, '21/11/2014', 'Pendiente', '23123', 'dfsgdg', ''),
(14, '28/11/2014', 'Pendiente', '123000', 'dsfgafdsg', ''),
(15, '29/11/2014', 'Pendiente', '50000', 'j', ''),
(16, '21/11/2014', 'Pendiente', '123000', 'ksdjkfsa', ''),
(18, '21/11/2014', 'Pendiente', '25000', 'asfdasd', ''),
(19, '21/11/2014', 'Pendiente', '25000', 'asfdasd', ''),
(20, '21/11/2014', 'Pendiente', '25000', 'asfdasd', ''),
(21, '22/11/2014', 'Pendiente', '123333', 'daf', ''),
(24, '21/11/2014', 'Pendiente', '124444', 'jk', ''),
(25, '14/11/2014', 'Pendiente', '85000', 'ninguna', '1053'),
(26, '12/11/2014', 'Pendiente', '34000', 'none', '1060648721');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ordenpedido`
--

CREATE TABLE IF NOT EXISTS `ordenpedido` (
`ord_numero` int(11) NOT NULL,
  `ord_fecha` varchar(20) NOT NULL,
  `prov_nit` varchar(15) NOT NULL,
  `prov_nombre` varchar(20) NOT NULL,
  `prov_telefono` varchar(20) NOT NULL,
  `prov_direccion` varchar(30) NOT NULL,
  `ord_estado` enum('Pendiente','Aceptada','Rechazada','') NOT NULL,
  `ord_precio` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `ordenpedido`
--

INSERT INTO `ordenpedido` (`ord_numero`, `ord_fecha`, `prov_nit`, `prov_nombre`, `prov_telefono`, `prov_direccion`, `ord_estado`, `ord_precio`) VALUES
(1, '14-11-14', '234', 'Renaultttt', '8786564', 'Manizales', 'Pendiente', '$2704000'),
(2, '14-11-14', '32423', '32423', 'Monteria', 'Hyundai', 'Pendiente', '$10530000');

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
('123', 'Mazda', 'Manizales', '656565', 'none'),
('134', 'cd', 'arnjuez', '8787', 'ninguna'),
('234', 'Renaultttt', 'Manizales', '8786564', 'Proveedor de Repuestos Renault'),
('32423', '32423', 'Hyundai', 'Monteria', 'ninguna');

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
  `prov_nit` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `repuestos`
--

INSERT INTO `repuestos` (`rep_codigo`, `rep_tipo`, `rep_marca`, `rep_cantidad`, `rep_precio`, `prov_nit`) VALUES
('1', 'Batería', 'Kia', '203', '132000', '134'),
('2', 'Motor', 'michellin', '2', '1200000', '134'),
('3', 'Amortiguador', 'michellin', '2', '80000', '134'),
('56', 'Bomba de gasolina', 'Yamaha', '78', '45000', '134');

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
  `cli_telefono` varchar(20) NOT NULL,
  `cli_correo` varchar(100) NOT NULL,
  `aut_placa` varchar(8) NOT NULL,
  `aut_modelo` varchar(30) NOT NULL,
  `aut_marca` varchar(30) NOT NULL,
  `emp_id` varchar(15) NOT NULL,
  `emp_nombre` varchar(50) NOT NULL,
  `res_observaciones` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`res_codigo`, `res_fecha`, `res_estado`, `cli_id`, `cli_nombre`, `cli_telefono`, `cli_correo`, `aut_placa`, `aut_modelo`, `aut_marca`, `emp_id`, `emp_nombre`, `res_observaciones`) VALUES
(1, '2014-11-18', 'Pendiente', '1053', 'DAniel', '2323', 'dmsanchez86@misena.edu.co', '111AAA', '2015', 'Mazda', '12', 'Casimiro', 'Ninguna'),
(2, '2014-11-05', 'Pendiente', '1053', 'DAniel', '2323', 'dmsanchez@misena.du.co', '111AAA', '2015', 'Mazda', '12', 'Casimiro', 'fdgdfg'),
(3, '2014-11-21', 'Pendiente', '1053844273', 'Mauricio', '3203768421', 'dmsanchez86@misena.edu.co', '234GGT', '2011', 'Kia', '111', 'Jeremiasss', 'dfg'),
(4, '2014-11-12', 'Pendiente', '7789654', 'Paula Andrea', '3134258230', 'pao-345@yahoo.es', '300ZVA', '2011', 'Hyundai', '111', 'Jeremiasss', 'ninguna...');

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
-- Indices de la tabla `cotizacion`
--
ALTER TABLE `cotizacion`
 ADD PRIMARY KEY (`cot_numero`);

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
 ADD PRIMARY KEY (`cue_numero`), ADD KEY `cli_id` (`usu_id`);

--
-- Indices de la tabla `detallefactura`
--
ALTER TABLE `detallefactura`
 ADD KEY `FK_detallefactura_1` (`fac_numero`);

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
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
 ADD PRIMARY KEY (`fac_numero`), ADD KEY `FK_factura_1` (`cli_id`);

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
-- Indices de la tabla `ordenpedido`
--
ALTER TABLE `ordenpedido`
 ADD PRIMARY KEY (`ord_numero`);

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
-- AUTO_INCREMENT de la tabla `cotizacion`
--
ALTER TABLE `cotizacion`
MODIFY `cot_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `cuentas`
--
ALTER TABLE `cuentas`
MODIFY `cue_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
MODIFY `man_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=27;
--
-- AUTO_INCREMENT de la tabla `ordenpedido`
--
ALTER TABLE `ordenpedido`
MODIFY `ord_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
MODIFY `res_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
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
