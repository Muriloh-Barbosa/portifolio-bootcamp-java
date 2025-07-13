package br.com.murilo.javaSpring.main.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Entidade que representa um endereço obtido via API do ViaCEP.
 *
 * Gerada a partir do JSON de retorno do ViaCEP, usando o site jsonschema2pojo.org.
 *
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 * Autor: Murilo
 */
@Entity
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    /**
     * Construtor padrão requerido pelo JPA.
     */
    public Endereco() {
    }

    /**
     * Construtor completo.
     *
     * @param cep         CEP do endereço
     * @param logradouro  Logradouro
     * @param complemento Complemento
     * @param bairro      Bairro
     * @param localidade  Cidade
     * @param uf          Unidade Federativa
     * @param ibge        Código IBGE
     * @param gia         Código GIA
     * @param ddd         DDD
     * @param siafi       Código SIAFI
     */
    public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade,
                    String uf, String ibge, String gia, String ddd, String siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    // Getters e Setters

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }
}
