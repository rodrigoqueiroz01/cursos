package colecoes.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // retorna O Hobbit
        System.out.println(livros.peek()); // retorna O Hobbit

        for (String livro : livros) {
            System.out.println(livro);
        }

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop());
//        System.out.println(livros.remove());

//        livros.size();
//        livros.clear();
//        livros.contains();
//        livros.isEmpty();


    }

}
