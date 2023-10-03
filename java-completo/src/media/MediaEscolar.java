package media;

import java.util.Scanner;

public class MediaEscolar {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Grau escolar: ");
        String grauEscolar = scanner.nextLine();

        System.out.print("Ano letivo: ");
        int anoLetivo = scanner.nextInt();

        System.out.println("\n===== Média Escolar =====");

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Nota 4: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 0.0 && media < 4.0) {
            System.out.printf("Média final: %.1f\n", media);
            System.out.println("Aluno " + nome + ": reprovado!");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.printf("Média final: %.1f\n", media);
            System.out.println("Aluno " + nome + ": em recuperação!");
        } else if (media >= 6.0 && media < 10.0) {
            System.out.printf("Média final: %.1f\n", media);
            System.out.println("Aluno " + nome + ": aprovado!");
        }

        scanner.close();
    }

}
