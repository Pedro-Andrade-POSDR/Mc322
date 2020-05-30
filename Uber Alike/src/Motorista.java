import java.util.ArrayList;

public class Motorista extends Usuario {
	private int cartao;
	private int carteira;
	private ArrayList<Veiculo> veiculos;
	
	public Motorista(String a, int b, String c, int d, int e) {
		super(a,b,c);
		cartao = d;
		carteira = e;
		veiculos = new ArrayList<Veiculo>();
	}
	
	protected void addVeiculo(Veiculo veic) {
		veiculos.add(veic);
	}
	
	protected Veiculo getVeiculo(int a) {
		return veiculos.get(a - 1);
	}

}
