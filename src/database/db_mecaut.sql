-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 07-12-2014 a las 19:33:26
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
('123LLO', 'Quibdó', 'Camioneta', '2011', 'Ford', 'Gas', '238km', '131313', 'camila'),
('222AAA', 'Riohacha', 'Camion', '2015', 'Mazda', 'Gasolina', '0Km', '12345', 'MAo'),
('232BHG', 'Cartagena ', 'Deportivo', '2015', 'Nissan', 'Gasolina', '0Km', '1060648721', 'Andres'),
('23321', 'Arauca', 'Camion', '1997', 'Kia', 'Gas', '456km', '33321321', 'Luz Adriana'),
('234GGT', 'Bucaramanga', 'Campero', '2011', 'Kia', 'Gasolina', '2000Km', '1053844273', 'Mauricio'),
('23frg', 'Armenia', 'Deportivo', '2012', 'Hyundai', 'gas', '34', '6700874', 'Oscar Eduardo'),
('300ZVA', 'Bogotá', 'Camion', '2011', 'Hyundai', 'Gasolina', '30000km', '7789654', 'Paula Andrea'),
('332KLO', 'Armenia', 'Campero', '2010', 'Chevrolet', 'Gas', '30000km', '1053', 'Daniel'),
('334JYU', 'Valledupar', 'Camion', '1987', 'Mazda', 'Gasolina', '200000Km', '1053843130', 'Yuliana'),
('344HHH', 'Armenia', 'Campero', '2012', 'Hyundai', 'Gas', '0Km', '1212', 'Alexandra'),
('476JJL', 'Bogotá', 'Camion', '1988', 'Mercedez Benz', 'Gasolina', '300km', '23233', 'Esteban'),
('877GTH', 'Bucaramanga', 'Deportivo', '2015', 'Ford', 'Gas', '0Km', '1053844273', 'Mauricio'),
('980GHT', 'Barranquilla', 'Campero', '2012', 'Hyundai', 'Gas', '0Km', '12345', 'MAo'),
('995AXC', 'Sincelejo', 'Volqueta', '1996', 'Chevrolet', 'ACPM', '307887km', '12345', 'Malicio'),
('abc14', 'Manizales', 'Deportivo', '2014', 'Kia', 'gas', '1000', '1053832044', 'natalia'),
('asd123', 'Bogotá', 'Deportivo', '2013', 'Toyota', 'gas', '120', '1234567890', 'sergio'),
('asd2', 'Armenia', 'Camion', '2014', 'Hyundai', 'gas', '123', '1234567890', ''),
('asd24', 'Arauca', 'Deportivo', '2013', 'Toyota', 'gas', '34', '1234567890', 'sergio'),
('asdf234', 'Manizales', 'Camion', '2012', 'Toyota', 'gasolina', '43', '1053841696', 'sergio alejandro'),
('aws123', 'Manizales', 'Camioneta', '2015', 'Toyota', 'gasolina', '0', '1053843298', 'esteban'),
('bbb123', 'Arauca', 'Campero', '2015', 'Mercedez Benz', 'gas', '456', '1053841697', 'alexandra'),
('bbbb', 'Barranquilla', 'Deportivo', '2014', 'Toyota', 'gasolina', '0', '987654321', 'alexandra'),
('blk323', 'Bogotá', 'Campero', '2001', 'Chevrolet', 'gasolina', '160000', '1053832044', 'natalia'),
('cv123', 'Armenia', 'Camioneta', '2013', 'Ford', 'gas', '213', '131313', 'camil'),
('sdf3234', 'Bucaramanga', 'Deportivo', '2013', 'Mazda', 'gasolina', '14', '1123456789', 'juan diego'),
('vvva', 'Armenia', 'Camion', '2015', 'Chevrolet', 'gas', '54', '1053841697', 'alexandra');

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
('000000000', 'Maicol Stiven', 'Cardona', 'Femenino', '6574545', 'El caribe', 'mai-ari@gmail.com'),
('1053', 'Daniel', 'Sanchez', 'Masculino', '2323', 'La Florida', 'dmsanchez@misena.du.co'),
('1053832044', 'natalia', 'franco', '', '55555', 'calle 16', 'nfranco440@miena.edu.co'),
('1053841696', 'sergio alejandro', 'londoño ', 'Masculino', '988', 'aran', 'salon'),
('1053841697', 'alexandra', 'gutierrez esclante', 'Femenino', '9898', 'villa hermosa', 'alexa@'),
('1053843130', 'Yuliana', 'Ramirez', 'Femenino', '3232323', 'Sena', 'yuliana10@misena.edu.co'),
('1053844273', 'Mauricio', 'Sánchez', 'Masculino', '3203768421', 'Pereira', 'dmsanchez86@misena.edu.co'),
('1057690788', 'Nelson', 'Perez', 'Masculino', '8766756', 'Pio XII', 'nel-perez89@outlook.com'),
('1060648721', 'Andres', 'Zapata', 'Masculino', '3127185122', 'Villamaria', 'andres@gmail.com'),
('11112323', 'Danel', 'Avilla', 'Masculino', '45435435', 'Carmen', 'dan.123@gmail.com'),
('1123456789', 'juan diego', 'botero', 'Masculino', '7766', 'villamaria', 'juan@'),
('1212', 'Alexandra', 'Gutierrez', 'Femenino', '8767655', 'Villahermosa', 'alexa@outlook.com'),
('121212', 'Camila', 'Perez', 'Femenino', '342342', 'El Cable', 'camila@gmail.com'),
('12121222222', 'Diego', 'Alvarez', 'Masculino', '54564645', 'carmen', 'diego@misena.edu.co'),
('121312323', 'chayanne', 'baygon', 'Masculino', '77676777', 'halmeria', 'gratis@ms.co'),
('12232', 'Yuliana', 'Valencia', 'Femenino', '454545', 'La Enea', 'yuli@yahoo.com'),
('123123434', 'mafe', 'granada', 'Femenino', '234234', 'LA Linda', 'mafe@gmail.com'),
('12312423', 'brahyan', 'parreira', 'Masculino', '34234243', 'Calle larga', 'bryan@yahoo.es'),
('12345', 'Malicio', 'Arbeloa', 'Masculino', '33333333', 'San Cayetano', 'mal-@mail.com'),
('1234567890', 'sergio', 'londoño osorio', 'Masculino', '8787666', 'aranjuez', 'salondono69'),
('124123432', 'Alison', 'Castellanos', 'Femenino', '237846555', 'Lisboa', 'alison@gmail.com'),
('131313', 'camila', 'morales', 'Femenino', '33432123', 'La Enea', 'calia@terra.com'),
('23233', 'Esteban', 'Castaño', 'Masculino', '4444444', 'Solferino', 'este@outlook.com'),
('2332', 'Julian', 'Arias', 'Masculino', '232323', 'La Enea', 'juli@gmail.com'),
('234234', 'asdasda', 'asdasd', 'Femenino', '2131234', 'sadasd', 'asdasd@hotmail.com'),
('234234234', 'Cristina', 'Fuquen', 'Femenino', '9878788', 'Samaria', 'cris.fuquen@misena.du.co'),
('33321321', 'Luz Adriana', 'Ávila', 'Femenino', '8755555', 'Armenia', 'adri.32@outlook.com'),
('33333', 'Sergio', 'Londoño', 'Masculino', '8766646', 'Aranjuez', 'che3cho@misena.edu.co'),
('6700874', 'Oscar Eduardo', 'Perez', 'Masculino', '8762323', 'Peralonso', 'os_eduar89@gmail.com'),
('7789654', 'Paula Andrea', 'Giraldo', 'Femenino', '3134258230', 'Los Cedros', 'pao-345@yahoo.es'),
('9506', 'Felipe', 'Piolin', 'Masculino', '8918060', 'Altos de Granada', 'fel_piolin@gamil.com'),
('95070215269', 'juan esteban', 'castaÃ±o calvo', 'Masculino', '8764266', 'cra 7c#51-03', 'eeeeljuan@hotmail.com'),
('987654321', 'alexandra', 'gutierrez', 'Femenino', '87676', 'villa', 'alxita@misn.edu.co');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Volcado de datos para la tabla `cotizacion`
--

