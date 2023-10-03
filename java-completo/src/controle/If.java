package controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = scanner.nextDouble();

        if (media >= 7.0 && media <= 10.0) {
            System.out.println("Aluno aprovado!");
            System.out.println("Parabéns!");
        }

        if (media >= 4.5 && media < 7.0)
            System.out.println("Aluno em recuperação!");

        boolean criterioReprovacaoAtingido = media >= 0 && media < 4.5;
        if (criterioReprovacaoAtingido)
            System.out.println("Aluno reprovado!");

        scanner.close();

    }

}
