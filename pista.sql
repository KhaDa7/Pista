-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mag 08, 2024 alle 09:52
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pista`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `auto`
--

CREATE TABLE `auto` (
  `id` int(11) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modello` varchar(50) NOT NULL,
  `importo` double NOT NULL,
  `scheda_tecnica` longtext NOT NULL,
  `immagine` longtext NOT NULL,
  `cavalli` varchar(20) NOT NULL,
  `accelerazione` varchar(20) NOT NULL,
  `velocita_massima` varchar(20) NOT NULL,
  `blueprint` varchar(20) NOT NULL,
  `immagine_dettaglio` varchar(20) NOT NULL,
  `logo_scuderia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `auto`
--

INSERT INTO `auto` (`id`, `marca`, `modello`, `importo`, `scheda_tecnica`, `immagine`, `cavalli`, `accelerazione`, `velocita_massima`, `blueprint`, `immagine_dettaglio`, `logo_scuderia`) VALUES
(1, 'Porsche', '911 GT3', 750, 'La Porsche 911 GT3 è un\'icona nel mondo delle auto sportive, perfetta per chi cerca prestazioni da pista in un veicolo omologato per la strada. Presentata per la prima volta nel 1999, la GT3 è una declinazione ad alte prestazioni del già impressionante modello 911. Questa auto è stata continuamente perfezionata attraverso generazioni, con l\'ultima versione che sfoggia un motore boxer a 6 cilindri da 4.0 litri, in grado di erogare fino a 510 cavalli.\r\n\r\nLe prestazioni sono sbalorditive: la GT3 può accelerare da 0 a 100 km/h in soli 3,4 secondi, raggiungendo una velocità massima di circa 320 km/h. Il suo assetto è ottimizzato per l\'aerodinamica e la stabilità, con ampi spoiler e diffusori che riducono la resistenza e aumentano la deportanza. Esteticamente, la GT3 mantiene le linee classiche del 911, pur distinguendosi con dettagli più aggressivi che ne accentuano il carattere sportivo.\r\n\r\nL\'interno della 911 GT3 è un perfetto equilibrio tra comfort e funzionalità sportiva, con sedili sportivi avvolgenti, materiali di alta qualità e tutti gli ultimi sistemi di infotainment e connettività. La vettura offre anche una notevole versatilità, con una configurazione che permette di godere di una guida sportiva senza rinunciare al comfort quotidiano.\r\n\r\nLa Porsche 911 GT3 è quindi una scelta eccellente per gli appassionati di guida che cercano un\'esperienza pura, arricchita dalla lunga eredità di ingegneria Porsche. È un\'auto che promette e consegna emozioni forti, sia su strada che in pista, mantenendo sempre un livello di raffinatezza e qualità che solo Porsche può offrire.', 'porsche-911-GT3.png', '510', '3,4', '318', 'porsche-bp.png', 'porsche.png', 'logo-porsche.png'),
(2, 'Lamborghini', 'Huracan', 950, 'La Lamborghini Huracán è un capolavoro dell\'ingegneria italiana, concepita per sostituire la famosa Gallardo nel 2014. Questo modello è diventato rapidamente un\'icona nel mondo delle supercar, grazie al suo design mozzafiato e alle prestazioni eccezionali. Il design della Huracán combina linee aggressive e aerodinamiche con un carattere decisamente moderno e sportivo. La carrozzeria è caratterizzata da forme scolpite che non solo definiscono il suo aspetto audace, ma migliorano anche l\'efficienza aerodinamica.\r\n\r\nSotto il cofano, la Huracán è equipaggiata con un potente motore V10 5.2 litri, capace di erogare fino a 640 cavalli nelle versioni più potenziate. Questo le permette di accelerare da 0 a 100 km/h in soli 2,9 secondi, con una velocità massima che supera i 325 km/h. La trasmissione è affidata a un cambio a doppia frizione a 7 rapporti, che garantisce cambi di marcia fulminei.\r\n\r\nInternamente, la Huracán offre un abitacolo orientato al pilota, con tecnologie all\'avanguardia e materiali di altissima qualità. Il sistema di infotainment è integrato in modo elegante e offre connettività avanzata e un impianto audio di qualità superiore. Le modalità di guida configurabili permettono al pilota di adattare la vettura a varie condizioni di strada o pista.\r\n\r\nIn termini di sicurezza, la Huracán include sistemi avanzati come l\'assistenza alla frenata, il controllo dinamico del veicolo e sistemi di monitoraggio per garantire massima sicurezza durante la guida ad alta velocità. Lamborghini Huracán rappresenta una fusione perfetta di tradizione e innovazione, offrendo un\'esperienza di guida senza paragoni per gli appassionati di auto sportive.', 'lamborghini-huracan-LP610-4.png', '640', '3,4', '325', 'lamborghini-bp.png', 'lamborghini.png', 'logo-lamborghini.png'),
(3, 'Ferrari', '296 GTB', 1400, 'La Ferrari 296 GTB rappresenta una rivoluzione nel panorama delle supercar, introducendo un\'innovativa configurazione ibrida plug-in. Lanciata nel 2021, questa vettura è un tributo all\'eccellenza ingegneristica di Maranello, combinando prestazioni straordinarie con una maggiore sostenibilità ambientale. Il cuore della 296 GTB è un motore V6 da 3.0 litri, accoppiato a un motore elettrico, che insieme generano una potenza combinata di 830 cavalli. Questa sinergia permette alla vettura di accelerare da 0 a 100 km/h in soli 2,9 secondi.\r\n\r\nDal punto di vista del design, la 296 GTB sfoggia linee eleganti e aerodinamiche, che non solo accentuano la sua estetica sportiva ma migliorano anche le prestazioni. La silhouette è compatta e muscolosa, con una marcata enfasi sulle proporzioni dinamiche. Internamente, il cockpit è focalizzato sul conducente, con tutti i comandi ergonomicamente posizionati per una guida intuitiva e coinvolgente.\r\n\r\nLa tecnologia è al centro dell\'esperienza di guida, con sistemi di assistenza avanzati e un infotainment all\'avanguardia che rende ogni viaggio un piacere. La 296 GTB è dotata di una modalità di guida totalmente elettrica, permettendo brevi spostamenti urbani senza emissioni. Questa flessibilità la rende ideale per chi cerca una supercar che non comprometta le prestazioni per l\'efficienza.\r\n\r\nIn pista o su strada, la Ferrari 296 GTB offre una guida emozionante, mantenendo sempre un occhio di riguardo verso l\'ambiente. Con una tale combinazione di stile, potenza e innovazione, la 296 GTB si posiziona come un nuovo punto di riferimento nel segmento delle supercar ibride di lusso.\r\n\r\n\r\n\r\n\r\n', 'ferrari-296GTB.png', '830', '2,9', '330', 'ferrari-296-bp.png', 'ferrari-296.png', 'logo-ferrari.png'),
(4, 'Ferrari', '488', 1850, 'La Ferrari 488 è un capolavoro di ingegneria italiana, un\'auto sportiva che ha segnato un\'epoca nel catalogo della Ferrari. Introdotto nel 2015, ha sostituito la 458 Italia, portando una serie di miglioramenti sia in termini di performance che di design. Il cuore pulsante della 488 è il suo motore V8 biturbo da 3.9 litri, una novità per Ferrari che tradizionalmente preferiva i motori aspirati. Questo propulsore eroga 670 cavalli nella versione GTB, permettendo alla vettura di scattare da 0 a 100 km/h in soli 3 secondi.\r\n\r\nEsteticamente, la 488 presenta linee fluide e aerodinamiche, con prese d\'aria strategicamente posizionate che migliorano il raffreddamento e la performance. La silhouette è immediatamente riconoscibile come una Ferrari, con un design che equilibra aggressività e eleganza. All\'interno, la cabina è un connubio di lusso e funzionalità, con materiali di alta qualità e tecnologie avanzate che offrono un ambiente confortevole e intuitivo.\r\n\r\nLa Ferrari 488 non brilla solo in termini di prestazioni ma anche in termini di maneggevolezza, grazie al sistema di controllo della trazione e al sofisticato sistema di sospensioni che garantiscono stabilità e controllo anche nelle condizioni di guida più impegnative. La versione Spider aggiunge il piacere della guida a cielo aperto, senza compromettere le prestazioni.\r\n\r\nSicurezza e tecnologia sono al top, con sistemi di assistenza alla guida che garantiscono protezione attiva e passiva agli occupanti. La Ferrari 488 è un esempio eccellente di come performance estreme possono convivere con il lusso e il comfort, rendendola una delle supercar più desiderate al mondo.', 'ferrari-488-GTB.png', '720', '3', '330', 'ferrari-488-bp.png', 'ferrari-488.png', 'logo-ferrari.png'),
(5, 'Chevrolet', 'Corvette Stingray Z51', 300, 'La Chevrolet Corvette Stingray Z51 è un simbolo dell\'ingegneria automobilistica americana che unisce prestazioni straordinarie a un design iconico. Presentata come parte della ottava generazione, questa versione esalta le caratteristiche della Corvette con aggiunte specifiche per migliorare le prestazioni sia su strada che in pista. Al cuore della Corvette Stingray Z51 pulsa un potente motore V8 da 6.2 litri, capace di erogare 495 cavalli di potenza e 637 Nm di coppia, abbinato a un cambio automatico a otto velocità che assicura transizioni fluide e reattive.\r\n\r\nEsteticamente, la Stingray Z51 si distingue per linee aggressive e un profilo aerodinamico ottimizzato, con prese d\'aria più grandi e uno spoiler posteriore che contribuisce a una maggiore deportanza. Internamente, l\'abitacolo è orientato al pilota, con materiali di alta qualità e tecnologie avanzate che garantiscono comfort e connettività. Questo modello include anche sedili sportivi, un volante sportivo e un avanzato sistema di infotainment.\r\n\r\nDal punto di vista della dinamica di guida, il pacchetto Z51 aggiunge sospensioni sportive, freni più grandi e un sistema di scarico ad alte prestazioni che non solo migliora le capacità della vettura ma arricchisce anche l\'esperienza sonora durante la guida. Inoltre, con l\'aggiunta di differenziali elettronici e di un sistema di raffreddamento migliorato, la Corvette Stingray Z51 è perfettamente equipaggiata per affrontare lunghe sessioni ad alta velocità in circuito.\r\n\r\nQuesta vettura rappresenta l\'equilibrio perfetto tra prestazioni da supercar e praticità quotidiana, rendendola ideale per chi cerca un\'auto emozionante senza compromessi. La Chevrolet Corvette Stingray Z51 dimostra che è possibile avere un\'auto sportiva con prestazioni eccezionali a un prezzo accessibile.', 'chevrolet-crovette-stingray-Z51.png', '502', '3,5', '296', 'chevrolet-bp.png', 'chevrolet.png', 'logo-chevrolet.png'),
(6, 'Audi', 'R8 V10', 650, 'L\'Audi R8 V10 è una supercar che incarna la fusione perfetta tra prestazioni estreme e lusso sofisticato. Lanciata per la prima volta nel 2006 e continuamente aggiornata, questa vettura sportiva si avvale di un motore V10 aspirato che eroga una potenza che varia da 540 a 620 cavalli, a seconda della versione. Questo propulsore permette alla R8 V10 di accelerare da 0 a 100 km/h in poco più di 3 secondi, raggiungendo una velocità massima che supera i 330 km/h.\r\n\r\nIl design della R8 V10 è distintivo e immediatamente riconoscibile, con linee affilate e una silhouette bassa e larga che sottolineano il suo carattere aggressivo. La configurazione del motore centrale contribuisce non solo all\'estetica, ma anche all\'equilibrio dinamico e alla distribuzione del peso, ottimizzando le performance in curva.\r\n\r\nInternamente, la R8 V10 offre un abitacolo lussuoso, dotato di materiali di alta qualità e tecnologie avanzate. Il cockpit è orientato al conducente, con controlli intuitivi e un display digitale che fornisce tutte le informazioni necessarie per una guida ottimale. Inoltre, nonostante il suo focus sulle prestazioni, la R8 V10 offre un comfort sorprendente, rendendola adatta anche per viaggi più lunghi.\r\n\r\nL\'Audi R8 V10 non è solo un\'opera d\'arte mobile, ma anche un capolavoro tecnologico. È dotata di sistemi di assistenza alla guida di ultima generazione che garantiscono sicurezza e controllo in ogni situazione. Questa supercar rappresenta un perfetto equilibrio tra la potenza di una vettura da pista e l\'eleganza di un\'auto da gran turismo, attirando sia gli appassionati di guida sportiva che coloro che desiderano un veicolo esclusivo e performante.', 'audi-R8-V10.png', '570', '3,7', '329', 'audi-bp.png', 'audi.png', 'logo-audi.png');

-- --------------------------------------------------------

--
-- Struttura della tabella `pagamenti`
--

CREATE TABLE `pagamenti` (
  `id` int(11) NOT NULL,
  `tipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `pagamenti`
