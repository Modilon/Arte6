package br.com.bandtec.miseenscene.service;

import br.com.bandtec.miseenscene.model.Categoria;
import br.com.bandtec.miseenscene.model.Habilidade;

import java.util.List;

public interface HabilidadeServiceInterface {

    public List<Habilidade> listar();

    public Habilidade salvar(Habilidade habilidade);

    public void remover(Habilidade habilidade);

    public Habilidade buscarPorId(Long idHabilidade);

    public Habilidade buscarPorNome(String nomeHabilidade);

    public Boolean existeByHabilidade(String nomeHabilidade);

    public Boolean existeByIdHabilidade(Long idHabilidade);

}
