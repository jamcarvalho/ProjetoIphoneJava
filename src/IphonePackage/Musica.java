package IphonePackage;

public class Musica {
	
	String titulo;
	String album;
	String cantor;
	
	public Musica(String titulo, String album, String trilha) {
		super();
		this.titulo = titulo;
		this.album = album;
		this.cantor = trilha;
	}
	
	@Override
	public String toString() {
		return "\n Musica{ Título: '" + titulo + "' Album: '" + album + "'titulo Cantor: '" + cantor + "' }";
	}
}
