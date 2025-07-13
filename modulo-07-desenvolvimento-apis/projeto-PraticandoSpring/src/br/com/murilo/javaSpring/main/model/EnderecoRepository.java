package br.com.murilo.javaSpring.main.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface de repositório para operações CRUD com a entidade Endereco. (salvar, buscar, deletar e listar endereços.)
 *
 * Autor: Murilo
 */
@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
