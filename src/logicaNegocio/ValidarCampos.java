package logicaNegocio;

import excecoes.LivrariaException;

public class ValidarCampos {

	public void validarPrecoLivro(double preco) {
		if(preco <= 0.0) {
			throw new LivrariaException("Preço deve ser um valor maior que zero!");
		}
	}
	
	public void validarQtdLivro(int qtd) {
		if(qtd < 0) {
			throw new LivrariaException("Quantidade deve ser um valor maior que zero!");
		}
	}
	public void validarAutorTitulo(String autor, String titulo) {
		if(autor.equals("") || titulo.equals("")) {
			throw new LivrariaException("Livro deve conter autor e título!");
		}
	}
}
