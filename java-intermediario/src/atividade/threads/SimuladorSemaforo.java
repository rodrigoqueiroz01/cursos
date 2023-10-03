package atividade.threads;

public class SimuladorSemaforo {

    public static void main(String[] args) throws InterruptedException {
        var semafaro = new ThreadSemaforo();

        for (int i=0; i<10; i++){
            System.out.println(semafaro.getCor());
            semafaro.esperaCorMudar();
        }

        semafaro.desligarSemaforo();
    }
}
