package controle;

import java.util.Scanner;
import java.util.logging.Logger;

public class SwitchSemBreak {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(SwitchSemBreak.class.getName());
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faixa: ");
        var faixa = scanner.next();

        // cenário específico com apenas um break
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("\nSei o Bassai-dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan\n");
                break;
            default:
                System.out.println("Não sei de nada\n");
        }

        logger.info("Fim da primeira execução!");

        // cenário específico sem break
        System.out.print("\n-----------------\nIdade: ");
        var idade = scanner.nextInt();

        switch (idade) {
            case 3:
                System.out.println("\nSabe programar!");
            case 2:
                System.out.println("Sabe falar!");
            case 1:
                System.out.println("Sabe andar!");
            case 0:
                System.out.println("Sabe respirar!\n");
        }

        logger.info("Fim da segunda execução!");
        scanner.close();
    }
    
}
