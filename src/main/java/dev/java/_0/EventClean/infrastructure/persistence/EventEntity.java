package dev.java._0.EventClean.infrastructure.persistence;

import dev.java._0.EventClean.core.enums.TipoEvento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private LocalDateTime dataInicio;

    private LocalDateTime dataFim;

    private String identificador;

    private String localEvento;

    private Integer capacidade;

    private String organizador;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipo;
}
