package br.com.bandtec.miseenscene;

import br.com.bandtec.miseenscene.model.Categoria;
import br.com.bandtec.miseenscene.repository.UsuarioRepository;
import br.com.bandtec.miseenscene.service.UsuarioService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class MiseensceneApplicationTests {

	@Autowired
	private UsuarioService usuarioService;

	@Test
	public void modelCategoria(){
		Categoria categoria = new Categoria();
		categoria.setIdCategoria(Long.valueOf(1));
		categoria.setNome("Teste");
		Assert.assertEquals(Long.valueOf(1), categoria.getIdCategoria());
		Assert.assertEquals("Teste", categoria.getNome());
		Assert.assertEquals("Categoria{idCategoria=1, nome='Teste'}", categoria.toString());
		categoria = new Categoria();
		Assert.assertEquals(null, categoria.getNome());
	}


}
