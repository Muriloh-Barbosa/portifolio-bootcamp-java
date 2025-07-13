package br.com.murilo.javaPuro.facade.subsistema.cep;

/**
 * Simula uma API externa de consulta de CEP.
 *
 *Implementação de Singleton Eager para simplicidade.
 *
 * Autor: Murilo
 */
public class CepApi {

    private static final CepApi instance = new CepApi();

    private CepApi() {
        // Construtor privado para evitar instanciação
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        // Simulação de consulta real
        return "Sao Paulo";
    }

    public String getState(String cep) {
        // Simulação de consulta real
        return "SP";
    }
}
