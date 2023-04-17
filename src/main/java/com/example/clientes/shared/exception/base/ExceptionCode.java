package com.example.clientes.shared.exception.base;

import lombok.Getter;

@Getter
public enum ExceptionCode {
  CLIENT_NOT_FOUND("ERR-001", "CLIENT_NOT_FOUND"),
  CLIENT_INACTIVE("ERR-002", "CLIENT_INACTIVE"),
  CLIENT_DUPLICATED("ERR-003", "CLIENT_DUPLICATED");
  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
}
