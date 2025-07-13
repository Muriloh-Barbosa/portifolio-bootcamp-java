package br.com.murilo.javaSpring.main.controller;

import br.com.murilo.javaSpring.main.model.Cliente;
import br.com.murilo.javaSpring.main.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller que expõ~e a API de Cliente.
 *
 * Atua como REST, abstraindo a complexidade das integrações, o banco de dados e com o serviço ViaCEP.
 *
 * Autor: Murilo
 */
@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    /**
     * Retorna todos os clientes cadastrados.
     *
     * @return lista de clientes
     */
    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    /**
     * Busca um cliente específico pelo ID.
     *
     * @param id identificador do cliente
     * @return cliente encontrado
     */
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        Cliente cliente = clienteService.buscarPorId(id);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        }
        return ResponseEntity.notFound().build();
    }

    /**
     * Insere um novo cliente.
     *
     * @param cliente dados do cliente a ser inserido
     * @return cliente inserido
     */
    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    /**
     * Atualiza os dados de um cliente existente.
     *
     * @param id identificador do cliente
     * @param cliente dados atualizados
     * @return cliente atualizado
     */
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    /**
     * Deleta um cliente pelo ID.
     *
     * @param id identificador do cliente
     * @return resposta sem conteúdo
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
