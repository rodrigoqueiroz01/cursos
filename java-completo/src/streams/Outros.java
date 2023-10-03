package streams;

import streams.filters.Aluno;
import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        var a1 = new Aluno("Ana", 7.1);
        var a2 = new Aluno("Luna", 6.1);
        var a3 = new Aluno("Gui", 8.1);
        var a4 = new Aluno("Gabi", 10);
        var a5 = new Aluno("Ana", 7.1);
        var a6 = new Aluno("Pedro", 7.1);
        var a7 = new Aluno("Gui", 8.1);
        var a8 = new Aluno("Maria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("\ndistinct..."); // operação intermediária
        alunos.stream()
                .distinct() // tira as duplicações
                .forEach(System.out::println);

        System.out.println("\nSkip/Limit"); // operação intermediária
        alunos.stream()
                .distinct()
                .skip(2) // pula
                .limit(2) // busca só até certo limite
                .forEach(System.out::println);

        System.out.println("\ntakeWhile"); // operação intermediária
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.getNota() >= 7)
                .forEach(System.out::println);
    }

}
