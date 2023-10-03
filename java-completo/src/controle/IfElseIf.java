package controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = scanner.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        } else if (nota >= 6.1) {
            System.out.println("Conceito B");
        } else if (nota > 5.1) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Conceito D");
        }

        System.out.println("Fim!");
        scanner.close();

    }

}
