package lambdas;

public class Threads {

    public static void main(String[] args) {
        var trabalho1 = new Trabalho1();
        var trabalho2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    println("Tarefa #02");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {

                    }
                }
            }
        };

        Runnable trabalho3 = Threads::trabalho3;

        var t1 = new Thread(trabalho1);
        var t2 = new Thread(trabalho2);
        var t3 = new Thread(trabalho3);

        t1.start();
        t2.start();
        t3.start();
    }

    public static void trabalho3() {
        for (int i = 0; i < 100; i++) {
            println("Tarefa #02");
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }

    public static void println(String texto) {
        System.out.println(texto);
    }

}
