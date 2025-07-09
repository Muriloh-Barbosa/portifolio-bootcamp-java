import java.util.*;

public class GerenciamentoTarefas {
    public static void main(String[] args) {
        // Simulando entrada fixa
        int n = 3;
        String[] entradas = {
            "Estudar Java, 1",
            "Reuniao Tech, 3",
            "Pausa Cafe, 2"
        };

        // TODO: Crie uma lista para armazenar as tarefas como pares (nome, prioridade):
        List<Tarefa> tarefas = new ArrayList<>();

        // TODO: Leia cada linha, separada por nome e prioridade e adiciona à lista:
        for (int i = 0; i < n; i++) {
            String linha = entradas[i];
            String[] partes = linha.split(",");
            String nome = partes[0].trim();
            int prioridade = Integer.parseInt(partes[1].trim());
            tarefas.add(new Tarefa(nome, prioridade));
        }

        // TODO: Ordene a lista pela prioridade crescente:
        tarefas.sort(Comparator.comparingInt(t -> t.prioridade));

        // Imprime a lista ordenada no formato "tarefa - prioridade":
        for (Tarefa t : tarefas) {
            System.out.println(t.nome + " - " + t.prioridade);
        }
    }

    // Classe auxiliar para armazenar nome e prioridade:
    static class Tarefa {
        String nome;
        int prioridade;

        public Tarefa(String nome, int prioridade) {
            this.nome = nome;
            this.prioridade = prioridade;
        }
    }
}
