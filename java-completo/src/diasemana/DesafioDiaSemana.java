package diasemana;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Informe o dia da semana: ");
        String dia = scanner.next();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.print("1° dia");
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.print("2° dia");
        } else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
            System.out.print("3° dia");
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.print("4° dia");
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.print("5° dia");
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.print("6° dia");
        } else if (dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
            System.out.print("7° dia");
        } else {
            System.out.print("Esse dia não existe!");
        }

        scanner.close();

    }

}
