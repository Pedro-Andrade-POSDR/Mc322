package lab10;

public class Veiculo {
	private String placa;
	private int ano;
	private boolean luxo;
	
	Motorista motorista;
	
	public Veiculo (String pla, int an, boolean lux, Motorista motor) {
		placa = pla;
		ano = an;
		luxo = lux;
		motorista = motor;
		motor.addVeiculo(this);
	}
	
	protected boolean getLuxo() {
		return luxo;
	}
	
	protected void imprimirDados() {
		System.out.println("Placa:" + placa);
		System.out.println("Ano:" + ano);
		if (luxo)
			System.out.println("Modelo luxo");
		else
			System.out.println("Modelo Comum");
	}
	

}
