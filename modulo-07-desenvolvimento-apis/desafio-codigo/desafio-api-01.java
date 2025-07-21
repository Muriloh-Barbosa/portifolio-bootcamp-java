import java.util.*;

public class EndpointMaisAcessado {
    public static void main(String[] args) {
        // Valor fixo para teste
        String linha = "/login /home /login /profile";

        // TODO: Divida em array:
        String[] endpoints = linha.split("\\s+");

        // TODO: Crie um mapa para contar frequência:
        Map<String, Integer> frequencia = new LinkedHashMap<>();

        // TODO: Contabilize a frequência mantendo ordem de entrada:
        for (String endpoint : endpoints) {
            frequencia.put(endpoint, frequencia.getOrDefault(endpoint, 0) + 1);
        }

        // TODO: Encontre o endpoint com maior frequência:
        String maisAcessado = "";
        int maxFrequencia = 0;

        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                maisAcessado = entry.getKey();
                maxFrequencia = entry.getValue();
            }
        }

        // Imprime o endpoint mais acessado
        System.out.println(maisAcessado);
    }
}
