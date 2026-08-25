
CREATE DATABASE IF NOT EXISTS 3at_db;
USE 3at_db;
-- 2. CRIANDO A TABELA DE ALUNOS
CREATE TABLE IF NOT EXISTS alunos (
numero_chamada INT PRIMARY KEY,
nome VARCHAR(50)
);


DELIMITER $$
CREATE PROCEDURE CadastrarAluno(
IN p_chamada INT,
IN p_nome VARCHAR(50)
)
BEGIN
INSERT INTO alunos (numero_chamada, nome)
VALUES (p_chamada, p_nome);
END $$
DELIMITER ;

CALL CadastrarAluno(1, 'Ana Silva');

SELECT * FROM alunos;