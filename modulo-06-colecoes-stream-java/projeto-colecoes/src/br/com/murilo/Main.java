package br.com.murilo;

import br.com.murilo.gui.SudokuFrame;

public class Main {
    public static void main(String[] args) {
        new SudokuFrame();
    }
}


/*

//* DESOMENTE ESSE TRECHO PARA TESTAR NO TERMINAL

package br.com.murilo;

import br.com.murilo.model.SudokuBoard;
import br.com.murilo.gui.SudokuFrame;

public class Main {
    public static void main(String[] args) {
        // Cria um tabuleiro vazio
        SudokuBoard board = new SudokuBoard();

        // Carrega números fixos dos argumentos (opcional)
        for (String arg : args) {
            String[] parts = arg.split(",");
            if (parts.length == 3) {
                int row = Integer.parseInt(parts[0]);
                int col = Integer.parseInt(parts[1]);
                int num = Integer.parseInt(parts[2]);
                board.setFixedNumber(row, col, num);
            }
        }

        new SudokuFrame(board);
    }
}

 */