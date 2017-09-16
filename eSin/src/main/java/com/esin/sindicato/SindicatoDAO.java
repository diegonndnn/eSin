package com.esin.sindicato;

import java.util.List;

public interface SindicatoDAO {

	public void salvar(Sindicato sindicato);

	public void excluir(Sindicato sindicato);

	public Sindicato carregar(String codigo);

	public List<Sindicato> listar();

}
