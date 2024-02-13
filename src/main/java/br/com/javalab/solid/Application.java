package br.com.javalab.solid;


public class Application {

	public static void main(String[] args) {
		
		int v1 = 10;
		int v2 = 2;
		
		Soma s1 = new Soma();
		
		calcular(s1, v1, v2);
		
		Dividir d1 = new Dividir();
		
		calcular(d1, v1, v2);
		
		
	}
	
	static void calcular(Calculo c1, int v1, int v2) {
		
		int resp = c1.calcular(v1, v2);
		
		System.out.println("Resposta -> " + resp);
		
	}

}
