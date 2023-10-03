package streams.reduce;

import streams.filters.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce02 {

    public static void main(String[] args) {

        var a1 = new Aluno("Ana", 7.1);
        var a2 = new Aluno("Luna", 6.1);
        var a3 = new Aluno("Gui", 8.1);
        var a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() <= 7;
        Function<Aluno, Double> nota = aluno -> aluno.getNota();
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        // pipeline de execução
        alunos.parallelStream()
                .filter(aprovado)
                .map(nota)
                .reduce(somatorio)
                .ifPresent(System.out::println);

    }

}
