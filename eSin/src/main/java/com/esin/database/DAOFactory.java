package com.esin.database;

import com.esin.pessoa.DAO.PessoaDAO;
import com.esin.pessoa.DAO.PessoaDAOHibernate;
import com.esin.sindicato.DAO.SindicatoDAO;
import com.esin.sindicato.DAO.SindicatoDAOHibernate;

public class DAOFactory {

	public static SindicatoDAO criarSindicatoDAO() {
		SindicatoDAOHibernate sindicatoDAO = new SindicatoDAOHibernate();
		sindicatoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return sindicatoDAO;
	}
	
	public static PessoaDAO criarPessoaDAO() {
		PessoaDAOHibernate pessoaDAO = new PessoaDAOHibernate();
		pessoaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return pessoaDAO;
	}

}
