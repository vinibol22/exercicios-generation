package br.org.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long>{

	public List <Categoria> findAllByCategoriaContainingIgnoreCase
	(String categoria);
	
}
