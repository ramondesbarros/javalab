package br.com.javalab.designpatterns.factorymethod;

public class MotoFactory implements VeiculoFactory {

	@Override
	public Veiculo createVeiculo() {
		// TODO Auto-generated method stub
        return new Moto();
	}

}
