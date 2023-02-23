DELIMITER $$
CREATE PROCEDURE `getUsersAndCreditCards`()
BEGIN
	SELECT cliente.nombre, cliente.apellido, cliente.email, tipotarjeta_idtarjeta ,tipotarjeta.nombre
    FROM cliente
    INNER JOIN cliente_has_tipotarjeta
    ON cliente.idcliente = cliente_has_tipotarjeta.cliente_idcliente
    INNER JOIN tipotarjeta
    ON cliente_has_tipotarjeta.tipotarjeta_idtarjeta = tipotarjeta.idtarjeta;
END $$
DELIMITER ;