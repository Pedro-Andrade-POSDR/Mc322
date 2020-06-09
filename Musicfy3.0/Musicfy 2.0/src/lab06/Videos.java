package lab06;

public class Videos extends Item{
	private int pixel;
	private int fps;
	
	public Videos(String nome, int tempo, String autor, int pixel, int fps) {
		super(nome, tempo, autor);
		this.pixel = pixel;
		this.fps = fps;
		
		int tam = (5 * tempo) + (fps * pixel * tempo);
		
		setTamanho(tam);
	}
	
}
