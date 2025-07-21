import java.util.*;

public class EndpointGetLista {
    public static void main(String[] args) {
        // Valor fixo para teste
        String linha = "Carlos Ana Beatriz";

        // TODO: Divida os nomes em um array:
        String[] nomes = linha.split("\\s+");

        // TODO: Ordene os nomes alfabeticamente:
        Arrays.sort(nomes);

        // TODO: Use o StringBuilder para construir a saída no formato JSON simples:
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        // TODO: Itere e adicione aspas e vírgulas entre os nome:s
        for (int i = 0; i < nomes.length; i++) {
            sb.append("\"").append(nomes[i]).append("\"");
            if (i < nomes.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        // Imprime a lista formatada
        System.out.println(sb.toString());
    }
}
