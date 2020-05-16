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
        System.out.println("ENTRER N° CREATURE A PAYER");
        Scanner scan = new Scanner(System.in);
        int numCreaturePayee = scan.nextInt();

        System.out.println();

        Creature creaturePayee=this.pioche.get(numCreaturePayee);
        this.champBataille.add(creaturePayee);
        this.pioche.remove(numCreaturePayee);
        this.mana=this.mana - creaturePayee.getPrix();
    }
  
    public void genereMainDepart() {
        for (int i=0; i<7; i++){
            pioche.add(new Creature());
        }
    }

    public void printPioche() {
        System.out.println("MAIN JOUEUR");
        for(int i=0;i<this.pioche.size();i++){
            System.out.println("Carte n°" + i + ": Prix: " +this.pioche.get(i).getPrix() + " Force: " + this.pioche.get(i).getForce());
        }
        System.out.println();
        System.out.println("***");
        System.out.println();

    }

    public void printChampBataille() {
        System.out.println("CHAMP DE BATAILLE");
        for(int i=0;i<this.champBataille.size();i++){
            System.out.println("Carte n°" + i + ": Force: " + this.champBataille.get(i).getForce());
        }
        System.out.println();
        System.out.println("***");
        System.out.println();
    }

    public void addMana() {
        this.mana=numTour;
    }

}
