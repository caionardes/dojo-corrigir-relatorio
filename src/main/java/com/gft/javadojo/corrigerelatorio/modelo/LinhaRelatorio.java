package com.gft.javadojo.corrigerelatorio.modelo;

import java.time.LocalDate;

public class LinhaRelatorio {

	private String id;
	private String nomesobrenome;
	private LocalDate data;

	public LinhaRelatorio(String id, String nomesobrenome, LocalDate data) {
		super();
		this.id = id;
		this.nomesobrenome = nomesobrenome;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public String getNomesobrenome() {
		return nomesobrenome;
	}

	public LocalDate getData() {
		return data;
	}
}
