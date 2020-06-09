package lab06;
import java.util.ArrayList;

public class Musicfy {
	private ArrayList<Musica> musicas;
	private ArrayList<User> usuarios;
	
	public Musicfy() {
		musicas = new ArrayList<Musica>();
		usuarios = new ArrayList<User>();
	}
	
	public void Iniciar(User user) {
		System.out.println("Bem vinde, a MusicFy " + user.getNome());
		System.out.println("O que pretende fazer hoje?");
		System.out.println("---------------------------");
		System.out.println("[1] Tocar Aleatório");
		System.out.println("[2] Ir para as playlists");
		System.out.println("[3] Ir para usúarios");
		System.out.println("[4] Ir para informações do perfil");
	}
	
}
