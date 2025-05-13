package dev.java._0.EventClean.core.entities;

import dev.java._0.EventClean.core.enums.TipoEvento;

import java.time.LocalDateTime;

public record Event(
    Long id,
    String nome,
    String descricao,
    LocalDateTime dataInicio,
    LocalDateTime dataFim,
    String identificador,
    String local,
    String organizador,
    TipoEvento tipo //se pa q vai ser do tipo Enum
){}
