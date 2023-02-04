package loja;

public class Produto {

	private String nome;
	private String descricao;
	private Long quantidade;
	private double preco;

	public Produto(String nome, String descricao, Long quantidade, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

}
