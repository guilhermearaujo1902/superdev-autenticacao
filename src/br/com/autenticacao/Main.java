package br.com.autenticacao;

import br.com.autenticacao.controller.UsuarioController;
import br.com.autenticacao.model.Usuario;

public class Main {

	public static void main(String[] args) {


		Usuario usuario = new Usuario();
		usuario.setNome("Guilherme 3");
		usuario.setEmail("guilherme3@proway.com");
		usuario.setSenha("12345");
		
		UsuarioController controller = new UsuarioController();
		controller.cadastrar(usuario);

	}

}
