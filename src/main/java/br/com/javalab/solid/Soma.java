package br.com.javalab.solid;

public class Soma implements Calculo {

	@Override
	public int calcular(int a, int b) {
		int resp = a + b; 
		return resp;

	}

}
