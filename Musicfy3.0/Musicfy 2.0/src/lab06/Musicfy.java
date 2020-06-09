package lab06;

public class Musicfy {
	public static void main(String[] args) {
		User user1 = new User("Pedro", "309-475-994-74", "08/02/2001", "homem");
		User user2 = new User("Deise", "111-111-111-11", "24/05/1999", "mulher");
			
		user1.changeAssinatura();
		
		//Aqui temos a criação de músicas para demonstração
		Musica song1 = new Musica("Welcome to the Black Parade", 2, "My Chemical Romance");
		Musica song2 = new Musica("Welcome to my life", 2, "Simple Plan");
		Musica song3 = new Musica("Rajadão", 2, "Pablo Vittar");
		Musica song4 = new Musica("Combatchy", 8, "Anitta");
		Musica song5 = new Musica("Bad Romance", 2, "Lady Gaga");
		Musica song15 = new Musica("Alejandre", 3, "Lady Gaga");
		Musica song11 = new Musica("Monster", 1, "Lady Gaga");
		Musica song12 = new Musica("Speechlees", 3, "Lady Gaga");
		Musica song13 = new Musica("Dance in the Dark", 7, "Lady Gaga");
		Musica song14 = new Musica("Telephone", 8, "Lady Gaga");
		Musica song6 = new Musica("The Dog Days are Over", 1, "Florence and the machine");
		Musica song7 = new Musica("Umbrella", 9, "Rihanna");
		Musica song8 = new Musica("Listen to your Friends", 2, "Declan Mckenna");
		Musica song9 = new Musica("Humongous", 2, "Declan Mckenna");
		Musica song10 = new Musica("The Kids Don't Wanna Come Home", 6, "Declan Mckenna");
		Musica song16 = new Musica("Brazil", 6, "Declan Mckenna");
		Musica song17 = new Musica("Mind", 2, "Declan Mckenna");
		Musica song18 = new Musica("Make me your queen", 4, "Declan Mckenna");
		Musica song19 = new Musica("Isombard", 6, "Declan Mckenna");
		
		
		Videos video1 = new Videos("Bacurau clipe", 8, "Kleber Mendonça", 5, 2);
		Videos video2 = new Videos("S&M", 2, "Rihanna", 5, 2);
		Videos video3 = new Videos("Dead", 1, "My Chemical Romance", 5, 2);
		Videos video4 = new Videos("Parabéns", 1, "Pablo Vittar", 5, 2);
		
		Album album1 = new Album("Fame Monster");
		Album album2 = new Album("What do you think about the car");
		
		album1.adicionarMusica(song5);
		album1.adicionarMusica(song15);
		album1.adicionarMusica(song11);
		album1.adicionarMusica(song12);
		album1.adicionarMusica(song13);
		album1.adicionarMusica(song14);	
		album2.adicionarMusica(song8);
		album2.adicionarMusica(song9);
		album2.adicionarMusica(song10);
		album2.adicionarMusica(song16);
		album2.adicionarMusica(song17);
		album2.adicionarMusica(song18);
		album2.adicionarMusica(song19);
		
		CanaldePodcast podcast1 = new CanaldePodcast("Anticast", 3, "Ivan", 3);
		CanaldePodcast podcast2 = new CanaldePodcast("Revolushow", 3, "Jones", 1);
		CanaldePodcast podcast3 = new CanaldePodcast("Fogo no Parquin", 3, "Sabrina", 3);
		
		Playlist playlist1 = new Playlist("Músicas para dançar");
		Playlist playlist2 = new Playlist("Antissistêmicas");
		Playlist playlist3 = new Playlist("Rock");
		Playlist playlist4 = new Playlist("Sopodcast");
		
		//Agora vamos adicionar os itens nas playlists
		playlist1.addItem(song3);
		playlist1.addItem(song4);
		playlist1.addItem(album1);
		playlist1.addItem(song6);
		playlist1.addItem(song7);
		playlist1.addItem(video2);
		playlist1.addItem(video4);
		
		playlist2.addItem(album2);
		playlist2.addItem(podcast1);
		playlist2.addItem(podcast2);
		playlist2.addItem(podcast3);
		playlist2.addItem(video1);
		
		playlist3.addItem(song1);
		playlist3.addItem(song2);
		playlist3.addItem(video3);
		
		playlist4.addItem(podcast1);
		playlist4.addItem(podcast2);
		playlist4.addItem(podcast3);
		
		//Agora vamos adicionar as playlists nos usuários, tanto assinantes quanto não assinantes
		user1.addPlaylist(playlist1);
		user1.addPlaylist(playlist2);
		user1.addPlaylist(playlist3);
		
		//Vamos tentar adicionar a um usuário uma playlist maior que a capacidade máxima permitida
		user2.addPlaylist(playlist1);
		user2.addPlaylist(playlist2);
		
		//Vamos tentar adicionar uma playlist grande mas somente de podcasts
		user2.addPlaylist(playlist4);
		
		//Vamos ver quais Playlists temos em cada usuário
		user1.imprimirPlaylists();
		user2.imprimirPlaylists();
		
		//Vamos testar a funções de playlist
		user1.acessarPlaylist(1).duracao();
		user1.acessarPlaylist(1).duracaoMedia();
		user1.acessarPlaylist(1).maiorDuracao();
		user1.acessarPlaylist(1).menorDuracao();

		
		user1.acessarPlaylist(2).play();
		user1.acessarPlaylist(2).play(true);
		
		user2.importarPlaylist(user1, 3);
		user2.importarPlaylist(user1, 2);
		
		//Vamos verificar se nossa playlist foi compartilhada
		user2.imprimirPlaylists();
		
		//Agora vamos remover uma playlist que não existe no nosso usuário
		user2.removePlaylist(3);
		
		user2.imprimirPlaylists();
		


	}
}
