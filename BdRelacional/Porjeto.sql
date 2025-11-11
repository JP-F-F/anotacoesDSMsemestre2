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
    CONSTRAINT fk_Docente PRIMARY KEY (id_docente),
    CONSTRAINT fk_IES FOREIGN KEY (cod_ies) REFERENCES IES (cod_ies)
);

CREATE TABLE IF NOT EXISTS Curso(
    cod_curso INT IDENTITY(1,1) NOT NULL,
    id_campus INT,
    nome_curso VARCHAR(25) NOT NULL,
    grau_academico VARCHAR(20) NOT NULL,
    modalidade VARCHAR(15) NOT NULL,
    carga_horaria_total FLOAT NOT NULL,
    numero_vagas INT
    CONSTRAINT fk_Curso PRIMARY KEY (cod_curso),
    CONSTRAINT fk_Campus FOREIGN KEY (id_campus) REFERENCES Campus (id_campus)
);

CREATE TABLE IF NOT EXISTS Aluno(
    id_aluno INT IDENTITY(1,1) NOT NULL,
    cod_curso INT,
    nome_aluno VARCHAR(30) NOT NULL,
    ano_ingresso DATE NOT NULL,
    sexo CHAR(1) NOT NULL,
    cor_raca VARCHAR(10) NOT NULL,
    dt_nascimento DATE NOT NULL,
    situacao VARCHAR(20),
);

CREATE TABLE IF NOT EXISTS Matricula(
    id_matricula INT IDENTITY(1,1) NOT NULL,
    id_aluno INT,
    cod_disciplina INT,
    ano DATE NOT NULL,
    semestre INT NOT NULL,
    nota_final FLOAT NOT NULL,
    frequencia INT NOT NULL,
);

CREATE TABLE IF NOT EXISTS Disciplina(
    cod_disciplina INT IDENTITY(1,1) NOT NULL,
    cod_curso INT,
    nome_disciplina VARCHAR(20),
    carga_horaria DATETIME,
    periodo VARCHAR(15),
)