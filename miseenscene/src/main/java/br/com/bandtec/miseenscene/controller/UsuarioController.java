package br.com.bandtec.miseenscene.controller;

import br.com.bandtec.miseenscene.model.Usuario;
import br.com.bandtec.miseenscene.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    boolean logado = false;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsuarios(){
        return usuarioService.listar();
    }

    @PostMapping("/logar/{login}/{senha}")
    public String logar(@PathVariable("login") String login,
                         @PathVariable("senha") String senha){
        if(usuarioService.existeByLogin(login)){
            Usuario usuario = usuarioService.buscarPorLogin(login);
            if(usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)){
                logado = true;
                return "Login realizado com sucesso, seja bem-vindo: " + login;
            }else{
                return "Login ou senha invalidos";
            }
        }else{
            return "Usuário não cadastrado";
        }
    }

    @PostMapping("/logoff")
    public String logoff(){
        if(logado){
            logado = false;
            return "Logoff realizado com sucesso";
        }else{
            return "Erro ao realizar logoff";
        }
    }

    @PostMapping("/add/{email}/{login}/{senha}")
    public String salvarUsuario(@PathVariable("email") String email,
                                 @PathVariable("login") String login,
                                 @PathVariable("senha") String senha){
        Usuario usuario = new Usuario(email, login, senha);
        try{
            if(usuarioService.existeByLogin(usuario.getLogin())){
                return "Login já cadastrado!";
            }else {
                usuarioService.salvar(usuario);
                return "Cadastro realizado com sucesso!";
            }
        }catch (Exception e){
            return "Erro ao cadastrar";
        }
    }

    @GetMapping("/buscar/{login}")
    public Usuario buscarUsuarioPorLogin(@PathVariable("login") String login){
        return usuarioService.buscarPorLogin(login);
    }

    @DeleteMapping("/excluir/{login}")
    public Boolean removerUsuario(@PathVariable("login") String login){
        try {
            Usuario usuario = usuarioService.buscarPorLogin(login);
            usuarioService.remover(usuario);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
}
