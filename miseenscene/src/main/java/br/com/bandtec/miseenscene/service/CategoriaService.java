package br.com.bandtec.miseenscene.service;

import br.com.bandtec.miseenscene.model.Categoria;
import br.com.bandtec.miseenscene.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriaService implements CategoriaServiceInterface {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void remover(Categoria categoria) {
        categoriaRepository.delete(categoria);
    }

    @Override
    public Categoria buscarPorId(Long idCategoria) {
        return categoriaRepository.findCategoriaByIdCategoria(idCategoria);
    }

    @Override
    public Categoria buscarPorNome(String nomeCategoria) {
        return categoriaRepository.findCategoriaByNome(nomeCategoria);
    }

    @Override
    public Boolean existeByCategoria(String nomeCategoria) {
        return categoriaRepository.existsByNome(nomeCategoria);
    }

    @Override
    public Boolean existeByIdCategoria(Long idCategoria) {
        return categoriaRepository.existsByIdCategoria(idCategoria);
    }
}
