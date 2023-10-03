package calculadora;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Informe o número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe o número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Informe a operação: ");
        String operação = scanner.next();

        double resultado = "+".equals(operação) ? numero1 + numero2 : 0;
        resultado = "-".equals(operação) ? numero1 - numero2 : resultado;
        resultado = "x".equals(operação) ? numero1 * numero2 : resultado;
        resultado = "/".equals(operação) ? numero1 / numero2 : resultado;
        resultado = "%".equals(operação) ? numero1 % numero2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", numero1, operação, numero2, resultado);

        scanner.close();
    }

}
