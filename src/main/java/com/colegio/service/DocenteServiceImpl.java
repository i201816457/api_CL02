package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Docente;
import com.colegio.repository.DocenteRepository;



@Service
public class DocenteServiceImpl {

	@Autowired
	private DocenteRepository repository;
	
	public Docente inserta(Docente obj) {
		return repository.save(obj);
	}


	public List<Docente> listaDocente() {
		return repository.findAll();
	}
	

	
}
