package teorica.threads;

public class Teste3 {

    public static void main(String[] args) {
        var thread1 = new MinhaThreadRunnable("#1", 500);
        var thread2 = new MinhaThreadRunnable("#2", 500);
        var thread3 = new MinhaThreadRunnable("#3", 500);

        var t1 = new Thread(thread1);
        var t2 = new Thread(thread2);
        var t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while (t1.isAlive() || t2.isAlive() || t3.isAlive()) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nExecução finalizada!");
    }
}
