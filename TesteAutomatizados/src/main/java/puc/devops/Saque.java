package puc.devops;

public class Saque {
	
	private String senhaValida = "12345";
	private int valdorSaldoConta = 100;
	
	public boolean validarSenha(String senha) {
		if(senha.equals(this.senhaValida))
			return true;
		return false;
	}
	
	public boolean validarSaldo(int valorSaque) {
		if(valorSaque <= this.valdorSaldoConta)
			return true;
		return false;
	}
	
	public int debitarValor(int valorSaque) {
		return this.valdorSaldoConta - valorSaque;
	}
	
	public boolean atualizarSaldo(int novoSaldo) {
		
		if(novoSaldo > this.valdorSaldoConta)
			return false;
		
		this.valdorSaldoConta = novoSaldo;
		return true;
	}
	
	public void sacarDinheiro(String senha, int valorSaque) throws Exception {
		
		if(!this.validarSenha(senha))
			throw new Exception("Senha inválida");
		
		if(!this.validarSaldo(valorSaque))
			throw new Exception("Valor do saque maior do que saldo em conta");
		
		int novoSaldo = this.debitarValor(valorSaque);
		this.atualizarSaldo(novoSaldo);
		
	}

	public String getSenhaValida() {
		return senhaValida;
	}

	public void setSenhaValida(String senhaValida) {
		this.senhaValida = senhaValida;
	}

	public int getValdorSaldoConta() {
		return valdorSaldoConta;
	}

	public void setValdorSaldoConta(int valdorSaldoConta) {
		this.valdorSaldoConta = valdorSaldoConta;
	}
}