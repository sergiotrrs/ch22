SELECT * FROM cliente;
SELECT * FROM tipotarjeta;
-- Seleccionado los registros 5, 7 y 9
SELECT * FROM cliente
	WHERE idcliente = 5 OR idcliente = 7 OR idcliente = 9;
SELECT * FROM cliente
		WHERE idcliente IN (5,7,9);
-- Saber los nombre que no sean repetidos
SELECT DISTINCT nombre from cliente;
SELECT COUNT(DISTINCT nombre) from cliente;
-- Cuantas sucursales, están en operación con los clientes
SELECT COUNT(DISTINCT idsucursal ) FROM cliente;
-- Saber el id, nombre, dirección de las sucursales
-- que NO están siendo utilizadas.
SELECT idsucursal, nombre, direccion
	FROM sucursal
    WHERE idsucursal NOT IN (  
      SELECT DISTINCT idsucursal FROM cliente
    );

-- Conocer las tajetas que su ingreso mínimos
-- esté en el rango de 10k y 50k
-- Ordene en forma descendete en el ingreso_min
SELECT * FROM tipotarjeta
  WHERE ingresos_min >= 10000 
  AND ingresos_min <= 50000
  ORDER BY ingresos_min DESC;

SELECT * FROM tipotarjeta 
  WHERE ingresos_min 
  BETWEEN 1000 AND 50000 
  ORDER BY 
    ingresos_min DESC,
    nombre DESC;
  
-- Agrupar los elementos que sean similares
-- en la columna ingresos_min.
SELECT ingresos_min, COUNT(ingresos_min) AS cantidad
 	FROM tipotarjeta
	GROUP BY ingresos_min
    ORDER BY ingresos_min;
-- Agrupar los elementos que sean similares
-- en la columna ingresos_min
-- Solo mostrar los registros que sean mayor a 2
-- Cuando se utlice Group by, para reaizar un filtro
-- debemos utilizar Having
SELECT ingresos_min, COUNT(ingresos_min) AS cantidad
 	FROM tipotarjeta
	GROUP BY ingresos_min
    HAVING cantidad >= 2
    ORDER BY ingresos_min;


SELECT * FROM cliente;

SELECT * FROM sucursal;
SELECT * FROM tipotarjeta ORDER BY ingresos_min;
