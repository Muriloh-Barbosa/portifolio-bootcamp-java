package br.com.murilo.dominio;

import java.time.LocalDate;

/**
 * Representa uma mentoria no bootcamp.
 * Estende Conteudo e define uma regra própria de XP.
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO_BASE + 20d;
    }

    // Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria {" +
                "\n  titulo='" + getTitulo() + '\'' +
                ",\n  descricao='" + getDescricao() + '\'' +
                ",\n  data=" + data +
                "\n}";
    }
}
