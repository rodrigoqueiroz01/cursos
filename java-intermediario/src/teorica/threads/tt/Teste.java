package teorica.threads.tt;

public class Teste {

    public static void main(String[] args) {
        var tt = new TiqueTaque();
        var tique = new ThreadTiqueTaque("#1", tt);
        var taque = new ThreadTiqueTaque("#1", tt);

        try {
            tique.t.join();
            taque.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
