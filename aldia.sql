-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-11-2016 a las 22:30:17
-- Versión del servidor: 5.5.39
-- Versión de PHP: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `aldia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `key_cuenta_agente`
--

CREATE TABLE IF NOT EXISTS `key_cuenta_agente` (
  `key` varchar(400) NOT NULL,
  `cuenta_agente` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `key_cuenta_agente`
--

INSERT INTO `key_cuenta_agente` (`key`, `cuenta_agente`) VALUES
('102010', 'REP360'),
('102115', 'TAL476'),
('102204', 'CVX240'),
('102205', 'BLN021'),
('102206', 'DDU914'),
('102212', 'BSP344'),
('102232', 'DCC847'),
('102311', 'SPT962'),
('102363', 'BDS458'),
('102377', 'VEM004'),
('102383', 'ABW091'),
('102408', 'KUL584'),
('102422', 'TFV026'),
('102491', 'SKF270'),
('102514', 'KJR564'),
('102600', 'MPY493'),
('102612', 'BTP377'),
('102620', 'TZR605'),
('102623', 'HKQ093'),
('102645', 'MPW264'),
('102649', 'SPT311'),
('102699', 'FBB396'),
('102735', 'MBO728'),
('102743', 'FBK840'),
('102746', 'BHY907'),
('102800', 'ZYQ002'),
('102811', 'RAT052'),
('102825', 'GNQ709'),
('102866', 'DDV881'),
('102942', 'BCE482'),
('102948', 'SNS080'),
('102958', 'STB612'),
('102971', 'GRG458'),
('102977', 'MRZ037'),
('103012', 'MNQ213'),
('103055', 'MQP043'),
('103058', 'VDT568'),
('103153', 'HBN252'),
('103193', 'RZF679'),
('103212', 'BGU279'),
('103229', 'MNT763'),
('103231', 'QHP124'),
('103235', 'IEL173'),
('103240', 'MCR819'),
('103242', 'HTS366'),
('103256', 'WGU880'),
('103266', 'WGV158'),
('103269', 'HAN564'),
('103273', 'KAO348'),
('103275', 'RBL933'),
('103282', 'DDX407'),
('103311', 'FCM912'),
('103312', 'CDO615'),
('103314', 'DAC239'),
('165903', 'WGU880');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `placa_imei`
--

CREATE TABLE IF NOT EXISTS `placa_imei` (
  `placa` varchar(400) NOT NULL,
  `imei` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `placa_imei`
--

INSERT INTO `placa_imei` (`placa`, `imei`) VALUES
('ABW091', '088046273327'),
('BCE482', '088047932616'),
('BDS458', '088046274424'),
('BGU279', '088046574344'),
('BHY907', '088047750117'),
('BLN021', '088046249798'),
('BSP344', '088047619213'),
('BTP377', '088046446634'),
('CDO615', '044070981288'),
('CVX240', '088046246570'),
('DAC239', '088046574823'),
('DCC847', '088047749895'),
('DDU914', '088047616375'),
('DDV881', '088046451139'),
('DDX407', '088046452632'),
('FBB396', '088046425125'),
('FBK840', '088046425851'),
('FCM912', '044070980231'),
('GNQ709', '088046450347'),
('GRG458', '088046941055'),
('HAN564', '088047974394'),
('HBN252', '088047933309'),
('HKQ093', '088046577131'),
('HTS366', '088046231325'),
('IEL173', '088047974600'),
('KAO348', '088047974550'),
('KJR564', '088047616854'),
('KUL584', '088046272600'),
('MBO728', '088046943317'),
('MCR819', '088047973933'),
('MNQ213', '088046446576'),
('MNT763', '088047974667'),
('MPW264', '088046575945'),
('MPY493', '088046940933'),
('MQP043', '088047749887'),
('MRZ037', '088047750356'),
('QHP124', '088047933259'),
('RAT052', '088046448317'),
('RBL933', '088047975029'),
('RZF679', '088047328849'),
('SKF270', '088047750349'),
('SNS080', '088047974162'),
('SPT311', '088047933481'),
('SPT962', '088046448580'),
('STB612', '088047974261'),
('TAL476', '088046178302'),
('TFV026', '088047343640'),
('TZR605', '088046231820'),
('VDT568', '088046273608'),
('VEM004', '088046273335'),
('WGU880', '088046165903'),
('WGV158', '088046272998'),
('ZYQ002', '088047934893');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reponse`
--

