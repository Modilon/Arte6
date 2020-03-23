package br.com.bandtec.miseenscene.service;

import br.com.bandtec.miseenscene.model.HabilidadeUsuario;
import br.com.bandtec.miseenscene.model.Usuario;

import java.util.List;

public interface HabilidadeUsuarioServiceInterface {

    public List<HabilidadeUsuario> listar();

    public HabilidadeUsuario salvar(HabilidadeUsuario habilidadeUsuario);

    public void remover(HabilidadeUsuario habilidadeUsuario);

    public HabilidadeUsuario buscarPorId(Long idObjeto);

    public List<HabilidadeUsuario> listarHabilidadesPorUsuario(Usuario usuario);

}
