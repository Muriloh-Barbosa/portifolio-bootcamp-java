package br.com.murilo.javaSpring.main.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Representa um cliente do sistema.
 *
 * Autor: Murilo
 */
@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToOne
    private Endereco endereco;

    /**
     * Construtor padrão requerido pelo JPA.
     */
    public Cliente() {
    }

    /**
     * Construtor completo.
     *
     * @param id       identificador do cliente
     * @param nome     nome do cliente
     * @param endereco endereço associado
     */
    public Cliente(Long id, String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
