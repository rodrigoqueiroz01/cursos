package streams.filters;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {

        var a1 = new Aluno("Ana", 7.8, true);
        var a2 = new Aluno("Bia", 5.8, false);
        var a3 = new Aluno("Daniel", 9.8, true);
        var a4 = new Aluno("Gui", 6.8, false);
        var a5 = new Aluno("Rebeca", 7.1, true);
        var a6 = new Aluno("Pedro", 8.8, false);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

        Predicate<Aluno> aprovado = aa -> aa.getNota() >= 7;
        Function<Aluno, String> respostaAprovado = a -> "Parabéns " + a.getNome() + "! Você foi aprovado!";

        Predicate<Aluno> reprovado = ar -> ar.getNota() < 7;
        Function<Aluno, String> respostaReprovado = a -> a.getNome() + ", você foi reprovado!";

        alunos.stream()
                .filter(aprovado)
                .map(respostaAprovado)
                .forEach(System.out::println);

        alunos.stream()
                .filter(reprovado)
                .map(respostaReprovado)
                .forEach(System.out::println);

    }

}
