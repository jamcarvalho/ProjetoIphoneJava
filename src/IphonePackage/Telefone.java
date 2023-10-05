package IphonePackage;

public interface Telefone {
	
	public static void telefonar(String numeroTelefone) {
		System.out.println("telefonando para " + numeroTelefone);
	}
	
	public static void enviarSMS(String numeroTelefone, String mensagem) {
		System.out.println("mensagem: '" + mensagem + "' enviada para " + numeroTelefone);
	}
}
