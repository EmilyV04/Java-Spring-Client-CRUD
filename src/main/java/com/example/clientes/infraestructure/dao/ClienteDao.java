package com.example.clientes.infraestructure.dao;

import com.example.clientes.domain.entities.Cliente;

public interface ClienteDao {
  Cliente saveCliente(Cliente cliente);
}
