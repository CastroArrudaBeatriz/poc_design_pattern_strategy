package com.example.poc_design_pattern_strategy.core.strategies;

import com.example.poc_design_pattern_strategy.entity.Agendamento;

import java.time.LocalDateTime;

public interface EspecialidadeStrategy {

    Agendamento agendarConsulta(String medico, LocalDateTime dataHoraConsulta);

}
