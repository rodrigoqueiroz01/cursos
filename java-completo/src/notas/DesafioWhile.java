package notas;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        String resposta = "S";

        while (resposta.equalsIgnoreCase("S")) {
            System.out.print("Aluno(a): ");
            String nome = scanner.nextLine();

            System.out.println();

            int quantidadeNotas = 0;
            double nota = 0;
            double total = 0;

            for (; quantidadeNotas <= 3; quantidadeNotas++) {
                System.out.printf("Nota %s: ", (quantidadeNotas + 1));
                nota = scanner.nextDouble();

                if (nota >= 0 && nota <= 10) {
                    total += nota;
                } else {
                    System.out.println("Nota informada está inválida, tente novamente!");
                    break;
                }
            }

            double media = total / quantidadeNotas;

            if (media >= 0 && media < 4) {
                System.out.printf("------------------\nMédia final: %.1f\n", media);
                System.out.println("Aluno(a) " + nome + ": Reprovado!");
            } else if (media >= 4 && media < 7) {
                System.out.printf("------------------\nMédia final: %.1f\n", media);
                System.out.println("Aluno(a) " + nome + ": Recuperação!");
            } else if (media >= 7 && media <= 10) {
                System.out.printf("------------------\nMédia final: %.1f\n", media);
                System.out.println("Aluno(a) " + nome + ": Aprovado!");
            }

            System.out.print("\nRegistrar uma nova nota? [S/N] - ");
            resposta = scanner.next();
        }

        scanner.close();
    }

}
