DROP DATABASE IF EXISTS db_loja;

CREATE DATABASE IF NOT EXISTS db_loja;

USE db_loja;

    CREATE TABLE IF NOT EXISTS tb_vendas (
    id_nf INT,
    id_item INT,
    cod_prod INT,
    valor_unit double,
    quantidade INT,
    desconto INT
    );
    
    INSERT INTO tb_vendas ( id_nf, id_item, cod_prod, valor_unit, quantidade, desconto) VALUES
    (1,1,1,25.00,10,5),
    (1, 2, 2, 13.50, 3, NULL),
    (1, 3, 3, 15.00, 2, NULL),
    (1, 4,4,10.00,1,NULL),
    (1,5,5,30.00,1,NULL),
    (2,1,3,15.00,4,NULL),
    (2,2,4,10.00,5,NULL),
    (2,3,5,30.00,7,NULL),
    (3,1,1,25.00,5,NULL),
    (3,2,4,10.00,4,NULL),
    (3,3,5,30.00,5,NULL),
    (3,4,2,13.50,7,NULL),
    (4,1,5,30.00,10,15),
    (4,2,4,10.00,12,5),
    (4,3,1,25.00,13,5),
    (5,1,3,15.00,3,NULL),
    (5,2,5,30.00,6,null),
    (6,1,1,25.00,22,15),
    (6,2,3,15.00,25,20),
    (7,1,1,25.00,10,3),
    (7,3,3,15.00,10,4),
    (7,4,5,30.0,10,1);
    
SELECT  id_nf, id_item, cod_prod, valor_unit
FROM tb_vendas;

SELECT id_nf, id_item, cod_prod, valor_unit- (valor_unit*(desconto/100)) AS "valor_vendido" 
FROM tb_vendas
WHERE desconto IS NOT NULL;


UPDATE tb_vendas
SET desconto = 0
WHERE desconto IS NULL;

SELECT id_nf, id_item, cod_prod, quantidade * valor_unit as valor_total, desconto,  valor_unit - (valor_unit*(desconto/100)) AS "valor vendido"
FROM tb_vendas;

SELECT id_nf, SUM(valor_unit * quantidade)
FROM tb_vendas
GROUP BY id_nf;

SELECT id_nf, valor_unit * quantidade
FROM tb_vendas
ORDER BY valor_unit * quantidade DESC;

SELECT  cod_prod, quantidade
FROM tb_vendas;

SELECT id_nf,  cod_prod, quantidade
FROM tb_vendas
WHERE quantidade > 10;

SELECT id_nf, valor_unit * quantidade
FROM tb_vendas
WHERE quantidade > 500
ORDER BY valor_unit * quantidade DESC;

SELECT cod_prod, AVG(desconto) AS media
FROM tb_vendas
GROUP BY cod_prod;

SELECT cod_prod, MIN(desconto) AS menor, MAX(desconto) AS maior, AVG(desconto) AS media
FROM tb_vendas
GROUP BY cod_prod;


SELECT id_nf, COUNT(id_item) AS qtd_itens
FROM tb_vendas
GROUP BY id_nf
HAVING COUNT(id_item);
			







 


    
    
    
    
    