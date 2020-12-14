

CREATE TABLE pessoa(
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
logradouro VARCHAR(255),
numero varchar(10),
bairro VARCHAR(50),
cep VARCHAR(10),
cidade VARCHAR(50),
estado varchar(50),
ativo BOOLEAN
)ENGINE=InnoDB DEFAULT CHARSET=utf8;