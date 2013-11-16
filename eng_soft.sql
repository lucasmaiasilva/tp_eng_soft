-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 16/11/2013 às 15h26min
-- Versão do Servidor: 5.5.29
-- Versão do PHP: 5.3.10-1ubuntu3.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `eng_soft`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `Cliente`
--

CREATE TABLE IF NOT EXISTS `Cliente` (
  `id_cliente` int(11) NOT NULL,
  `data_registro` text NOT NULL,
  `cpf` text NOT NULL,
  `endereco` text NOT NULL,
  `cidade` text NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Eletrodomestico`
--

CREATE TABLE IF NOT EXISTS `Eletrodomestico` (
  `id_eletro` int(11) NOT NULL AUTO_INCREMENT,
  `modelo` text NOT NULL,
  `fabricante` text NOT NULL,
  `data_fab` text NOT NULL,
  `status` text NOT NULL,
  PRIMARY KEY (`id_eletro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Fabricante`
--

CREATE TABLE IF NOT EXISTS `Fabricante` (
  `fab_id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` text NOT NULL,
  `endereco` text NOT NULL,
  `telefone` text NOT NULL,
  PRIMARY KEY (`fab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Funcionario`
--

CREATE TABLE IF NOT EXISTS `Funcionario` (
  `login` text NOT NULL,
  `senha` text NOT NULL,
  `id_func` int(11) NOT NULL AUTO_INCREMENT,
  `cart_trabalho` text NOT NULL,
  `data_ingresso` text NOT NULL,
  `cargo` text NOT NULL,
  PRIMARY KEY (`id_func`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `Peca`
--

CREATE TABLE IF NOT EXISTS `Peca` (
  `peca_id` int(11) NOT NULL,
  `nome` text NOT NULL,
  `fab_id` int(11) NOT NULL,
  `lote` text NOT NULL,
  `qtdade_estoque` int(11) NOT NULL,
  PRIMARY KEY (`peca_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
