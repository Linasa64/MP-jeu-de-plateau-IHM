import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

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
    Joueur adversaire;
    

    public Joueur(){
        System.out.println("Ouech bien ou quoi ? C'est quoi ton blaze ?");
        this.pv=20;
        Scanner monNom = new Scanner(System.in);
        this.nomJoueur=monNom.nextLine();
        this.pioche = new ArrayList<Creature>();
        this.champBataille = new ArrayList<Creature>();
        this.numTour=0;
    }

    public void payerCreature () {

        System.out.println();
        System.out.println("* * * PAYER CREATURE * * *");
        System.out.println();

                System.out.println("ENTRER N° CREATURE A PAYER");
                System.out.println("Taper 0 pour passer");
                Scanner scan = new Scanner(System.in);
                int numCreaturePayee = scan.nextInt();
                if(numCreaturePayee==0){
                	System.out.println("TOUR PASSÉ");
                }else{

                System.out.println();

                Creature creaturePayee=this.pioche.get(numCreaturePayee);
                if(creaturePayee.getPrix()<=this.mana){
                    this.champBataille.add(creaturePayee);
                    this.pioche.remove(numCreaturePayee);
                    this.mana=this.mana - creaturePayee.getPrix();
                }
                else{
                    System.out.println("VOUS N'AVEZ PAS ASSEZ DE MANA POUR PAYER CETTE CREATURE. SAISISSEZ UN NOUVEAU N°");
                }
            }
    
            
        System.out.println();
        System.out.println("* * * PHASE D'ATTAQUE * * *");
        System.out.println();
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
    
    public void attaque(){
		
		System.out.println("ENTRER NÂ° CREATURE ATTAQUANTE"); // on attaque avec une carte Ã  la fois 
        Scanner scan = new Scanner(System.in);
        int numCreatureAttaquante = scan.nextInt();

        System.out.println();
		
		double chanceAttaque=Math.random();
		
		if (chanceAttaque <= 0.33){  // attaque reussit
			System.out.println("*Rick astley danse*");
			System.out.println("votre attaque rÃ©ussit");
			Creature creatureAttaquante=this.champBataille.get(numCreatureAttaquante);
			this.adversaire.pv=this.adversaire.pv-creatureAttaquante.getForce();
			
		}
		else if (chanceAttaque >= 0.66){ // l'attaque ne rÃ©ussit pas la crÃ©ature se dÃ©truit
			
			System.out.println("WASTED LA NUCLEARITE DES ROLLERS A DETRUIT VOTRE CARTE"); // eddy malou n'est pas fier de vous
			this.champBataille.remove(numCreatureAttaquante);			
			
		}
		else { // il ne se passe rien
			System.out.println ("c'est comme dans plus belle la vie : il ne se passe rien");
		
        }
        
        System.out.println();
        System.out.println("***");
        System.out.println();

	}
    
    public int getPV () {
        return this.pv;
    }

    public void printPV () {
        System.out.print(this.pv);
    }
	
}
