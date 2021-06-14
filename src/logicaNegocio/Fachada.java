package logicaNegocio;

import interfaceUsuario.BooksEntity;

public class Fachada {

	private ValidarCampos vc = new ValidarCampos();
	private Persistencia persistencia = new Persistencia();
	
	public void inserirLivro(BooksEntity be) {
		vc.validarPrecoLivro(be.getPrice());
		vc.validarQtdLivro(be.getQty());
		vc.validarAutorTitulo(be.getAuthor(), be.getTitle());
		persistencia.inserirLivro(be);
	}
}
