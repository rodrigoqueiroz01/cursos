package arrays;

public class Exercicio1 {

    /*
     * É uma estrutura estática, com tamanho fixo.
     * Os dados são homogênios. (Se crio um array de inteiro, todos os outros dados serão inteiros.
     * Array é um objeto.
     */

    public static void main(String[] args) {

        double[] a = new double[6];
        a[0] = 1.6;
        a[1] = 2.5;
        a[2] = 3.4;
        a[3] = 4.3;
        a[4] = 5.2;
        a[5] = 6.1;

        System.out.println("O valor de A é " + a[0]);
        System.out.println("O valor de B é " + a[1]);
        System.out.println("O valor de C é " + a[2]);
        System.out.println("O valor de D é " + a[3]);
        System.out.println("O valor de E é " + a[4]);
        System.out.println("O valor de F é " + a[5]);

//        double[][][] b = new double[3][3][3];  // Array de 3 dimensões

    }

}
