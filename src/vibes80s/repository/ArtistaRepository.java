package vibes80s.repository;

public interface ArtistaRepository {
	
	public void listarArtistas();
	public void listarArtistaNacional();
	public void listarArtistaInternacional();
	
	public void comprar(String nomeAlbum);

}
