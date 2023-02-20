SELECT * FROM cliente;

-- saber cuantos clientes son de la sucursal 1;
SELECT * FROM cliente 
	WHERE idsucursal = 1;
    
SELECT COUNT(idsucursal) FROM cliente
	WHERE idsucursal = 1;
-- Cuantos registros tiene como correo @generation.mx
SELECT COUNT(idsucursal) FROM cliente
	WHERE email LIKE '%@generation.mx';

-- mostrar nombre, apellido, email y días de edad
SELECT nombre as "name", apellido as "lastname", email,
	DATEDIFF( "2023-02-15"  , fecha_nacimiento ) AS "days_of_live"  -- dias
	FROM cliente;
-- mostrar nombre, apellido, email y años de edad
SELECT nombre as "name", apellido as "lastname", email,
	DATEDIFF( "2023-02-15"  , fecha_nacimiento )/365 AS "age" 
	FROM cliente;

-- mostrar nombre, apellido, email y años de edad (ENTERO)
SELECT nombre as "name", apellido as "lastname", email,
	FLOOR(DATEDIFF( NOW() , fecha_nacimiento )/365) AS "age" 
	FROM cliente;

SELECT DATE_ADD( NOW() , INTERVAL 10 DAY ) AS "hoy más 10 días";

SELECT nombre,
	EXTRACT( YEAR FROM fecha_nacimiento) AS "año nacimiento"
	FROM cliente;

SELECT * FROM cliente;
    