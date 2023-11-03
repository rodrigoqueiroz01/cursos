package br.com.dev.rq.rest_springboot.exception.handler;

import br.com.dev.rq.rest_springboot.exception.*;
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

    @ExceptionHandler(FileStorageException.class)
    public final ResponseEntity<Object> handleFileStorageExceptions(Exception ex, WebRequest request) {
        var status = HttpStatus.INTERNAL_SERVER_ERROR;

        var apiError = ApiError.builder()
                .status(status.value())
                .title("Falha no armazenamento do arquivo")
                .detail(ex.getMessage())
                .type(request.getDescription(false))
                .build();

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON);

        return super.handleExceptionInternal(ex, apiError, headers, status, request);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public final ResponseEntity<Object> handleEntityNotFoundExceptions(Exception ex, WebRequest request) {
        var status = HttpStatus.NOT_FOUND;

        var apiError = ApiError.builder()
                .status(status.value())
                .title("Dado não encontrado")
                .type(request.getDescription(false))
                .detail(ex.getMessage())
                .build();

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON);

        return super.handleExceptionInternal(ex, apiError, headers, status, request);
    }

    @ExceptionHandler(MyFileNotFoundException.class)
    public final ResponseEntity<Object> handleMyFileNotFoundExceptions(Exception ex, WebRequest request) {
        var status = HttpStatus.NOT_FOUND;

        var apiError = ApiError.builder()
                .status(status.value())
                .title("Arquivo não encontrado")
                .type(request.getDescription(false))
                .detail(ex.getMessage())
                .build();

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON);

        return super.handleExceptionInternal(ex, apiError, headers, status, request);
    }

    @ExceptionHandler(DataAlreadyExistsException.class)
    public final ResponseEntity<Object> handleDataAlreadyExistsExceptions(Exception ex, WebRequest request) {
        var status = HttpStatus.BAD_REQUEST;

        var apiError = ApiError.builder()
                .status(status.value())
                .title("Os dados já existem")
                .type(request.getDescription(false))
                .detail(ex.getMessage())
                .build();

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON);

        return super.handleExceptionInternal(ex, apiError, headers, status, request);
    }

    @ExceptionHandler(RequiredObjectIsNullException.class)
    public final ResponseEntity<Object> handleRequiredObjectIsNullExceptions(Exception ex, WebRequest request) {
        var status = HttpStatus.BAD_REQUEST;

        var apiError = ApiError.builder()
                .status(status.value())
                .title("Objeto nulo identificado")
                .type(request.getDescription(false))
                .detail(ex.getMessage())
                .build();

        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PROBLEM_JSON);

        return super.handleExceptionInternal(ex, apiError, headers, status, request);
    }

}
