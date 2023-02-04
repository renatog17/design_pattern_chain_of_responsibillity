package loja.desconto;
import loja.CarrinhoDeCompras;

public class SemDesconto extends Desconto{

	public SemDesconto(Desconto proximo) {
		super(null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double caucularDesconto(CarrinhoDeCompras carrinhoDeCompras) {
		return 0;
	}

}
