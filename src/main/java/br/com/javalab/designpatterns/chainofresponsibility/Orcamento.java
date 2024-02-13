package br.com.javalab.designpatterns.chainofresponsibility;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;

	private int quantidadedeIntens;

	public Orcamento(BigDecimal valor, int quantidadedeIntens) {
		super();
		this.valor = valor;
		this.quantidadedeIntens = quantidadedeIntens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadedeIntens() {
		return quantidadedeIntens;
	}
}
