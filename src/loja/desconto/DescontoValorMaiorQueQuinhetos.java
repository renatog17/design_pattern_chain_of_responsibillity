package loja.desconto;

import loja.CarrinhoDeCompras;
import loja.Produto;

public class DescontoValorMaiorQueQuinhetos extends Desconto{

	public DescontoValorMaiorQueQuinhetos(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double caucularDesconto(CarrinhoDeCompras carrinhoDeCompras) {
		double precoTotal = 0;
		for (Produto produto : carrinhoDeCompras.getProdutos()) {
			precoTotal = produto.getPreco();
			if(precoTotal>500.0)
				return 0.1;
		}
		return proximo.caucularDesconto(carrinhoDeCompras);
	}

}
