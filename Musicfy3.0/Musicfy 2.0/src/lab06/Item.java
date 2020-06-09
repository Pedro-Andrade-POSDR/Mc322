package lab06;

public class Item {
	private String nome;
	private int tempo;
	private String autor;
	private int tamanho;
	
	public Item(String nome, int tempo, String autor) {
		this.nome = nome;
		this.tempo = tempo;
		this.autor = autor;
	}
	
	protected void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	protected int getTamanho() {
		return tamanho;
	}
	
	protected void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	protected int getTempo() {
		return tempo;
	}
	
	protected String getAutor() {
		return autor;
	}
	
	protected void setAutor(String autor) {
		this.autor = autor;
	}
	
	protected boolean confirmPodcast() {
		return false;
	}
	
	protected String getNome() {
		return nome;
	}
	
	protected void imprimirMusica() {
		System.out.println(nome);
		System.out.println(autor);
		System.out.println(tamanho + " MB");
	}
	

}
