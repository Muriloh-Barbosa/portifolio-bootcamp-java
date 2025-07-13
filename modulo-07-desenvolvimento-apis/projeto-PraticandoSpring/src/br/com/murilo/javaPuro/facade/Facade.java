package br.com.murilo.javaPuro.facade;

import br.com.murilo.javaPuro.facade.subsistema.cep.CepApi;
import br.com.murilo.javaPuro.facade.subsistema.crm.CrmService;

/**
 * Facade
 * Classe simplifica a interação com os subsistemas CRM e CEP
 *
 * Autor: Murilo
 */
public class Facade {

    /**
     * Migra os dados do cliente para o CRM.
     *
     * @param nome Nome do cliente
     * @param cep  CEP do endereço
     * @param ddd  Código DDD do telefone
     */
    public void migrarCliente(String nome, String cep, String ddd) {
        String cidade = CepApi.getInstance().getCity(cep);
        String estado = CepApi.getInstance().getState(cep);
        CrmService.saveClient(nome, cep, cidade, estado, ddd);
    }
}
