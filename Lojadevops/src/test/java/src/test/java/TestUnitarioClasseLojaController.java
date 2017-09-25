package src.test.java;




import org.junit.*;

import br.com.indra.jovemprofissional.LojaController;



public class TestUnitarioClasseLojaController{
	
	@Test
	public void nuloValida(){	
		LojaController testeLoja = new LojaController();
		Boolean retorno = testeLoja.valida("");
		Assert.assertEquals(false, retorno);
	}

	@Test
	public void naoNuloValida(){	
		LojaController testeLoja = new LojaController();
		Boolean retorno = testeLoja.valida("admin");
		Assert.assertEquals(true, retorno);
	}
}