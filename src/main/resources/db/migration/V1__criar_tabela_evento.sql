-- V1_criar_tabela_evento.sql

CREATE TABLE Events(
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    descricao TEXT,
    data_inicio TIMESTAMP NOT NULL,
    data_fim TIMESTAMP NOT NULL,
    identificador VARCHAR(255) NOT NULL UNIQUE,
    local_evento VARCHAR(255) NOT NULL,
    organizador VARCHAR(80) NOT NULL,
    capacidade INTEGER NOT NULL,
    tipo_evento VARCHAR(255) NOT NULL
);