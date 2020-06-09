package lab06;
import java.util.ArrayList;

public class User {
	private String nome;
	private String cpf;
	private String nascimento;
	private String genero;
	private boolean assinante;
	private int armazenamentoTotal;
	private int armazenamento;
	
	private ArrayList<Playlist> playlists;
	
	public User (String nome, String cpf, String nascimento, String genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.genero = genero;
		assinante = false;
		armazenamentoTotal = 90;
		armazenamento = 0;
		
		this.playlists = new ArrayList<Playlist>();
	}
	
	protected void changeAssinatura() {
		if (assinante == true ) {
			assinante = false;
			armazenamentoTotal = 90;
		}
		
		else {
			assinante = true;
			armazenamentoTotal = 900;
		}
	}
	
	protected void addPlaylist(Playlist playlist) {
		if(playlist.getTamanho() + armazenamento <= armazenamentoTotal || playlist.soPodcast() == true) {
			playlists.add(playlist);
			if(playlist.soPodcast() != true)
				armazenamento = armazenamento + playlist.getTamanho();
		}
		else {
			System.out.println("Usuário não possui memória suficiente");
		}
	}
	protected void removePlaylist(int aux) {
		if(aux <= playlists.size()) {
			Playlist playlist = acessarPlaylist(aux-1);
			playlists.remove(playlist);
		}
		else {
			System.out.println("Não há playlist com esse número");
		}
	}
	
	private ArrayList<Playlist> getPlaylist() {
		return playlists;
	}
	
	protected void imprimirPlaylists() {
		int aux = 1;
		for (Playlist atual : playlists) {
			System.out.println("Playlist " + aux);
			atual.imprimirPlaylist();
			aux += 1;
		}
		System.out.println();
	}
	
	protected Playlist acessarPlaylist(int indice) {
		return getPlaylist().get(indice - 1);
	}
	
	protected void importarPlaylist(User user, int aux) {
		Playlist playlist = user.acessarPlaylist(aux);
		addPlaylist(playlist);	
	
	}
}
