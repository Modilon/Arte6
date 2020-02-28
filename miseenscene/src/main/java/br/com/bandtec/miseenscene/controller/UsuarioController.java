package br.com.bandtec.miseenscene.controller;

import br.com.bandtec.miseenscene.model.Usuario;
import br.com.bandtec.miseenscene.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsuarios(){
        return usuarioService.listar();
    }

    @PostMapping("/add/{email}/{login}/{senha}")
    public Boolean salvarUsuario(@PathVariable("email") String email,
                                 @PathVariable("login") String login,
                                 @PathVariable("senha") String senha){
        Usuario usuario = new Usuario(email, login, senha);
        try{
            usuarioService.salvar(usuario);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @DeleteMapping("/excluir/{login}")

}
