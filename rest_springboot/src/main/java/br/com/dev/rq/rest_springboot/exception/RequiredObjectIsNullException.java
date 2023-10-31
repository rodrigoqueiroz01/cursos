package br.com.dev.rq.rest_springboot.exception;

import java.io.Serial;

public class RequiredObjectIsNullException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public RequiredObjectIsNullException() {
        super("Não é permitido persistir um objeto nulo!");
    }

    public RequiredObjectIsNullException(String message) {
        super(message);
    }

}
