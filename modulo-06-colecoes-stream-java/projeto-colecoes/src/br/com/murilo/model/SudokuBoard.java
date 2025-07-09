package br.com.murilo.model;

public class SudokuBoard {
    private final Cell[][] grid;
    private boolean userPlayed;

    public SudokuBoard() {
        grid = new Cell[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = new Cell();
        userPlayed = false;
    }

    public void setFixedNumber(int row, int col, int number) {
        grid[row][col].setFixed(number);
    }

    public boolean placeNumber(int row, int col, int number) {
        if (grid[row][col].isFixed() || !grid[row][col].isEmpty()) {
            return false;
        }
        grid[row][col].setValue(number);
        userPlayed = true;
        return true;
    }

    public boolean removeNumber(int row, int col) {
        if (grid[row][col].isFixed()) {
            return false;
        }
        grid[row][col].clear();
        return true;
    }

    public void clearUserNumbers() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j].clear();
        userPlayed = false;
    }

    public Cell[][] getGrid() {
        return grid;
    }

    public boolean isFull() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (grid[i][j].isEmpty()) return false;
        return true;
    }

    public boolean hasErrors() {
        // Linhas
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int val = grid[i][j].getValue();
                if (val != 0) {
                    if (seen[val]) return true;
                    seen[val] = true;
                }
            }
        }

        // Colunas
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[10];
            for (int i = 0; i < 9; i++) {
                int val = grid[i][j].getValue();
                if (val != 0) {
                    if (seen[val]) return true;
                    seen[val] = true;
                }
            }
        }

        // Blocos 3x3
        for (int blockRow = 0; blockRow < 9; blockRow += 3) {
            for (int blockCol = 0; blockCol < 9; blockCol += 3) {
                boolean[] seen = new boolean[10];
                for (int i = blockRow; i < blockRow + 3; i++)
                    for (int j = blockCol; j < blockCol + 3; j++) {
                        int val = grid[i][j].getValue();
                        if (val != 0) {
                            if (seen[val]) return true;
                            seen[val] = true;
                        }
                    }
            }
        }

        return false;
    }

    public String getStatus() {
        if (!userPlayed) {
            return "NAO INICIADO";
        }
        if (!isFull()) {
            return hasErrors() ? "NUMERO JA EXISTE NA LINHA OU COLUNA SELECIONADA" : " PREENCHA TODOS OS CAMPOS";
        }
        return hasErrors() ? "REVISE TODOS OS CAMPOS" : "COMPLETO";
    }
}
