import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import java.util.Scanner; 

public class Joueur {
    int pv;
    String nomJoueur;
    int mana;
    int numTour;
    ArrayList<Creature> pioche;
    ArrayList<Creature> champBataille;

    public Joueur(){
        this.pv=20;
        this.pioche = new ArrayList<Creature>();
        this.champBataille = new ArrayList<Creature>();
        this.numTour=0;
    }

    public void payerCreature () {
        Scanner scan = new Scanner(System.in);
        int numCreaturePayee = scan.nextInt();

        Creature creaturePayee=this.pioche.get(numCreaturePayee);
        this.champBataille.add(creaturePayee);
        this.pioche.remove(numCreaturePayee);
    }
  
    public void genereMainDepart() {
        for (int i=0; i<7; i++){
            pioche.add(new Creature());
        }
    }

    public void printPioche() {
        for(int i=0;i<this.pioche.size();i++){
            System.out.println("Carte n°" + i + ": Prix: " +this.pioche.get(i).getPrix() + " Force: " + this.pioche.get(i).getForce());
        }
    }

    public void addMana() {
        this.mana=numTour;
    }

}
