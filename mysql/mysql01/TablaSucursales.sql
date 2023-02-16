-- Crear datos a tabla sucursales
-- INSERT INTO tabla (campos) VALUES (),(),();
INSERT INTO sucursales (nombre_sucursal, direccion)
	VALUES ("Las Palmas","Las Palmas n.88" ),
    ("Plaza Las Américas","Av. Siempre viva n.44" ),
    ("Colinas del Oriente","Av. Oriente n.123" ),
    ("Ruta 66","Radiador springs ruta 66" ),
    ("Plaza Altaria","Boulevar Luis Donaldo Colosio" );

DELETE FROM sucursales WHERE idsucursal = 1;

SELECT * FROM sucursales;