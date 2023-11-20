import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class board {

    private JButton a1;
    private JButton a2;
    private JButton a3;

    private JButton b1;
    private JButton b2;
    private JButton b3;

    private JButton c1;
    private JButton c2;
    private JButton c3;
    private boolean go = true;

    public board() {

        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(3, 3));

        a1 = new JButton();
        a1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(a1);

            }
        });

        a2 = new JButton();
        a2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(a2);

            }
        });

        a3 = new JButton();
        a3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(a3);

            }
        });

        b1 = new JButton();
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(b1);

            }
        });

        b2 = new JButton();
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(b2);

            }
        });

        b3 = new JButton();
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(b3);
            }
        });

        c1 = new JButton();
        c1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(c1);

            }
        });

        c2 = new JButton();
        c2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(c2);
            }
        });

        c3 = new JButton();
        c3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setPlayer(c3);
            }
        });

        panel.add(a1);
        panel.add(a2);
        panel.add(a3);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        panel.add(c1);
        panel.add(c2);
        panel.add(c3);

        frame.setVisible(true);

    }

    public static void reset(JButton a1, JButton a2, JButton a3, JButton b1, JButton b2, JButton b3, JButton c1,
            JButton c2, JButton c3) {
        a1.setText("");
        a2.setText("");
        a3.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        c1.setText("");
        c2.setText("");
        c3.setText("");
    }

    public void setPlayer(JButton button) {
        if (button.getText().equals("")) {
            if (go == true) {
                button.setFont(new Font("Arial", Font.PLAIN, 40));
                a1.setFont(new Font("Arial", Font.PLAIN, 40));
                button.setForeground(Color.RED);
                button.setText("X");
                board.this.go = false;
            } else {
                button.setFont(new Font("Arial", Font.PLAIN, 40));
                a1.setFont(new Font("Arial", Font.PLAIN, 40));
                button.setForeground(Color.BLUE);
                button.setText("O");
                board.this.go = true;
            }
            checkWins(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        }

    }

    public static void checkWins(JButton a1, JButton a2, JButton a3, JButton b1, JButton b2, JButton b3, JButton c1,
            JButton c2, JButton c3) {
        if (a1.getText().equals(a2.getText()) && a2.getText().equals(a3.getText()) && !a1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player " + a1.getText() + " Wins!");
            reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        } else if (b1.getText().equals(b2.getText()) && b2.getText().equals(b3.getText()) && !b1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player " + b1.getText() + " Wins!");
            reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        } else if (c1.getText().equals(c2.getText()) && c2.getText().equals(c3.getText()) && !c1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player " + c1.getText() + " Wins!");
            reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        } else if (a1.getText().equals(b1.getText()) && b1.getText().equals(c1.getText()) && !a1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player " + a1.getText() + " Wins!");
            reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        } else if (a2.getText().equals(b2.getText()) && b2.getText().equals(c2.getText()) && !a2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player " + a2.getText() + " Wins!");
            reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        } else if (a3.getText().equals(b3.getText()) && b3.getText().equals(c3.getText()) && !a3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player " + a3.getText() + " Wins!");
            reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        } else if (a1.getText().equals(b2.getText()) && b2.getText().equals(c3.getText()) && !a1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player " + a1.getText() + " Wins!");
            reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        } else if (a3.getText().equals(b2.getText()) && b2.getText().equals(c1.getText()) && !a3.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Player " + a3.getText() + " Wins!");
            reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
        } else {
            if (!a1.getText().equals("") && !a2.getText().equals("") && !a3.getText().equals("")
                    && !b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("")
                    && !c1.getText().equals("") && !c2.getText().equals("") && !c3.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "It's a Tie!");
                reset(a1, a2, a3, b1, b2, b3, c1, c2, c3);
            }
        }

    }
}