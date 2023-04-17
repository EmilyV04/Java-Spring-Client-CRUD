package com.example.clientes.infraestructure.repository;

import com.example.clientes.domain.entities.Cliente;
import com.example.clientes.infraestructure.dao.ClienteDao;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDaoImpl implements ClienteDao {
  private final String INSERT_SQL = "insert into cliente_dto (id, tipo_id, nombre, apellido, estado) values (:id, :tipoId, :nombre, :apellido, :estado)";

  @Autowired
  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  @Override
    public Cliente saveCliente(Cliente cliente){
    SqlParameterSource parameters = new MapSqlParameterSource()
        .addValue("id", cliente.getId())
        .addValue("tipoId", cliente.getTipoId())
        .addValue("nombre", cliente.getNombre())
        .addValue("apellido", cliente.getApellido())
        .addValue("estado", cliente.getEstado());

    Map<String, Object> map = new HashMap<String, Object>();
    map.put("id", cliente.getId());
    map.put("tipoId", cliente.getTipoId());
    map.put("nombre", cliente.getNombre());
    map.put("apellido", cliente.getApellido());
    map.put("estado", cliente.getEstado());

    namedParameterJdbcTemplate.update(INSERT_SQL, parameters);
    return cliente;
  }
}
