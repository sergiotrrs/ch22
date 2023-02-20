USE bank_jh;
SELECT * FROM cliente;
-- ACtualizanda el idsucursal a 2 clientes
UPDATE cliente SET idsucursal = 1
	WHERE idcliente = 1 OR idcliente = 2;

UPDATE cliente SET idsucursal = 2
	WHERE idcliente > 2 AND idcliente < 5; -- id 3 y 4

UPDATE cliente SET idsucursal = 1
	WHERE email LIKE '%@generation.%'; -- un carácter _ , varios %

SELECT * FROM cliente;

UPDATE cliente SET idsucursal = 3
 WHERE nombre = 'Daniel' AND apellido = 'Ruiz';
 
-- Cambiar el año de nacimiento de un cliente
UPDATE cliente SET 
	fecha_nacimiento = DATE_FORMAT( fecha_nacimiento, '1983-%m-%d')
    WHERE idcliente = 6;
-- Sumar 2 años al año de nacimiento
UPDATE cliente SET 
	fecha_nacimiento = DATE_FORMAT( 
		fecha_nacimiento,
         DATE_ADD( fecha_nacimiento, INTERVAL 2 YEAR) 		
         )
    WHERE idcliente = 6;
    
SELECT * FROM cliente;