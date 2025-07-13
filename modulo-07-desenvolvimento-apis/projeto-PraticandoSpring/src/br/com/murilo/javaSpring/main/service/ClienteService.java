package br.com.murilo.javaSpring.main.service;

import br.com.murilo.javaSpring.main.model.Cliente;

/**
 * Interface que define o contrato para operações de serviço relacionadas a Cliente.
 *
 * Abstrair operações de CRUD sobre Cliente.
 *
 * Autor: Murilo
 */
public interface ClienteService {

    /**
     * Retorna todos os clientes cadastrados.
     *
     * @return todos os clientes
     */
    Iterable<Cliente> buscarTodos();

    /**
     * Busca um cliente pelo seu ID.
     *
     * @param id identificador do cliente
     * @return Cliente encontrado
     */
    Cliente buscarPorId(Long id);

    /**
     * Insere um novo cliente no sistema.
     *
     * @param cliente objeto cliente a ser inserido
     */
    void inserir(Cliente cliente);

    /**
     * Atualiza os dados de um cliente existente.
     *
     * @param id identificador do cliente a ser atualizado
     * @param cliente dados atualizados
     */
    void atualizar(Long id, Cliente cliente);

    /**
     * Remove um cliente pelo seu ID.
     *
     * @param id identificador do cliente a ser removido
     */
    void deletar(Long id);
}
