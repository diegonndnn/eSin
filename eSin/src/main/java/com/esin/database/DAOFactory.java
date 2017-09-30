package com.esin.database;

import com.esin.sindicato.DAO.SindicatoDAO;
import com.esin.sindicato.DAO.SindicatoDAOHibernate;

public class DAOFactory {

	public static SindicatoDAO criarSindicatoDAO() {
		SindicatoDAOHibernate sindicatoDAO = new SindicatoDAOHibernate();
		sindicatoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return sindicatoDAO;
	}

}
