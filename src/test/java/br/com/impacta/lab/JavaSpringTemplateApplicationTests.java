package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;

public class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHavePFWithInterfacePessoa() {
		
		Pessoa pf = new PessoaFisica("45875412575", "PF");		
		
		assertEquals("PF", pf.getTipo());
		
	}
	
	@Test
	public void shouldHavePJWithInterfacePessoa() {
		
		Pessoa pf = new PessoaJuridica("33293439000109", "PJ");	
		
		assertEquals("PJ", pf.getTipo());
		
	}
	
}
