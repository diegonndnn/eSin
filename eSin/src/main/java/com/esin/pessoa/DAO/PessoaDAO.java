package com.esin.pessoa.DAO;

import java.util.List;

import com.esin.pessoa.Pessoa;

public interface PessoaDAO {
	
	
	public void salvar(Pessoa pessoa);

	public void excluir(Pessoa pessoa);

	public Pessoa carregar(String codigo);

	public List<Pessoa> listar();
}
