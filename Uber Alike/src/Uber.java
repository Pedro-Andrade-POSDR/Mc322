
public class Uber {
	public static void main(String[] args) {
		Passageiro user1 = new Passageiro("Marcos", 145678798, "15/07/1998", 369874);
		Passageiro user2 = new Passageiro("João", 654673652, "03/01/2002", 785632);
		
		Motorista mot1 = new Motorista("Maria", 248679108, "12/02/1997", 483530 ,987654);
		
		Veiculo veic1 = new Veiculo("ABC-1234", 2009, true, mot1);
		Veiculo veic2 = new Veiculo("OOP-2020", 2013, false, mot1);
		
		Viagem viagem1 = user1.fazerViagem(mot1, 0.5f, 2);
		viagem1.addParadas();
		viagem1.addParadas();
		
		viagem1.Sumarry();
		
		Viagem viagem2 = user1.fazerViagem(mot1, 2, 1);
		
		viagem2.addParadas();
		viagem2.addParadas();
		viagem2.addParadas(user2);
		viagem2.addParadas();
		viagem2.addParadas();
		
		viagem2.Sumarry();
		
		Viagem viagem3 = user1.fazerViagem(mot1, 0.7f, 1);
		viagem3.addParadas();
		viagem3.addParadas();
		viagem3.addParadas();
		
		viagem3.Sumarry();
	}
	

}


//• Fa ̧ca uma viagem de Marcos com Maria, em seu carro de luxo, distˆancia
//de 500 metros, com duas paradas.
//• Fa ̧ca uma viagem de Marcos e Jo ̃ao com Maria, em seu carro comum,
//distˆancia de 2 km, com 5 paradas, em que Jo ̃ao terminar ́a sua viagem na
//terceira parada.
//• Fa ̧ca uma viagem de Jo ̃ao com Maria em seu carro de luxo, distˆancia de
//700m, 3 paradas.
//No final de cada viagem, imprima na tela um resumo (summary) de cada viagem.
//Com informa ̧c ̃oes como passageiro(s), motorista, distˆancia percorrida, paradas
//e pre ̧co final da viagem.