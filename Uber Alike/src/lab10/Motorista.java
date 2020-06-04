package lab10;
import java.util.ArrayList;

public class Motorista extends Usuario {
	private int cartao;
	private int carteira;
	private boolean disponivel;
	private ArrayList<Veiculo> veiculos;
	
	public Motorista(String a, int b, String c, int d, int e) {
		super(a,b,c);
		cartao = d;
		carteira = e;
		veiculos = new ArrayList<Veiculo>();
		disponivel = true;
	}
	
	protected void addVeiculo(Veiculo veic) {
		veiculos.add(veic);
	}
	
	protected Veiculo getVeiculo(int a) {
		return veiculos.get(a - 1);
	}
	
	protected void mudarDisponibilidade() {
		if (disponivel == true)
			disponivel = false;
		else
			disponivel = true;
	}
	
	protected boolean getDisponibilidade() {
		return disponivel;
	}
	
	protected void imprimirCarros() {
		int aux = 1;
		for(Veiculo veic : veiculos) {
			System.out.println("Veículo número " + aux +  ":");
			veic.imprimirDados();	
			aux += 1;
		}
	}

}
