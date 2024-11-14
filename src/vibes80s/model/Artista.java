package vibes80s.model;

import java.util.List;

public abstract class Artista {
	
	private String nome;
	private String gravadora;
	private String genero;
	private List<Album> Albuns;
	
	public Artista(String nome, String gravadora, String genero, List<Album> albuns) {
		super();
		this.nome = nome;
		this.gravadora = gravadora;
		this.genero = genero;
		Albuns = albuns;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<Album> getAlbuns() {
		return Albuns;
	}
	public void setAlbuns(List<Album> albuns) {
		Albuns = albuns;
	}
	
	public abstract void comprar();
	
}
