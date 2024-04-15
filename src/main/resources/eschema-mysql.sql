PARTE 6
SE CREA LA TABLA EN SQL PARA CONECTAR 
SE CREA USUARIO Y TABLAS EN SQL

drop table if exists videojuego;
drop table 

create table videojuego(
        id int primary key auto_increment,
        nombre varchar(200) not null,
        descripcion varchar(4000),
        imagen_url varchar(4000)
);

insert into videojuego (
    nombre,         descripcion,            imagen_url)values
("Destiny 2",       "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://xxboxnews.blob.core.windows.net/prod/sites/2/2022/05/D2_S17_XBOX_Wire_1920x1080_EN-35fed1ba5156afc45bed.jpg"   ),
("Fortnite"   ,   "Some quick example text to build on the card title and make up the bulk of the card's content.",   "https://image.api.playstation.com/vulcan/ap/rnd/202311/2801/009384c2725d335d3711b0d3c84672142fc93f72077e679e.jpg"),
("Resident Evil 4"   ,   "Some quick example text to build on the card title and make up the bulk of the card's content.",   "https://i.ytimg.com/vi_webp/bwxMrAy4z-s/maxresdefault.webp"),
("Need for Speed"   ,   "Some quick example text to build on the card title and make up the bulk of the card's content.", "https://st.overclockers.ru/images/lab/2016/03/18/2/001_art_big.jpg" ),
("mortal kombat 1", "Mortal Kombat 1 es un videojuego de lucha desarrollado por NetherRealm Studios y publicado por Warner Bros. Games. Es la duodécima entrega principal de la serie Mortal Kombat y una secuela de Mortal Kombat 11. Mortal Kombat 1 es el segundo reinicio suave de la serie, tras Mortal Kombat","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXAfm9ITGq6iAtvPxYs9sqJCJN-LB_LRud0w"),
("super mario odyssey", "Es un videojuego de plataformas en 3D con una jugabilidad similar a la de Super Mario 64 y Super Mario Sunshine, que te permite explorar libremente los mundos abiertos.", "https://media.vandal.net/ivandal/11/60/1146x600/5/5-2023/2023522338074_1.jpg"),
("call of duty modern warfare", " es un videojuego de disparos en primera persona desarrollado por Infinity Ward y publicado por Activision. Es el decimosexto juego de la saga Call of Duty y es un reinicio de la serie Modern Warfare","https://cdn.akamai.steamstatic.com/steam/apps/2000950/header.jpg?t=1678294805");

PARTE 7
DESPUES DE CREAR LA PRIMER TABLA Y AGREGAR LOS DATOS, AGREGAR LAS DEPENDENCIAS PARA CONECTAR A LA DB 
LUEGO IR A APPLICATION.PROPIETIS 

create table distribuidor (
id int primary key auto_increment,
nombre varchar(250) not null,
sitio_web varchar(4000)
);

insert into distribuidor 
(id,        nombre,         sitio_web)values
(1, "2k",                   "https://2k.com/en-US/"),
(2, "Focus Home Interactive", "https://www.focus-entmt.com/en"),
(3, "Thekla",                  null),
(4, "Nunber One",              null),
(5, "505 Games",             "https://505games.com/"),
(6,"unknown Worlds Entretaiment", "https://unknownworlds.com/"),
(7,"Campo Santo",               "https://www.camposanto.com/");


alter table videojuego 
add colum distribuidor_id int,
add foreign key (distribuidor_id)references distribuidor(id);

update videojuego set distribuidor_id = 1 where id in(1,5);
update videojuego set distribuidor_id = 2 where id in(2);
update videojuego set distribuidor_id = 3 where id in(3);
update videojuego set distribuidor_id = 4 where id in(4);
update videojuego set distribuidor_id = 5 where id in(6);
update videojuego set distribuidor_id = 6 where id in(7);
update videojuego set distribuidor_id = 7 where id in(8);

alter table videojuego
modify distribuidor_id int not null;
