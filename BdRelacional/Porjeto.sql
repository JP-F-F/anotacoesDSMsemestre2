CREATE DATABASE IF NOT EXISTS Projeto_BD;

CREATE TABLE IF NOT EXISTS IES(
    cod_ies  INT IDENTITY(1,1) NOT NULL,
    nome_ies VARCHAR(25) NOT NULL,
    categoria VARCHAR(20) NOT NULL,
    tipo_administracao VARCHAR(7) NOT NULL,
    acad VARCHAR(20) NOT NULL,
    municipio VARCHAR(20) NOT NULL,
    UF VARCHAR(2) NOT NULL,
    CONSTRAINT chk_tp_adm CHECK(tipo_administracao IN('Pública', 'Privada')),
    CONSTRAINT chk_acad CHECK(acad IN ('Universidade', 'Centro Universitário', 'Faculdade', 'Instituto Federal')),
    CONSTRAINT pk_IES PRIMARY KEY (cod_ies)
);

CREATE TABLE IF NOT EXISTS Campus(
    id_campus INT IDENTITY(1,1) NOT NULL,
    cod_ies INT,
    nome_campus VARCHAR(40) NOT NULL,
    municipio VARCHAR(23) NOT NULL,
    UF VARCHAR(2) NOT NULL,
    CONSTRAINT fk_IES FOREIGN KEY (cod_ies) REFERENCES IES (cod_ies),
    CONSTRAINT pk_Campus PRIMARY KEY (id_campus)
);

CREATE TABLE IF NOT EXISTS Docente(
    id_docente INT IDENTITY(1,1) NOT NULL,
    cod_ies INT,
    nome_docente VARCHAR(20) NOT NULL,
    titulacao VARCHAR(20) NOT NULL,
    regime_trabalho VARCHAR(20),
    sexo CHAR(1) NOT NULL,
)