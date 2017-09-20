package com.esin.web;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.esin.sindicato.Sindicato;
import com.esin.sindicato.SindicatoRN;

@ManagedBean(name = "sindicatoBean")
@RequestScoped
public class SindicatoBean {

	private Sindicato sindicato = new Sindicato();
	private List<Sindicato> lista;
	private SindicatoRN sindicatoRN;
	
	public SindicatoBean() {
		this.novo();
	}
	
	
	public String novo() {
		this.sindicato = new Sindicato();
		this.sindicato.setFundacao(new Date());
		return null;
	}

	public String salvar() {
		this.sindicatoRN = new SindicatoRN();
		this.sindicatoRN.salvar(this.sindicato);
		this.novo();
		this.sindicatoRN = null;
		
		return "sindicatoListagem";
	}

	
	public String editar() {
		return "sindicato";
	}

	public Sindicato getSindicato() {
		return this.sindicato;
	}

	public void setSindicato(Sindicato sindicato) {
		this.sindicato = sindicato;
	}

	public List<Sindicato> getLista() {
		if (this.lista == null) {
			this.sindicatoRN = new SindicatoRN();
			this.lista = this.sindicatoRN.listar();
		}

		return this.lista;
	}
	
	public void excluir() {
		this.sindicatoRN = new SindicatoRN();
		this.sindicatoRN.excluir(sindicato);
		this.sindicatoRN = null;
		this.novo();
		
	}

}
