package com.esin.util;

import com.esin.sindicato.SindicatoDAO;
import com.esin.sindicato.SindicatoDAOHibernate;

public class DAOFactory {

	public static SindicatoDAO criarSindicatoDAO() {
		SindicatoDAOHibernate sindicatoDAO = new SindicatoDAOHibernate();
		sindicatoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return sindicatoDAO;
	}

}
