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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel; // j'ai tout mis parce que j'ai essayé avec plein de trucs, j'enlèverai plus tard les bibliothèques inutiles

public class BoutonsCreatures extends JPanel /* implements ActionListener */ { // j'ai mis en commentaire pour compiler
                                                                               // mais il y a l'amorce en bas aussi
    private ArrayList<Creature> pioche;
    private ArrayList<Creature> champBataille;

    public void boutonsPioche() {
        JPanel creatures = new JPanel();
        creatures.setLayout(new BoxLayout(creatures, BoxLayout.LINE_AXIS));
        for (int i = 0; i <= this.pioche.size(); i++) {
            creatures.add(new JButton(i + ": " + this.pioche.get(i).getNom()));
        }
        JPanel stop = new JPanel();
        stop.add(new JButton("Je passe"));

        JPanel groupeBoutons = new JPanel();
        groupeBoutons.setLayout(new BoxLayout(groupeBoutons, BoxLayout.PAGE_AXIS));
        groupeBoutons.add(creatures);
        groupeBoutons.add(stop);
    }

    // je sais pas comment faire le lien entre les boutons et les actions à
    // effectuer avec les créatures dans les listes
    // Surtout que les attributs de cette classe ne sont pas les mêmes que ceux de
    // la classe joueur ??

    /*
     * public void actionPerformed(ActionEvent e) {
     * 
     * if (e.getSource() == this.button1) { Creature
     * creaturePayee=this.pioche.get(numCreaturePayee);
     * this.champBataille.add(creaturePayee); this.pioche.remove(numCreaturePayee);
     * this.mana=this.mana - creaturePayee.getPrix(); } if (e.getSource() ==
     * this.button2) {
     * 
     * } }
     */

}