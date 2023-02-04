package loja.desconto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import loja.CarrinhoDeCompras;

public class DescontoClienteFidelidadeIgualOuMaiorADezAnos extends Desconto{

	public DescontoClienteFidelidadeIgualOuMaiorADezAnos(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double caucularDesconto(CarrinhoDeCompras carrinhoDeCompras) {
		LocalDate dataAtual = LocalDate.now();
		long anos = carrinhoDeCompras.getCliente().getFidelidade().until(dataAtual, ChronoUnit.YEARS);
		if(anos>10)
			return 0.4;
		return proximo.caucularDesconto(carrinhoDeCompras);
	}

}
