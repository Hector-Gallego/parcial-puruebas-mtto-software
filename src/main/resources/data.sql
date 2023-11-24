INSERT INTO actors (names, age)
VALUES
('John Smith', 40),
('Emma Johnson', 27),
('Michael Davis', 35),
('Sophia Wilson', 42),
('Matthew Brown', 31),
('Olivia Taylor', 29),
('Andrew Anderson', 38),
('Ava Martinez', 33),
('William Garcia', 26),
('Isabella Robinson', 39),
('James Lee', 24),
('Mia Clark', 36),
('Joseph Rodriguez', 41),
('Charlotte Thompson', 28),
('David Martinez', 25),
('Emily White', 37),
('Daniel Hall', 30),
('Abigail Young', 43),
('Alexander Harris', 32),
('Ella Allen', 44),
('Noah King', 23),
('Sofia Scott', 45),
('Logan Green', 22),
('Avery Phillips', 46),
('Benjamin Baker', 21),
('Amelia Reed', 47),
('Lucas Turner', 20),
('Harper Nelson', 48),
('Henry Walker', 19),
('Grace Wright', 49),
('Jackson Cooper', 18),
('Chloe Adams', 50),
('Ethan Hill', 17),
('Victoria Mitchell', 51),
('Sebastian Ward', 16),
('Zoe Roberts', 52),
('Carter Turner', 15),
('Lily Carter', 53),
('Jayden Collins', 14),
('Penelope Price', 54),
('Matthew Morgan', 13),
('Nora Foster', 55),
('Leo Phillips', 12),
('Hannah Kelly', 56),
('Gabriel Perry', 11),
('Addison Richardson', 57),
('Anthony Murphy', 10),
('Aria Wood', 58),
('Dylan Butler', 9),
('Stella Brooks', 59),
('Christopher Coleman', 8),
('Mila Hughes', 60);


INSERT INTO directors (names, age)
VALUES
('Christopher Nolan', 50),
('Steven Spielberg', 75),
('Quentin Tarantino', 58),
('Martin Scorsese', 79),
('Alfred Hitchcock', 82),
('Stanley Kubrick', 74),
('Francis Ford Coppola', 82),
('Tim Burton', 63),
('James Cameron', 67),
('David Fincher', 59),
('Peter Jackson', 60),
('Spike Lee', 64),
('Woody Allen', 86),
('Clint Eastwood', 91),
('Ridley Scott', 84),
('Guillermo del Toro', 57),
('Darren Aronofsky', 53),
('Coen Brothers', 67),
('Wes Anderson', 52);


INSERT INTO genres (name)
VALUES
('Acción'),
('Comedia'),
('Drama'),
('Aventura'),
('Ciencia ficción'),
('Suspenso'),
('Romance'),
('Fantasía'),
('Terror'),
('Animación'),
('Documental'),
('Misterio'),
('Musical'),
('Western'),
('Crimen'),
('Histórico'),
('Guerra'),
('Biografía'),
('Deporte'),
('Familia');


