package controle;

import java.util.Scanner;
import java.util.logging.Logger;

public class SwitchComBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(SwitchComBreak.class.getName());

        var conceito = "";

        System.out.print("Informe a nota: ");
        var nota = scanner.nextInt();

        switch (nota) {
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1:
                conceito = "E";
                break;
            case 0:
                conceito = "F";
                break;
            default:
                conceito = "inválido!";
//                break; (O último é opcional)
        }

        // Melhor forma de ser feito é assim.
//        if (nota >= 9 && nota <= 10) {
//            conceito = "A";
//        } else if (nota >= 7 && nota < 9) {
//            conceito = "B";
//        } else if (nota >= 5 && nota < 7) {
//            conceito = "C";
//        } else if (nota >= 3 && nota < 5) {
//            conceito = "D";
//        } else if (nota >= 1 && nota < 3) {
//            conceito = "E";
//        } else if (nota >= 0 && nota < 1) {
//            conceito = "F";
//        } else {
//            conceito = "inválido!";
//        }

        System.out.printf("Conceito é %s\n\n", conceito);

        logger.info("Fim da execução!");
        scanner.close();

    }

}
