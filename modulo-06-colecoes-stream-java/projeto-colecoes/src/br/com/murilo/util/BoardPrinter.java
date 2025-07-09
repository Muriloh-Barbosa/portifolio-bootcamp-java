package br.com.murilo.util;

import br.com.murilo.model.SudokuBoard;
import br.com.murilo.model.Cell;

public class BoardPrinter {
    public static void print(SudokuBoard board) {
        Cell[][] grid = board.getGrid();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("+-------+-------+-------+");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");
                int val = grid[i][j].getValue();
                System.out.print(val == 0 ? ". " : val + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }
}
