package com.atividades.exe001;
//https://start.spring.io/

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Exercício 1: Maven + Streams
//Crie um projeto Java utilizando o Maven que contenha uma lista de strings.
// Em seguida, utilize Streams para realizar as seguintes operações:
// a) Conte o número total de strings na lista.
// b) Encontre a string mais longa presente na lista.
// c) Conte quantas vezes cada string aparece na lista e exiba a contagem para as 5 strings mais frequentes.
@SpringBootApplication
public class Exe001Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exe001Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//criei a lista
		List<String> Listinha = Arrays.asList("Preto", "Branco", "Vermelho", "Laranja", "Amarelo", "Azul", "Marrom", "Verde", "Preto", "Preto", "Vermelho", "Amarelo", "Amarelo", "Amarelo");
		long contaritems = Listinha.size();
		//contar os itemns


		String maioral = Listinha
				.stream()
				.max(Comparator.comparingInt(String::length))
				.get();



		// Conta a frequência de cada elemento usando streams
		Map<String, Long> frequencyMap = Listinha.stream()
				.collect(Collectors.groupingBy(
						s -> s, // Função para agrupar por elemento
						Collectors.counting() // Função para contar ocorrências
				));

		// Exibir o Map com as contagens de ocorrências
		frequencyMap.forEach((element, count) ->
				 System.out.println(element + ": " + count));

		System.out.println("\nA Quantidade de itens na lista é  = " + contaritems);
		System.out.println("\nLA Maior String é  = " + maioral);


//		@Override
//		public void run (String...args) throws Exception {
//
//		}
//
//
//	}
	}
}
