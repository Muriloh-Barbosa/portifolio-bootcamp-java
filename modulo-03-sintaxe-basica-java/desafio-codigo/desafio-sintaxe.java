import java.util.Scanner;

public class CorporateEmailValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expectedDomain = "@company.com";

        System.out.println("Digite o e-mail");

        String email = scanner.nextLine().trim();

        // TODO: Verifique se o e-mail contém o domínio esperado

        // Utilizado o endsWith, pois vai validar se a string termina com o sufixo especificado
        if (email.endsWith(expectedDomain)) {
          System.out.println("E-mail valido");
        }
        else {
          System.out.println("E-mail invalido");
        }

        scanner.close();
    }
}