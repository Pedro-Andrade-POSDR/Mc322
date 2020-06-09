package lab06;
import java.util.ArrayList;

public class Album extends Item {
	private ArrayList<Musica> musicas;
	
	public Album (String nome) {
		super(nome, 0, "Sem artista");
		musicas = new ArrayList<Musica>();
	}
	
	protected void adicionarMusica(Musica musica) {
		musicas.add(musica);
		
		int tamanho = musica.getTamanho() + getTamanho();
		setTamanho(tamanho);
		
		int tempo = musica.getTempo() + getTempo();
		setTempo(tempo);
		
		if(getAutor() == "Sem artista") {
			setAutor(musica.getAutor());
		}
		
		else if (getAutor() != musica.getAutor()) {
			setAutor("Artistas Variados");
		}
	}
	private boolean umArtista() {
		boolean aux = true;
		String autor = musicas.get(0).getAutor();
		
		for (Musica musica : musicas) {
			if (musica.getAutor() != autor) {
				aux = false;
				break;
			}
		}
		
		return aux;
	}
	protected void removeMusica(Musica musica) {
		boolean isIn = musicas.remove(musica);
		
		if(isIn) {
			int tamanho = getTamanho() - musica.getTamanho() ;
			setTamanho(tamanho);
		
			int tempo = getTempo() - musica.getTempo();
			setTempo(tempo);
			}
		
	
		if (umArtista() == true && getAutor() == "Artistas Variados") {
			setAutor(musicas.get(0).getAutor());
			
		}
	}

}
