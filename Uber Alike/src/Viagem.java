import java.util.ArrayList;

public class Viagem {
	private float distancia;
	private Motorista motorista;
	private Veiculo veiculo;
	private ArrayList<Parada> paradas;
	
	private ArrayList<Passageiro> passageiros;
	
	public Viagem(float dist, Motorista motor, int a) {
		distancia = dist;
		motorista = motor;
		veiculo = motor.getVeiculo(a);
		paradas = new ArrayList<Parada>();
	}
	
	public void addPassageiro(Passageiro passageiro) {
		passageiros.add(passageiro);
	}
	
	public void addParadas() {
		Parada parada = new Parada();
		paradas.add(parada);
	}
	
	public void addParadas(Passageiro pass) {
		Parada desc = new Parada(pass);
		passageiros.add(pass);
		paradas.add(desc);
	}
	
	

}
