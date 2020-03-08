package br.com.bandtec.miseenscene.service;

import br.com.bandtec.miseenscene.model.Usuario;

import java.util.List;

public interface UsuarioServiceInterface {

    public List<Usuario> listar();

    public Usuario salvar(Usuario usuario);

    public void remover(Usuario  usuario);

    public Usuario buscarPorId(Long idUsuario);

    public Usuario buscarPorLogin(String login);

    public Boolean existeByLogin(String login);

    public Boolean existeByIdUsuario(Long idUsuario);

    public Boolean verificarDuplicidade(String login, Long id);

}
