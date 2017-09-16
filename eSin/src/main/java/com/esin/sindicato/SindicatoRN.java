package com.esin.sindicato;

import java.util.List;

import com.esin.util.DAOFactory;

public class SindicatoRN {
	
	private SindicatoDAO dao;
	
	public SindicatoRN() {
		this.dao = DAOFactory.criarSindicatoDAO();
	}
	
	public Sindicato carregar(String codigo) {
		return this.dao.carregar(codigo);
	}
	
	public void salvar(Sindicato sindicato) {
		this.dao.salvar(sindicato);
	}
	
	public void excluir(Sindicato sindicato) {
		this.dao.excluir(sindicato);
	}
	
	public List<Sindicato> listar(){
		return this.dao.listar();
	}

}
