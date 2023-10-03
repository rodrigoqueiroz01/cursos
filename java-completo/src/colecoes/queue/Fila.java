package colecoes.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e add -> adicionam elementos a fila.
        // A diferença é o comportamento quando a fila está cheia.

        fila.add("Ana"); // retorna false.
        fila.offer("Bia"); // lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // peek e element -> obter o próximo elemento da fila (sem remover).
        // A diferença é o comportamento quando a fila está vazia.

        System.out.println(fila.peek()); // retorna false
        System.out.println(fila.peek());

        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.element());

//        fila.clear();
//        fila.size();
//        fila.isEmpty();

        // poll e remove -> obter o próximo elemento da fila e remove.
        // A diferença é o comportamento quando a fila está vazia.

        // fila.poll(); -> retorna false
        // fila.remove(); -> lança exceção

        System.out.println(fila.poll()); // Retorna: Ana
        System.out.println(fila.poll()); // Retorna: Bia
        System.out.println(fila.poll()); // Retorna: Carlos
        System.out.println(fila.poll()); // Retorna: Daniel
        System.out.println(fila.poll()); // Retorna: Rafaela
        System.out.println(fila.poll()); // Retorna: Gui
        System.out.println(fila.poll()); // Retorna: Null
        System.out.println(fila.remove());

    }

}
