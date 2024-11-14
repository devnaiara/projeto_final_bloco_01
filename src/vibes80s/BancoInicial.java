package vibes80s;

import java.util.ArrayList;
import java.util.List;

import vibes80s.model.Album;
import vibes80s.model.Artista;
import vibes80s.model.ArtistaNacionalidade;

public class BancoInicial {

	public static List<Artista> criarArtista(){
		 List<Artista> artistas = new ArrayList<>();

	        List<Album> albuns1 = new ArrayList<>();
	        albuns1.add(new Album("Rádio Pirata Ao Vivo", 1986, 44.90));
	        albuns1.add(new Album("Quatro Coiotes", 1988, 39.99));
	        artistas.add(new ArtistaNacionalidade("RPM", "Universal", "Rock Nacional", albuns1, "Brasil"));
	        

	        List<Album> albuns2 = new ArrayList<>();
	        albuns2.add(new Album("Brothers in Arms", 1985,  59.99));
	        albuns2.add(new Album("On Every Street", 1991, 69.99));
	        artistas.add(new ArtistaNacionalidade("Dire Straits", "Warner", "Rock", albuns2, "Reino Unido"));
	        
	        List<Album> albuns3 = new ArrayList<>();
	        albuns3.add(new Album("Anacrônico", 2005,  25.99));
	        albuns3.add(new Album("Chiaroscuro", 2009, 20.99));
	        artistas.add(new ArtistaNacionalidade("Pitty", "Polysom", "Rock Nacional", albuns3, "Brasil"));
	        
	        List<Album> albuns4 = new ArrayList<>();
	        albuns4.add(new Album("O Passo do Lui", 1984,  33.99));
	        albuns4.add(new Album("Big Bang", 2009, 27.99));
	        artistas.add(new ArtistaNacionalidade("Paralamas do Sucesso", "EMI", "Rock Nacional", albuns4, "Brasil"));
	        
	        List<Album> albuns5 = new ArrayList<>();
	        albuns5.add(new Album("World Wide Live", 1985,  53.99));
	        albuns5.add(new Album("Taken by Force", 1977, 58.99));
	        artistas.add(new ArtistaNacionalidade("Scorpions", "Mercury", "Rock", albuns5, "Alemanha"));

	        return artistas;
	}
}
