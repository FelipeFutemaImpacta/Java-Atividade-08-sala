package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;

class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHavePFWithInterfacePessoa() {
		
		Pessoa pf = new PessoaFisica();
		pf.setDocumento("45875412575");
		pf.setTipo("PF");
		
		
		assertEquals("PF", pf.getTipo());
		
	}
	
	@Test
	public void shouldHavePJWithInterfacePessoa() {
		
		Pessoa pf = new PessoaJuridica();
		pf.setDocumento("33293439000109");
		pf.setTipo("PJ");
		
		
		assertEquals("PJ", pf.getTipo());
		
	}
	
}
