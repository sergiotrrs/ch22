SELECT * FROM cliente;
SELECT * FROM sucursal;
-- INNER JOIN
SELECT * FROM cliente
	INNER JOIN sucursal
    ON cliente.idsucursal = sucursal.idsucursal;
-- mostrar todos los datos de cliente, y solo el nombre
-- de la sucursal.
SELECT cliente.*, sucursal.nombre AS "nombre sucursal"
	FROM cliente
	INNER JOIN sucursal
    ON cliente.idsucursal = sucursal.idsucursal;

-- Mostrar email cliente, nombre sucursal
-- con los clientes que tengas @gmail.com
-- ordenamos por email descentende
SELECT cliente.email,sucursal.nombre AS "nombre sucursal"
  FROM cliente
  INNER JOIN sucursal 
  ON cliente.idsucursal = sucursal.idsucursal
  WHERE cliente.email LIKE "%@gmail.com"
  ORDER BY cliente.email DESC;
  
-- Mostrar email cliente, las tarjetas que tiene
-- y el nombre de cada tarjeta;
SELECT cliente.email, tipotarjeta_idtarjeta,
       tipotarjeta.nombre
    FROM cliente
    INNER JOIN cliente_has_tipotarjeta
    ON cliente.idcliente = cliente_has_tipotarjeta.cliente_idcliente
    INNER JOIN tipotarjeta
    ON cliente_has_tipotarjeta.tipotarjeta_idtarjeta = tipotarjeta.idtarjeta;

-- LeftJOIN
SELECT * FROM cliente
	LEFT JOIN cliente_has_tipotarjeta
    ON idcliente = cliente_idcliente;

SELECT * FROM cliente_has_tipotarjeta
	RIGHT JOIN tipotarjeta
    ON tipotarjeta_idtarjeta = idtarjeta;


