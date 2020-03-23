package br.com.bandtec.miseenscene.service;

import br.com.bandtec.miseenscene.model.HabilidadeUsuario;
import br.com.bandtec.miseenscene.model.Usuario;
import br.com.bandtec.miseenscene.repository.HabilidadeUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HabilidadeUsuarioService implements  HabilidadeUsuarioServiceInterface {

    @Autowired
    private HabilidadeUsuarioRepository habilidadeUsuarioRepository;

    @Override
    public List<HabilidadeUsuario> listar() {
        return (List<HabilidadeUsuario>) habilidadeUsuarioRepository.findAll();
    }

    @Override
    public HabilidadeUsuario salvar(HabilidadeUsuario habilidadeUsuario) {
        return habilidadeUsuarioRepository.save(habilidadeUsuario);
    }

    @Override
    public void remover(HabilidadeUsuario habilidadeUsuario) {
        habilidadeUsuarioRepository.delete(habilidadeUsuario);
    }

    @Override
    public HabilidadeUsuario buscarPorId(Long idHabilidadeUsuario) {
        return habilidadeUsuarioRepository.findById(idHabilidadeUsuario).orElse(null);
    }

    @Override
    public List<HabilidadeUsuario> listarHabilidadesPorUsuario(Usuario usuario) {
        return habilidadeUsuarioRepository.findByUsuario(usuario);
    }
}
