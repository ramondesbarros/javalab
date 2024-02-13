package br.com.javalab.designpatterns.strategy;

public class ImpostoIPI implements Imposto {

	@Override
	public double calcularImposto(double valor) {
		// TODO Auto-generated method stub
        return valor * 0.10;
	}

}
