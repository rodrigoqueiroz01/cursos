package teorica.threads.calc;

public class ThreadSoma implements Runnable {

    private String nome;
    private int[] numeros;
    private static Calculadora calculadora = new Calculadora();

    public ThreadSoma(String nome, int[] numeros) {
        this.nome = nome;
        this.numeros = numeros;

        new Thread(this. nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " iniciada.");
        int soma = calculadora.somaArray(this.numeros);
        System.out.println("Resultado da soma para thread " + this.nome + " é: " + soma);
        System.out.println(this.nome + " terminada.");
    }
}
