package br.com.murilo.javaPuro.facade.subsistema.crm;

/**
 * Simula um serviço de CRM externo.
 *
 * Responsável por gravar dados de cliente no sistema.
 *
 * Autor: Murilo
 */
public class CrmService {

    private CrmService() {
        // Construtor privado para evitar instanciação
    }

    /**
     * Simula a gravação de um cliente no CRM.
     *
     * @param nome   Nome do cliente
     * @param cep    CEP do endereço
     * @param cidade   Cidade do cliente
     * @param estado  Estado do cliente
     * @param ddd    DDD do telefone
     */
    public static void saveClient(String nome, String cep, String cidade, String estado, String ddd) {
        System.out.println("Cliente Salvo no sistema:");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("DDD: " + ddd);
    }
}
