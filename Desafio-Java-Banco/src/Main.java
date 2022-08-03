
public class Main {

	public static void main(String[] args) {
		Cliente vitor = new Cliente();
		Cliente joao = new Cliente();
		vitor.setNome("Vitor");
		joao.setNome("Joao");
		
		Conta conta1 = new ContaCorrente(vitor);
		Conta conta2 = new ContaPoupanca(joao);
		conta1.depositar(1000);
		conta1.transferir(432.50, conta2);
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
		
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
	}

}
