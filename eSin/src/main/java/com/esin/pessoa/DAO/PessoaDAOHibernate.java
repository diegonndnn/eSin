package com.esin.pessoa.DAO;

import java.util.List;

import org.hibernate.Session;

import com.esin.pessoa.Pessoa;

public class PessoaDAOHibernate implements PessoaDAO{
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Pessoa pessoa) {
		this.session.merge(pessoa);

	}

	@Override
	public void excluir(Pessoa pessoa) {
		this.session.delete(pessoa);

	}

	@Override
	public Pessoa carregar(String codigo) {
		return (Pessoa) this.session.get(Pessoa.class, codigo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> listar() {
		return this.session.createCriteria(Pessoa.class).list();
	}
}
