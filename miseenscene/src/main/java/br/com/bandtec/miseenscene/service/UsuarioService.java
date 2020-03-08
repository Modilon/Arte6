package br.com.bandtec.miseenscene.service;

import br.com.bandtec.miseenscene.model.Usuario;
import br.com.bandtec.miseenscene.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioService implements UsuarioServiceInterface {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listar() {
        return usuarioRepository.findAllByOrderByIdUsuario();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void remover(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    @Override
    public Usuario buscarPorId(Long idUsuario) {
        return usuarioRepository.findUsuarioByIdUsuario(idUsuario);
    }

    @Override
    public Usuario buscarPorLogin(String login) {
        return usuarioRepository.findUsuarioByLogin(login);
    }

    @Override
    public Boolean existeByLogin(String login) {
        return usuarioRepository.existsByLogin(login);
    }

    @Override
    public Boolean existeByIdUsuario(Long idUsuario) {
        return usuarioRepository.existsByIdUsuario(idUsuario);
    }

    @Override
    public Boolean verificarDuplicidade(String login, Long id) {
        return null;
    }

}
