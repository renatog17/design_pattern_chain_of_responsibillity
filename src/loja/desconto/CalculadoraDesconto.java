package loja.desconto;

import loja.CarrinhoDeCompras;

public class CalculadoraDesconto {

	public double calcular(CarrinhoDeCompras carrinhoDeCompras) {
		Desconto desconto = new DescontoClienteFidelidadeIgualOuMaiorADezAnos(
				new DescontoCompraComMaisDe10Itens(
				new DescontoValorMaiorQueQuinhetos(
				new SemDesconto(null))));
		
		return desconto.caucularDesconto(carrinhoDeCompras);
	}
}
