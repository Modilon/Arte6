package br.com.bandtec.FourArt.service;

import br.com.bandtec.FourArt.model.Usuario;

import java.util.List;


public class UsuarioService implements UsuarioServiceInterface {

    @Override
    public List<Usuario> listar() {
        return null;
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        return null;
    }

    @Override
    public void remover(Usuario usuario) {

    }

    @Override
    public Usuario buscarPorId(Long idUsuario) {
        return null;
    }

    @Override
    public Usuario buscarPorLogin(String login) {
        return null;
    }

    @Override
    public Boolean existeByLogin(String login) {
        return null;
    }

    @Override
    public Boolean verificarDuplicidade(String login, Long id) {
        return null;
    }
}
