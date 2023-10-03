package aniversario;

import java.util.Date;

public class ChegadaAniversarianteEvent {

    private final Date horaChegada;

    public ChegadaAniversarianteEvent(Date horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Date getHoraChegada() {
        return horaChegada;
    }

}
