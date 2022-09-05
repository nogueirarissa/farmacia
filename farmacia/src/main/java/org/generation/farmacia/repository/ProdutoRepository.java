package org.generation.farmacia.repository;

import java.util.List;

import org.generation.farmacia.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
	
	public List<Produto>findAllByNome_ProdutoContainingIgnoreCase(@Param("produto") String produto);

}
