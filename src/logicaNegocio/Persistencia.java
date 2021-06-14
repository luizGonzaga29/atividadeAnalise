package logicaNegocio;

import bancoDados.BooksBD;
import excecoes.LivrariaException;
import interfaceUsuario.BooksEntity;

public class Persistencia {

	private BooksBD book = new BooksBD();
	
	public void inserirLivro(BooksEntity be) {
		if(book.verificarSeExisteLivro(be.getId()) != null) {
			throw new LivrariaException("Livro já cadastrado!");
		}else {
			book.inserir(be);
		}
		
	}
}
