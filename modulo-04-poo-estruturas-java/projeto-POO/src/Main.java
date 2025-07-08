import br.com.murilo.dominio.Aluno;
import br.com.murilo.dominio.Bootcamp;
import br.com.murilo.dominio.Conteudo;
import br.com.murilo.dominio.Curso;
import br.com.murilo.dominio.Mentoria;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        // =========================
        // Criando conteúdos
        // =========================
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Fundamentos");
        cursoJava.setDescricao("Curso completo de Java para iniciantes.");
        cursoJava.setCargaHoraria(8);

        Curso cursoJavascript = new Curso();
        cursoJavascript.setTitulo("JavaScript Moderno");
        cursoJavascript.setDescricao("Curso pratico de JavaScript.");
        cursoJavascript.setCargaHoraria(6);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria em Java");
        mentoriaJava.setDescricao("Sessão para duvidas e boas praticas em Java.");
        mentoriaJava.setData(LocalDate.now().plusDays(2));

        // =========================
        // Criando bootcamp
        // =========================
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Full Stack Developer");
        bootcamp.setDescricao("Programa completo com cursos e mentorias para desenvolvimento full stack.");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJavascript);
        bootcamp.getConteudos().add(mentoriaJava);

        // =========================
        // Aluno Vanessa
        // =========================
        Aluno vanessa = new Aluno();
        vanessa.setNomeCompleto("Vanessa Senju");
        vanessa.matricularNoBootcamp(bootcamp);

        System.out.println(">>> Progresso inicial - Vanessa");
        imprimirResumoAluno(vanessa);
        salvarRelatorioAlunoEmArquivo(vanessa);

        vanessa.progredir();
        vanessa.progredir();

        System.out.println(">>> Após progresso - Vanessa");
        imprimirResumoAluno(vanessa);
        salvarRelatorioAlunoEmArquivo(vanessa);

        // =========================
        // Aluno Murilo
        // =========================
        Aluno murilo = new Aluno();
        murilo.setNomeCompleto("Murilo Namikaze");
        murilo.matricularNoBootcamp(bootcamp);

        System.out.println(">>> Progresso inicial - Murilo");
        imprimirResumoAluno(murilo);
        salvarRelatorioAlunoEmArquivo(murilo);

        murilo.progredir();

        System.out.println(">>> Apos progresso - Murilo");
        imprimirResumoAluno(murilo);
        salvarRelatorioAlunoEmArquivo(murilo);

        // =========================
        // Aluno Pedro
        // =========================
        Aluno pedro = new Aluno();
        pedro.setNomeCompleto("Pedro Sarutobi");
        pedro.matricularNoBootcamp(bootcamp);

        System.out.println(">>> Progresso inicial - Pedro");
        imprimirResumoAluno(pedro);
        salvarRelatorioAlunoEmArquivo(pedro);

        pedro.progredir();
        pedro.progredir();
        pedro.progredir();

        System.out.println(">>> Apos progresso - Pedro");
        imprimirResumoAluno(pedro);
        salvarRelatorioAlunoEmArquivo(pedro);

        // =========================
        // Aluno Gabriel
        // =========================
        Aluno gabriel = new Aluno();
        gabriel.setNomeCompleto("Gabriel Hatake");
        gabriel.matricularNoBootcamp(bootcamp);

        System.out.println(">>> Progresso inicial - Gabriel");
        imprimirResumoAluno(gabriel);
        salvarRelatorioAlunoEmArquivo(gabriel);

        gabriel.progredir();

        System.out.println(">>> Apos progresso - Gabriel");
        imprimirResumoAluno(gabriel);
        salvarRelatorioAlunoEmArquivo(gabriel);
    }

    // =====================================================
    // Gambiarra para colorir a resposta
    // =====================================================
    public static void imprimirResumoAluno(Aluno aluno) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_YELLOW = "\u001B[33m";

        System.out.println(ANSI_CYAN + "========================================" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Relatorio do Aluno: " + aluno.getNomeCompleto() + ANSI_RESET);
        System.out.println(ANSI_CYAN + "----------------------------------------" + ANSI_RESET);

        // Conteúdos Matriculados
        System.out.println(ANSI_YELLOW + "Conteudos MATRICULADOS:" + ANSI_RESET);
        if (aluno.getConteudosMatriculados().isEmpty()) {
            System.out.println("  Nenhum conteudo matriculado no momento.");
        } else {
            int count = 1;
            for (Conteudo c : aluno.getConteudosMatriculados()) {
                System.out.printf("  %d) %s%n", count++, resumoConteudo(c));
            }
        }

        System.out.println();

        // Conteúdos Concluídos
        System.out.println(ANSI_YELLOW + "Conteudos CONCLUIDOS:" + ANSI_RESET);
        if (aluno.getConteudosConcluidos().isEmpty()) {
            System.out.println("  Nenhum conteudo concluido ainda.");
        } else {
            int count = 1;
            for (Conteudo c : aluno.getConteudosConcluidos()) {
                System.out.printf("  %d) %s%n", count++, resumoConteudo(c));
            }
        }

        System.out.println();
        System.out.printf(ANSI_GREEN + "Total de XP obtido: %.2f%n" + ANSI_RESET, aluno.calcularTotalXp());
        System.out.println(ANSI_CYAN + "========================================\n" + ANSI_RESET);
    }

    // =====================================================
    // Formtacao de datas
    // =====================================================
    public static String resumoConteudo(Conteudo conteudo) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        if (conteudo instanceof Curso) {
            Curso c = (Curso) conteudo;
            return String.format("Curso: %s (%d horas)", c.getTitulo(), c.getCargaHoraria());
        } else if (conteudo instanceof Mentoria) {
            Mentoria m = (Mentoria) conteudo;
            String dataFormatada = m.getData() != null ? m.getData().format(formatter) : "N/A";
            return String.format("Mentoria: %s (Data: %s)", m.getTitulo(), dataFormatada);
        } else {
            return conteudo.getTitulo();
        }
    }

    // =====================================================
    // salva relat do aluno em arquivo .txt   - Ideia surgiu devido uma automacao que fiz no excel
    // =====================================================
    public static void salvarRelatorioAlunoEmArquivo(Aluno aluno) {
        String nomeArquivo = aluno.getNomeCompleto().replaceAll(" ", "_") + "_relatorio.txt";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");

        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            writer.write("========================================\n");
            writer.write("Relatorio do Aluno: " + aluno.getNomeCompleto() + "\n");
            writer.write("----------------------------------------\n");

            writer.write("Conteudos MATRICULADOS:\n");
            if (aluno.getConteudosMatriculados().isEmpty()) {
                writer.write("  Nenhum contedo matriculado no momento.\n");
            } else {
                int count = 1;
                for (Conteudo c : aluno.getConteudosMatriculados()) {
                    writer.write("  " + (count++) + ") " + resumoConteudo(c) + "\n");
                }
            }

            writer.write("\n");

            writer.write("Conteudos CONCLUIDOS:\n");
            if (aluno.getConteudosConcluidos().isEmpty()) {
                writer.write("  Nenhum contuedo concluido ainda.\n");
            } else {
                int count = 1;
                for (Conteudo c : aluno.getConteudosConcluidos()) {
                    writer.write("  " + (count++) + ") " + resumoConteudo(c) + "\n");
                }
            }

            writer.write("\n");
            writer.write(String.format("Total de XP obtido: %.2f%n", aluno.calcularTotalXp()));
            writer.write("========================================\n");

            System.out.println("Relatorio salvo em arqiuvo: " + nomeArquivo + "\n");
        } catch (IOException e) {
            System.err.println("Erro ao salvar relatorio: " + e.getMessage());
        }
    }
}
