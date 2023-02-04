package loja;

import java.util.List;

public class CarrinhoDeCompras {

	private Cliente cliente;
	private List<Produto> produtos;

	public CarrinhoDeCompras(Cliente cliente, List<Produto> produtos) {
		super();
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public double calcularValorTotal() {
		double valorTotal = 0;
		for (Produto produto : produtos) {
			valorTotal = +produto.getPreco() * produto.getQuantidade();
		}
		return valorTotal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
