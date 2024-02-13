package br.com.javalab.designpatterns.strategy;

public class CalculadoraImposto {

	   private Imposto imposto;

	    public CalculadoraImposto(Imposto imposto) {
	        this.imposto = imposto;
	    }

	    public double calcularImposto(double valor) {
	        return imposto.calcularImposto(valor);
	    }

	    public void setImposto(Imposto imposto) {
	        this.imposto = imposto;
	    }
}
