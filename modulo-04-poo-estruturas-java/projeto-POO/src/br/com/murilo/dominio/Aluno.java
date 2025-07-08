package br.com.murilo.dominio;

import java.util.*;

/**
 * Representa um aluno participante do bootcamp.
 */
public class Aluno {
    private String nomeCompleto;
    private Set<Conteudo> conteudosMatriculados = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void matricularNoBootcamp(Bootcamp bootcamp) {
        this.conteudosMatriculados.addAll(bootcamp.getConteudos());
        bootcamp.getAlunosMatriculados().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosMatriculados.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosMatriculados.remove(conteudo.get());
        } else {
            System.out.println("Nenhum conteudo restante para progredir!");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    // Getters e Setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Set<Conteudo> getConteudosMatriculados() {
        return conteudosMatriculados;
    }

    public void setConteudosMatriculados(Set<Conteudo> conteudosMatriculados) {
        this.conteudosMatriculados = conteudosMatriculados;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nomeCompleto, aluno.nomeCompleto)
                && Objects.equals(conteudosMatriculados, aluno.conteudosMatriculados)
                && Objects.equals(conteudosConcluidos, aluno.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCompleto, conteudosMatriculados, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", matriculados=" + conteudosMatriculados +
                ", concluidos=" + conteudosConcluidos +
                '}';
    }
}