-- Consulta de clientes con su sucursal correspondiente
SELECT * FROM clientes
	INNER JOIN sucursales
    ON clientes.fk_idsucursal = sucursales.idsucursal;
-- Sobre idSucursal = 3
SELECT * FROM clientes
	INNER JOIN sucursales
    ON clientes.fk_idsucursal = sucursales.idsucursal
    WHERE sucursales.idsucursal = 3;
    
    