
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		//implicito -> super();não precisa colocar
		super(agencia, numero); //vai rodar o construtor da CONTA
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
		
	}

}
