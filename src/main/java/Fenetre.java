import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout; 
 
public class Fenetre extends JFrame {


  public Fenetre(){                
    this.setTitle("It's a kind of magic magiiiiiic");
    this.setSize(1000, 800);
    this.setLocationRelativeTo(null);               
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new Panneau());
    this.setVisible(true); 

  }     
}