-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 19-11-2014 a las 01:31:06
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
('111BBB', 'Sincelejo', 'Campero', '2012', 'Ford', 'Gas', '0Km', '12345', 'MAo'),
('222AAA', 'Riohacha', 'Camion', '2015', 'Mazda', 'Gasolina', '0Km', '12345', 'MAo'),
('232BHG', 'Cartagena ', 'Deportivo', '2015', 'Nissan', 'Gasolina', '0Km', '1060648721', 'Andres'),
('23321', 'Arauca', 'Camion', '1997', 'Kia', 'Gas', '456km', '33321321', 'Luz Adriana'),
('234GGT', 'Bucaramanga', 'Campero', '2011', 'Kia', 'Gasolina', '2000Km', '1053844273', 'Mauricio'),
('23frg', 'Armenia', 'Deportivo', '2012', 'Hyundai', 'gas', '34', '6700874', 'Oscar Eduardo'),
('300ZVA', 'Bogotá', 'Camion', '2011', 'Hyundai', 'Gasolina', '30000km', '7789654', 'Paula Andrea'),
('334JYU', 'Valledupar', 'Camion', '1987', 'Mazda', 'Gasolina', '200000Km', '1053843130', 'Yuliana'),
('344HHH', 'Armenia', 'Campero', '2012', 'Hyundai', 'Gas', '0Km', '1212', 'Alexandra'),
('877GTH', 'Bucaramanga', 'Deportivo', '2015', 'Ford', 'Gas', '0Km', '1053844273', 'Mauricio'),
('980GHT', 'Barranquilla', 'Campero', '2012', 'Hyundai', 'Gas', '0Km', '12345', 'MAo');

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
('1053', 'Daniel', 'Sanchez', 'Masculino', '2323', 'La Florida', 'dmsanchez@misena.du.co'),
('1053843130', 'Yuliana', 'Ramirez', 'Femenino', '3232323', 'Sena', 'yuliana10@misena.edu.co'),
('1053844273', 'Mauricio', 'Sánchez', 'Masculino', '3203768421', 'Pereira', 'dmsanchez86@misena.edu.co'),
('1057690788', 'Nelson', 'Perez', 'Masculino', '8766756', 'Pio XII', 'nel-perez89@outlook.com'),
('1060648721', 'Andres', 'Zapata', 'Masculino', '3127185122', 'Villamaria', 'andres@gmail.com'),
('1212', 'Alexandra', 'Gutierrez', 'Femenino', '33333', 'Villahermosa', 'alexa@outlook.com'),
('121212', 'Camila', 'Perez', 'Femenino', '342342', 'El Cable', 'camila@gmail.com'),
('12232', 'Yuliana', 'Valencia', 'Femenino', '454545', 'La Enea', 'yuli@yahoo.com'),
('23233', 'Esteban', 'Castaño', 'Masculino', '4444444', 'Solferino', 'este@outlook.com'),
('2332', 'Julian', 'Arias', 'Masculino', '232323', 'La Enea', 'juli@gmail.com'),
('33321321', 'Luz Adriana', 'Ávila', 'Femenino', '8755555', 'Armenia', 'adri.32@outlook.com'),
('33333', 'Sergio', 'Londoño', 'Masculino', '111111', 'Aranjuez', 'nulll'),
('50450778', 'Julian Camilo', 'Arias Gallo', 'Masculino', '8766767', 'La Enea', 'juli@gmail.co'),
('6700874', 'Oscar Eduardo', 'Perez', 'Masculino', '8762323', 'Peralonso', 'os_eduar89@gmail.com'),
('7789654', 'Paula Andrea', 'Giraldo', 'Femenino', '3134258230', 'Los Cedros', 'pao-345@yahoo.es'),
('9506', 'Felipe', 'Piolin', 'Masculino', '8918060', 'Altos de Granada', 'fel_piolin@gamil.com');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcado de datos para la tabla `cotizacion`
--

