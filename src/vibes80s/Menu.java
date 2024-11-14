package vibes80s;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        int opcao;

        while (true) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                     Vibes80s                      ");
            System.out.println("              Reviva o som, resgate a vibe!        ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                                                   ");
            System.out.println("        Bem-vindos ao E-Commerce Vibes80s          ");
            System.out.println("                                                   ");
            System.out.println("        Por favor, escolha a opção desejada:       ");
            System.out.println("       1 - Listar todos os Artistas                ");
            System.out.println("       2 - Listar todos os Artistas Nacionais      ");
            System.out.println("       3 - Listar todos os Artistas Internacionais ");
            System.out.println("       4 - Comprar                                 ");
            System.out.println("       5 - Sair                                    ");

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite um valor inteiro.");
                leia.nextLine(); // 
                opcao = 0;
            }

            if (opcao == 5) {
                System.out.println("\nVibes80s - Obrigado pela visita!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("\nListando todos os Artistas...");
                    break;

                case 2:
                    System.out.println("\nListando todos os Artistas Nacionais...");
                    break;

                case 3:
                    System.out.println("\nListando todos os Artistas Internacionais...");
                    break;

                case 4:
                    System.out.println("\nIniciando processo de compra...");
                    break;

                default:
                    System.out.println("\nOpção Inválida. Tente novamente.");
                    break;
            }
        }
    }
}
