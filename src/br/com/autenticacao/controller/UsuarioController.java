package br.com.autenticacao.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.autenticacao.DAO.GenericDAO;
import br.com.autenticacao.DAO.UsuarioDAOImpl;
import br.com.autenticacao.model.Usuario;

public class UsuarioController {
	
	public List<Usuario> listarTodos() {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			List<Usuario> lista = new ArrayList<Usuario>();

			for (Object object : dao.listarTodos()) {
				lista.add((Usuario) object);
			}

			return lista;

		} catch (Exception ex) {
			System.out.println("Problemas na Controller para listar Usuarios " + ex.getMessage());
			ex.printStackTrace();
			return null;
		}
	}
	
	public Usuario listarPorId(int id) {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			Usuario Usuario = (Usuario) dao.listarPorId(id);
			return Usuario;
		} catch (Exception e) {
			System.out.println("Problemas na Controller para listar Usuarios " + e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	public boolean cadastrar(Usuario Usuario) {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			dao.cadastrar(Usuario);
			System.out.println("Cadastrado!");
			return true;
		} catch (Exception e) {
			System.out.println("Problemas na Controller para cadastrar Usuario" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public boolean alterar(Usuario Usuario) {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			dao.alterar(Usuario);
			return true;
		} catch (Exception e) {
			System.out.println("Problemas na Controller para alterar Usuario" + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public void excluir(int id) {
		try {
			GenericDAO dao = new UsuarioDAOImpl();
			dao.excluir(id);
		} catch (Exception e) {
			System.out.println("Problemas na Controller para excluir Usuario" + e.getMessage());
			e.printStackTrace();
		}
	}

}
