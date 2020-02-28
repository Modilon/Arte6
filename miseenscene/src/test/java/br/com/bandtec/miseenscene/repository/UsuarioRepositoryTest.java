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
        Assert.assertEquals(1, usuarioService.listar().size());
    }

    @Test
    public void listarUsuariosController(){
        List<Usuario> usuarioList = usuarioController.getUsuarios();
        Assert.assertEquals(1, usuarioList.size());
    }

}
