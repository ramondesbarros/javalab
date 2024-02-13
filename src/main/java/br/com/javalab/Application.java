package br.com.javalab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {

//		List<Leilao> expirados = leiloes.buscarLeiloesExpirados();
//		expirados.forEach(leilao -> {
//			Lance maiorLance = maiorLanceDadoNoLeilao(leilao);
//			leilao.setLanceVencedor(maiorLance);
//			leilao.fechar();
//			leiloes.salvar(leilao);
//			enviadorDeEmails.enviarEmailVencedorLeilao(maiorLance);
//		});

//		List<Lance> lancesDoLeilao = new ArrayList<>(leilao.getLances());
//		lancesDoLeilao.sort((lance1, lance2) -> {
//			return lance2.getValor().compareTo(lance1.getValor());
//		});

		List<String> names = Arrays.asList("John", "Jack", "Hamilton", "George");

		List<String> namesResp = Arrays.asList("John", "Jack", "Hamilton");

		List<String> result = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());

		result.forEach(element -> System.out.println(element));

		Optional<String> result2 = names.stream().filter(name -> name.startsWith("J")).findFirst();

		String result3 = names.stream().filter(name -> name.startsWith("J")).findFirst().map(Object::toString)
				.orElse(null);

		System.out.println(namesResp);
		// xxx.setYYY(ofNullable(zzz.getZZZ())).map(i -> zzz).or else(trhow)
		//stream.sequential().collect(Collectors.toCollection(() -> existingList))
		
		//names.stream().map(String::length).forEachOrdered(namesResp::add);
		//names.stream().forEachOrdered(namesResp::add);

		
		List<Integer> listInteger = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> i1 = Arrays.asList(6, 7, 8, 9, 10);


		System.out.println(listInteger);
		
		listInteger = listInteger.stream()
	               .filter(n -> n % 2 == 0)
	               .collect(Collectors.toList());
		
		System.out.println(listInteger);
		
		List<String> destList = Arrays.asList("foo");
		List<String> newList = Arrays.asList("0", "1", "2", "3", "4", "5");

		destList = Stream.concat(destList.stream(), newList.stream()).parallel()
		            .collect(Collectors.toList());
		System.out.println(destList);
		

		List<String> destList1 = new ArrayList<>(Arrays.asList("foo"));
		List<String> newList1 = Arrays.asList("0", "1", "2", "3", "4", "5");
//		newList1.parallelStream()
//		       .collect(Collectors.toCollection(() -> destList1));
		
		newList1.stream()
	       .collect(Collectors.toCollection(() -> destList1));

		System.out.println("Last------------------------");
		System.out.println(destList1);
	}
}
