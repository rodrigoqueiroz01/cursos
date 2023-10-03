package oo.heranca.desafio1;

public class Carro {

    private final int VELOCIDADE_MAXIMA;
    private int velocidadeAtual;

    private int delta = 5;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "Km/h";
    }

}
