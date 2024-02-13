package br.com.javalab.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		
		List<String> usuarios = Arrays.asList("Ramon", "Dave", "Hayley", "CJ Ramone", "Lisa", "Einstein");
		
		// Filter 
		/***
		 * uma operação intermediária que consiste em filtrar objetos com base em algum critério 
		 * fornecido por parâmetro, esse critério é representado por uma função lambda.
		 */
		
		List<String> collect = usuarios.stream()
			.filter(u -> u.length() > 5)
			.collect(Collectors.toList());
		
		collect.forEach(c -> System.out.println(c));
		
		// Return -> [Hayley, CJ Ramone, Einstein]
		
		
		//O MAP é uma operação intermediária que permite transformar um objeto em algum outro tipo de objeto                

		List<String> numerosEmString = Arrays.asList("1.0", "2.0", "3.0");

		List<BigDecimal> numeros = numerosEmString
		        .stream()
		        .map(s -> new BigDecimal(s))
		        .collect(Collectors.toList());
		
		System.out.println("MAP------------------");
		
		System.out.println(numeros);
		
		
		//O OPTIONALS surgiram para evitar nullPointerExceptions e antes de tentar obter algo, podemos validar se realmente existe. Ainda para a lista de nomes, vamos tentar encontrar qualquer nome que comece com W.

		List<String> names = Arrays.asList("John", "Jack", "Hamilton", "George", "Will", "Wellington");
		Optional<String> result = names.stream()
						.filter(name -> name.startsWith("W"))
						.findAny();
		
		System.out.println("OPTIONALS----------------");
		
		System.out.println(result);


		
		//Através do REDUCE podemos fazer operações com cada resultado da stream. Por exemplo, somar todas as idades maiores que 20.

		List<Person> people = Arrays.asList(new Person("John", 26),
						new Person("Jack", 40),
						new Person("Hamilton", 14),
						new Person("George", 63));

		OptionalInt resultpeople = people.stream()
						.filter(p -> p.getAge() > 20)
						.mapToInt(Person::getAge)
						.reduce((a, b) -> a + b);
		
		System.out.println("REDUCE-------------------");
		System.out.println(resultpeople);
		
		

	}
}
