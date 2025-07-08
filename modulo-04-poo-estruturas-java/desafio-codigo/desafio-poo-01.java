import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ClassificacaoCandidatos {

    static class Candidato {
        String nome;
        int pontuacao;

        Candidato(String nome, int pontuacao) {
            this.nome = nome;
            this.pontuacao = pontuacao;
        }
    }

    public static void main(String[] args) {
        // Simulando a entrada como se fosse digitada
        int n = 3;
        String[] dadosEntrada = {
                "Ana,85",
                "Bruno,90",
                "Clara,75"
        };

        List<Candidato> candidatos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String linha = dadosEntrada[i].trim();
            //String linha = scanner.nextLine().trim();
            // Exemplo de entrada: "Ana,85"
            String[] partes = linha.split(",");
            String nome = partes[0].trim();
            int pontuacao = Integer.parseInt(partes[1].trim());
            candidatos.add(new Candidato(nome, pontuacao));
        }

        // TODO: Ordene: maior pontuação primeiro; se empate, ordem alfabética do nome
        Collections.sort(candidatos, new Comparator<Candidato>() {
            @Override
            public int compare(Candidato c1, Candidato c2) {
                if (c2.pontuacao != c1.pontuacao) {
                    return Integer.compare(c2.pontuacao, c1.pontuacao);
                } else {
                    return c1.nome.compareTo(c2.nome);
                }
            }
        });
        // Imprimir nomes na ordem definida
        for (Candidato c : candidatos) {
            System.out.println(c.nome);
        }

        //scanner.close();
    }
}