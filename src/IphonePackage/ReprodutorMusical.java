package IphonePackage;

import java.util.ArrayList;

public interface ReprodutorMusical {
	
	static ArrayList<Musica> musicaList = new ArrayList<Musica> ();
	
	public static void adicionarMusica(String titulo, String album, String cantor) {
		musicaList.add(new Musica(titulo, album, cantor));
	}
	
	public static void exibirMusicas() {
		if (!musicaList.isEmpty()) {
			System.out.println(musicaList);
		    } else {
		    	System.out.println("A lista está vazia!");
		    	}
		  }
}