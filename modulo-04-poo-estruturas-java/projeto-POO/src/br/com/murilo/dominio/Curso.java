package br.com.murilo.dominio;

/**
 * Representa um curso dentro do bootcamp.
 * Estende Conteudo e define a regra de XP com base na carga horária.
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO_BASE * cargaHoraria;
    }

    // Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "\n  titulo='" + getTitulo() + '\'' +
                ",\n  descricao='" + getDescricao() + '\'' +
                ",\n  cargaHoraria=" + cargaHoraria + " horas" +
                "\n}";
    }
}
