package br.com.bandtec.miseenscene.controller;

import br.com.bandtec.miseenscene.model.HabilidadeUsuario;
import br.com.bandtec.miseenscene.model.Usuario;
import br.com.bandtec.miseenscene.service.HabilidadeUsuarioService;
import br.com.bandtec.miseenscene.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/habilidades/usuario")
public class HabilidadeUsuarioController {

    @Autowired
    private HabilidadeUsuarioService habilidadeUsuarioService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{idUsuario}")
    public List<HabilidadeUsuario> buscarHabilidadesDoUsuario(@PathVariable("idUsuario") Long idUsuario){
        Usuario usuario = usuarioService.buscarPorId(idUsuario);
        return habilidadeUsuarioService.listarHabilidadesPorUsuario(usuario);
    }

}
