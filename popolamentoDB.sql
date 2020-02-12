INSERT INTO `agent` VALUES (0,'Via Numero 1','1984-05-07','Milano','primaEmail@email.it',0,'Edoardo',18,'Cardaci','3487135984','M','www.primoAgent.com','94010'),
(0,'Via Numero 2','1975-12-21','Torino','secondaEmail@email.it',0,'Claudio',18,'Rossi','3254156987','M','www.secondoAgent.com','95841'),
(0,'Via Numero 3','1971-01-14','Genova','terzaEmail@email.it',0,'Aurora',21,'Bianchi','3475112655','F','www.terzoAgent.com','96841'),
(0,'Via Numero 4','1988-06-03','Milano','quartaEmail@email.it',0,'Giuliana',19,'Verdi','3987456214','F','www.quartoAgent.com','96258'),
(0,'Via Numero 5','1991-11-01','Firenze','quintaEmail@email.it',0,'Yvonne',17,'Di Roma','3547854123','F','www.quintoAgent.com','98745'),
(0,'Via Numero 6','1990-03-01','Bologna','sestaEmail@email.it',0,'Mario',18,'Leonardi','3214569854','M','www.sestoAgent.com','96321'),
(0,'Via Numero 7','1987-02-09','Catania','settimaEmail@email.it',0,'Giovanni',17,'Lo Presti','3698745632','M','www.settimoAgent.com','91375'),
(0,'Via Numero 8','1983-08-11','Roma','ottavaEmail@email.it',0,'Samuele',18,'Tirenni','3487456985','M','www.ottavoAgent.com','94316'),
(0,'Via Numero 9','1979-10-29','Milano','nonaEmail@email.it',0,'Cristina',19,'Fiore','3516924637','F','www.nonoAgent.com','97856'),
(0,'Via Numero 10','1984-01-07','Torino','decimaEmail@email.it',0,'Fabrizio',20,'Rondò','3916784256','M','www.decimoAgent.com','99788');
INSERT INTO `area` VALUES (0,'Area Informatica','Informatica'),
(0,'Linguaggi di programmazione','Informatica'),
(0,'Schemi elettrici','Elettronica'),
(0,'Processi chimici','Biologia'),
(0,'Come cucinare le uova','Cucina'),
(0,'Sezionare le rane','Medicina'),
(0,'La vita è!','Filosofia'),
(0,'Scopriamo il gotico','Architettura'),
(0,'Forme strambe per le cose','Design'),
(0,'Verso la Luna!','Aviazione');
INSERT INTO `classroom` VALUES (0,50,0,'Classe Uno'),
(0,20,1,'Classe Due'),
(0,30,0,'Classe Tre'),
(0,30,0,'Classe Quattro'),
(0,10,1,'Classe Cinque'),
(0,30,0,'Classe Sei'),
(0,20,1,'Classe Sette'),
(0,40,0,'Classe Otto'),
(0,40,0,'Classe Nove'),
(0,20,1,'Classe Dieci');
INSERT INTO `project` VALUES (0,1.00,'progInform','2020-02-14',0,'Java','2020-01-04',1);
INSERT INTO `course` VALUES (0,10,'CorsoJava',1,120,'syllaA','CorsoJavaTitle',1,1);
INSERT INTO `client` VALUES ('1', 'Via Santa Sofia 5', 'Torino', 'clientUno@email.com', 'CDFSCL98074', 'UniMi', 'IT1498406480', '34789512584', '94010', '1');

INSERT INTO `course_edition` VALUES (0,'Address','Milan',50,'2020-02-14',0,'2020-01-01','94010',1,1,1,1),(0,'Address','Turin',90,'2019-01-01',0,'2018-05-14','9411',1,1,1,1);
INSERT INTO `student` VALUES 
(0,'1980-01-31','Diploma',0,'primamail@hotmail.it','Ester','Nuante','3989632365',0,'F',NULL),
(0,'1992-10-14','Diploma',0,'ciccioiccio@live.it','Francesco','La Spina','3921955013',0,'M',NULL),
(0,'1994-12-05','Laurea',1,'emailUno@live.it','Antonio','Sereste','3485228321',1,'M',NULL),
(0,'1995-04-19','Magistrale',2,'emailDue@live.it','Laura','Brambilla','3469821447',1,'F',NULL),
(0,'1992-08-30','PHD',3,'nome.cognome@gmail.com','Mario','Rossi','3274565871',1,'M',NULL),
(0,'1993-01-11','Laurea',1,'altra_email@yahoo.com','Giulia','Verdi','3914587948',0,'F',NULL),
(0,'1994-09-21','Magistrale',2,'nosense@hotmail.de','Monica','Di Clausura','3474849188',0,'F',NULL),
(0,'19990101','PHD',3,'quasifiniti@hotmail.de','Alessandro','Salerno','3456987412',0,'M',NULL),
(0,'19970602','Diploma',0,'penultimamail@hotmail.it','Franco','Svizzero','3487456984',0,'M',NULL),
(0,'19910425','Diploma',0,'ultimamail@hotmail.uk','Marina','Acqua','3214785478',0,'F',NULL);
INSERT INTO `enrollment` VALUES (0,'CiaoAsses',0,'2020-01-05',50,0,NULL,0,1,1),(0,'SecondoAsses',0,'2018-05-14',98,0,NULL,0,2,1);
INSERT INTO `hibernate_sequence` VALUES (1);