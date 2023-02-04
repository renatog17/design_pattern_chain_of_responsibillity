package loja;

import java.time.LocalDate;
import java.util.Arrays;

import loja.desconto.CalculadoraDesconto;

public class TesteDesconto {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Renato", LocalDate.of(2000, 12, 30));
		Cliente cliente2 = new Cliente("Renato", LocalDate.of(2022, 12, 30));
		Cliente cliente3 = new Cliente("Renato", LocalDate.of(2022, 12, 30));
		
		Produto produto1 = new Produto("Bicicleta", "Mountain Bike", 1L, 1220.0);
		Produto produto2 = new Produto("Cadeira", "Cadeira Gamer", 1L, 1320.0);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(cliente1, Arrays.asList(produto1, produto2));
		CarrinhoDeCompras carrinhoDeCompras2 = new CarrinhoDeCompras(cliente2, Arrays.asList(produto1, produto2));
		CarrinhoDeCompras carrinhoDeCompras3 = new CarrinhoDeCompras(cliente3, Arrays.asList(produto1, produto2,produto1,produto1,produto1,produto1,produto1,produto1,produto1,produto1,produto1));
		
		CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
		
		System.out.println( calculadoraDesconto.calcular(carrinhoDeCompras));
		System.out.println( calculadoraDesconto.calcular(carrinhoDeCompras2));
		System.out.println( calculadoraDesconto.calcular(carrinhoDeCompras3));
	}
}
