package org.dio.padroes.projetos.spring.repositories;

import org.dio.padroes.projetos.spring.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
