package com.example.poc_design_pattern_strategy;

import com.example.poc_design_pattern_strategy.core.strategies.EspecialidadeContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

@SpringBootApplication
public class PocDesignPatternStrategyApplication {

	public static void main(String[] args) {

		SpringApplication.run(PocDesignPatternStrategyApplication.class, args);

		var medicos = new EspecialidadeContext().getMedicosConveniados();
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o nome e sobrenome do medico: ");
		String nomeMedico = ler.nextLine().toUpperCase();

		try {
			var agendamento = medicos.get(nomeMedico).agendarConsulta(
					nomeMedico,
					LocalDateTime.of(2024, Month.APRIL,20,14,20
					));

			System.out.println("Agendamento realizado!");
			System.out.println(agendamento.toString());
		}catch (NullPointerException exception){
			System.out.println("Medico informado nao se encontra na lista de conveniados");
		}


	}

}
