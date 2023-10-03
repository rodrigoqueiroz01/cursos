package excecao;

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

}
