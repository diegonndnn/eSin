package com.esin.sindicato.DAO;

import java.util.List;

import com.esin.sindicato.Sindicato;

public interface SindicatoDAO {

	public void salvar(Sindicato sindicato);

	public void excluir(Sindicato sindicato);

	public Sindicato carregar(String codigo);

	public List<Sindicato> listar();

}
