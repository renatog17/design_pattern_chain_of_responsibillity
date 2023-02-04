package loja;

import java.time.LocalDate;

public class Cliente {

	private String name;
	private LocalDate fidelidade;

	public Cliente(String name, LocalDate fidelidade) {
		super();
		this.name = name;
		this.fidelidade = fidelidade;
	}

	public String getName() {
		return name;
	}

	public LocalDate getFidelidade() {
		return fidelidade;
	}

}
