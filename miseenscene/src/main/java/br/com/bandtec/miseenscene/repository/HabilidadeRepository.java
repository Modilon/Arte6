package br.com.bandtec.miseenscene.repository;

import br.com.bandtec.miseenscene.model.Habilidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabilidadeRepository extends CrudRepository<Habilidade, Long> {

    public Habilidade findHabilidadeByIdHabilidade(Long idHabilidade);

    public Habilidade findHabilidadeByNomeHabilidade(String nomeHabilidade);

    public Boolean existsByIdHabilidade(Long idHabilidade);

    public Boolean existsByNomeHabilidade(String nomeHabilidade);

    public List<Habilidade> findAll();

}
