package controle;

import java.util.Scanner;

public class For02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int contador = 10; contador >= 0; contador -= 2) {
            System.out.println("contagem = " + contador);
        }

        scanner.close();
    }

}
