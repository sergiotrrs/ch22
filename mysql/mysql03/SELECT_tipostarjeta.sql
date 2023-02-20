SELECT * from cliente;
SELECT * from contrato;
SELECT * FROM tipotarjeta;
SELECT * FROM cliente_has_tipotarjeta;

-- Consulta las tarjetas que ingreso min >9,000
SELECT * FROM tipotarjeta
	WHERE ingresos_min > 9000;
-- Ordenar de forma descentende
SELECT * FROM tipotarjeta
	WHERE ingresos_min > 9000
    ORDER BY ingresos_min DESC;
-- Ordernar TODOS los campos en forma DESCENTENDE
-- En la columna nombre
SELECT * FROM tipotarjeta
	ORDER BY nombre DESC;
SELECT * FROM tipotarjeta
	ORDER BY nombre ASC;
-- Ver las tarjetas que NO sean ingresos min = 10000
SELECT * FROM tipotarjeta
	WHERE ingresos_min != 10000;
SELECT * FROM tipotarjeta
	WHERE NOT ingresos_min = 10000;

-- Seleccionar tarjetas que ingresos sean
-- >2000 y <50000, pero que su nombre
-- no comience con 'p';
-- que lo ordene por nombre de forma asc.
SELECT * FROM tipotarjeta
	WHERE ingresos_min > 2000.00 
    AND ingresos_min < 50000.00 
    AND NOT nombre LIKE "p%"
    ORDER BY nombre DESC;

-- Obtener el min de ingresos_min
SELECT MIN(ingresos_min) FROM tipotarjeta;

-- Obtener el mayo de los ingresos_min
SELECT MAX(ingresos_min) FROM tipotarjeta;
-- Mostrar los registros que cumplan con el mayor valor de
-- ingreso_min
SELECT * FROM tipotarjeta
	WHERE ingresos_min = (
		SELECT MAX(ingresos_min) FROM tipotarjeta
    );
-- Obtener el promedio de la columna ingresos_min
SELECT AVG(ingresos_min) FROM tipotarjeta;

-- Obtener la sumatoria de la columna ingresos_min
-- que sean menor a 10000;
SELECT SUM(ingresos_min) AS "sumatoria" FROM tipotarjeta
	WHERE ingresos_min < 10000;

SELECT * FROM tipotarjeta;