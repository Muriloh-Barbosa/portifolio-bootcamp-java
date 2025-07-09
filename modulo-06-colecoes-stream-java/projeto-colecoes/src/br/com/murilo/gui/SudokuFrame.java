package br.com.murilo.gui;

import br.com.murilo.model.SudokuBoard;
import br.com.murilo.model.Cell;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.List;

public class SudokuFrame extends JFrame {
    private SudokuBoard board;
    private JPanel boardPanel;
    private JTextField[][] cells;

    public SudokuFrame() {
        // Configura janela básica
        setTitle("Sudoku - Java");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // escolha da dificuldade e board com números fixos
        escolherDificuldade();

        // Criar o painel com base no board já preenchido
        boardPanel = new JPanel(new GridLayout(9, 9));
        add(boardPanel, BorderLayout.CENTER);
        add(buildControlPanel(), BorderLayout.SOUTH);

        //Renderiza os campos com números fixos
        renderBoard();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /*
     Painel de botões de ação
     */
    private JPanel buildControlPanel() {
        JPanel panel = new JPanel();

        JButton verificarButton = new JButton("Verificar");
        verificarButton.addActionListener(e -> verificarTabuleiro());

        JButton limparButton = new JButton("Limpar");
        limparButton.addActionListener(e -> limparEntradasUsuario());

        JButton novoJogoButton = new JButton("Novo Jogo");
        novoJogoButton.addActionListener(e -> {
            escolherDificuldade();
            renderBoard();
        });

        JButton sairButton = new JButton("Sair");
        sairButton.addActionListener(e -> System.exit(0));

        panel.add(verificarButton);
        panel.add(limparButton);
        panel.add(novoJogoButton);
        panel.add(sairButton);

        return panel;
    }

    /*
     Mostra descolha dificuldade e inicializa
     */
    private void escolherDificuldade() {
        // Opções de dificuldade
        Object[] opcoes = {"Facil", "Medio", "Dificil"};
        String escolha = (String) JOptionPane.showInputDialog(
                this,
                "Escolha o nível de dificuldade:",
                "Novo Jogo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                "Facil");

        // Cria novo board
        board = new SudokuBoard();

        // Se o usuário escolher e existir, carrega.
        if (escolha != null && Dificuldade.PRESETS.containsKey(escolha)) {
            List<String> presets = Dificuldade.PRESETS.get(escolha);
            for (String item : presets) {
                String[] parts = item.split(",");
                int row = Integer.parseInt(parts[0]);
                int col = Integer.parseInt(parts[1]);
                int num = Integer.parseInt(parts[2]);
                board.setFixedNumber(row, col, num);
            }
        }
    }

    /*
     Renderiza o grid 9x9 com numeros fixos e editáveis
     */
    private void renderBoard() {
        boardPanel.removeAll();
        cells = new JTextField[9][9];
        Cell[][] grid = board.getGrid();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JTextField field = new JTextField();
                field.setHorizontalAlignment(JTextField.CENTER);
                field.setFont(new Font("SansSerif", Font.BOLD, 18));

                if (grid[i][j].isFixed()) {
                    field.setText(String.valueOf(grid[i][j].getValue()));
                    field.setEditable(false);
                    field.setBackground(Color.LIGHT_GRAY);
                }

                field.setBorder(getCellBorder(i, j));
                cells[i][j] = field;
                boardPanel.add(field);
            }
        }
        boardPanel.revalidate();
        boardPanel.repaint();
    }

    /*
     Define as bordas para destacar os blocos 3x3
     */
    private Border getCellBorder(int row, int col) {
        int top = (row % 3 == 0) ? 3 : 1;
        int left = (col % 3 == 0) ? 3 : 1;
        int bottom = ((row + 1) % 3 == 0) ? 3 : 1;
        int right = ((col + 1) % 3 == 0) ? 3 : 1;
        return BorderFactory.createMatteBorder(top, left, bottom, right, Color.BLACK);
    }

    /*
     Verifica o status do jogo
     */
    private void verificarTabuleiro() {
        updateBoardFromFields();
        String status = board.getStatus();
        JOptionPane.showMessageDialog(this, "Status atual: " + status);
    }

    /*
     LimpaR s entradas do usuario, mantendo numeros fixo
     */
    private void limparEntradasUsuario() {
        board.clearUserNumbers();
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                if (!board.getGrid()[i][j].isFixed())
                    cells[i][j].setText("");
    }

    /*
     Atualiza o modelo de dados a partir dos campos de texto
     */
    private void updateBoardFromFields() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!board.getGrid()[i][j].isFixed()) {
                    String text = cells[i][j].getText().trim();
                    try {
                        int val = Integer.parseInt(text);
                        board.placeNumber(i, j, val);
                    } catch (NumberFormatException e) {
                        board.removeNumber(i, j);
                    }
                }
            }
        }
    }
}
