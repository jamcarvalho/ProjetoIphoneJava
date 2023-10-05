package IphonePackage;

public class Iphone implements Telefone, NavegadorInternet, ReprodutorMusical {

	public static void main(String[] args) {
		
		ligar();
		
		// testing class Telefone
		
		String numeroTelefone = "999-999-999";
		String mensagem = "Bom dia!";
		
		Telefone.enviarSMS(numeroTelefone, mensagem);
		
		Telefone.telefonar(numeroTelefone);
		
		// testing class ReprodutorMusical
		
		String titulo1 = "N.I.B.";
		String album1  = "Black Sabbath";
		String cantor1 = "Black Sabbath";
		
		ReprodutorMusical.adicionarMusica(titulo1, album1, cantor1);
		
		String titulo2 = "Paranoid";
		String album2  = "Paranoid";
		String cantor2 = "Black Sabbath";
		
		ReprodutorMusical.adicionarMusica(titulo2, album2, cantor2);
		
		System.out.println("\nMinha play list\n");
		ReprodutorMusical.exibirMusicas();
		
		// testing class NavegadorInternet
		
		System.out.println("\nSurfando na Internet\n");
		NavegadorInternet.abrirNovaAba();
		NavegadorInternet.abrirNovaAba();
		NavegadorInternet.fecharAba();
		
		desligar();

	}

	private static void ligar() {
		System.out.println("Iphone ligado\n");
		
	}
	
	private static void desligar() {
		System.out.println("\nIphone desligado");
		
	}
}
