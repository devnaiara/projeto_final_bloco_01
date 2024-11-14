package vibes80s.repository;

import vibes80s.model.Album;

public interface ArtistaRepository {
	
	public void listarArtistas();
	public void listarArtistaNacional();
	public void listarArtistaInternacional();
	
	public void comprar(String nomeAlbum);
	
	public Album buscarAlbum(String nomeAlbum);

}
