package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Usuário 01: ");
            valor = scanner.nextLine();

            System.out.print("Usuário 02: ");
            valor = scanner.nextLine();
        }

        System.out.println("Bate-papo encerrado!");

        scanner.close();
    }

}
