package com.example.poc_design_pattern_strategy.core.strategies;

import com.example.poc_design_pattern_strategy.core.strategies.concreteStrategies.CardiologiaStrategy;
import com.example.poc_design_pattern_strategy.core.strategies.concreteStrategies.GinecologiaStrategy;
import com.example.poc_design_pattern_strategy.core.strategies.concreteStrategies.OrtopediaStrategy;
import lombok.Data;

import java.util.Map;

@Data
public class EspecialidadeContext {

    private Map<String, EspecialidadeStrategy> medicosConveniados = Map.of(
            "MARIANA ALMEIDA", new GinecologiaStrategy(),
            "LEONARDO VINCI", new CardiologiaStrategy(),
            "LACAN SILVA", new OrtopediaStrategy());

}
