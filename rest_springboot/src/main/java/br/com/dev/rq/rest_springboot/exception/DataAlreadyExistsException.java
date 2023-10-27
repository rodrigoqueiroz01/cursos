package br.com.dev.rq.rest_springboot.exception;

import java.io.Serial;

public class DataAlreadyExistsException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public DataAlreadyExistsException(String message) {
        super(message);
    }
}
