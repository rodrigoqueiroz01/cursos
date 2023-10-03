package lambdas.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for(String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        // COM {} E ()
        aprovados.forEach((nome) -> { System.out.println(nome + "!!!"); });
        // COM {} E SEM ()
        aprovados.forEach(nome -> { System.out.println(nome + "!!!"); });
        // SEM {} E SEM ()
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

        System.out.println("\nMethod reference #01..."); // REFERENCIA O MÉTODO: PERCORRE CADA UM DOS ELEMENTOS, E PASSA COMO PARÂMETRO NO PRINTLN.
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod reference #02...");
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Olá, meu nome é " + nome);
    }

}
