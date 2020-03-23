package br.com.bandtec.miseenscene.service;

import br.com.bandtec.miseenscene.model.Habilidade;
import br.com.bandtec.miseenscene.repository.HabilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HabilidadeService implements HabilidadeServiceInterface {

    @Autowired
    private HabilidadeRepository habilidadeRepository;


    @Override
    public List<Habilidade> listar() {
        return habilidadeRepository.findAll();
    }

    @Override
    public Habilidade salvar(Habilidade habilidade) {
        return habilidadeRepository.save(habilidade);
    }

    @Override
    public void remover(Habilidade habilidade) {
        habilidadeRepository.delete(habilidade);
    }

    @Override
    public Habilidade buscarPorId(Long idHabilidade) {
        return habilidadeRepository.findHabilidadeByIdHabilidade(idHabilidade);
    }

    @Override
    public Habilidade buscarPorNome(String nomeHabilidade) {
        return habilidadeRepository.findHabilidadeByNomeHabilidade(nomeHabilidade);
    }

    @Override
    public Boolean existeByHabilidade(String nomeHabilidade) {
        return habilidadeRepository.existsByNomeHabilidade(nomeHabilidade);
    }

    @Override
    public Boolean existeByIdHabilidade(Long idHabilidade) {
        return habilidadeRepository.existsByIdHabilidade(idHabilidade);
    }
}
