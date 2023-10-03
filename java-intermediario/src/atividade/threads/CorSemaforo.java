package atividade.threads;

public enum CorSemaforo {
    VERDE(1000),
    AMARELO(300),
    VERMELHO(2000);

    private final int tempoEspera;

    CorSemaforo(int tempoEspera){
        this.tempoEspera = tempoEspera;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }
}
