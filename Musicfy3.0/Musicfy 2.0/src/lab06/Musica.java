package lab06;

public class Musica extends Item{
	
	public Musica(String nome, int tempo, String autor) {
		super(nome,tempo,autor);
		int tamanho = 5 * tempo;
		super.setTamanho(tamanho);
	}
	
	
}
