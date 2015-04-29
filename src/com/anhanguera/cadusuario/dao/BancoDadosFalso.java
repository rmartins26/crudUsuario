package com.anhanguera.cadusuario.dao;

import java.util.HashMap;
import java.util.Map;

import com.anhanguera.cadusuario.bean.Usuario;

public class BancoDadosFalso {

	public static BancoDadosFalso bancoDadosFalso;
	private static Map<Integer, Usuario> baseDados = new HashMap<Integer, Usuario>();

	private BancoDadosFalso() {

	}

	public static BancoDadosFalso getInstance() {
		if (bancoDadosFalso == null)
			bancoDadosFalso = new BancoDadosFalso();

		return bancoDadosFalso;
	}

	public void inserir(int id, Usuario usuario) {
		baseDados.put(id, usuario);
	}

	public void atualizar(int id, Usuario usuario) {
		baseDados.put(id, usuario);

	}

	public void selecionar(Usuario usuario) {
		baseDados.containsValue(usuario);
	}

	public int retornarProxID() {
		return baseDados.size() + 1;
	}

}
