package com.example.poc_design_pattern_strategy.core.strategies.concreteStrategies;

import com.example.poc_design_pattern_strategy.core.strategies.EspecialidadeStrategy;
import com.example.poc_design_pattern_strategy.entity.Agendamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CardiologiaStrategy implements EspecialidadeStrategy {
    @Override
    public Agendamento agendarConsulta(String medico, LocalDateTime dataHoraConsulta) {
        return Agendamento
                .builder()
                .medico(medico)
                .dataHoraConsulta(dataHoraConsulta)
                .valorConsulta(BigDecimal.valueOf(150))
                .mensagem("Agendamento para especialidade de Cardiologia").build();
    }
}
