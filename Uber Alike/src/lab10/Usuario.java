package lab10;

public abstract class Usuario {
	private String nome;
	private int cpf;
	private String nascimento;
	
	public Usuario (String a, int b, String c) {
		nome = a;
		cpf = b;
		nascimento = c;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void imprimirUser() {
		System.out.printf(nome + " ");
	}

}
