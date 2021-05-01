package com.bolsadeideas.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		lista.add(new Usuario(1,"Nico","Pfleger"));
		lista.add(new Usuario(2,"Mati","Pfleger"));
		lista.add(new Usuario(3,"Tato","Pfleger"));
		lista.add(new Usuario(4,"Victor","Pfleger"));
		lista.add(new Usuario(5,"Otro Victor","Pfleger"));
		lista.add(new Usuario(6,"Nicolas","Pfleger"));
		lista.add(new Usuario(7,"Nicolas2","Pfleger"));
	}

	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for(Usuario u: this.lista) {
			if (u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		
		return resultado;
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		
		//CONVIERTO EL OBJ USUARIO EN OPCIONAL
		return Optional.ofNullable(usuario);
	}
	
	

}
