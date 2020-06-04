package lab10;

public class Main {
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		
		Passageiro user1 = new Passageiro("Marcos", 145678798, "15/07/1998", 369874);
		Passageiro user2 = new Passageiro("João", 654673652, "03/01/2002", 785632);
		
		Motorista mot1 = new Motorista("Maria", 248679108, "12/02/1997", 483530 ,987654);
		
		Veiculo veic1 = new Veiculo("ABC-1234", 2009, true, mot1);
		Veiculo veic2 = new Veiculo("OOP-2020", 2013, false, mot1);
		
		sistema.addMotorista(mot1);
		sistema.addPassageiro(user1);
		sistema.addPassageiro(user2);
		
		sistema.fazerViagem(user1);
		sistema.fazerViagem(user1);
		
		sistema.fazerViagem(user2);
		
		
	}
	

}
