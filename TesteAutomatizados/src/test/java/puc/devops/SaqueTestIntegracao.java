package puc.devops;

import org.junit.Test;

import junit.framework.Assert;

public class SaqueTestIntegracao {
	
	@Test
	public void verificarAtualizacaoSaldoValida() {
		Saque saque = new Saque();
		
		int novoSaldo = saque.debitarValor(50);
		boolean atualizou = saque.atualizarSaldo(novoSaldo);
		
		Assert.assertEquals(true, atualizou);
	}
	
	@Test
	public void verificarAtualizacaoSaldoInValida() {
		Saque saque = new Saque();
		
		int novoSaldo = saque.debitarValor(50);
		novoSaldo = novoSaldo + 200;
		boolean atualizou = saque.atualizarSaldo(novoSaldo);
		
		Assert.assertEquals(false, atualizou);
	}
	
	
}