--

INSERT INTO `pagamenti` (`id`, `tipo`) VALUES
(1, 'Paypal'),
(2, 'Google pay'),
(3, 'bonifico');

-- --------------------------------------------------------

--
-- Struttura della tabella `piloti`
--

CREATE TABLE `piloti` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `data_di_nascita` date NOT NULL,
  `descrizione` longtext NOT NULL,
  `immagine` longtext NOT NULL,
  `bandiera_nazionalita` varchar(20) NOT NULL,
  `anni_esperienza` int(11) NOT NULL,
  `gp_disputati` int(11) NOT NULL,
  `gp_vinti` int(11) NOT NULL,
  `podi` int(11) NOT NULL,
  `mondiali` int(11) NOT NULL,
  `scuderia` varchar(50) NOT NULL,
  `logo_scuderia` varchar(70) NOT NULL,
  `immagine_dettaglio` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `piloti`
--

INSERT INTO `piloti` (`id`, `nome`, `cognome`, `data_di_nascita`, `descrizione`, `immagine`, `bandiera_nazionalita`, `anni_esperienza`, `gp_disputati`, `gp_vinti`, `podi`, `mondiali`, `scuderia`, `logo_scuderia`, `immagine_dettaglio`) VALUES
(1, 'Charles', 'Leclerc', '1997-10-16', 'Charles Leclerc è uno dei due attuali piloti della Scuderia Ferrari nel Mondiale di Formula 1. Nella sua giovane carriera, ha già ottenuto vari record: è il primo monegasco a riuscire nell\'impresa di vincere un Gran Premio ed è il più giovane pilota ad aver vinto un GP al volante di una vettura del Cavallino Rampante.', 'Leclerc.png', 'monaco.png', 10, 131, 5, 33, 0, 'Ferrari', 'logo-ferrari.png', 'charles.jpg'),
(2, 'Max', 'Verstappen', '1997-09-30', 'Max Verstappen è un pilota di Formula 1 olandese conosciuto per la sua guida aggressiva e il suo talento eccezionale. Nato il 30 settembre 1997, ha fatto il suo debutto nella massima categoria del motorsport nel 2015, diventando il più giovane pilota ad aver mai gareggiato in Formula 1. Da allora, ha dimostrato una straordinaria velocità e determinazione, diventando un contendente regolare per il titolo mondiale, vincendone due. La sua abilità nelle condizioni difficili e la sua personalità lo rendono uno dei piloti più amati e rispettati sulla griglia di partenza.', 'Verstappen.png', 'belgio.png', 9, 190, 58, 102, 3, 'Red Bull', 'logo-redbull.png', 'max verstappen.jpg'),
(3, 'Lewis', 'Hamilton', '1985-01-07', 'Lewis Hamilton è un pilota di Formula 1 britannico nato il 7 gennaio 1985 a Stevenage, in Inghilterra. Considerato uno dei migliori piloti della storia della Formula 1, Hamilton ha debuttato nella massima categoria del motorsport nel 2007 con la McLaren, conquistando subito l\'attenzione del mondo del motorsport con il suo talento straordinario e il suo carisma. Nel corso degli anni, ha accumulato numerose vittorie, pole position e sette campionati mondiali, diventando uno dei piloti più decorati di tutti i tempi. Oltre alle sue capacità di guida impeccabili, Hamilton è noto anche per il suo impegno per le questioni sociali e ambientali, utilizzando la sua piattaforma per promuovere la diversità e la sostenibilità. La sua determinazione, il suo stile di guida incisivo e la sua personalità carismatica lo rendono uno dei personaggi più iconici e influenti della Formula 1.', 'Hamilton.png', 'inghilterra.png', 17, 338, 103, 197, 7, 'Mercedes', 'logo-mercedes.png', 'lewis.jpg'),
(4, 'Fernando', 'Alonso', '1981-07-29', 'Fernando Alonso è un pilota di Formula 1 spagnolo nato il 29 luglio 1981 ad Oviedo, in Spagna. Conosciuto per la sua abilità eccezionale e la sua determinazione senza pari, Alonso ha fatto il suo debutto in Formula 1 nel 2001 con Minardi, dimostrando subito il suo talento sul circuito. Ha vinto il suo primo campionato mondiale nel 2005 con la Renault, seguito da un altro titolo nel 2006. Nel corso della sua carriera, ha gareggiato anche per team come McLaren e Ferrari, accumulando numerose vittorie, pole position e podi. Alonso è noto per il suo stile di guida aggressivo e la sua capacità di eccellere anche nelle situazioni più difficili. Dopo un breve ritiro, è tornato in Formula 1 nel 2021 con Alpine, dimostrando che il suo spirito competitivo e la sua passione per il motorsport non sono affatto affievoliti.', 'Alonso.png', 'spagna.png', 23, 384, 32, 106, 2, 'Aston Martin', 'logo-aston.png', 'alonso.jpg'),
(5, 'Carlos', 'Sainz', '1994-09-01', 'Carlos Sainz è un pilota di Formula 1 spagnolo nato il 1º settembre 1994 a Madrid. Figlio del leggendario pilota di rally Carlos Sainz Sr., Carlos Jr. ha seguito le orme paterne nel mondo del motorsport e ha fatto il suo debutto in Formula 1 nel 2015 con la Scuderia Toro Rosso. Conosciuto per la sua determinazione e la sua costanza in pista, Sainz ha dimostrato di essere un pilota affidabile e veloce, guadagnandosi il rispetto nel paddock. Ha gareggiato anche per team come Renault e McLaren, ottenendo risultati consistenti e podi. Nel 2021, ha firmato per la Scuderia Ferrari, continuando a dimostrare il suo talento e la sua versatilità come uno dei giovani piloti più promettenti della griglia di partenza di Formula 1.', 'Sainz.png', 'spagna.png', 9, 191, 3, 21, 0, 'Ferrari', 'logo-ferrari.png', 'carlossainz.jpeg'),
(6, 'Kevin', 'Magnussen', '1992-10-05', 'Kevin Magnussen è un pilota automobilistico danese nato il 5 ottobre 1992 a Roskilde, in Danimarca. Ha iniziato la sua carriera in Formula 1 nel 2014 con la squadra McLaren, dopo aver dimostrato il suo talento nelle categorie minori. Conosciuto per la sua guida aggressiva e il suo stile determinato, Magnussen ha ottenuto risultati promettenti nelle prime stagioni della sua carriera in Formula 1. Ha gareggiato anche per team come Renault e Haas, dimostrando la sua versatilità e la sua abilità nel adattarsi a diverse situazioni di gara. Con una grande esperienza nel mondo del motorsport, Magnussen continua a essere un pilota rispettato e un elemento prezioso nella griglia di partenza di Formula 1.', 'Magnussen.png', 'danimarca.png', 10, 11, 1, 5, 0, 'Haas', 'logo-haas1.png', 'Kevin.jpg');

