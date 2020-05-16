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
        this.pioche = new ArrayList<Creature>();
        this.champBataille = new ArrayList<Creature>();
    }

    public void payerCreature () {
        Scanner scan = new Scanner(System.in);
        int numCreaturePayee = scan.nextInt();

        Creature creaturePayee=this.pioche.get(numCreaturePayee);
        this.champBataille.add(creaturePayee);
        this.pioche.remove(numCreaturePayee);
    }

}
