package com.example.poc_design_pattern_strategy.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class Agendamento {

    private String medico;

    private LocalDateTime dataHoraConsulta;

    private String mensagem;

    private BigDecimal valorConsulta;
}
