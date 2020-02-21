package br.com.bandtec.FourArt;

import br.com.bandtec.FourArt.model.Categoria;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/applicationContext.xml"})
class FourArtApplicationTests {

	@Test
	public void modelCategoria(){
		Categoria categoria = new Categoria(1, "Teste");
		categoria.setIdCategoria(1);
		categoria.setNome("Teste");
		Assert.assertEquals(1, categoria.getIdCategoria());
		Assert.assertEquals("Teste", categoria.getNome());
		Assert.assertEquals("Categoria{idCategoria=1, nome='Teste'}", categoria.toString());
		categoria = new Categoria();
		Assert.assertEquals(null, categoria.getNome());
	}

}
