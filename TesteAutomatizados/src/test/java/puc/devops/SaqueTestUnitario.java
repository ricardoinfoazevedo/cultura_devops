package puc.devops;

import org.junit.Test;

import junit.framework.Assert;

public class SaqueTestUnitario {
	
	@Test
	public void verificarSenhaValida() {
		Saque saque = new Saque();
		boolean senha = saque.validarSenha("12345");
		Assert.assertEquals(true, senha);
	}
	
	@Test
	public void verificarSenhaInvalida() {
		Saque saque = new Saque();
		boolean senha = saque.validarSenha("123456");
		Assert.assertEquals(false, senha);
	}
	
	
}