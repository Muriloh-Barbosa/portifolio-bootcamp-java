package br.com.murilo.javaSpring.main.service.impl;

import br.com.murilo.javaSpring.main.model.Cliente;
import br.com.murilo.javaSpring.main.model.ClienteRepository;
import br.com.murilo.javaSpring.main.model.Endereco;
import br.com.murilo.javaSpring.main.model.EnderecoRepository;
import br.com.murilo.javaSpring.main.service.ClienteService;
import br.com.murilo.javaSpring.main.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação da interface, utilizando os padrões, Singleton e Facade.
 *
 * Strategy: esta classe implementa a estratégia de operações relacionadas a Cliente.
 *
 * Singleton:o Spring gerencia como um único bean injetado em outras classes.
 *
 * Facade: simplifica a integração com os repositórios e com o serviço externo ViaCEP, expondo uma interface simples para a aplicação.
 *
 * Autor: Murilo
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: Dependêcias gerenciadas pelo Spring
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementação dos mtodos definidos na interface ClienteService

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElse(null);
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        if (clienteRepository.existsById(id)) {
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    /**
     * Verifica se o CEP j´á existe no banco.
     * Se não existir, consulta o ViaCEP e salva o endereçooEm seguida, associa o endereço ao cliente e salva o cliente.
     *
     * @param cliente objeto cliente a ser salvo
     */
    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();

        Endereco endereco = enderecoRepository.findById(cep)
                .orElseGet(() -> {
                    Endereco novoEndereco = viaCepService.consultarCep(cep);
                    enderecoRepository.save(novoEndereco);
                    return novoEndereco;
                });

        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
