
public class Passageiro extends Usuario{
	private int cartao;
	
	public Passageiro(String a, int b, String c, int d) {
		super(a,b,c);
		cartao = d;
	}
	
	public Viagem fazerViagem(Motorista motor, float distancia, int index) {
		Viagem viagem = new Viagem(distancia, motor, index);
		viagem.addPassageiro(this);
		return viagem;
	}

}
