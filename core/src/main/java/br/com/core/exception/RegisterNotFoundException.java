package br.com.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RegisterNotFoundException extends RuntimeException {
    public RegisterNotFoundException(Object id) {
        super("Register not found with id " + id);
    }
}
