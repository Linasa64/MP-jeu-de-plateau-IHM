import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.*;

import javax.swing.JPanel;

public class AffichageEtatJeu extends JPanel {
    private static final long serialVersionUID = 1L;
    private Joueur joueur;
    private Fenetre fen;

    public void etatJeu(Graphics g) {
        JLabel nomJoueur = new JLabel(this.joueur.getNomJoueur());
        nomJoueur.setBounds(50, 50, 100, 30);
        JLabel pvJoueur = new JLabel(String.valueOf(this.joueur.getPV()));
        nomJoueur.setBounds(50, 100, 100, 30);
        JLabel manaJoueur = new JLabel(String.valueOf(this.joueur.getMana()));
        nomJoueur.setBounds(50, 150, 100, 30);

        fen.add(nomJoueur);
        fen.add(pvJoueur);
        fen.add(manaJoueur);
    }

}