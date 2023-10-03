package excecao.personalizadaA;

import java.io.Serial;

public class NumeroForaintervaloException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -3014530899920482717L;

    private final String nomeAtributo;

    public NumeroForaintervaloException(String nomeAtributo) {
        this.nomeAtributo = nomeAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo", nomeAtributo);
    }

}
