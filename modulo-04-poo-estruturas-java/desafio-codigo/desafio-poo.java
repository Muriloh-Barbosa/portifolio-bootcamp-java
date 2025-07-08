import java.util.ArrayList;
import java.util.List;

public class FiltroCandidatosPorHabilidade {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        // Simulando a entrada como se fosse digitada
        String entradaHabilidade = "3,java";
        String[] linhasCandidatos = {
                "Ana-java,sql,git",
                "Clara-python,css,html",
                "Felipe-java,spring,git"
        };

        // Processa a primeira linha
        String[] primeiraLinha = entradaHabilidade.split(",");
        int n = Integer.parseInt(primeiraLinha[0].trim());
        String habilidadeBuscada = primeiraLinha[1].trim().toLowerCase();

        List<String> candidatosComHabilidade = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String linha = linhasCandidatos[i].trim();
            String[] partes = linha.split("-", 2);
            String nome = partes[0].trim();
            String habilidades = partes.length > 1 ? partes[1].trim() : "";

            String[] listaHabilidades = habilidades.split(",");
            boolean possuiHabilidade = false;

            for (String hab : listaHabilidades) {
                if (hab.trim().toLowerCase().equals(habilidadeBuscada)) {
                    possuiHabilidade = true;
                    break;
                }
            }

            if (possuiHabilidade) {
                candidatosComHabilidade.add(nome);
            }
        }

        if (candidatosComHabilidade.isEmpty()) {
            System.out.println("Nenhum candidato encontrado");
        } else {
            for (String candidato : candidatosComHabilidade) {
                System.out.println(candidato);
            }
        }
        //scanner.close();
    }
}