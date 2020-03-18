package br.com.bandtec.miseenscene.repository;

import br.com.bandtec.miseenscene.controller.UsuarioController;
import br.com.bandtec.miseenscene.model.Usuario;
import br.com.bandtec.miseenscene.service.UsuarioService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UsuarioRepositoryTest {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioController usuarioController;

    @Test
    public void listarTodosOsUsuarios(){
        try {
            Assert.assertEquals(5, usuarioService.listar().size());
        }catch (Exception e){
            System.out.println(e);
            Assert.fail();
        }
    }

    @Test
    public void listarUsuariosController(){
        List<Usuario> usuarioList = usuarioController.getUsuarios();
        try{
            Assert.assertEquals(5, usuarioList.size());
        }catch (Exception e){
            System.out.println(e);
            Assert.fail();
        }
    }

    @Test
    public void usuarioExistePeloLogin(){
        try{
            Assert.assertEquals(true, usuarioService.existeByLogin("eduardo"));
        }catch (Exception e){
            System.out.println(e);
            Assert.fail();
        }
    }

    @Test
    public void usuarioExistePeloId(){
        try{
            Assert.assertEquals(true, usuarioService.existeByIdUsuario(Long.valueOf(1)));
        }catch (Exception e){
            System.out.println(e);
            Assert.fail();
        }
    }

    @Test
    public void encontrarUsuarioPeloLogin(){
        Usuario usuarioReq = new Usuario("edu@gmail.com","eduardo","1234", null, null);
        try{
            if(usuarioService.existeByLogin(usuarioReq.getLogin())){
                Usuario usuarioResponse = usuarioService.buscarPorLogin(usuarioReq.getLogin());
                Assert.assertEquals(usuarioReq.getEmail(), usuarioResponse.getEmail());
                Assert.assertEquals(usuarioReq.getLogin(), usuarioResponse.getLogin());
                Assert.assertEquals(usuarioReq.getSenha(), usuarioResponse.getSenha());
            }else{
                Assert.fail();
            }
        }catch (Exception e){
            System.out.println(e);
            Assert.fail();
        }
    }

    @Test
    public void encontrarUsuarioPeloId(){
        Usuario usuarioReq = new Usuario();
        usuarioReq.setIdUsuario(Long.valueOf(1));
        usuarioReq.setEmail("edu@gmail.com");
        usuarioReq.setLogin("eduardo");
        usuarioReq.setSenha("1234");
        usuarioReq.setDataNasc(null);
        usuarioReq.getDataNasc();
        usuarioReq = new Usuario(Long.valueOf(1), "edu@gmail.com", "eduardo", "1234", null, null);
        usuarioReq.toString();

        try{
            if(usuarioService.existeByIdUsuario(usuarioReq.getIdUsuario())){
                Usuario usuarioResponse = usuarioService.buscarPorId(usuarioReq.getIdUsuario());
                Assert.assertEquals(true, usuarioReq.equals(usuarioResponse));
                Assert.assertEquals(usuarioReq.getIdUsuario(), usuarioResponse.getIdUsuario());
                Assert.assertEquals(usuarioReq.getEmail(), usuarioResponse.getEmail());
                Assert.assertEquals(usuarioReq.getLogin(), usuarioResponse.getLogin());
                Assert.assertEquals(usuarioReq.getSenha(), usuarioResponse.getSenha());
            }else{
                Assert.fail();
            }
        }catch (Exception e){
            System.out.println(e);
            Assert.fail();
        }
    }



}

