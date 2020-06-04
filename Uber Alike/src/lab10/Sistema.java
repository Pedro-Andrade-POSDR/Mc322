package lab10;

import java.util.Scanner;
import java.util.ArrayList;

public class Sistema {
	private ArrayList<Motorista> motoristas;
	private ArrayList<Passageiro> passageiros;
	
	public Sistema() {
		motoristas = new ArrayList<Motorista>();
		passageiros = new ArrayList<Passageiro>();
	}
	protected void addMotorista(Motorista motor) {
		motoristas.add(motor);
	}
	
	protected void addPassageiro(Passageiro pass) {
		passageiros.add(pass);
	}
	
	private Motorista AcharMotorista() {
		for (Motorista motor : motoristas) {
			if (motor.getDisponibilidade())
				motor.mudarDisponibilidade();
				return motor;
		}
		System.out.println("Não há motoristas disponíveis");
		return null;
	}
	
	private Passageiro AcharPassageiro(String nome) {
		for(Passageiro pass : passageiros) {
			if(pass.getNome().equals(nome))
				return pass;
		}
		return null;
	}
	
	
	
	public void fazerViagem(Passageiro pass) {
		System.out.println("Digite a distância em metros da viagem");
		
		Scanner keyboard = new Scanner(System.in);

		int distancia = keyboard.nextInt();
		
		Motorista motor = AcharMotorista();
		
		if(motor == null)
			return;
		
		System.out.println("Escolha o carro que será usado");
		
		motor.imprimirCarros();
		
		int carro = keyboard.nextInt();
		
		Viagem viagem = new Viagem(distancia, motor, carro);
		
		viagem.addPassageiro(pass);
		String command = keyboard.nextLine();
		
		while(true) {
			System.out.println("Mais alguém viajará com você? [y/n]");
		
			
			command = keyboard.nextLine();
		
			if(command.compareTo("n") == 0)
				break;
			
			System.out.println("Digite o nome de quem viajará com você");
			
			command = keyboard.nextLine();
			
			Passageiro convidado = AcharPassageiro(command);
			
			viagem.addPassageiro(convidado);
			
		}
		
		viagem.Confirmacao();
		
		System.out.println("Confirmar viagem [y/n]");
		
		command = keyboard.nextLine();
		
		if(command.compareTo("n") == 0) {
			System.out.println("Viagem cancelada");
			return;
		}
		
		while(true) {
			System.out.println("Adicionar parada? [y/n]");
			command = keyboard.nextLine();
			if(command.compareTo("n") == 0)
				break;
			System.out.println("Alguem sobe ou desce? [y/n]");
			command = keyboard.nextLine();
			if(command.compareTo("y") == 0) {
				System.out.println("Digite o nome de passageiro");
				command = keyboard.nextLine();
				Passageiro convidado = AcharPassageiro(command);
				
				if (convidado == null)
					System.out.println("Passageiro não encontrado");
				else {
					System.out.println("Passageiro sobe ou desce? [s/d]");
					command = keyboard.nextLine();
					if (command.compareTo("s") == 0)
						viagem.addParadas(convidado,true);
					else
						viagem.addParadas(convidado,false);
				}
			}
			else {
				viagem.addParadas();
			}
		}
		
		System.out.println("Viagem finalizada");
		
		System.out.println();
		
		viagem.Sumarry();
		
		viagem.liberarMotorista();
		
	}
	
	

}
