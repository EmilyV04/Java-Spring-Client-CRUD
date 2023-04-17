package com.example.clientes.application;

import com.example.clientes.domain.entities.Cliente;
import com.example.clientes.domain.servicies.ClienteSaveService;
import com.example.clientes.shared.exception.base.ClientDuplicatedException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ClienteSave {
  private final ClienteSaveService clienteSaveService;

  public Cliente saveCliente(Cliente cliente){
    try {
      return clienteSaveService.saveCliente(cliente);
    }catch (Exception e) {
      throw new ClientDuplicatedException("El Id de este cliente ya existe");
    }
  }
}
