use baseanimal;

-- Buscar todos los perros
select * 
from animal 
where tipoAnimal = 'PERRO';

-- Buscar todos los gatos
select * 
from animal 
where tipoAnimal = 'GATO';

-- Buscar todos los caballos
select * 
from animal 
where tipoAnimal = 'CABALLO';

-- Buscar qué animales tienen carritos
select * 
from animal a 
inner join carrito c on a.idCarrito = c.idCarrito;

-- Buscar qué animales tienen férulas
select * 
from animal a 
inner join ferula f on a.idFerula = f.idFerula; 

-- Buscar qué responsables acompañan a cada animal
select * 
from responsable r 
inner join animal a on r.idResponsable = a.idResponsable 
order by r.idResponsable;    

-- Buscar qué animales tienen férulas completas
select idAnimal, nombre, tipoAnimal, idResponsable 
from animal a 
inner join ferula f on a.idFerula = f.idFerula 
where tipoFerula = 'FÉRULA_COMPLETA';

-- Buscar qué animales tienen férulas parciales
select idAnimal, nombre, tipoAnimal, idResponsable 
from animal a inner join ferula f on a.idFerula = f.idFerula 
where tipoFerula = 'FÉRULA_PARCIAL';

-- Buscar qué animales tienen carritos
select idAnimal, nombre, tipoAnimal, idResponsable 
from animal a 
inner join carrito c on a.idCarrito = c.idCarrito;

-- Buscar los responsables cuyo nombres empiezan con "P"
select * 
from animal a 
inner join ferula f on a.idFerula = f.idFerula inner join responsable r on a.idResponsable = r.idResponsable 
where r.nombreResponsable like 'P%';