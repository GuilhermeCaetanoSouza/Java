

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeuTCC implements ActionListener {
    private JFrame frame;
    private JButton[][] buttons;
    private int[][] board;
    private boolean[][] revealed;
    private int size;
    private int bombs;
    private int blocksRemaining;

    private long startTime; // Variável para armazenar o tempo de início do jogo
    private JLabel timerLabel; // Rótulo para exibir o cronômetro
    private long elapsedTime; // Tempo decorrido desde o início do jogo

    private List<Long> bestTimes = new ArrayList<>(); // Lista para armazenar os melhores tempos

    public campo(int size, int bombs) {
        this.size = size;
        this.bombs = bombs;
        this.blocksRemaining = size * size - bombs;

        frame = new JFrame("Campo Minado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(size, size));

        buttons = new JButton[size][size];
        board = new int[size][size];
        revealed = new boolean[size][size];

        // Inicializa o tabuleiro com zeros
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }

        // Adiciona os botões à janela principal
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(this);
                buttons[i][j].addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        if (SwingUtilities.isRightMouseButton(e)) {
                            marcarBloco((JButton) e.getSource());
                        }
                    }
                });
                frame.add(buttons[i][j]);
            }
        }

        // Distribui as bombas pelo tabuleiro
        int count = 0;
        while (count < bombs) {
            int randX = (int) (Math.random() * size);
            int randY = (int) (Math.random() * size);
            if (board[randX][randY] != -1) {
                board[randX][randY] = -1;
                count++;
            }
        }

        timerLabel = new JLabel("Tempo: 0 s");
        frame.add(timerLabel);

        frame.setSize(500, 500);
        frame.setVisible(true);

        startTime = System.currentTimeMillis(); // Inicia a contagem do tempo
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        // Obtém a posição do botão clicado
        int x = -1, y = -1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (button == buttons[i][j]) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        // Verifica se o botão clicado tem uma bomba
        if (board[x][y] == -1) {
            button.setText("X");
            JOptionPane.showMessageDialog(frame, "Você perdeu!");
            reiniciarJogo();
        } else {
            revelarBloco(x, y, button);
            
            // Verifica se o jogador venceu o jogo
            if (checkWin()) {
                long endTime = System.currentTimeMillis();
                elapsedTime = (endTime - startTime) / 1000; // Tempo em segundos

                bestTimes.add(elapsedTime); // Adiciona o tempo atual à lista de melhores tempos
                Collections.sort(bestTimes); // Ordena os tempos

                if (bestTimes.size() > 3) {
                    bestTimes.remove(bestTimes.size() - 1); // Remove o pior tempo, se houver mais de 3 tempos
                }

                updateTimerLabel(); // Atualiza o rótulo do cronômetro
                updateBestTimesLabel(); // Atualiza o rótulo dos melhores tempos

                JOptionPane.showMessageDialog(frame, "Parabéns! Você venceu!", "Vitória", JOptionPane.INFORMATION_MESSAGE);
                reiniciarJogo();
            }
        }

        button.setEnabled(false); // Desabilita o botão após ser clicado
    }

    // ... (seu código existente)

    // Atualiza o rótulo do cronômetro com o tempo decorrido
    private void updateTimerLabel() {
        timerLabel.setText("Tempo: " + elapsedTime + " s");
    }

    // Atualiza o rótulo dos melhores tempos
    private void updateBestTimesLabel() {
        String bestTimesText = "Melhores Tempos:\n";
        for (int i = 0; i < bestTimes.size(); i++) {
            bestTimesText += (i + 1) + ". " + bestTimes.get(i) + " s\n";
        }
        JOptionPane.showMessageDialog(frame, bestTimesText, "Melhores Tempos", JOptionPane.INFORMATION_MESSAGE);
    }

    // ... (seu código existente)

    // Marca ou desmarca um bloco com um ponto de interrogação
    private void marcarBloco(JButton button) {
        if (button.getText().equals("")) {
            button.setText("?");
        } else if (button.getText().equals("?")) {
            button.setText("");
        }
    }

    // Revela o conteúdo de um bloco

    private void revelarBloco(int x, int y, JButton meubutton) {
        if (revealed[x][y]) {
            return;
        }

        revealed[x][y] = true;
        int count = countBombs(x, y);
        if (count == 0) {
            meubutton.setText("");
        } else {
            meubutton.setText(Integer.toString(count));
        }

        blocksRemaining--;
    }

    // Conta o número de bombas ao redor de uma posição
    private int countBombs(int x, int y) {
        int count = 0;
        for (int i = Math.max(0, x - 1); i <= Math.min(size - 1, x + 1); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(size - 1, y + 1); j++) {
                if (board[i][j] == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    // Verifica se todas as células sem bomba foram reveladas
    private boolean checkWin() {
        return blocksRemaining == 0;
    }

    // Reinicia o jogo
    private void reiniciarJogo() {
        frame.dispose(); // Fecha a janela atual
        new campo(size, bombs); // Cria um novo jogo
    }}
