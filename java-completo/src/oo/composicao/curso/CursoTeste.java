package oo.composicao.curso;

public class CursoTeste {

    public static void main(String[] args) {

        var aluno1 = new Aluno("João");
        var aluno2 = new Aluno("Maria");
        var aluno3 = new Aluno("Pedro");

        var curso1 = new Curso("Java Completo");
        var curso2 = new Curso("Web 2023");
        var curso3 = new Curso("React Native");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso1.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso2);
        aluno2.adicionarCurso(curso2);
        aluno3.adicionarCurso(curso2);

        curso3.adicionarAluno(aluno1);
        curso3.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        for (Aluno aluno : curso1.alunos) {
            System.out.println("Estou matriculado no curso 1...");
            System.out.println("...e meu nome é " + aluno.nome + "\n");
        }

        System.out.println(aluno1.cursos.get(0).alunos);
        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }

}
