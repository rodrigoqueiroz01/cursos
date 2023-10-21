package br.com.dev.rq.rest_springboot.exception.handler;

import br.com.dev.rq.rest_springboot.exception.UnsupportedMathOperationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    private static final String MSG_ERRO_GENERICO = "Ocorreu um erro inesperado no sistema. " +
            "Tente novamente e, se o problema persistir, entre em contato com o administrador.";

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        var status = HttpStatus.INTERNAL_SERVER_ERROR;

        var apiError = ApiError.builder()
                .status(status.value())
                .title(MSG_ERRO_GENERICO)
                .detail(ex.getMessage())
                .type(request.getDescription(false))
                .build();

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON);

        return super.handleExceptionInternal(ex, apiError, headers, status, request);
    }

    @ExceptionHandler(UnsupportedMathOperationException.class)
    public final ResponseEntity<Object> handleBadRequestExceptions(Exception ex, WebRequest request) {
        var status = HttpStatus.BAD_REQUEST;

        var apiError = ApiError.builder()
                .status(status.value())
                .title("Requisição inválida!")
                .type(request.getDescription(false))
                .detail(ex.getMessage())
                .build();

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON);

        return super.handleExceptionInternal(ex, apiError, headers, status, request);
    }

}