INSERT INTO `cotizacion` (`cot_numero`, `cot_fecha`, `cli_id`, `cli_nombre`, `man_codigo`, `man_precio`, `man_precioFinal`, `cot_valor`, `cot_observaciones`, `cot_estado`) VALUES
(1, '14-11-06', '1053844273', 'Mauricio', '1', '365000', '360000', '5000', 'ninguna', 'Pendiente'),
(2, '14-11-06', '1053844273', 'Mauricio', '25', '235000', '85000', '150000', 'abono 150 lucas', 'Pendiente'),
(3, '14-11-08', '1060648721', 'Andres', '26', '34000', '14000', '20000', 'Ninguna', 'Pendiente'),
(4, '14-11-14', '1053844273', 'Mauricio', '3', '300000', '254700', '45300', 'abono', 'Pendiente'),
(5, '14-11-21', '1053844273', 'Mauricio', '3', '254700', '250000', '4700', 'edsgd', 'Pendiente'),
(6, '14-12-18', '1053', 'Daniel', '25', '85000', '51000', '34000', 'dsfgsd', 'Pendiente'),
(7, '14-12-03', '1053841696', 'sergio alejandro', '45', '132000', '42000', '90000', 'Abono del 80%', 'Pendiente'),
(8, '14-12-05', '1053841697', 'alexandra', '49', '2400000', '2000000', '400000', 'ninguna', 'Pendiente'),
(9, '14-12-13', '1053841697', 'alexandra', '49', '2000000', '1000000', '1000000', 'ninguna', 'Pendiente'),
(10, '14-12-08', '1053832044', 'natalia', '56', '396000', '300000', '96000', 'abono ', 'Pendiente'),
(11, '14-12-09', '1053832044', 'natalia', '56', '300000', '50000', '250000', 'ninguno', 'Pendiente');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=46 ;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`cue_numero`, `cue_usuario`, `cue_contrasena`, `cue_tipoUsuario`, `cue_estado`, `usu_id`) VALUES
(1, 'dany', '21232f297a57a5a743894a0e4a801fc3', 'administrador', 'Activa', '1053844273'),
(2, '23233', 'b515e49e1faaf698fb98bafb1105aa16', 'cliente', 'Activa', '23233'),
(4, '1212', 'a01610228fe998f515a72dd730294d87', 'cliente', 'Activa', '1212'),
(5, '34', 'e369853df766fa44e1ed0ff613f563bd', 'cliente', 'Activa', '34'),
(6, '23', '37693cfc748049e45d87b8c7d8b9aacd', 'empleado', 'Activa', '23'),
(7, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'administrador', 'Activa', '95063017168'),
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
(21, '1057690788', 'f2dfcbb61a967103d568dfbb575578fc', 'cliente', 'Activa', '1057690788'),
(22, 'camila', '202cb962ac59075b964b07152d234b70', 'cliente', 'Activa', '131313'),
(23, 'danel', 'dany', 'cliente', 'Activa', '11112323'),
(24, '123123434', '9f04fffd70153362b1f8fbe4ca96c3fc', 'cliente', 'Activa', '123123434'),
(25, '234234234', '61b80f94cdd6d632f7bc38fd9ed91d9c', 'cliente', 'Activa', '234234234'),
(26, '000000000', '4c93008615c2d041e33ebac605d14b5b', 'cliente', 'Activa', '000000000'),
(27, '12312423', '6a8223465ef4a5db7fc35a1bd94b5502', 'cliente', 'Activa', '12312423'),
(28, '124123432', '1678ce26de6c5b8db22f079b23621217', 'cliente', 'Activa', '124123432'),
(29, '121312323', '4ee1ba4e4b8541e6e58f8b6617555700', 'cliente', 'Activa', '121312323'),
(30, '1053841696', '764b1f010a03403b8caf8cba9e1bce80', 'cliente', 'Activa', '1053841696'),
(31, '1010101010', '3fd5c2a0df1ce9dc01f0698adc57c72b', 'empleado', 'Activa', '1010101010'),
(32, 'user1', '0cc175b9c0f1b6a831c399e269772661', 'cliente', 'Activa', '567474'),
(33, 'teban753', '69ba109c895658f4c0f163c5fd8c4898', 'cliente', 'Activa', '1053843298'),
(34, 'teban753', 'juan', 'cliente', 'Activa', '95070215269'),
(35, 'leo', '0f759dd1ea6c4c76cedc299039ca4f23', 'cliente', 'Activa', '234325'),
(36, 'leo', '7815696ecbf1c96e6894b779456d330e', 'cliente', 'Activa', '234325'),
(37, '878787', '9180b4da3f0c7e80975fad685f7f134e', 'cliente', 'Activa', '234234'),
(38, 'checho34', '0f39295cc001f31de347c29fb504e92f', 'cliente', 'Activa', '1053841696'),
(39, 'dieg1', '1b9fc02e98389d29c1506fe944b07d16', 'cliente', 'Activa', '12121222222'),
(40, '1234567890', 'e807f1fcf82d132f9bb018ca6738a19f', 'cliente', 'Activa', '1234567890'),
(41, '1053841697', '827ccb0eea8a706c4c34a16891f84e7b', 'cliente', 'Activa', '1053841697'),
(42, '1123456789', '5c2ac85eb3834d3adb2289aa92f60457', 'cliente', 'Activa', '1123456789'),
(43, 'alexa', '277f2a7ecb7cfcd264aeb2067fb46df8', 'cliente', 'Activa', '987654321'),
(44, 'natalia', '81dc9bdb52d04dc20036dbd8313ed055', 'cliente', 'Activa', '1053832044'),
(45, '1053838276', '3a57bd03b4fe3658614234f02ba75a43', 'empleado', 'Activa', '1053838276');

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
('10', '2', 'Motor', 'michellin', '359', '1200000'),
('11', '2', 'Motor', 'michellin', '4187', '1200000'),
('12', '2', 'Motor', 'michellin', '4413', '1200000'),
('13', '56', 'Bomba de gasolina', 'Yamaha', '6', '45000'),
('14', '2', 'Motor', 'michellin', '4', '1200000'),
('15', '2', 'Motor', 'michellin', '3', '1200000'),
('16', '1', 'Batería', 'Kia', '2', '132000'),
('17', '1', 'Batería', 'Kia', '2', '132000'),
('18', '1', 'Batería', 'Kia', '100', '132000'),
('18', '2', 'Motor', 'michellin', '17673', '1200000'),
('19', '1', 'Batería', 'Kia', '4', '132000'),
('19', '3', 'Amortiguador', 'michellin', '46', '80000'),
('20', '2', 'Motor', 'michellin', '4', '1200000'),
('21', '56', 'Bomba de gasolina', 'Yamaha', '4', '45000');

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
(37, 'Motor', '', '', '222AAA', 'MAo', '', '', '', '', ''),
(37, 'Frenos', '', '', '222AAA', 'MAo', '', '', '', '', ''),
(38, 'Reparación de Frenos', 'h', '22/11/2014', '222AAA', 'MAo', '12312', 'Caliman Sanchez', '3', 'Amortiguador', '5'),
(38, 'Cambio de Aceite', 'hd', '21/11/2014', '222AAA', 'MAo', '12312', 'Caliman Sanchez', '3', 'Amortiguador', '9'),
(39, 'Reparación de Frenos', 'dfsg', '14/11/2014', '980GHT', 'MAo', '23', 'Calilo Giraldo', '2', 'Motor', '3'),
(39, 'Reparación de Frenos', 'fsgdsd', '15/11/2014', '980GHT', 'MAo', '23', 'Calilo Giraldo', '3', 'Amortiguador', '100'),
(39, 'Reparación de Frenos', 'fsgdsd', '15/11/2014', '980GHT', 'MAo', '23', 'Calilo Giraldo', '3', 'Amortiguador', '100'),
(40, 'Cambio de Aceite', 'ninguna', '12/11/2014', '344HHH', 'Alexandra', '12312', 'Caliman Sanchez', '3', 'Amortiguador', '4'),
(41, 'Cambio de Llantas', 'se necesito cambio de llantas urgente', '21/11/2014', '980GHT', 'Mauricio', '12', 'Casimiro Pelante', '3', 'Amortiguador', '6'),
(42, 'Reparación de Frenos', 'dfgfdsagasdf', '23/11/2014', '980GHT', 'MAo', '111', 'Jeremiasss Vallejo', '1', 'Batería', '4'),
(43, 'Reparación de Frenos', 'dfgv', '08/11/2014', '344HHH', 'Alexandra', '12121212', 'Elias Cardenaz', '2', 'Motor', '0'),
(44, 'Cambio de Aceite', 'ninguan', '01/11/2014', 'cv123', 'camil', '12121212', 'Elias Cardenaz', '1', 'Batería', '3'),
(45, 'Reparación de Frenos', 'mimgima	', '07/12/2014', 'asdf234', 'sergio alejandro', '12', 'Casimiro Pelante', '1', 'Batería', '1'),
(46, 'Sondeo de radiador', 'dsfg', '19/12/2014', '23321', 'Luz Adriana', '12312', 'Caliman Sanchez', '2', 'Motor', '4'),
(47, 'Lubricación', 'dsfg', '19/12/2014', 'aws123', 'esteban', '12312', 'Caliman Sanchez', '56', 'Bomba de gasolina', '6'),
(48, 'Sincronización del motor', 'ninguna', '13/12/2014', 'bbb123', '', '12', 'Casimiro Pelante', '3', 'Amortiguador', '3'),
(49, 'Ajuste de suspensión', 'ninguna', '13/12/2014', 'bbb123', 'alexandra', '12121212', 'Elias Cardenaz', '2', 'Motor', '2'),
(50, 'Cambio de radiador', 'ninguna', '06/12/2014', 'sdf3234', 'juan diego', '12121212', 'Elias Cardenaz', '3', 'Amortiguador', '5'),
(51, 'Alineación', 'ninguna', '06/12/2014', 'bbbb', 'alexandra', '12121212', 'Elias Cardenaz', '2', 'Motor', '2'),
(52, 'Cambio de aceite', 'asdasd', '05/12/2014', '111AAA', 'DAniel', '12', 'Casimiro Pelante', '2', 'Motor', '5'),
(2, 'Alineación', 'asdfs', '05/12/2014', '222AAA', 'MAo', '12121212', 'Elias Cardenaz', '3', 'Amortiguador', '3'),
(54, 'Alineación', 'nne', '12/12/2014', '111BBB', 'MAo', '12', 'Casimiro Pelante', '2', 'Motor', '6'),
(55, 'Cambio de aceite', 'asd', '20/12/2014', '995AXC', 'Malicio', '111', 'Jeremiasss Vallejo', '3', 'Amortiguador', '22'),
(56, 'Afinamiento', 'ninguno', '05/12/2014', 'blk323', 'natalia', '1010101010', 'sergio londoño', '1', 'Batería', '1'),
(56, 'Ajuste de suspensión', 'ninguna', '05/12/2014', 'blk323', 'natalia', '1010101010', 'sergio londoño', '1', 'Batería', '1'),
(56, 'Ajuste de suspensión', 'ninguna', '05/12/2014', 'blk323', 'natalia', '1010101010', 'sergio londoño', '1', 'Batería', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalles_devolucion`
--

CREATE TABLE IF NOT EXISTS `detalles_devolucion` (
  `ord_numero` varchar(10) NOT NULL,
  `rep_codigo` varchar(20) NOT NULL,
  `rep_nombre` varchar(30) NOT NULL,
  `rep_cantidad` varchar(10) NOT NULL,
  `rep_precio` varchar(20) NOT NULL,
  `prov_nit` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detalles_devolucion`
--

INSERT INTO `detalles_devolucion` (`ord_numero`, `rep_codigo`, `rep_nombre`, `rep_cantidad`, `rep_precio`, `prov_nit`) VALUES
('6', '56', 'Bomba de gasolina', '1', '45000', '123'),
('17', '3', 'Amortiguador', '10', '80000', '32423'),
('2', '2', 'Motor', '8', '1200000', '32423'),
('2', '2', 'Motor', '8', '1200000', '32423'),
('2', '1', 'Batería', '5', '132000', '32423'),
('2', '56', 'Bomba de gasolina', '6', '45000', '32423'),
('2', '2', 'Motor', '8', '1200000', '32423'),
('2', '1', 'Batería', '5', '132000', '32423'),
('2', '56', 'Bomba de gasolina', '6', '45000', '32423'),
('2', '1', 'Batería', '5', '132000', '32423');

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
('980GHT', 'Mauricio', 'Llantas', '14/11/2014', 'necesito cambio urgente de llantas'),
('cv123', 'camil', 'Frenos', '07/11/2014', 'ninguna'),
('aws123', 'esteban', 'Llantas', '03/12/2014', 'gaste de llantas'),
('bbb123', 'alexandra', 'Ajuste de suspensión', '05/12/2014', 'ninguna'),
('sdf3234', 'juan diego', 'Cambio de radiador', '05/12/2014', 'ninguna'),
('bbbb', 'alexandra', 'Cambio de filtro', '12/12/2014', 'ninguna'),
('995AXC', 'Malicio', 'Cambio de bujía', '05/12/2014', 'none'),
('blk323', 'natalia', 'Afinamiento', '05/12/2014', 'ninguna'),
('blk323', 'natalia', 'Ajuste de suspensión', '05/12/2014', 'cambio balineras'),
('blk323', 'natalia', 'Alineación', '05/12/2014', 'alinear llanta derecha');

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
(21, '3', 'Amortiguador', 'michellin', '4', '80000'),
(22, '2', 'Motor', 'michellin', '10', '1200000'),
(23, '1', 'Batería', 'Kia', '2', '132000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `devoluciones`
--

CREATE TABLE IF NOT EXISTS `devoluciones` (
`dev_numero` int(11) NOT NULL,
  `dev_fecha` varchar(20) NOT NULL,
  `ord_numero` varchar(20) NOT NULL,
  `numero_repuestos` varchar(10) NOT NULL,
  `dev_descripcion` varchar(500) NOT NULL,
  `ord_estado` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=19 ;

--
-- Volcado de datos para la tabla `devoluciones`
--

INSERT INTO `devoluciones` (`dev_numero`, `dev_fecha`, `ord_numero`, `numero_repuestos`, `dev_descripcion`, `ord_estado`) VALUES
(1, '2014-12-335', '8', '1', 'sfgasfd', 'Aceptada'),
(2, '2014-12-335', '8', '1', 'Se devolvieron todas las baterias por que estaban sin carga', 'Aceptada'),
(3, '2014-12-335', '-----', '0', 'Se devolvieron todas las baterias por que estaban sin carga', 'Aceptada'),
(4, '2014-12-337', '8', '1', 'mal estado', 'Aceptada'),
(5, '2014-12-337', '-----', '0', 'mal estadp', 'Aceptada'),
(6, '2014-12-337', '6', '1', 'muy mal estado', 'Aceptada'),
(7, '2014-12-337', '17', '1', 'sdfgsdf', 'Aceptada'),
(8, '2014-12-337', '-----', '0', 'sdfgsdf', 'Aceptada'),
(9, '2014-12-337', '17', '0', 'dsfgsdfgsdfgsdfgsdf', 'Aceptada'),
(10, '2014-12-338', '2', '1', 'sdfsdafsdf', 'Aceptada'),
(11, '2014-12-338', '-----', '0', 'sdfsdafsdf', 'Aceptada'),
(12, '2014-12-338', '2', '1', 'asdfsdfsdfsdfsd', 'Aceptada'),
(13, '2014-12-338', '2', '1', 'sdf', 'Aceptada'),
(14, '2014-12-338', '2', '1', 'sdfsa', 'Aceptada'),
(15, '2014-12-338', '2', '1', 'asdfasfasdfasd', 'Aceptada'),
(16, '2014-12-338', '2', '1', 'a', 'Aceptada'),
(17, '2014-12-338', '2', '1', 'asd', 'Aceptada'),
(18, '2014-12-338', '2', '1', 'nini', 'Aceptada');

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
('1010101010', 'sergio', 'londoño', 'Masculino', 'Mécanico', '76767', 'ana', '1123', 'asjd'),
('1053838276', 'jhon jorge', 'aguilar cortez', 'Masculino', 'Mécanico', '8786460', 'barrio colombia', '1000000', 'jjaguilar67@misena.edu.co'),
('1053844273', 'Daniel', 'Sánchez', 'Masculino', 'Administrador', '3203768421', 'Las Vegas', '230040', 'dany@yahoo.com'),
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
  `cli_nombre` varchar(50) NOT NULL,
  `fac_total` varchar(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

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
(10, '2014-11-14', '1053', 'Daniel Sanchez', '4.308E8'),
(11, '2014-12-12', '1053', 'Daniel Sanchez', '5.0244E9'),
(12, '2014-12-20', '33321321', 'Luz Adriana Ávila', '5.2956E9'),
(13, '2014-12-20', '23233', 'Esteban Castaño', '270000.0'),
(14, '2014-12-12', '1234567890', 'sergio londoño osorio', '4800000.0'),
(15, '2014-12-06', '1234567890', 'sergio londoño osorio', '3600000.0'),
(16, '2014-12-13', '1053841697', 'alexandra gutierrez esclante', '264000.0'),
(17, '2014-12-07', '123123434', 'mafe granada', '264000.0'),
(18, '2014-12-07', '121212', 'Camila Perez', '2.12208E10'),
(19, '2014-12-05', '1053841697', 'alexandra gutierrez esclante', '4208000.0'),
(20, '2014-12-12', '1053', 'Daniel Sanchez', '4800000.0'),
(21, '2014-12-06', '1053832044', 'natalia franco', '180000.0');

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
('12/11/2014', '03/12/2014', '12345', '111BBB', '2000', 'abs', '0', 'azul', 'diesel', 'diesel', 'Manual', '2', '2', '2', 'Regular', 'Regular', 'Buena'),
('05/12/2014', NULL, '1053832044', 'blk323', '1300', 'ok', '1000', 'azul', 'diesel', 'diesel', 'Automatica', '145', '169', '145', 'Buena', 'Buena', 'Buena');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fondos`
--

CREATE TABLE IF NOT EXISTS `fondos` (
  `usu_id` varchar(30) NOT NULL,
  `imagen` varchar(500) DEFAULT 'Wallpaper-auto-concept-neon-tuning-desktop1.jpg'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `fondos`
--

INSERT INTO `fondos` (`usu_id`, `imagen`) VALUES
('1053844273', 'Wallpaper-auto-concept-neon-tuning-desktop1.jpg'),
('95063017168', 'audi-s5-rear-angle-1920x1080-wallpaper-1377.jpg');

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
('GRO002', 'Ocasional', '33333', 'Activo'),
('GRP003', 'Potencial', '121212', 'Inactivo'),
('GRO002', 'Ocasional', '1057690788', 'Activo'),
('GRO002', 'Ocasional', '123123434', 'Activo'),
('GRO002', 'Ocasional', '234234234', 'Activo'),
('GRH001', 'Habitual', '000000000', 'Activo'),
('GRO002', 'Ocasional', '12312423', 'Activo'),
('GRO002', 'Ocasional', '124123432', 'Activo'),
('GRO002', 'Ocasional', '121312323', 'Activo'),
('GRO002', 'Ocasional', '1053841696', 'Activo'),
('GRO002', 'Ocasional', '1234567890', 'Activo'),
('GRO002', 'Ocasional', '1053841697', 'Activo'),
('GRO002', 'Ocasional', '1123456789', 'Activo');

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
('222AAA', 37, '12345', '12/11/2014'),
('222AAA', 38, '12345', '12/11/2014'),
('980GHT', 39, '12345', '12/11/2014'),
('344HHH', 40, '1212', '12/11/2014'),
('980GHT', 41, '12345', '16/11/2014'),
('980GHT', 42, '12345', '15/11/2014'),
('344HHH', 43, '1212', '24/11/2014'),
('cv123', 44, '131313', '24/11/2014'),
('asdf234', 45, '1053841696', '05/12/2014'),
('23321', 46, '33321321', '03/12/2014'),
('aws123', 47, '1053843298', '03/12/2014'),
('bbb123', 48, '', '13/12/2014'),
('bbb123', 49, '1053841697', '04/12/2014'),
('sdf3234', 50, '1123456789', '04/12/2014'),
('bbbb', 51, '987654321', '05/12/2014'),
('111AAA', 52, '1053', '05/12/2014'),
('222AAA', 2, '12345', '05/12/2014'),
('111BBB', 54, '12345', '12/12/2014'),
('995AXC', 55, '12345', '05/12/2014'),
('blk323', 56, '1053832044', '05/12/2014');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=57 ;

--
-- Volcado de datos para la tabla `mantenimientos`
--

INSERT INTO `mantenimientos` (`man_codigo`, `man_fechaInicio`, `man_estado`, `man_costo`, `man_observaciones`, `cli_id`) VALUES
(1, '2014-12-05', 'Pendiente', '230000', 'ninguno', '1053844273'),
(53, '05/12/2014', 'Pendiente', '240000', 'ninguna', '12345'),
(54, '12/12/2014', 'Pendiente', '7200000', 'nniguna', '12345'),
(55, '05/12/2014', 'Pendiente', '1760000', 'asd', '12345'),
(56, '05/12/2014', 'Pendiente', '50000', 'ninguna', '1053832044');

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
('980GHT', '12345', 'MAo', 'Rechazada', '2014-11-12'),
('344HHH', '1212', 'Alexandra', 'Aceptada', '2014-11-12'),
('980GHT', '12345', 'Mauricio', 'Aceptada', '2014-11-16'),
('cv123', '131313', 'camil', 'Aceptada', '2014-11-24'),
('aws123', '1053843298', 'esteban', 'Aceptada', '2014-12-03'),
('bbb123', '1053841697', 'alexandra', 'Aceptada', '2014-12-04'),
('sdf3234', '1123456789', 'juan diego', 'Aceptada', '2014-12-04'),
('bbbb', '987654321', 'alexandra', 'Aceptada', '2014-12-05'),
('995AXC', '12345', 'Malicio', 'Aceptada', '2014-12-05'),
('blk323', '1053832044', 'natalia', 'Aceptada', '2014-12-05');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

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
(21, '14-11-15', '32423', '32423', 'Monteria', 'Hyundai', 'Pendiente', '320000'),
(22, '14-12-12', '234', 'Renault', '8786564', 'Manizales', 'Pendiente', '12000000'),
(23, '14-12-05', '850850-6', 'mecanicos', '310310310', 'pueblo escondido', 'Pendiente', '264000');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Volcado de datos para la tabla `promociones`
--

INSERT INTO `promociones` (`pro_codigo`, `pro_fecha`, `pro_tipo`, `pro_descripcion`, `pro_estado`) VALUES
(1, '09/11/2014', 'Repuesto', 'Compre 3 llantas y lleve 4', 'Activa'),
(2, '10/11/2014', 'Mantenimiento', 'Si solicita un cambio de frenos se le obsequia el liquido para ello', 'Activa'),
(4, '16/11/2014', 'Mantenimiento', 'Si compras un aleron obtendras un descuento del 10%', 'Inactiva'),
(5, '22/11/2014', 'Mantenimiento', 'Por cambio de sistema electrico reciba completamente gratis una batería', 'Activa'),
(6, '05/12/2014', 'Repuesto', 'envetunado de llantas', 'Activa');

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
('324', 'Hyundai', 'Arauca', '3444444', 'Proveedor de repuestos hyundai'),
('567', 'vcb', 'dfg', '45', 'sdf'),
('850850-6', 'mecanicos', 'pueblo escondido', '310310310', 'venta ');

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
('1', 'Batería', 'Kia', '2', '132000', '134'),
('2', 'Motor', 'michellin', '0', '1200000', '134'),
('3', 'Amortiguador', 'michellin', '78', '80000', '134'),
('56', 'Bomba de gasolina', 'Yamaha', '80', '45000', '134');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`res_codigo`, `res_fecha`, `res_estado`, `cli_id`, `cli_nombre`, `cli_telefono`, `cli_correo`, `aut_placa`, `aut_modelo`, `aut_marca`, `emp_id`, `emp_nombre`, `res_observaciones`) VALUES
(1, '2014-11-18', 'Pendiente', '1053', 'DAniel', '2323', 'dmsanchez86@misena.edu.co', '111AAA', '2015', 'Mazda', '12', 'Casimiro', 'Ninguna'),
(2, '2014-11-05', 'Pendiente', '1053', 'DAniel', '2323', 'dmsanchez@misena.du.co', '111AAA', '2015', 'Mazda', '12', 'Casimiro', 'fdgdfg'),
(3, '2014-11-21', 'Pendiente', '1053844273', 'Mauricio', '3203768421', 'dmsanchez86@misena.edu.co', '234GGT', '2011', 'Kia', '111', 'Jeremiasss', 'dfg'),
(4, '2014-11-12', 'Pendiente', '7789654', 'Paula Andrea', '3134258230', 'pao-345@yahoo.es', '300ZVA', '2011', 'Hyundai', '111', 'Jeremiasss', 'ninguna...'),
(5, '2014-11-07', 'Pendiente', '1053843130', 'Daniel', '2323', 'dmsanchez@misena.du.co', '111AAA', '2015', 'Mazda', '111', 'Jeremiasss', 'dsfdgsdg'),
(6, '2014-11-28', 'Pendiente', '1060648721', 'Andres', '3127185122', 'andres@gmail.com', '232BHG', '2015', 'Nissan', '232323', 'Felipe', 'Ninguna'),
(7, '2014-11-28', 'Pendiente', '33321321', 'Luz Adriana', '8755555', 'adri.32@outlook.com', '23321', '1997', 'Kia', '12312', 'Caliman', 'dsfgdsfgsd'),
(8, '2014-12-19', 'Pendiente', '1053841697', 'alexandra', '9898', 'alexa@', 'bbb123', '2015', 'Mercedez Benz', '12312', 'Caliman', 'ninguna'),
(9, '2014-12-06', 'Pendiente', '1053832044', 'natalia', '55555', 'nfranco440@miena.edu.co', 'abc14', '2014', 'Kia', '1010101010', 'sergio', 'ninguna');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tiposmantenimientos`
--

CREATE TABLE IF NOT EXISTS `tiposmantenimientos` (
  `man_tipo` varchar(50) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tiposmantenimientos`
--

INSERT INTO `tiposmantenimientos` (`man_tipo`) VALUES
('Afinamiento'),
('Ajuste de suspensión'),
('Alineación'),
('Cambio de aceite'),
('Cambio de bujía'),
('Cambio de filtro'),
('Cambio de llantas'),
('Cambio de pastillas'),
('Cambio de radiador'),
('Frenos'),
('Lubricación'),
('Luces'),
('Sincronización del motor'),
('Sondeo de radiador'),
('Tensión correas del motor'),
('Tensión de embrague');

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
-- Indices de la tabla `tiposmantenimientos`
--
ALTER TABLE `tiposmantenimientos`
 ADD PRIMARY KEY (`man_tipo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cotizacion`
--
ALTER TABLE `cotizacion`
MODIFY `cot_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `cuentas`
--
ALTER TABLE `cuentas`
MODIFY `cue_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=46;
--
-- AUTO_INCREMENT de la tabla `devoluciones`
--
ALTER TABLE `devoluciones`
MODIFY `dev_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
MODIFY `fac_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
MODIFY `man_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=57;
--
-- AUTO_INCREMENT de la tabla `ordenpedido`
--
ALTER TABLE `ordenpedido`
MODIFY `ord_numero` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT de la tabla `promociones`
--
ALTER TABLE `promociones`
MODIFY `pro_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
MODIFY `res_codigo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
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
