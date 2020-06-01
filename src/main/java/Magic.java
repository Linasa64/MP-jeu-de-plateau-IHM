import javax.swing.*;
import java.awt.event.*;

public class Magic {
  public static void main(String[] args) {

    Fenetre fen = new Fenetre();

    JButton b = new JButton("Commencer une partie");
    b.setBounds((fen.getWidth() - 300) / 2, 100, 300, 80);
    fen.add(b);

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Partie nouvellePartie = new Partie();
        fen.repaint();
      }
    });

  }
}
