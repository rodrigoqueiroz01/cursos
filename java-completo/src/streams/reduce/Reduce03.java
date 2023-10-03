package streams.reduce;

import streams.filters.Aluno;
import streams.reduce.media.Media;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce03 {

    public static void main(String[] args) {

        var a1 = new Aluno("Ana", 7.1);
        var a2 = new Aluno("Luna", 6.1);
        var a3 = new Aluno("Gui", 8.1);
        var a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = aluno -> aluno.getNota() <= 7;
        Function<Aluno, Double> apenasNota = aluno -> aluno.getNota();

        BiFunction<Media, Double, Media> calculaMedia = (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia = (media1, media2) -> Media.combinar(media1, media2);

        // PIPELINE DE EXECUÇÃO
        var media = alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calculaMedia, combinarMedia);

        System.out.println("A média da turma é " + media.getValor());
    }
}
