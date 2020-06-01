import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
 
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
    private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g){                
        Font font = new Font("Courier", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.darkGray);          
        g.drawString("Bienvenue à toi nouveau joueur !", this.getWidth()/2-130, 20);             
    }
}
