package vibes80s;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import vibes80s.controller.ArtistaController;
import vibes80s.model.Album;
import vibes80s.model.Artista;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Artista> artistas = BancoInicial.criarArtista();
        ArtistaController controller = new ArtistaController(artistas);

        List<Album> carrinhoCompras = new ArrayList<>();

        int opcao = 0;

        while (true) {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                     Vibes80s                      ");
            System.out.println("              Reviva o som, resgate a vibe!        ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("        Bem-vindos ao E-Commerce Vibes80s          ");
            System.out.println("                                                   ");
            System.out.println("        Por favor, escolha a opção desejada:       ");
            System.out.println("       1 - Listar todos os Artistas                ");
            System.out.println("       2 - Listar todos os Artistas Nacionais      ");
            System.out.println("       3 - Listar todos os Artistas Internacionais ");
            System.out.println("       4 - Adicionar Item ao Carrinho              ");
            System.out.println("       5 - Remover Item do Carrinho                ");
            System.out.println("       6 - Visualizar Itens no Carrinho            ");
            System.out.println("       7 - Finalizar Compra                        ");
            System.out.println("       8 - Sair                                    ");

            try {
                System.out.print("Opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("\nPor favor, digite um número válido.");
                scanner.nextLine(); 
                continue;
            }

            switch (opcao) {
                case 1:
                    controller.listarArtistas();
                    break;

                case 2:
                    controller.listarArtistaNacional();
                    break;

                case 3:
                    controller.listarArtistaInternacional();
                    break;

                case 4:
                    System.out.print("Digite o nome do álbum que deseja adicionar ao carrinho: ");
                    String nomeAlbum = scanner.nextLine();
                    try {
                        Album album = controller.buscarAlbum(nomeAlbum);
                        carrinhoCompras.add(album);
                        System.out.println("Álbum adicionado ao carrinho: " + album.getNome());
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do álbum que deseja remover do carrinho: ");
                    String nomeAlbumRemover = scanner.nextLine();
                    boolean removido = false;
                    for (Album album : carrinhoCompras) {
                        if (album.getNome().equalsIgnoreCase(nomeAlbumRemover)) {
                            carrinhoCompras.remove(album);
                            System.out.println("Álbum removido do carrinho: " + album.getNome());
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Álbum não encontrado no carrinho.");
                    }
                    break;

                case 6:
                    System.out.println("\nItens no Carrinho:");
                    if (carrinhoCompras.isEmpty()) {
                        System.out.println("O carrinho está vazio.");
                    } else {
                        for (Album album : carrinhoCompras) {
                            System.out.println("- " + album.getNome() + " (" + album.getAno() + "), Preço: R$ " + album.getValor());
                        }
                    }
                    break;

                case 7:
                    System.out.println("\nFinalizando a compra. Itens no carrinho:");
                    double total = 0;
                    for (Album album : carrinhoCompras) {
                        System.out.println("- " + album.getNome() + " (" + album.getAno() + "), Preço: R$ " + album.getValor());
                        total += album.getValor();
                    }
                    System.out.printf("Total da compra: R$ %.2f%n", total);
                    carrinhoCompras.clear();
                    System.out.println("Compra finalizada com sucesso!");
                    break;

                case 8:
                    System.out.println("\nVibes80s - Agradecemos a sua visita!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOpção Inválida. Tente novamente.");
                    break;
            }
        }
    }
}