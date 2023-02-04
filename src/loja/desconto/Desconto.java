package loja.desconto;

import loja.CarrinhoDeCompras;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}
	
	public abstract double caucularDesconto(CarrinhoDeCompras carrinhoDeCompras);
}
