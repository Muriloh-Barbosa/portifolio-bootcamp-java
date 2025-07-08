package br.com.murilo.dominio;

/**
 * Classe abstrata que representa um conteúdo genérico no bootcamp,
 * como cursos ou mentorias.
 * Define o contrato para cálculo de XP.
 */
public abstract class Conteudo {

    protected static final double XP_PADRAO_BASE = 10d;

    private String titulo;
    private String descricao;

    /**
     * Método abstrato que calcula o XP gerado ao concluir o conteúdo.
     * Implementado nas subclasses.
     *
     * @return XP obtido
     */
    public abstract double calcularXp();

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo {" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
