package conversao;

import java.util.Scanner;

public class Conversao {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro salário: R$");
        String valor1 = scanner.next().replace(",", ".");

        System.out.print("Informe o segundo salário: R$");
        String valor2 = scanner.next().replace(",", ".");

        System.out.print("Informe o terceiro salário: R$");
        String valor3 = scanner.next().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;

        System.out.printf("\nA média dos salários é: R$%.2f", media);

        scanner.close();

    }
}
