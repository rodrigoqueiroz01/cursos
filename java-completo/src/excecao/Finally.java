package excecao;

import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        try {
            System.out.println(7 / sc.nextInt());
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            System.out.println("finalizando conexão...");
            sc.close();
        }
    }
}
