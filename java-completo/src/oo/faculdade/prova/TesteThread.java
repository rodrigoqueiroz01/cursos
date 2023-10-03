package oo.faculdade.prova;

public class TesteThread {

    private static boolean stop;

    private static synchronized void setStop() {
        stop = true;
    }

    private static synchronized boolean getStop() {
        return stop;
    }

    public void run() {
        System.out.print("W");
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Runnable() {
            public void run() {
                int n = 0;
                System.out.print("X");
                while (!getStop()) n++;
                System.out.print("Y");
            }
        });

        t.start();
        Thread.sleep(10000);
        setStop();
        System.out.print("Z");

    }
}
