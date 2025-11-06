CREATE DATABASE IF NOT EXISTS Projeto_BD;

CREATE TABLE IF NOT EXISTS IES(
    cod_ies  IDENTITY(1,1) NOT NULL,
    nome_ies VARCHAR(25) NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    tipo_administracao VARCHAR(7) NOT NULL,

    CONSTRAINT chk_tp_adm CHECK(tipo_administracao IN('Pública', 'Privada')),
)