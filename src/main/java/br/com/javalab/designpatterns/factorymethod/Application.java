package br.com.javalab.designpatterns.factorymethod;

public class Application {

    public static void main(String[] args) {
    	
        VeiculoFactory factory = new CarroFactory(); // VeiculoFactory superclass / CarroFactory subclass
        Veiculo veiculo = factory.createVeiculo();
        veiculo.dirigir();

        factory = new MotoFactory();
        veiculo = factory.createVeiculo();
        veiculo.dirigir();

        factory = new CaminhaoFactory();
        veiculo = factory.createVeiculo();
        veiculo.dirigir();
    }
}
