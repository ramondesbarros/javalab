package br.com.javalab.designpatterns.factorymethod;

public class CarroFactory implements VeiculoFactory {

	@Override
	public Veiculo createVeiculo() {
		// TODO Auto-generated method stub
        return new Carro();
	}

}
