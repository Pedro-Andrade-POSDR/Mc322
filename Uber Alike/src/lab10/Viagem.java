package lab10;
import java.util.ArrayList;

public class Viagem {
	private float distancia;
	private Motorista motorista;
	private Veiculo veiculo;
	private ArrayList<Parada> paradas;
	private ArrayList<Passageiro> passageiros;
	private float preco;
	
	public Viagem(float dist, Motorista motor, int a) {
		distancia = dist;
		motorista = motor;
		veiculo = motor.getVeiculo(a);
		
		boolean aux = veiculo.getLuxo();
		int divid = (int)distancia/100;
		
		if(aux) {
			preco = divid * 3.5f + 7.0f;
		}
		else {
			preco = divid * 2.0f + 3.0f;
		}
		
		paradas = new ArrayList<Parada>();
		passageiros = new ArrayList<Passageiro>();
	}
	
	protected void addPassageiro(Passageiro passageiro) {
		passageiros.add(passageiro);
	}
	
	protected void addParadas() {
		Parada parada = new Parada();
		paradas.add(parada);
		if(veiculo.getLuxo())
			preco += 2.7f;
		else
			preco += 1.5f;
	}
	
	protected void addParadas(Passageiro pass, boolean sobe) {
		Parada desc = new Parada(pass, sobe);
		paradas.add(desc);
		if(veiculo.getLuxo())
			preco += 2.7f;
		else
			preco += 1.5f;
	}
	
	protected void liberarMotorista() {
		motorista.mudarDisponibilidade();
	}
	
	public void Confirmacao() {
		System.out.println("----------Resumo da viagem-----------");
		System.out.println();
		System.out.println();
		System.out.println("Motorista:" + motorista.getNome());
		veiculo.imprimirDados();
		System.out.println("Preço sem paradas R$ " + preco);
		System.out.println();
	}
	
	public void Sumarry() {
		System.out.printf("Passageiro(s): ");
		for (Passageiro i : passageiros){
			i.imprimirUser();
		}
		System.out.println();
		System.out.printf("Motorista: ");
		motorista.imprimirUser();
		System.out.println();
		System.out.println("Distância do percurso: " + distancia + "m");
		
		System.out.println("Houve " + paradas.size() + " paradas");
		
		int aux = 1;
		for(Parada parada : paradas) {
			if(parada.getPass() != null) {
				if(parada.getSobe())
					System.out.printf("Houve subida na " + aux+ "ª parada de ");
				else
					System.out.printf("Houve descida na " + aux+ "ª parada de ");
				parada.getPass().imprimirUser();
				System.out.println();
			}
			aux += 1;
		}
		
		System.out.println("Preço: R$" + preco);
		System.out.println();
		
	}
	
	

}
