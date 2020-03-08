package br.com.bandtec.miseenscene.repository;

import br.com.bandtec.miseenscene.model.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

    public Categoria findCategoriaByIdCategoria(Long idCategoria);

    public Categoria findCategoriaByNome(String nomeCategoria);

    public Boolean existsByNome(String nomeCategoria);

    public List<Categoria> findAll();

}
