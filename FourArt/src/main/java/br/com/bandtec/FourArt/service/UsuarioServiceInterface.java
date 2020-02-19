package br.com.bandtec.FourArt.service;

import br.com.bandtec.FourArt.model.Usuario;

import java.util.List;

public interface UsuarioServiceInterface {

    public List<Usuario> listar();

    public Usuario salvar(Usuario usuario);

    public void remover(Usuario  usuario);

    public Usuario buscarPorId(Long idUsuario);

    public Usuario buscarPorLogin(String login);

    public Boolean existeByLogin(String login);

    public Boolean verificarDuplicidade(String login, Long id);

}
