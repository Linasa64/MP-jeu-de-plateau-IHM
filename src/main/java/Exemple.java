import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Exemple extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;

    private JButton button;
    private JButton button2;

    public Exemple() {
        this.button = new JButton("Exemple");
        this.button.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        Font font = new Font("Courier", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.darkGray);
        g.drawString("Bienvenue à toi nouveau joueur !", this.getWidth() / 2 - 130, 20);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button) {
            System.out.println("Coucou");
        }
        if (e.getSource() == this.button2) {

        }
    }
}
