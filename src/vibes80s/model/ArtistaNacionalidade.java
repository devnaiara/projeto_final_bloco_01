package vibes80s.model;

import java.util.List;

public class ArtistaNacionalidade extends Artista {

	private String nacionalidade;

	public ArtistaNacionalidade(String nome, String gravadora, String genero, List<Album> albuns,
			String nacionalidade) {
		super(nome, gravadora, genero, albuns);
		this.nacionalidade = nacionalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	@Override
	public void comprar() {
        System.out.println("\n Comprando álbuns do artista: "+ getNome()+ " da nacionalidade: " +nacionalidade);
        for (Album album:getAlbuns()) {
        	album.comprar();
        }
	}
}
