package br.com.javalab.designpatterns.strategy;

public class Aplication {

    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ImpostoICMS());
        double imposto = calculadora.calcularImposto(100);
        System.out.println("ICMS: " + imposto);

        calculadora.setImposto(new ImpostoISS());
        imposto = calculadora.calcularImposto(100);
        System.out.println("ISS: " + imposto);

        calculadora.setImposto(new ImpostoIPI());
        imposto = calculadora.calcularImposto(100);
        System.out.println("IPI: " + imposto);
    }
}
