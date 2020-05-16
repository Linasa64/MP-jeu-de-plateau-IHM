import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

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
}
