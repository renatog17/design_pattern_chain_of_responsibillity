package loja.desconto;

import loja.CarrinhoDeCompras;

public class DescontoCompraComMaisDe10Itens extends Desconto{

	public DescontoCompraComMaisDe10Itens(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double caucularDesconto(CarrinhoDeCompras carrinhoDeCompras) {
		if(carrinhoDeCompras.getProdutos().size()>10)
			return 0.2;
		return proximo.caucularDesconto(carrinhoDeCompras);
	}

}
