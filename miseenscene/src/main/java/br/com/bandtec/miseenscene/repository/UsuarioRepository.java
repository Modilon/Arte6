package br.com.bandtec.miseenscene.repository;

import br.com.bandtec.miseenscene.model.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    public Usuario findUsuarioByLogin(String login);

    public Usuario findUsuarioByIdUsuario(Long idUsuario);

    public Boolean existsByLogin(String login);

    public Boolean existsByIdUsuario(Long idUsuario);

    public List<Usuario> findAllByOrderByIdUsuario();

    @Query(value = "select case WHEN (count(u.id) > 0) then 1 else 0 end  "
            + "from usuario u "
            + "where LOWER(u.login) = :login and (u.id != :id or :id is null) ",
            nativeQuery = true)
    public int verificarDuplicidade(@Param("login") String login, @Param("id") Long id);

}
