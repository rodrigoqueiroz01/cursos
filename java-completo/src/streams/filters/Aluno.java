package streams.filters;

import java.util.Objects;

public class Aluno {

    private String nome;
    private double nota;
    private boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isBomComportamento() {
        return bomComportamento;
    }

    public void setBomComportamento(boolean bomComportamento) {
        this.bomComportamento = bomComportamento;
    }

    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(aluno.nota, nota) == 0 && bomComportamento == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }
}
