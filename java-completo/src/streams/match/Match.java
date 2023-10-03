package streams.match;

import streams.filters.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        var a1 = new Aluno("Ana", 7.1);
        var a2 = new Aluno("Luna", 6.1);
        var a3 = new Aluno("Gui", 8.1);
        var a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() <= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado)); // todos foram aprovados?
        System.out.println(alunos.stream().anyMatch(aprovado)); // alguém foi aprovado?
        System.out.println(alunos.stream().noneMatch(reprovado)); // ninguém foi aprovado?
    }

    /*
        (ALL) allMatch - TODOS (se SIM: true / se NÃO: false)
        (ANY) anyMatch - ALGUÉM (se SIM: true / se NÃO: false)
        (NONE) noneMatch - NINGUÉM (se SIM: true / se NÃO: false)
    */

}
