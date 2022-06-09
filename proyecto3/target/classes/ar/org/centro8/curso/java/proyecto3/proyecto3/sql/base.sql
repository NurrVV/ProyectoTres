drop database if exists baseanimal;
create database baseanimal;
use baseanimal;

drop table if exists animal; -- Esta tiene que ir primero porque es la que tiene las claves foráneas
drop table if exists responsable;
drop table if exists ferula;
drop table if exists carrito;


CREATE TABLE responsable (
    idResponsable INT AUTO_INCREMENT PRIMARY KEY,
    nombreResponsable VARCHAR(50) NOT NULL,
    apellidoResponsable VARCHAR(50) NOT NULL,
    telefonoResponsable VARCHAR(25) NOT NULL,
    emailResponsable VARCHAR(100) NOT NULL
);
create table carrito(
	idCarrito int auto_increment primary key,
    altoGeneral DOUBLE NOT NULL,
    anchoGeneral DOUBLE NOT NULL,
    profundidadGeneral DOUBLE NOT NULL,
    miembrosFaltantes varchar(300) not null,
    medidaMunonDelanteroDerecho DOUBLE,
    diametroMunonDelanteroDerecho DOUBLE,
    medidaMunonDelanteroIzquierdo DOUBLE,
    diametroMunonDelanteroIzquierdo DOUBLE,
    medidaMunonTraseroDerecho DOUBLE,
    diametroMunonTraseroDerecho DOUBLE,
    medidaMunonTraseroIzquierdo DOUBLE,
    diametroMunonTraseroIzquierdo DOUBLE,
    descripcionExtra varchar(300)    
);

create table ferula(
	idFerula int auto_increment primary key,
    tipoFerula enum('FÉRULA_COMPLETA','FÉRULA_PARCIAL'), -- enum no puede tener espacios
    miembroProtesis enum('DELANTERO_DERECHO', 'DELANTERO_IZQUIERDO', 'TRASERO_DERECHO','TRASERO_IZQUIERDO'),
    alto DOUBLE NOT NULL,
    ancho DOUBLE NOT NULL,
    profundidad DOUBLE NOT NULL      
);

create table animal(
    idAnimal int auto_increment primary key, -- ser consistente en los nombres de id
    nombre varchar(25) not null,
    tipoAnimal enum('PERRO','GATO','CABALLO'),
    idResponsable int,
    idFerula int,
    idCarrito int
);

alter table animal
add constraint foreign key fk_animal_carrito (idCarrito) references carrito(idCarrito);
alter table animal
add constraint foreign key fk_animal_responsable (idResponsable) references responsable (idResponsable);
alter table animal
add constraint foreign key fk_animal_ferula (idFerula) references ferula (idFerula);



-- solamente cuando somos root podemos cambiar la base de datos


-- escribir registros de prueba, al menos 5 registros por tabla. Poner en otro archivo DML data manipulation language
-- pensar en consultas de prueba, para recorrer toda la base de datos