-- --------------------------------------------------------

--
-- Struttura della tabella `prenotazioni`
--

CREATE TABLE `prenotazioni` (
  `id` int(11) NOT NULL,
  `data_corsa` date NOT NULL,
  `id_utente` int(11) DEFAULT NULL,
  `id_auto` int(11) DEFAULT NULL,
  `id_pilota` int(11) DEFAULT NULL,
  `id_pagamento` int(11) DEFAULT NULL,
  `data_ora_pagamento` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `profili`
--

CREATE TABLE `profili` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `immagine` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `profili`
--

INSERT INTO `profili` (`id`, `username`, `password`, `email`, `immagine`) VALUES
(24, 'Mario62', 'Mario$62', 'mariobianchi@gmail.com', NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `utenti`
--

CREATE TABLE `utenti` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `cognome` varchar(50) NOT NULL,
  `data_nascita` date NOT NULL,
  `id_profilo` int(11) DEFAULT NULL,
  `indirizzo` varchar(50) NOT NULL,
  `genere` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `documento` varchar(50) NOT NULL,
  `numero_documento` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `utenti`
--

INSERT INTO `utenti` (`id`, `nome`, `cognome`, `data_nascita`, `id_profilo`, `indirizzo`, `genere`, `telefono`, `documento`, `numero_documento`) VALUES
(20, 'Mario', 'Bianchi', '1962-09-14', 24, 'via dei fiori 2', 'M', '2222222222', 'Carta d\'Identità', 'CA235F2');

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `auto`
--
ALTER TABLE `auto`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `pagamenti`
--
ALTER TABLE `pagamenti`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `piloti`
--
ALTER TABLE `piloti`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `prenotazioni`
--
ALTER TABLE `prenotazioni`
  ADD PRIMARY KEY (`id`),
  ADD KEY `utente` (`id_utente`),
  ADD KEY `auto` (`id_auto`),
  ADD KEY `pilota` (`id_pilota`),
  ADD KEY `pagamento` (`id_pagamento`);

--
-- Indici per le tabelle `profili`
--
ALTER TABLE `profili`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `utenti`
--
ALTER TABLE `utenti`
  ADD PRIMARY KEY (`id`),
  ADD KEY `profilo` (`id_profilo`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `auto`
--
ALTER TABLE `auto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT per la tabella `pagamenti`
--
ALTER TABLE `pagamenti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT per la tabella `piloti`
--
ALTER TABLE `piloti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT per la tabella `prenotazioni`
--
ALTER TABLE `prenotazioni`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT per la tabella `profili`
--
ALTER TABLE `profili`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT per la tabella `utenti`
--
ALTER TABLE `utenti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `prenotazioni`
--
ALTER TABLE `prenotazioni`
  ADD CONSTRAINT `auto` FOREIGN KEY (`id_auto`) REFERENCES `auto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pagamento` FOREIGN KEY (`id_pagamento`) REFERENCES `pagamenti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pilota` FOREIGN KEY (`id_pilota`) REFERENCES `piloti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `utente` FOREIGN KEY (`id_utente`) REFERENCES `utenti` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limiti per la tabella `utenti`
--
ALTER TABLE `utenti`
  ADD CONSTRAINT `profilo` FOREIGN KEY (`id_profilo`) REFERENCES `profili` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
