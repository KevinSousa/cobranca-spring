package com.cobranca.sistema.model.enums;

public enum StatusTitulo {

	PENDENTE ("Pendente"),
	RECEBIDO ("Recebido"),
	CANCELADO ("Cancelado");
	
	private String descricao;

	StatusTitulo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}