package logicaNegocio;

import excecoes.LivrariaException;

public class ValidarCampos {

	public void validarPrecoLivro(double preco) {
		if(preco <= 0.0) {
			throw new LivrariaException("Pre�o deve ser um valor maior que zero!");
		}
	}
	
	public void validarQtdLivro(int qtd) {
		if(qtd <= 0) {
			throw new LivrariaException("Quantidade deve ser um valor maior que zero!");
		}
	}
}
