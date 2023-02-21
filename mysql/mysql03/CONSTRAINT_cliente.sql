
-- Se trata de eliminar, pero el constraint está en restrict
DELETE FROM sucursal WHERE idsucursal = 3;
-- Este registro si se puede eliminar, por que no estáALTER
-- siendo utilizado en la tabla cliente
DELETE FROM sucursal WHERE idsucursal = 2;

-- Se modifica el constraint a cascade
-- Se actualida el id de 3 a 5
UPDATE sucursal SET idsucursal = '5' 
	WHERE idsucursal = '3';
-- SE elimina el registro id 5
DELETE FROM sucursal
	WHERE idsucursal = 5;
UPDATE contrato SET idcliente = null;
DELETE FROM cliente_has_tipotarjeta;

-- Se establece la restricción en SetNull
DELETE FROM sucursal
	WHERE idsucursal = 1;

SELECT * FROM sucursal;
SELECT * FROM cliente;
SELECT * FROM contrato;

