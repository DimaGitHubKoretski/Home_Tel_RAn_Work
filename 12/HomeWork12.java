/**
 * Java Basic Home Work #4
 *
 * @author Dzmitry Karetsi
 * @todo 17.09.2022
 * @data 20.09.2022
 *
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomeWork12  extends JFrame {
    private final int PANEL_SIZE = 500;
    private final int CELL_SIZE = PANEL_SIZE / 3;
    private boolean gameOwer = false;

    public static void main(String[] args) {
        new HomeWork12();
    }

    public HomeWork12() {
        setTitle("Tic Tac toe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        TicTacToe.init();

        PaintPanel paintPanel = new PaintPanel();
        paintPanel.setBackground(Color.white);
        paintPanel.setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
        paintPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / CELL_SIZE;
                int y = e.getY() / CELL_SIZE;

                if (TicTacToe.isCellValid(x, y) && !gameOwer) {
                    TicTacToe.table[y][x] = 'x';
                    if (TicTacToe.isWin('x')) {
                        System.out.println("YOU WIN!");
                        gameOwer = true;
                    }
                    if (TicTacToe.isTableFill()) {
                        System.out.println("Sorry ,DRAWN!");
                        gameOwer = true;
                    }
                    if (!gameOwer) {
                        TicTacToe.turnAl();
                        if (TicTacToe.isWin('o')) {
                            System.out.println("Al WON!");
                            gameOwer = true;
                        }
                    }

                    paintPanel.repaint();
                }
            }
        });
        Button restart = new Button("Restart");
        restart.addActionListener(e -> {
            TicTacToe.init();
            gameOwer = false;
            paintPanel.repaint();
        });
        Button exit = new Button("Exit");
        exit.addActionListener(e -> System.exit(0));

        JPanel btnPanel = new JPanel();
        btnPanel.add(restart);
        btnPanel.add(exit);

        add(paintPanel, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class PaintPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.lightGray);
            for (int i = 1; i < 3; i++) {
                g.drawLine(0, CELL_SIZE * i, PANEL_SIZE, CELL_SIZE * i);
                g.drawLine(CELL_SIZE * i, 0, CELL_SIZE * i, PANEL_SIZE);
            }
            Graphics2D g2 = (Graphics2D) g;

            g2.setStroke(new BasicStroke(10f));

            for (int y = 0; y < 3; y++) {
                for (int x = 0; x < 3; x++) {
                    if (TicTacToe.table[y][x] == 'x') {
                        g.setColor(Color.blue);
                        g.drawLine(x * CELL_SIZE + 30, y * CELL_SIZE + 30,
                                (x + 1) * CELL_SIZE - 30, (y + 1) * CELL_SIZE - 30);
                        g.drawLine((x + 1) * CELL_SIZE - 30, y * CELL_SIZE + 30,
                                x * CELL_SIZE + 30, (y + 1) * CELL_SIZE - 30);

                    }
                    if (TicTacToe.table[y][x] == 'o') {
                        g.setColor(Color.red);
                        g.drawOval(x * CELL_SIZE + 20, y * CELL_SIZE + 20, CELL_SIZE - 40, CELL_SIZE - 40);
                    }

                }

            }

        }
    }
}