INSERT INTO movies (name, description, url, fk_director_id)
VALUES
('Elemental', 'En una ciudad donde los residentes del fuego, el agua, 
la tierra y el aire viven juntos, una joven apasionada y un chico que se deja
llevar por la corriente descubrirán algo elemental: cuánto tienen en común.',
'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/elemental-67823-poster-200x300.jpg?alt=media&token=02ebca60-6793-4f41-ae7b-3164d3592b96', 2),
('Fast & Furious X', 'Durante numerosas misiones más que imposibles, Dom Toretto y su
familia han sido capaces de ser más listos, de tener más valor y de ir más rápido que cualquier enemigo que se cruzara con ellos. 
Pero ahora tendrán que enfrentarse al oponente más letal que jamás hayan conocido: un terrible peligro que resurge del pasado,
que se mueve por una sangrienta sed de venganza y que está dispuesto a destrozar a la familia y destruir para siempre todo
lo que a Dom le importa.',
'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/fast-furious-x-67762-poster-200x300.jpg?alt=media&token=7471c4f9-f2aa-47c5-8a0b-46b5b76a2894', 4),
('Guy Ritchies The Covenant','Después de una emboscada, el intérprete afgano Ahmed hace todo lo posible 
para salvar la vida del sargento del ejército estadounidense John Kinley. Cuando Kinley se entera
de que a Ahmed y su familia no se les dio un pasaje seguro a Estados Unidos como prometieron, debe pagar 
su deuda regresando a la zona de guerra para recuperarlos antes de que los talibanes los persigan.',
'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/guy-ritchies-the-covenant-67748-poster-200x300.jpg?alt=media&token=c8af5a72-138d-43ef-ac83-a82d4271842e', 10),
('Transformers: El despertar de las bestias', 'La batalla en la Tierra ya no es solo entre Autobots y Decepticons… Maximals,
Predacons y Terrorcons se unen a Transformers: Rise of the Beasts.',
'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/transformers-el-despertar-de-las-bestias-67810-poster-200x300.jpg?alt=media&token=59789a9f-762b-46d8-aa5f-c80297697446', 15),
('Spider-Man: Cruzando el multiverso', 'Miles Morales regresa para una aventura épica que transportará al 
amigable vecino de Brooklyn Spider-Man a través del Multiverso para unir fuerzas con Gwen Stacy y
un nuevo equipo de Spider-People, y enfrentarse así a un villano mucho más poderoso que cualquier 
cosa que hayan conocido antes.',
'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/spider-man-cruzando-el-multiverso-67798-poster-200x300.jpg?alt=media&token=7af048d4-6f00-4b01-8384-daf18dc13ca3', 18),
('The Black Demon', 'Josh Lucas (Ford v Ferrari) protagoniza este intenso thriller de acción en 
el que unas vacaciones familiares se convierten en una lucha por la supervivencia contra un tiburón 
megalodón que ve a los humanos como una amenaza para su territorio. ¿Podrán salir con vida antes de 
que el tiburón vuelva a atacar?',
'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/the-black-demon-67774-poster-200x300.jpg?alt=media&token=aaecbf1d-23ca-433b-98a1-5b69dff03d28', 7),
('La sirenita', 'Ariel es una joven y soñadora sirena, hija del Rey Tritón, que está cansada 
de su vida como princesa bajo el mar. Su mayor deseo es abandonar el fondo marino y tener 
una vida normal y apacible en la superficie. La bruja Úrsula descubre su anhelo y, 
por eso, a cambio de su preciosa voz le ofrece un cuerpo totalmente humano. Ariel acepta, 
movida por su pasión por conocer el mundo terrestre y porque está enamorada de un 
apuesto príncipe humano. Pero las cosas no serán fáciles para Ariel, ya que la bruja 
Úrsula esconde oscuras intenciones.',
'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/la-sirenita-67770-poster-200x300.jpg?alt=media&token=364b61c6-442a-4f99-a491-febe50ecb2f7',12),
('Súper Mario Bros: La película', 'Mientras trabajan en una avería subterránea, los fontaneros
 de Brooklyn, Mario y su hermano Luigi, viajan por una misteriosa tubería hasta un nuevo mundo 
 mágico. Pero, cuando los hermanos se separan, Mario deberá emprender una épica misión para 
 encontrar a Luigi. Con la ayuda del champiñón local Toad y unas cuantas nociones de combate 
 de la guerrera líder del Reino Champiñón, la princesa Peach, Mario descubre todo el poder que 
 alberga en su interior.',
 'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/super-mario-bros-la-pelicula-67289-poster-200x300.jpg?alt=media&token=dd603eaa-dd1a-4538-a438-c93de0771056', 11),
 ('El reto', 'Una cirujana tiene que operar a un astronauta demasiado enfermo como para regresar a la Tierra de 
 inmediato. Primera película de ficción grabada en el espacio.',
 'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/sDSLt31mW2WaCLQ44Mcb119lP66.jpg?alt=media&token=39c12226-327a-4e23-a36f-2c6a35d42699', 2),
 ('Guardianes de la Galaxia: Volumen 3', 'Star-Lord, todavía recuperándose de la pérdida de Gamora, 
 debe reunir a su equipo para defender el universo junto con la protección de uno de los suyos. 
 Una misión que, si no se completa, podría llevar al final de los Guardianes tal como los conocemos.',
 'https://firebasestorage.googleapis.com/v0/b/mundopelis-dd024.appspot.com/o/guardianes-de-la-galaxia-volumen-3-67740-poster-200x300.jpg?alt=media&token=c5777325-95bc-467a-8fe5-e5e8e70094ea', 15);


INSERT INTO movies_as_genres (movie_id, genre_id)
VALUES
(1, 1),
(1, 2),
(1, 5),
(1, 7),
(2, 2),
(2, 4),
(2, 5),
(2, 10),
(2, 3),
(3, 5),
(4, 1),
(4, 15),
(4, 20),
(4, 17),
(4, 11),
(5, 5),
(5, 7),
(6, 3),
(6, 16),
(7, 14),
(7, 15),
(7, 6),
(8, 3),
(8, 2),
(8, 5),
(8, 1),
(9, 2),
(9, 9),
(9, 10),
(10, 11),
(10, 12),
(10, 13);

INSERT INTO movies_as_actors (movie_id, actor_id)
VALUES
(1, 1),
(1, 2),
(1, 50),
(1, 7),
(2, 23),
(2, 41),
(2, 5),
(2, 10),
(2, 32),
(3, 5),
(3, 23),
(3, 25),
(3, 12),
(4, 11),
(4, 15),
(4, 27),
(4, 17),
(4, 10),
(5, 5),
(5, 7),
(5, 10),
(5, 38),
(6, 3),
(6, 16),
(6, 17),
(6, 34),
(7, 14),
(7, 15),
(7, 6),
(8, 3),
(8, 2),
(8, 5),
(8, 1),
(9, 2),
(9, 9),
(9, 10),
(10, 11),
(10, 12),
(10, 13);




