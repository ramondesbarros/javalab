package br.com.javalab.string;

import org.apache.commons.lang3.StringUtils;


public class Application {

	public static void main(String[] args) {
		
		String n1 = "Ramon Barros";
		String n2 = "Ramon Barros";
		
		String testNull = null;
		
		System.out.println("--------------------------------------");
		
		System.out.println("StringUtils (classe static que não pode ser instanciada)");
		
		System.out.println("--------------------------------------");


		boolean isEqual = StringUtils.equals("A", "A");
		
		if (StringUtils.isEmpty(n1)) {
			
			System.out.println("n1 nao esta null");
			
		}

		if (StringUtils.isEmpty(testNull)) {
			
			System.out.println("test null nao esta null");
			
		}
		
		// Removendo espaços em branco de uma string
		String stringComEspacos = "    Essa string tem espaços em branco.    ";
		String stringSemEspacos = StringUtils.trim(stringComEspacos);
		System.out.println(stringSemEspacos); // Essa string tem espaços em branco.

		System.out.println("--------------------------------------");
		
		System.out.println("StringBuilder");
		
		System.out.println("--------------------------------------");

		
		StringBuilder sb = new StringBuilder();
		sb.append("Amanhã ");
		sb.append("o ");
		sb.append("dia ");
		sb.append("vai ");
		sb.append("estar ");
		sb.append("chuvoso!");

		System.out.println(sb);
		
		sb.delete(0, 3);
		
		System.out.println(sb);
		

		sb.replace(0, sb.length(), "X");
		
		System.out.println(sb);
		
		
		System.out.println("--------------------------------------");
		
		System.out.println("StringBuffer");
		
		System.out.println("--------------------------------------");
		StringBuffer buffer = new StringBuffer();

		buffer.append("Olá, ");
		buffer.append("mundo!");

		System.out.println(buffer);

	}
}
