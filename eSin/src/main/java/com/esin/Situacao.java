package com.esin;

import java.util.ArrayList;
import java.util.List;

public enum Situacao {

	
	ATIVO("ATIVO","Ativo"), 
	INATIVO("INATIVO", "Inativo");
	
	private String valor = "";
	private String descricao = "";
	
	private Situacao(String valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
		
	}
	
	private Situacao() {
		
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public String toString() {
		return getValor();
		
	}
	
	
}
