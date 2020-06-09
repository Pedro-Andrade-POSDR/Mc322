package lab06;
import java.util.ArrayList;
import java.util.Random;

public class Playlist {
	
	private ArrayList<Item> playlist;
	private String nome;
	private int tamanho;
	private boolean podcasts;
	private int tocando;
	
	public Playlist(String nome) {
		this.nome = nome;
		tamanho = 0;
		playlist = new ArrayList<Item>();
		tocando = 0;
	}
	
	protected void addItem(Item item) {
		playlist.add(item);
		tamanho = tamanho + item.getTamanho();
	}
	
	protected void remove(Item item) {
		playlist.add(item);
		tamanho = tamanho - item.getTamanho();
	}
	
	protected int getTamanho() {
		return tamanho;
	}
	
	protected boolean soPodcast() {
		for(int i = 0; i < playlist.size(); i++) {
			if(playlist.get(i).confirmPodcast() == false) {
				return false;
			}
		}
		return true;
	}
	
	protected Item menorDuracao() {
		Item menor = playlist.get(0);
		for (Item item : playlist) {
			if(item.getTempo() < menor.getTempo())
				menor = item;
		}
		System.out.println("A música de menor duração na playlist é:");
		menor.imprimirMusica();
		return menor;
	}
	
	protected Item maiorDuracao() {
		Item maior = playlist.get(0);
		for (Item item : playlist) {
			if(item.getTempo() > maior.getTempo())
				maior = item;
		}
		System.out.println("A música de maior duração na playlist é:");
		maior.imprimirMusica();
		return maior;
	}
	
	protected int duracao() {
		int total = 0;
		for (Item item : playlist) {
			total = total + item.getTempo();
		}
		System.out.println("Duração total da playlist: " + total);

		
		return total;
	}
	
	protected int duracao(boolean aux) {
		int total = 0;
		for (Item item : playlist) {
			total = total + item.getTempo();
		}
		
		return total;
	}
	
	protected int duracaoMedia(){
		int media = duracao(true);
		
		media = media/playlist.size();
		
		System.out.println("Duração media das músicas: " + media);

		return media;
	}
	
	protected void imprimirPlaylist() {
		System.out.println(nome);
		System.out.println(tamanho + " MB");
	}
	
	public void play() {
		System.out.println("Tocando agora: " + playlist.get(tocando).getNome());
		tocando += 1;
		if (tocando >= playlist.size()) {
			tocando = 0;
		}
	}
	
	public void play(boolean aleatorio) {
		int anterior = tocando;
		Random random = new Random();
		int indice = random.nextInt(playlist.size());
		while (indice == anterior - 1) {
			indice = random.nextInt(playlist.size());
		}
		System.out.println("Tocando agora: " + playlist.get(indice).getNome());
		tocando += indice;
		if (tocando >= playlist.size()) {
			tocando = 0;
		}
	}

}
