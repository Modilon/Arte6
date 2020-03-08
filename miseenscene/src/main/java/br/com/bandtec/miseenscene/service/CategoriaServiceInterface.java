package br.com.bandtec.miseenscene.service;

import br.com.bandtec.miseenscene.model.Categoria;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface CategoriaServiceInterface {

    public List<Categoria> listar();

    public Categoria salvar(Categoria categoria);

    public void remover(Categoria categoria);

    public Categoria buscarPorId(Long idCategoria);

    public Categoria buscarPorNome(String nomeCategoria);

    public Boolean existeByCategoria(String nomeCategoria);

    public Boolean existeByIdCategoria(Long idCategoria);

}
