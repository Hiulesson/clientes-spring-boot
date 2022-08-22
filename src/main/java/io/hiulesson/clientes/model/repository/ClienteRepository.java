package io.hiulesson.clientes.model.repository;

import io.hiulesson.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository  extends JpaRepository< Cliente, Integer> {
}
