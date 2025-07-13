package br.com.murilo.javaSpring.main.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface de repositório para operações CRUD com a entidade Cliente. (salvar, buscar, deletar e listar clientes.)
 *
 * Autor: Murilo
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
