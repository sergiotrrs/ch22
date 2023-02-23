
-- Mostrar todas las estaciones de la línea Azul

-- Las líneas que llegan a la estación Chabacano(3)

-- Listar las líneas con el número de estaciones que tienen.
SELECT `lines`.`name`, `lines`.`color`,
	COUNT(DISTINCT `lines_stations`.`station_id`) AS "N. estaciones"
	-- `lines_stations`.`line_id`, `lines_stations`.`station_id`
	FROM `lines`
    INNER JOIN `lines_stations`
    ON `lines`.`id` = `lines_stations`.`line_id`
    GROUP BY `lines`.`id`;

-- En que estación convergen más líneas. (Pantitlán)
SELECT `lines_stations`.`station_id`,
		`stations`.`name`,
		COUNT(DISTINCT `lines_stations`.`line_id`) AS "N.Líneas"
	FROM `lines_stations`
    INNER JOIN `stations`
    ON `lines_stations`.`station_id` = `stations`.`id`
    GROUP BY `stations`.`name`
    HAVING `N.Líneas` = (
		SELECT 	MAX(Max) as maximo -- Obteniendo el valor máximo de líneas que convergen
			FROM (
				SELECT -- obteniendo el n. de líneas que convergen en las estaciones
				COUNT(DISTINCT `lines_stations`.`line_id`) AS "Max"
				FROM `lines_stations`
				INNER JOIN `stations`
				ON `lines_stations`.`station_id` = `stations`.`id`
				GROUP BY `stations`.`name`    
				) temporal_table
    ); -- fin
    
    