package com.colegio.service;

import java.util.List;

import com.colegio.entity.Docente;


public interface DocenteService {

	public abstract Docente inserta(Docente obj);
	public abstract List<Docente> listaDocente();
	
}