CREATE TABLE IF NOT EXISTS `reponse` (
  `placa` varchar(400) DEFAULT NULL,
  `imei` varchar(400) DEFAULT NULL,
  `descripcion` varchar(400) DEFAULT NULL,
  `fecha_hora_gps` varchar(400) DEFAULT NULL,
  `fecha_hora_sistema` varchar(400) DEFAULT NULL,
  `velocidad` varchar(400) DEFAULT NULL,
  `divpol1` varchar(400) DEFAULT NULL,
  `divpol2` varchar(400) DEFAULT NULL,
  `divpol3` varchar(400) DEFAULT NULL,
  `divpol4` varchar(400) DEFAULT NULL,
  `direccion2` varchar(400) DEFAULT NULL,
  `sentido_letras` varchar(400) DEFAULT NULL,
  `latitud` varchar(400) DEFAULT NULL,
  `lomgitud` varchar(400) DEFAULT NULL,
  `tipo_evento` varchar(400) DEFAULT NULL,
  `clave_respuesta` varchar(400) DEFAULT NULL,
  `codigo_nombre` varchar(400) DEFAULT NULL,
  `placa_temporal` varchar(400) DEFAULT NULL,
  `diffgrid` varchar(400) DEFAULT NULL,
  `msdataRowOrder` varchar(400) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reponse`
--

INSERT INTO `reponse` (`placa`, `imei`, `descripcion`, `fecha_hora_gps`, `fecha_hora_sistema`, `velocidad`, `divpol1`, `divpol2`, `divpol3`, `divpol4`, `direccion2`, `sentido_letras`, `latitud`, `lomgitud`, `tipo_evento`, `clave_respuesta`, `codigo_nombre`, `placa_temporal`, `diffgrid`, `msdataRowOrder`) VALUES
('TAL476', '088046178302', '', '02/11/2016 16:28:12', '2016-11-02 16:28:12.0', '3', '', '', '', '', '', '128', '4.69176', '-74.166033', '', '', '', '', '', ''),
('DCC847', '088047749895', '', '02/11/2016 15:09:03', '2016-11-02 15:09:07.0', '0', '', '', '', '', '', '0', '3.870463', '-76.980027', '', '', '', '', '', ''),
('SPT962', '088046448580', '', '02/11/2016 16:16:55', '2016-11-02 16:16:57.0', '0', '', '', '', '', '', '186', '2.947885', '-75.298117', '', '', '', '', '', ''),
('VEM004', '088046273335', '', '02/11/2016 16:25:17', '2016-11-02 16:25:18.0', '0', '', '', '', '', '', '227', '4.125573', '-73.621325', '', '', '', '', '', ''),
('TFV026', '088047343640', '', '02/11/2016 16:24:01', '2016-11-02 16:23:57.0', '0', '', '', '', '', '', '0', '10.371162', '-75.50133', '', '', '', '', '', ''),
('BXO477', '088047616854', '', '02/11/2016 16:26:34', '2016-11-02 16:26:29.0', '0', '', '', '', '', '', '282', '4.400627', '-75.14664', '', '', '', '', '', ''),
('MPY493', '088046940933', '', '02/11/2016 16:27:16', '2016-11-02 16:27:13.0', '0', '', '', '', '', '', '218', '4.676395', '-74.10306', '', '', '', '', '', ''),
('BTP377', '088046446634', '', '02/11/2016 16:29:12', '2016-11-02 16:29:11.0', '0', '', '', '', '', '', '230', '4.671753', '-74.106607', '', '', '', '', '', ''),
('MPW264', '088046575945', '', '02/11/2016 16:28:39', '2016-11-02 16:28:39.0', '88', '', '', '', '', '', '296', '4.213308', '-74.95705', '', '', '', '', '', ''),
('FBB396', '088046425125', '', '02/11/2016 16:26:35', '2016-11-02 16:26:29.0', '23', '', '', '', '', '', '42', '6.64611', '-73.951763', '', '', '', '', '', ''),
('MBO728', '088046943317', '', '02/11/2016 11:54:56', '2016-11-02 11:54:54.0', '8', '', '', '', '', '', '353', '4.698252', '-74.201363', '', '', '', '', '', ''),
('BHY907', '088047750117', '', '02/11/2016 16:29:01', '2016-11-02 16:28:58.0', '39', '', '', '', '', '', '316', '10.85375', '-74.139572', '', '', '', '', '', ''),
('DDV881', '088046451139', '', '02/11/2016 16:20:24', '2016-11-02 16:20:25.0', '0', '', '', '', '', '', '0', '4.619325', '-74.179115', '', '', '', '', '', ''),
('SNS080', '088047974162', '', '02/11/2016 16:20:55', '2016-11-02 16:20:56.0', '0', '', '', '', '', '', '0', '6.208292', '-75.58652', '', '', '', '', '', ''),
('STB612', '088047974261', '', '02/11/2016 16:23:43', '2016-11-02 16:23:43.0', '0', '', '', '', '', '', '0', '6.250285', '-75.585237', '', '', '', '', '', ''),
('MQP043', '088047749887', '', '02/11/2016 16:28:55', '2016-11-02 16:28:50.0', '26', '', '', '', '', '', '304', '4.657247', '-74.100468', '', '', '', '', '', ''),
('RZF679', '088047328849', '', '02/11/2016 16:21:24', '2016-11-02 16:21:22.0', '0', '', '', '', '', '', '0', '4.703022', '-74.108745', '', '', '', '', '', ''),
('MNT763', '088047974667', '', '02/11/2016 16:25:58', '2016-11-02 16:26:14.0', '59', '', '', '', '', '', '344', '6.318373', '-75.531883', '', '', '', '', '', ''),
('QHP124', '088047933259', '', '02/11/2016 16:28:01', '2016-11-02 16:27:57.0', '29', '', '', '', '', '', '193', '4.327738', '-75.091862', '', '', '', '', '', ''),
('MCR819', '088047973933', '', '02/11/2016 16:26:39', '2016-11-02 16:26:37.0', '0', '', '', '', '', '', '0', '9.906225', '-73.842798', '', '', '', '', '', ''),
('HAN564', '088047974394', '', '02/11/2016 16:27:25', '2016-11-02 16:27:29.0', '49', '', '', '', '', '', '67', '9.79932', '-74.763962', '', '', '', '', '', ''),
('KAO348', '088047974550', '', '31/10/2016 13:37:22', '2016-11-01 00:00:41.0', '35', '', '', '', '', '', '235', '6.167723', '-75.607213', '', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `usuario` varchar(600) NOT NULL,
  `clave` varchar(600) NOT NULL,
  `tipousuario` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usuario`, `clave`, `tipousuario`) VALUES
('admin', 'admin', 'C'),
('desarrollador', 'desarrollador', 'D');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `key_cuenta_agente`
--
ALTER TABLE `key_cuenta_agente`
 ADD PRIMARY KEY (`key`);

--
-- Indices de la tabla `placa_imei`
--
ALTER TABLE `placa_imei`
 ADD PRIMARY KEY (`imei`), ADD UNIQUE KEY `placa` (`placa`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
 ADD PRIMARY KEY (`usuario`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
