package br.com.bandtec.miseenscene.repository;

import br.com.bandtec.miseenscene.model.HabilidadeUsuario;
import br.com.bandtec.miseenscene.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HabilidadeUsuarioRepository extends CrudRepository<HabilidadeUsuario, Long> {

    public List<HabilidadeUsuario> findByUsuario(Usuario usuario);

}
