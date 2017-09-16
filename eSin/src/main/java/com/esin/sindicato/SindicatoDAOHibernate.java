package com.esin.sindicato;

import java.util.List;

import org.hibernate.Session;

public class SindicatoDAOHibernate implements SindicatoDAO {

	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Sindicato sindicato) {
		this.session.merge(sindicato);

	}

	@Override
	public void excluir(Sindicato sindicato) {
		this.session.delete(sindicato);

	}

	@Override
	public Sindicato carregar(String codigo) {
		return (Sindicato) this.session.get(Sindicato.class, codigo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Sindicato> listar() {
		return this.session.createCriteria(Sindicato.class).list();
	}

}
	