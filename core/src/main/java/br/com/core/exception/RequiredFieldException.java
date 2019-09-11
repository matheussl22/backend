package br.com.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class RequiredFieldException extends IllegalArgumentException {
    public RequiredFieldException(String campo) {
        super("The " + campo + " must be filled!");
    }
}
