package br.com.javalab.designpatterns.strategy;

public class ImpostoISS implements Imposto {

	@Override
	public double calcularImposto(double valor) {
		// TODO Auto-generated method stub
        return valor * 0.05;
	}

}
