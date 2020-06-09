package lab06;

public class CanaldePodcast extends Item{
	private int numdeeps;
	
	public CanaldePodcast(String nome, int tempo, String autor, int numdeeps){
		super(nome, tempo, autor);
		this.numdeeps = numdeeps;
		
		setTamanho(numdeeps * tempo * 3);
		
	}
	
	@Override
	protected boolean confirmPodcast() {
		return true;
	}
	

}
