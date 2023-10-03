package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int quantidadeAlunos = scanner.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int quantidadeNotasPorAluno = scanner.nextInt();

        System.out.println();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotasPorAluno];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for(int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);

                notasDaTurma[a][n] = scanner.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double mediaTurma = total / (quantidadeAlunos * quantidadeNotasPorAluno);
        System.out.println("\nMédia da turma: " + mediaTurma);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDaTurma));
        }

        scanner.close();
    }
}
