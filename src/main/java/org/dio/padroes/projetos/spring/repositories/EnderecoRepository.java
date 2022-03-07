package org.dio.padroes.projetos.spring.repositories;

import org.dio.padroes.projetos.spring.entities.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
