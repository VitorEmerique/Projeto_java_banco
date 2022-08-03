
public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	
	protected static int SEQUENCIAL = 0;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	
	
	public Conta(Cliente cliente) {
		this.agencia =AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0;
		this.cliente = cliente;
		
	}
	
	
	@Override
	public void sacar(double valor) {
		
		this.saldo = saldo-valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo+valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	
	
	


	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


	public Cliente getCliente() {
		return cliente;
	}

	

	
}
