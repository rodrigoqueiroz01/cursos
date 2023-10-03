package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa falar as palavras mágicas...");

            System.out.print("Deseja sair? ");
            texto = scanner.nextLine();
        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("\nObrigado!");

        scanner.close();
    }

}
