
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
	

}