INSERT INTO `cotizacion` (`cot_numero`, `cot_fecha`, `cli_id`, `cli_nombre`, `man_codigo`, `man_precio`, `man_precioFinal`, `cot_valor`, `cot_observaciones`, `cot_estado`) VALUES
(1, '14-11-06', '1053844273', 'Mauricio', '1', '365000', '360000', '5000', 'ninguna', 'Pendiente'),
(2, '14-11-06', '1053844273', 'Mauricio', '25', '235000', '85000', '150000', 'abono 150 lucas', 'Pendiente'),
(3, '14-11-08', '1060648721', 'Andres', '26', '34000', '14000', '20000', 'Ninguna', 'Pendiente'),
(4, '14-11-14', '1053844273', 'Mauricio', '3', '300000', '254700', '45300', 'abono', 'Pendiente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE IF NOT EXISTS `cuentas` (
`cue_numero` int(11) NOT NULL,
  `cue_usuario` varchar(30) NOT NULL,
  `cue_contrasena` varchar(255) NOT NULL,
  `cue_tipoUsuario` varchar(20) NOT NULL,
  `cue_estado` varchar(20) NOT NULL DEFAULT 'Activa',
  `usu_id` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cue_numero`, `cue_usuario`, `cue_contrasena`, `cue_tipoUsuario`, `cue_estado`, `usu_id`) VALUES
(1, 'dany', '21232f297a57a5a743894a0e4a801fc3', 'administrador', 'Activa', '1053844273'),
(2, '23233', 'b515e49e1faaf698fb98bafb1105aa16', 'cliente', 'Activa', '23233'),
(4, '1212', 'a01610228fe998f515a72dd730294d87', 'cliente', 'Activa', '1212'),
(5, '34', 'e369853df766fa44e1ed0ff613f563bd', 'cliente', 'Activa', '34'),
(6, '23', '37693cfc748049e45d87b8c7d8b9aacd', 'empleado', 'Activa', '23'),
(7, 'admin', '202cb962ac59075b964b07152d234b70', 'administrador', 'Inactiva', '95063017168'),
(9, '1053843130', '281c4775c00b9b54558064e4bd7e010c', 'cliente', 'Activa', '1053843130'),
(10, '1060648721', '5c6ce2a5574098384170ac8c8a3fb426', 'cliente', 'Activa', '1060648721'),
(13, '11111', 'b0baee9d279d34fa1dfd71aadb908c3f', 'cliente', 'Activa', '11111'),
(14, '2222', '934b535800b1cba8f96a5d72f72f1611', 'cliente', 'Activa', '2222'),
(15, '33333', 'b7bc2a2f5bb6d521e64c8974c143e9a0', 'cliente', 'Inactiva', '33333'),
(16, '121212', '93279e3308bdbbeed946fc965017f67a', 'cliente', 'Activa', '121212'),
(17, '23423', '468171c825c02408cc99935447c785a5', 'empleado', 'Activa', '23423'),
(18, '2323', '149815eb972b3c370dee3b89d645ae14', 'empleado', 'Activa', '2323'),
(19, 'mao273', '1b9fc02e98389d29c1506fe944b07d16', 'cliente', 'Activa', '12345'),
(20, 'empleado', 'ac8be4aee61f5f6e21b8c5afffb52939', 'empleado', 'Activa', '12121212'),
(21, '1057690788', 'f2dfcbb61a967103d568dfbb575578fc', 'cliente', 'Activa', '1057690788');

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
('1', '2', 'Motor', 'michellin', '2', '1200000'),
('2', '56', 'Bomba de gasolina', 'Yamaha', '1', '45000'),
('3', '2', 'Motor', 'michellin', '5', '1200000'),
('3', '2', 'Motor', 'michellin', '5', '1200000'),
('5', '3', 'Amortiguador', 'michellin', '4', '80000'),
('6', '2', 'Motor', 'michellin', '4', '1200000'),
('6', '3', 'Amortiguador', 'michellin', '6', '80000'),
('7', '2', 'Motor', 'michellin', '4', '1200000'),
('8', '2', 'Motor', 'michellin', '4', '1200000'),
('8', '3', 'Amortiguador', 'michellin', '6', '80000'),
('9', '2', 'Motor', 'michellin', '1', '1200000'),
('10', '2', 'Motor', 'michellin', '359', '1200000');

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
(26, 'Cambio de Aceite', 'ninguna', '08/11/2014', '232BHG', 'Andres', '111', 'Jeremiasss', '1', 'Batería', '1'),
(27, 'Reparación de Frenos', 'ninguna', '01/11/2014', '232BHG', 'Andres', '111', 'Jeremiasss', '3', 'Amortiguador', '2'),
(28, 'Reparación de Frenos', 'asd', '14/11/2014', '234GGT', 'Mauricio', '12', 'Casimiro', '3', 'Amortiguador', '4'),
(29, 'Cambio de Llantas', 'none', '16/11/2014', '232BHG', 'Andres', '12312', 'Caliman Sanchez', '56', 'Bomba de gasolina', '16'),
(31, 'Cambio de Aceite', 'ninguna', '15/11/2014', '232BHG', 'Andres', '12312', 'Caliman Sanchez', '3', 'Amortiguador', '3'),
(32, 'Cambio de Llantas', 'none', '16/11/2014', '232BHG', 'Andres', '111', 'Jeremiasss Vallejo', '2', 'Motor', '4'),
(33, 'Reparación de Frenos', 'ninguna', '15/11/2014', '232BHG', 'Andres', '12', 'Casimiro Pelante', '3', 'Amortiguador', '6'),
(34, 'Cambio de Llantas', 'dfgsfdg', '16/11/2014', '300ZVA', 'Paula Andrea', '232323', 'Felipe Mejía', '2', 'Motor', '5'),
(34, 'Cambio de Llantas', 'dsfg', '15/11/2014', '300ZVA', 'Paula Andrea', '111', 'Jeremiasss Vallejo', '2', 'Motor', '4'),
(35, 'Cambio de Llantas', 'sdaf', '15/11/2014', '111AAA', 'DAniel', '12312', 'Caliman Sanchez', '2', 'Motor', '5'),
(35, 'Reparación de Frenos', 'sadfasd', '15/11/2014', '111AAA', 'DAniel', '12', 'Casimiro Pelante', '1', 'Batería', '5'),
(36, 'Reparación de Frenos', 'sdaf', '15/11/2014', '111AAA', 'DAniel', '23', 'Calilo Giraldo', '2', 'Motor', '4'),
(37, 'Motor', '', '', '222AAA', 'MAo', '', '', '', '', ''),
(37, 'Frenos', '', '', '222AAA', 'MAo', '', '', '', '', ''),
(38, 'Reparación de Frenos', 'h', '22/11/2014', '222AAA', 'MAo', '12312', 'Caliman Sanchez', '3', 'Amortiguador', '5'),
(38, 'Cambio de Aceite', 'hd', '21/11/2014', '222AAA', 'MAo', '12312', 'Caliman Sanchez', '3', 'Amortiguador', '9'),
(39, 'Reparación de Frenos', 'dfsg', '14/11/2014', '980GHT', 'MAo', '23', 'Calilo Giraldo', '2', 'Motor', '3'),
(39, 'Reparación de Frenos', 'fsgdsd', '15/11/2014', '980GHT', 'MAo', '23', 'Calilo Giraldo', '3', 'Amortiguador', '100'),
(39, 'Reparación de Frenos', 'fsgdsd', '15/11/2014', '980GHT', 'MAo', '23', 'Calilo Giraldo', '3', 'Amortiguador', '100'),
(40, 'Cambio de Aceite', 'ninguna', '12/11/2014', '344HHH', 'Alexandra', '12312', 'Caliman Sanchez', '3', 'Amortiguador', '4'),
(41, 'Cambio de Llantas', 'se necesito cambio de llantas urgente', '21/11/2014', '980GHT', 'Mauricio', '12', 'Casimiro Pelante', '3', 'Amortiguador', '6'),
(42, 'Reparación de Frenos', 'dfgfdsagasdf', '23/11/2014', '980GHT', 'MAo', '111', 'Jeremiasss Vallejo', '1', 'Batería', '4');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_mantenimientos_pendientes`
--

CREATE TABLE IF NOT EXISTS `detalles_mantenimientos_pendientes` (
  `aut_placa` varchar(20) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `man_tipo` varchar(50) NOT NULL,
  `man_fecha` varchar(20) NOT NULL,
  `man_descripcion` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalles_mantenimientos_pendientes`
--

INSERT INTO `detalles_mantenimientos_pendientes` (`aut_placa`, `cli_nombre`, `man_tipo`, `man_fecha`, `man_descripcion`) VALUES
('222AAA', 'MAo', 'Motor', '14/11/2014', 'dsfgs'),
('222AAA', 'MAo', 'Frenos', '12/11/2014', 'dsfg'),
('111BBB', 'MAo', 'Llantas', '14/11/2014', 'sfdgd'),
('111BBB', 'MAo', 'Llantas', '13/11/2014', 'asdfasdf'),
('980GHT', 'MAo', 'Luces', '13/11/2014', 'sdf'),
('980GHT', 'MAo', 'Frenos', '14/11/2014', 'dsfg'),
('980GHT', 'MAo', 'Motor', '13/11/2014', 'dfg'),
('344HHH', 'Alexandra', 'Llantas', '12/11/2014', 'sdf'),
('980GHT', 'Mauricio', 'Llantas', '14/11/2014', 'necesito cambio urgente de llantas');

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
(2, '1', 'Batería', 'Kia', '5', '132000'),
(3, '3', 'Amortiguador', 'michellin', '5', '80000'),
(4, '56', 'Bomba de gasolina', 'Yamaha', '5', '45000'),
(5, '56', 'Bomba de gasolina', 'Yamaha', '16', '45000'),
(6, '56', 'Bomba de gasolina', 'Yamaha', '1', '45000'),
(7, '1', 'Batería', 'Kia', '10', '132000'),
(8, '1', 'Batería', 'Kia', '30', '132000'),
(8, '2', 'Motor', 'michellin', '20', '1200000'),
(9, '1', 'Batería', 'Kia', '10', '132000'),
(10, '1', 'Batería', 'Kia', '29', '132000'),
(11, '2', 'Motor', 'michellin', '33', '1200000'),
(12, '3', 'Amortiguador', 'michellin', '10', '80000'),
(12, '56', 'Bomba de gasolina', 'Yamaha', '34', '45000'),
(17, '56', 'Bomba de gasolina', 'Yamaha', '10', '45000'),
(17, '3', 'Amortiguador', 'michellin', '10', '80000'),
(18, '56', 'Bomba de gasolina', 'Yamaha', '15', '45000'),
(20, '2', 'Motor', 'michellin', '39', '1200000'),
(21, '3', 'Amortiguador', 'michellin', '4', '80000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devoluciones`
--

CREATE TABLE IF NOT EXISTS `devoluciones` (
`dev_numero` int(11) NOT NULL,
  `dev_fecha` varchar(20) NOT NULL,
  `ord_numero` varchar(20) NOT NULL,
  `prov_nit` varchar(20) NOT NULL,
  `pro_nombre` varchar(30) NOT NULL,
  `rep_codigo` varchar(20) NOT NULL,
  `rep_nombre` varchar(20) NOT NULL,
  `rep_cantidad` varchar(30) NOT NULL,
  `rep_precio` varchar(20) NOT NULL,
  `dev_descripcion` varchar(500) NOT NULL,
  `ord_estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

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
('1053844273', 'Daniel', 'Sánchez', 'Masculino', 'Administrador', '3203768421', 'Texas', '230040', 'dany@yahoo.com'),
('111', 'Jeremiasss', 'Vallejo', 'Masculino', 'Mécanico', '8918060', 'Comuneros', '550100', 'jer-111@yahoo.es'),
('12', 'Casimiro', 'Pelante', 'Femenino', 'Mécanico', '34234', 'La Plata', '230000', 'cas_34345@hotmail.com'),
('12121212', 'Elias', 'Cardenaz', 'Masculino', 'Mécanico', '1212321', 'Solfe', '3400000', 'dmsanchez86@misena.edu.co'),
('12312', 'Caliman', 'Sanchez', 'Masculino', 'Mécanico', '23243', 'La Enea', '120000', 'cali-12@gmail.com'),
('23', 'Calilo', 'Giraldo', 'Masculino', 'Mécanico', '232323', 'Solferino', '34000', 'calilito@gamil.com'),
('232323', 'Felipe', 'Mejía', 'Masculino', 'Mécanico', '333333', 'San Sebastián', '340000', 'fel-6656@gmail.com'),
('95063017168', 'Daniel Maurcio', 'Sánchez Ávila', 'Masculino', 'Administrador', '3203768421', 'Carrera 6E #52-09', '500000', 'dmsanchez86@outlook.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE IF NOT EXISTS `factura` (
`fac_numero` int(11) NOT NULL,
  `fac_fecha` varchar(20) NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `fac_total` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`fac_numero`, `fac_fecha`, `cli_id`, `cli_nombre`, `fac_total`) VALUES
(1, '2014-11-07', '1053', 'DAniel', '2400000.0'),
(2, '2014-11-07', '9506', 'Felipe', '45000.0'),
(3, '2014-11-07', '1053', 'Daniel Sanchez', '6000000.0'),
(4, '2014-11-07', '1053', 'Daniel Sanchez', '6000000.0'),
(5, '2014-11-08', '1053', 'Daniel Sanchez', '320000.0'),
(6, '2014-11-09', '1053', 'Daniel Sanchez', '5280000.0'),
(7, '2014-11-13', '1053843130', 'Yuliana Ramirez', '4800000.0'),
(8, '2014-11-13', '1060648721', 'Andres Zapata', '5280000.0'),
(9, '2014-11-14', '2222', 'mmmm mmmm', '1200000.0'),
(10, '2014-11-14', '1053', 'Daniel Sanchez', '4.308E8');

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
('09/11/2014', '09/11/2014', '1053', '111AAA', '4444', 'resgd', '320', 'fdx', 'grsg', 'grsg', 'Automatica', '320', '320', '320', 'Buena', 'Buena', 'Buena'),
('09/11/2014', NULL, '1053844273', '234GGT', '', '', '0', '', '', '', '-------', '0', '0', '0', 'Mala', 'Mala', 'Mala'),
('09/11/2014', NULL, '1053844273', '877GTH', '123', 'jhg', '1230', 'adf', 'ghvhg', 'ghvhg', '-------', '1230', '23210', '1230', 'Regular', 'Regular', 'Buena'),
('12/11/2014', '12/11/2014', '12345', '980GHT', '3000', 'abs', '4', 'azul', 'diesel', 'diesel', 'Automatica', '3', '3', '3', 'Regular', 'Regular', 'Buena'),
('12/11/2014', NULL, '12345', '111BBB', '2000', 'abs', '0', 'azul', 'diesel', 'diesel', '-------', '2', '2', '2', 'Regular', 'Regular', 'Regular');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupoclientes`
--

CREATE TABLE IF NOT EXISTS `grupoclientes` (
  `gru_codigo` enum('GRH001','GRO002','GRP003') NOT NULL,
  `gru_nombre` enum('Habitual','Ocasional','Potencial') NOT NULL,
  `cli_id` varchar(15) NOT NULL,
  `cli_estado` enum('Activo','Inactivo') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `grupoclientes`
--

INSERT INTO `grupoclientes` (`gru_codigo`, `gru_nombre`, `cli_id`, `cli_estado`) VALUES
('GRO002', 'Ocasional', '33333', 'Inactivo'),
('GRP003', 'Potencial', '121212', 'Activo'),
('GRO002', 'Ocasional', '1057690788', 'Activo');

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
('232BHG', 26, '1060648721', '12/11/2014'),
('232BHG', 27, '1060648721', '07/11/2014'),
('234GGT', 28, '1053844273', '09/11/2014'),
('232BHG', 29, '1060648721', '14/11/2014'),
('111AAA', 30, '1053', '14/11/2014'),
('232BHG', 31, '1060648721', '06/11/2014'),
('232BHG', 32, '1060648721', '15/11/2014'),
('232BHG', 33, '1060648721', '07/11/2014'),
('300ZVA', 34, '7789654', '07/11/2014'),
('111AAA', 35, '1053', '08/11/2014'),
('111AAA', 36, '1053', '15/11/2014'),
('222AAA', 37, '12345', '12/11/2014'),
('222AAA', 38, '12345', '12/11/2014'),
('980GHT', 39, '12345', '12/11/2014'),
('344HHH', 40, '1212', '12/11/2014'),
('980GHT', 41, '12345', '16/11/2014'),
('980GHT', 42, '12345', '15/11/2014');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=43 ;

--
-- Volcado de datos para la tabla `mantenimientos`
--

INSERT INTO `mantenimientos` (`man_codigo`, `man_fechaInicio`, `man_estado`, `man_costo`, `man_observaciones`, `cli_id`) VALUES
(3, 'Sat Nov 15 00:00:00 COT 2014', 'Pendiente', '254700', 'MAntenimiento de hoy', '1053844273'),
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
(26, '12/11/2014', 'Pendiente', '14000', 'none', '1060648721'),
(27, '07/11/2014', 'Pendiente', '1200000', 'ninguna', '1060648721'),
(28, '09/11/2014', 'Pendiente', '340000', 'adas', '1053844273'),
(29, '14/11/2014', 'Pendiente', '720000', 'weqf', '1060648721'),
(30, '14/11/2014', 'Pendiente', '56000', 'dfg', '1053'),
(31, '06/11/2014', 'Pendiente', '240000', 'ninguna', '1060648721'),
(32, '15/11/2014', 'Pendiente', '$4800000', 'asdsf', '1060648721'),
(33, '07/11/2014', 'Pendiente', '$480000', 'sdfgasfg', '1060648721'),
(34, '07/11/2014', 'Pendiente', '$10800000', 'fdgsdfg', '7789654'),
(35, '08/11/2014', 'Pendiente', '$6660000', 'nnig		', '1053'),
(36, '15/11/2014', 'Pendiente', '$4800000', 'adfg', '1053'),
(37, '12/11/2014', 'Pendiente', '', 'dfasd', '12345'),
(38, '12/11/2014', 'Pendiente', '$1120000', 'fdgh', '12345'),
(39, '12/11/2014', 'Pendiente', '$19600000', 'sdfgsdf', '12345'),
(40, '12/11/2014', 'Pendiente', '$320000', 'niguna', '1212'),
(41, '16/11/2014', 'Pendiente', '$480000', 'eraf', '12345'),
(42, '15/11/2014', 'Pendiente', '$528000', 'dsfgasfd', '12345');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos_pendientes`
--

CREATE TABLE IF NOT EXISTS `mantenimientos_pendientes` (
  `aut_placa` varchar(20) NOT NULL,
  `cli_id` varchar(20) NOT NULL,
  `cli_nombre` varchar(20) NOT NULL,
  `manp_estado` enum('Pendiente','Aceptada','Rechazada') NOT NULL,
  `manp_fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mantenimientos_pendientes`
--

INSERT INTO `mantenimientos_pendientes` (`aut_placa`, `cli_id`, `cli_nombre`, `manp_estado`, `manp_fecha`) VALUES
('222AAA', '12345', 'MAo', 'Rechazada', '2014-11-11'),
('222AAA', '12345', 'MAo', 'Rechazada', '2014-11-11'),
('111BBB', '12345', 'MAo', 'Rechazada', '2014-11-11'),
('111BBB', '12345', 'MAo', 'Rechazada', '2014-11-12'),
('980GHT', '12345', 'MAo', 'Aceptada', '2014-11-12'),
('344HHH', '1212', 'Alexandra', 'Aceptada', '2014-11-12'),
('980GHT', '12345', 'Mauricio', 'Aceptada', '2014-11-16');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Volcado de datos para la tabla `ordenpedido`
--

INSERT INTO `ordenpedido` (`ord_numero`, `ord_fecha`, `prov_nit`, `prov_nombre`, `prov_telefono`, `prov_direccion`, `ord_estado`, `ord_precio`) VALUES
(2, '14-11-14', '32423', '32423', 'Monteria', 'Hyundai', 'Pendiente', '10530000'),
(3, '14-11-07', '234', 'Renaultttt', '8786564', 'Manizales', 'Pendiente', '400000'),
(4, '14-11-14', '32423', '32423', 'Monteria', 'Hyundai', 'Pendiente', '225000'),
(5, '14-11-07', '234', 'Renaultttt', '8786564', 'Manizales', 'Pendiente', '720000'),
(6, '14-11-12', '123', 'Mazda', '656565', 'Manizales', 'Pendiente', '45000'),
(7, '14-11-13', '134', 'cd', '8787', 'arnjuez', 'Pendiente', '1320000'),
(8, '14-11-27', '32423', '32423', 'Monteria', 'Hyundai', 'Pendiente', '27960000'),
(9, '14-11-15', '134', 'cd', '8787', 'arnjuez', 'Pendiente', '1320000'),
(10, '14-11-13', '134', 'cd', '8787', 'arnjuez', 'Pendiente', '3828000'),
(11, '14-11-13', '234', 'Renaultttt', '8786564', 'Manizales', 'Pendiente', '39600000'),
(12, '14-11-20', '123', 'Mazda', '656565', 'Manizales', 'Pendiente', '2330000'),
(17, '14-11-05', '32423', '32423', 'Monteria', 'Hyundai', 'Pendiente', '1250000'),
(18, '14-11-13', '134', 'cd', '8787', 'arnjuez', 'Pendiente', '675000'),
(20, '14-11-07', '32423', '32423', 'Monteria', 'Hyundai', 'Pendiente', '46800000'),
(21, '14-11-15', '32423', '32423', 'Monteria', 'Hyundai', 'Pendiente', '320000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `promociones`
--

CREATE TABLE IF NOT EXISTS `promociones` (
`pro_codigo` int(11) NOT NULL,
  `pro_fecha` varchar(20) NOT NULL,
  `pro_tipo` varchar(30) NOT NULL,
  `pro_descripcion` text NOT NULL,
  `pro_estado` enum('Activa','Inactiva') NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `promociones`
--

INSERT INTO `promociones` (`pro_codigo`, `pro_fecha`, `pro_tipo`, `pro_descripcion`, `pro_estado`) VALUES
(1, '09/11/2014', 'Repuesto', 'Compre 3 llantas y lleve 4', 'Activa'),
(2, '10/11/2014', 'Mantenimiento', 'Si solicita un cambio de frenos se le obsequia el liquido para ello', 'Activa'),
(4, '16/11/2014', 'Mantenimiento', 'Si compras un aleron obtendras un descuento del 10%', 'Inactiva'),
(5, '22/11/2014', 'Mantenimiento', 'Por cambio de sistema electrico reciba completamente gratis una batería', 'Activa');

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
('123', 'Mazda', 'Manizales', '656565', 'Proveedor de servicios mazda'),
('134', 'Chevroleth', 'Aranjuez', '8787878', 'Proveedor de repuestos chevrolte'),
('234', 'Renault', 'Manizales', '8786564', 'Proveedor de Repuestos Renault'),
('324', 'Hyundai', 'Arauca', '3444444', 'Proveedor de repuestos hyundai');

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
('1', 'Batería', 'Kia', '69', '132000', '134'),
('2', 'Motor', 'michellin', '4302', '1200000', '134'),
('3', 'Amortiguador', 'michellin', '146', '80000', '134'),
('56', 'Bomba de gasolina', 'Yamaha', '45', '45000', '134');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`res_codigo`, `res_fecha`, `res_estado`, `cli_id`, `cli_nombre`, `cli_telefono`, `cli_correo`, `aut_placa`, `aut_modelo`, `aut_marca`, `emp_id`, `emp_nombre`, `res_observaciones`) VALUES
(1, '2014-11-18', 'Pendiente', '1053', 'DAniel', '2323', 'dmsanchez86@misena.edu.co', '111AAA', '2015', 'Mazda', '12', 'Casimiro', 'Ninguna'),
(2, '2014-11-05', 'Pendiente', '1053', 'DAniel', '2323', 'dmsanchez@misena.du.co', '111AAA', '2015', 'Mazda', '12', 'Casimiro', 'fdgdfg'),
(3, '2014-11-21', 'Pendiente', '1053844273', 'Mauricio', '3203768421', 'dmsanchez86@misena.edu.co', '234GGT', '2011', 'Kia', '111', 'Jeremiasss', 'dfg'),
(4, '2014-11-12', 'Pendiente', '7789654', 'Paula Andrea', '3134258230', 'pao-345@yahoo.es', '300ZVA', '2011', 'Hyundai', '111', 'Jeremiasss', 'ninguna...'),
(5, '2014-11-07', 'Pendiente', '1053843130', 'Daniel', '2323', 'dmsanchez@misena.du.co', '111AAA', '2015', 'Mazda', '111', 'Jeremiasss', 'dsfdgsdg'),
(6, '2014-11-28', 'Pendiente', '1060648721', 'Andres', '3127185122', 'andres@gmail.com', '232BHG', '2015', 'Nissan', '232323', 'Felipe', 'Ninguna');

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
-- Indices de la tabla `devoluciones`
--
ALTER TABLE `devoluciones`
 ADD PRIMARY KEY (`dev_numero`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
 ADD PRIMARY KEY (`emp_id`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
 ADD PRIMARY KEY (`fac_numero`);

--
-- Indices de la tabla `grupoclientes`
--
ALTER TABLE `grupoclientes`
 ADD KEY `cli_id` (`cli_id`);

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
-- Indices de la tabla `promociones`
--
ALTER TABLE `promociones`
 ADD PRIMARY KEY (`pro_codigo`);

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
MODIFY `cot_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `cuentas`
--
ALTER TABLE `cuentas`
MODIFY `cue_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT de la tabla `devoluciones`
--
ALTER TABLE `devoluciones`
MODIFY `dev_numero` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
MODIFY `fac_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
MODIFY `man_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=43;
--
-- AUTO_INCREMENT de la tabla `ordenpedido`
--
ALTER TABLE `ordenpedido`
MODIFY `ord_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT de la tabla `promociones`
--
ALTER TABLE `promociones`
MODIFY `pro_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
MODIFY `res_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `historialmantenimientos`
--
ALTER TABLE `historialmantenimientos`
ADD CONSTRAINT `historialmantenimientos_ibfk_1` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`);

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`aut_placa`) REFERENCES `autos` (`aut_placa`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
