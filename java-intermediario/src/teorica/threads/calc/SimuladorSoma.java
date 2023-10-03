package teorica.threads.calc;

public class SimuladorSoma {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        var t1 = new ThreadSoma("#1", array);
        var t2 = new ThreadSoma("#2", array);
    }
}
