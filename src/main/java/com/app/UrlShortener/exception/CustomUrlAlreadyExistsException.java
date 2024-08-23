package com.app.UrlShortener.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomUrlAlreadyExistsException extends  CustomException {
    public CustomUrlAlreadyExistsException() {
        super("Custom URL already in use", HttpStatus.CONFLICT);
    }
}