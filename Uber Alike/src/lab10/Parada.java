package lab10;

public class Parada {
	private Passageiro descendo;
	private boolean sobe;
	
	public Parada() {
		descendo = null;
	}
	
	public Parada(Passageiro pass, boolean sobe) {
		descendo = pass;
		this.sobe = sobe;
	}
	
	protected Passageiro getPass() {
		return descendo;
	}
	
	protected boolean getSobe() {
		return sobe;
	}

}
