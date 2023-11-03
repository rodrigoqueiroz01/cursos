package br.com.dev.rq.rest_springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
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
