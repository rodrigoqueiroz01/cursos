package teorica.threads;

public class Teste {

    public static void main(String[] args) {
        var thread1 = new MinhaThreadRunnable("#1", 900);
        var thread2 = new MinhaThreadRunnable("#2", 650);
        var thread3 = new MinhaThreadRunnable("#3", 1100);
    }

}
