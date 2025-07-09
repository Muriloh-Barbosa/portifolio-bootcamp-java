package br.com.murilo.ui;

import br.com.murilo.model.SudokuBoard;
import br.com.murilo.util.BoardPrinter;
import java.util.Scanner;


/*TODO: CLASSE NÃO UTILIZADA, ADICIONAR NO MAIN.JVA SOMENTE QUANDO FOR TESTAR NO TERMINAL*/


public class Menu {
    private final SudokuBoard board;
    private final Scanner scanner;

    public Menu(SudokuBoard board) {
        this.board = board;
        this.scanner = new Scanner(System.in);
    }

    public void show() {
        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Iniciar novo jogo");
            System.out.println("2. Colocar um novo número");
            System.out.println("3. Remover um número");
            System.out.println("4. Verificar jogo");
            System.out.println("5. Verificar status do jogo");
            System.out.println("6. Limpar");
            System.out.println("7. Finalizar o jogo");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.println("Jogo já iniciado com números fixos ao rodar o programa.");
                case 2 -> placeNumber();
                case 3 -> removeNumber();
                case 4 -> BoardPrinter.print(board);
                case 5 -> System.out.println("Status: " + board.getStatus());
                case 6 -> {
                    board.clearUserNumbers();
                    System.out.println("Limpo!");
                }
                case 7 -> finalizeGame();
                case 0 -> running = false;
                default -> System.out.println("Opçao invalida!");
            }
        }
    }

    private void placeNumber() {
        System.out.print("Linha (0-8): ");
        int row = scanner.nextInt();
        System.out.print("Coluna (0-8): ");
        int col = scanner.nextInt();
        System.out.print("Número (1-9): ");
        int num = scanner.nextInt();

        if (board.placeNumber(row, col, num)) {
            System.out.println("Número inserido com sucesso!");
        } else {
            System.out.println("Posição já ocupada ou fixa!");
        }
    }

    private void removeNumber() {
        System.out.print("Linha (0-8): ");
        int row = scanner.nextInt();
        System.out.print("Coluna (0-8): ");
        int col = scanner.nextInt();

        if (board.removeNumber(row, col)) {
            System.out.println("Número removido!");
        } else {
            System.out.println("Não é possível remover um número fixo!");
        }
    }

    private void finalizeGame() {
        if (!board.isFull()) {
            System.out.println("Existem espaços vazios. Complete o tabuleiro!");
        } else if (board.hasErrors()) {
            System.out.println("Há erros no preenchimento. Corrija antes de finalizar!");
        } else {
            System.out.println("Parabéns! Jogo finalizado com sucesso.");
            System.exit(0);
        }
    }
}
