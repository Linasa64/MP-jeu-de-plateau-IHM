import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Fenetre extends JFrame {

  /**
   * Constructeur de la fenêtre.
   * Choix nom fenêtre
   * Choix de sa taille
   * Redimensionnement impossible
   * Position de la fenêtre: centrée
   * Fenêtre visible
   */

  public Fenetre() {
    this.setTitle("Je ne crois pas qu'il y ait de bons ou de mauvais jeux, la vie c'est avant tout des rencontres, des gens qui m'ont tendu la main à un moment où je ne pouvais pas, où j'étais seul chez moi.");
    this.setSize(1000, 800);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setContentPane(new Panneau());
    this.setVisible(true);
  }
}