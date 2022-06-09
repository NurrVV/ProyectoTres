use baseanimal;

insert into responsable (idResponsable, nombreResponsable, apellidoResponsable, telefonoResponsable,emailResponsable) 
values
		(1,'Pepita', 'Cravatta', '1584796332', 'pepcra@mail.com'),
		(2, 'Roberta', 'Pepinetta', '1578436659', 'ropep@mail.com'),
		(3, 'Fulgencio', 'Tosquetto', '1599743210', 'fultos@mail.com'),
		(4, 'Torcuatoncio', 'Soquetio', '1567855214', 'torsoq@mail.com'),
		(5, 'Pulpacia', 'Frecuenzza', '1511876649', 'pulfre@mail.com');
        
insert into carrito (idCarrito,
					 altoGeneral,
                     anchoGeneral, 
                     profundidadGeneral, 
                     miembrosFaltantes, 
                     medidaMunonDelanteroDerecho, 
                     diametroMunonDelanteroDerecho, 
                     medidaMunonDelanteroIzquierdo, 
                     diametroMunonDelanteroIzquierdo,
                     medidaMunonTraseroDerecho,
                     diametroMunonTraseroDerecho,
                     medidaMunonTraseroIzquierdo,
                     diametroMunonTraseroIzquierdo,
                     descripcionExtra) 
values
		(1, 25.6, 13.3, 38.4, 'Le faltan las dos patitas delanteras', 7.0, 3.0, 7.0, 2.5, null, null, null, null, 'Es muy movediza'),
        (2, 55.6, 23.7, 79.4, 'Tiene gran parte de los muñones traseros', null, null, null, null, 7.0, 3.0, 7.0, 2.5, 'Solamente perdió las patitas inferiores traseras'),
        (3, 30.0, 18.9, 41.2, 'Le falta la delantera izquierda y la trasera derecha', null, null, 3.0, 3.8, 7.0, 2.5, null, null, 'Es muy traviesa y saltarina'),
		(4, 59.3, 33.2, 65.7, 'Le falta la delantera derecha y tiene poco movimiento en la trasera derecha',6.1, 4.3, 38.7, 4.1, null, null, null, null, 'Está grandecito y le cuesta sentarse'),
		(5, 44.7, 22.1, 77.7, 'Le faltan las dos patitas delanteras', 4.6, 2.9, 3.3, 2.7, null, null, null, null, 'Es muy juguetona');
        
insert into ferula (idFerula, tipoFerula, miembroProtesis, alto, ancho, profundidad) 
values
		(1, 'FÉRULA_COMPLETA', 'DELANTERO_DERECHO', 18.3, 3.2, 3.4),
		(2, 'FÉRULA_PARCIAL', 'DELANTERO_IZQUIERDO', 10.3, 2.1, 2.9),
		(3, 'FÉRULA_COMPLETA', 'TRASERO_IZQUIERDO', 12.7, 2.7, 2.9),
		(4, 'FÉRULA_PARCIAL', 'TRASERO_DERECHO', 11.6, 3.5, 3.5),
		(5, 'FÉRULA_PARCIAL', 'DELANTERO_IZQUIERDO', 21.8, 4.1, 4.2),
        (6, 'FÉRULA_PARCIAL', 'DELANTERO_DERECHO', 59.9, 8.6, 8.9);

insert into animal (idAnimal, nombre, tipoAnimal, idResponsable, idFerula, idCarrito) 
values
		(1, 'Fritotto','PERRO', 1, 1, null),
		(2, 'Palunka','PERRO', 2, null, 1),
        (3, 'Wakko','PERRO', 1, null, 2),
		(4, 'Turuleca','GATO', 3, 2, null),
        (5, 'Rasquechunfen','PERRO', 1, null, 3),
		(6, 'Guernico','PERRO', 4, null, 4),
		(7, 'Chask','GATO', 1, 3, null),
        (8, 'Zardoz','PERRO', 5, 5, null),
        (9, 'Kikki','PERRO', 2, null, 5),
        (10, 'Ikoiko','CABALLO', 4, 6, null);