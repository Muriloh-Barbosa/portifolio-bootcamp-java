import java.util.*;

public class OrganizadorHorarios {
    public static void main(String[] args) {
        // Simulando entrada fixa
        int n = 5;
        String[] entradas = {
                "08:00",
                "08:00",
                "08:00",
                "09:00",
                "10:00"
        };

        // Usamos TreeSet para armazenar horarios unicos e ordenados automaticamente
        Set<String> horarios = new TreeSet<>();

        // TODO: leia cada horario e adicione ao conjunto
        for (int i = 0; i < n; i++) {
            String horario = entradas[i].trim();
            horarios.add(horario);
        }

        // TODO: Imprima os horarios unicos em ordem crescente:
        for (String horario : horarios) {
            System.out.println(horario);
        }

        // TODO: Imprima o total de horarios unicos:
        System.out.println("Total de horarios unicos: " + horarios.size());
    }
}