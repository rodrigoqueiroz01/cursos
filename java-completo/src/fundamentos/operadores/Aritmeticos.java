package fundamentos.operadores;

import java.util.Scanner;

public class Aritmeticos {

    public static void main(String[] args) {

        double x = 34.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);
        System.out.println(a / (float) b);

        // módulo
        System.out.println(x % y);
        System.out.println(a % b);

    }

}
