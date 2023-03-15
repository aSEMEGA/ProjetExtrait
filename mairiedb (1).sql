-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mer. 15 mars 2023 à 16:22
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP :  7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `mairiedb`
--

-- --------------------------------------------------------

--
-- Structure de la table `extrait`
--

CREATE TABLE `extrait` (
  `id` int(11) NOT NULL,
  `numacte` varchar(100) NOT NULL,
  `prenom` varchar(100) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `datenais` varchar(50) NOT NULL,
  `lieunais` varchar(100) NOT NULL,
  `sexe` varchar(35) NOT NULL,
  `prenom_p` varchar(100) NOT NULL,
  `nom_p` varchar(100) NOT NULL,
  `domicile_p` varchar(100) NOT NULL,
  `profession_p` varchar(100) NOT NULL,
  `prenom_m` varchar(100) NOT NULL,
  `nom_m` varchar(100) NOT NULL,
  `domicile_m` varchar(100) NOT NULL,
  `profession_m` varchar(100) NOT NULL,
  `date_d` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `extrait`
--

INSERT INTO `extrait` (`id`, `numacte`, `prenom`, `nom`, `datenais`, `lieunais`, `sexe`, `prenom_p`, `nom_p`, `domicile_p`, `profession_p`, `prenom_m`, `nom_m`, `domicile_m`, `profession_m`, `date_d`) VALUES
(1, '1234MCI', 'Moussa', 'Bah', '01/05/1995', 'Bamako', 'Masculin', 'Moussa', 'Bah', 'Golf', 'Maitre', 'Binta', 'Kone', 'Golf', 'Maitre', '10/04/2023'),
(2, '306MLF', 'Adama', 'Diarra', '25/10/2005', 'Sikasso', 'Feminin', 'Yaya', 'Diarra', 'Tominian', 'Avocat', 'Oumou', 'Diarra', 'Tominian', 'Assistante', '20/02/2023'),
(4, '405', 'Issa', 'Touré', '12/04/1885', 'Gao', 'Masculin', 'Ali', 'Touré', 'Gao', 'fonctionnaire', 'Nafi', 'Touré', 'Gao', 'Maitrêsse', '13/25/2023');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `extrait`
--
ALTER TABLE `extrait`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UNIQUE` (`numacte`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `extrait`
--
ALTER TABLE `extrait`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
