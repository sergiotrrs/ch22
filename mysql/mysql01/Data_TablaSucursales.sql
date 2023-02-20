-- Crear datos a tabla sucursales
-- INSERT INTO tabla (campos) VALUES (),(),();
USE bank;
INSERT INTO sucursal (nombre, direccion, ciudad)
	VALUES ("Las Palmas","Las Palmas n.88", "Cuernavaca" ),
    ("Plaza Las Américas","Av. Siempre viva n.44", "CDmx" ),
    ("Colinas del Oriente","Av. Oriente n.123", "CDmx" ),
    ("Ruta 66","Radiador springs ruta 66","Guadalajara" ),
    ("Plaza Altaria","Boulevar Luis Donaldo Colosio", "Guadalajara" );

SELECT * FROM sucursal;

INSERT INTO sucursal (idsucursal,nombre, direccion, ciudad)
	VALUES (100,"Plaza Querétaro", "Carretera 52 n.1023", "Querétaro");
INSERT INTO sucursal (nombre, direccion, ciudad)
	VALUES ("Plaza Guadalajara", "Carretera 102 n.1", "Guadalajara");
INSERT INTO sucursal (nombre, direccion, ciudad)
	VALUES ("Plaza Patio2", "Av. Patio n.34", "Monterrey");
-- Establcer el contador de Auto_Increment a 8
ALTER TABLE sucursal AUTO_INCREMENT = 1;
