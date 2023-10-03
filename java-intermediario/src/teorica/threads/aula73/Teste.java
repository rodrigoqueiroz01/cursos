package teorica.threads.aula73;

public class Teste {

    public static void main(String[] args) {
        var t1 = new MinhaThread("#1");
        var t2 = new MinhaThread("#2");

        t1.suspend();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.suspend();

        t1.resume();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.resume();

        t2.stop();
    }
}
