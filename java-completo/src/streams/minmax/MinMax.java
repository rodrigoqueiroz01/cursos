package streams.minmax;

import streams.filters.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {

        var a1 = new Aluno("Ana", 7.1);
        var a2 = new Aluno("Luna", 6.1);
        var a3 = new Aluno("Gui", 8.1);
        var a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if (aluno1.getNota() > aluno2.getNota()) return 1;
            if (aluno1.getNota() < aluno2.getNota()) return -1;
            return 0;
        };

        Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
            if (aluno1.getNota() > aluno2.getNota()) return -1;
            if (aluno1.getNota() < aluno2.getNota()) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());

        System.out.println(alunos.stream().max(piorNota).get());
        System.out.println(alunos.stream().min(piorNota).get());
    }

}
