package com.esin.web;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.esin.pessoa.Pessoa;
import com.esin.pessoa.PessoaRN;
import com.esin.util.FacesMessages;

@ManagedBean(name = "pessoaBean")
@RequestScoped
public class PessoaBean {

	private Pessoa pessoa;
	private List<Pessoa> lista;
	private PessoaRN pessoaRN;
	private FacesMessages messages = new FacesMessages();
	
	public PessoaBean() {
		this.novo();
	}
	
	public String novo() {
		this.pessoa = new Pessoa();
		this.pessoa.setNascimento(new Date());
		return null;
	}
	
	public void limpar() {
		this.pessoa = new Pessoa();
		this.pessoa.setNascimento(new Date());
	}
	
	public void salvar() {
		this.pessoaRN = new PessoaRN();
		this.pessoaRN.salvar(this.pessoa);
		this.novo();
		this.pessoaRN = null;
		messages.info("Pessoa cadastrada com sucesso");
	}
	
	public String editar() {
		return null;
	}
	
	public Pessoa getPessoa() {
		return this.pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	
}
