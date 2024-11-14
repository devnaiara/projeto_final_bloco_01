package vibes80s.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import vibes80s.model.Album;
import vibes80s.model.Artista;
import vibes80s.model.ArtistaNacionalidade;
import vibes80s.repository.ArtistaRepository;


public class ArtistaController implements ArtistaRepository {

    private final List<Artista> listaArtistas;

    public ArtistaController(List<Artista> artistas) {
        this.listaArtistas = new ArrayList<>(artistas);
    }

    @Override
    public void listarArtistas() {
        System.out.println("\nListando todos os artistas:");
        for (Artista artista : listaArtistas) {
            System.out.println("- " + artista.getNome()+ " - " + artista.getGravadora());
            for (Album album:artista.getAlbuns()) {
                System.out.println("Álbum: "+album.getNome()+ ". Por apenas R$: "+album.getValor());
            }
        }
    }

    @Override
    public void listarArtistaNacional() {
        System.out.println("\nListando artistas nacionais:");
        for (Artista artista : listaArtistas) {
            if (artista instanceof ArtistaNacionalidade && 
                ((ArtistaNacionalidade) artista).getNacionalidade().equalsIgnoreCase("Brasil")) {
                System.out.println("- " + artista.getNome()+ " - " + artista.getGravadora());
                for (Album album:artista.getAlbuns()) {
                    System.out.println("Álbum: "+album.getNome()+ ". Por apenas R$: "+album.getValor());
                }
            }
        }
    }

    @Override
    public void listarArtistaInternacional() {
        System.out.println("\nListando artistas internacionais:");
        for (Artista artista : listaArtistas) {
            if (artista instanceof ArtistaNacionalidade && 
                !((ArtistaNacionalidade) artista).getNacionalidade().equalsIgnoreCase("Brasil")) {
                System.out.println("- " + artista.getNome()+ " - " + artista.getGravadora());
                for (Album album:artista.getAlbuns()) {
                    System.out.println("Álbum: "+album.getNome()+ ". Por apenas R$: "+album.getValor());
                }
            }
        }
    }

    @Override
    public void comprar(String nomeAlbum) {
        System.out.println("\nIniciando processo de compra para o álbum: " + nomeAlbum);
        boolean albumEncontrado = false;
        for (Artista artista : listaArtistas) {
            for (var album : artista.getAlbuns()) {
                if (album.getNome().equalsIgnoreCase(nomeAlbum)) {
                    album.comprar();
                    albumEncontrado = true;
                    break;
                }
            }
            if (albumEncontrado) break;
        }
        if (!albumEncontrado) {
            throw new NoSuchElementException("Álbum " + nomeAlbum + " não encontrado.");
        }
    }
    
    @Override
    public Album buscarAlbum(String nomeAlbum) {
        for (Artista artista : listaArtistas) {
            for (Album album : artista.getAlbuns()) {
                if (album.getNome().equalsIgnoreCase(nomeAlbum)) {
                    return album;
                }
            }
        }
        throw new NoSuchElementException("Álbum " + nomeAlbum + " não encontrado.");
    }
    
}