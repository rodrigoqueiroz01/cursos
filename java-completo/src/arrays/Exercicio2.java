package arrays;

import java.util.Arrays;

public class Exercicio2 {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.7;
        notasAlunoA[1] = 10.0;
        notasAlunoA[2] = 5.3;
        notasAlunoA[3] = 9.3;

        System.out.println("Notas: " + Arrays.toString(notasAlunoA));

        var total = 0.0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        var media = total / notasAlunoA.length;

        if (media >= 0 && media < 4) {
            System.out.printf("Média: %.2f\nStatus: Reprovado", media);
        } else if (media >= 4 && media < 6) {
            System.out.printf("Média: %.2f\nStatus: Recuperação", media);
        } else if (media >= 6 && media <= 10) {
            System.out.printf("Média: %.2f\nStatus: Aprovado", media);
        }

        System.out.println("\n");

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        System.out.println("Notas: " + Arrays.toString(notasAlunoB));

        var total1 = 0.0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            total1 += notasAlunoB[i];
        }

        var media1 = total1 / notasAlunoB.length;

        if (media1 >= 0 && media1 < 4) {
            System.out.printf("Média: %.2f\nStatus: Reprovado", media1);
        } else if (media1 >= 4 && media1 < 6) {
            System.out.printf("Média: %.2f\nStatus: Recuperação", media1);
        } else if (media1 >= 6 && media1 <= 10) {
            System.out.printf("Média: %.2f\nStatus: Aprovado", media1);
        }
    }

}
