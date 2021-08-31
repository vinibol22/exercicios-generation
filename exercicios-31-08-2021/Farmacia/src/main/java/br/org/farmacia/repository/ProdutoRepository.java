package br.org.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
}
