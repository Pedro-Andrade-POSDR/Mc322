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
		passageiros = new ArrayList<Passageiro>();
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
		addPassageiro(pass);
		paradas.add(desc);
	}
	
	public void Sumarry() {
		System.out.printf("Passageiro(s):");
		for (Passageiro i : passageiros){
			i.imprimirUser();
		}
		System.out.println();
		System.out.printf("Motorista: ");
		motorista.imprimirUser();
		System.out.println();
		System.out.printf("Distância do percurso: " + distancia + " Km");
		
		System.out.println("Houve " + paradas.size() + " paradas");
		
	}
	
	

}
