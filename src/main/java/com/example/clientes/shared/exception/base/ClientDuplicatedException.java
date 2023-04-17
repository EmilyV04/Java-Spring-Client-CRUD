package com.example.clientes.shared.exception.base;

import org.springframework.http.HttpStatus;

public class ClientDuplicatedException extends BaseException {

  public ClientDuplicatedException(String message) {
    super(false, HttpStatus.CONFLICT, message, ExceptionCode.CLIENT_DUPLICATED);
  }
}
