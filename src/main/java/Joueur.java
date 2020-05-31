import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import java.util.Scanner; 

public class Joueur {
    private int pv; 
    private String nomJoueur;
    private int mana;
    private int numTour;
    private ArrayList<Creature> pioche;
    private ArrayList<Creature> champBataille;
    private Joueur adversaire;
    

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
        System.out.println("SI VOUS VOULEZ PAYER UNE CREATURE, SAISISSEZ SON N° ; SINON PASSEZ EN TAPANT -1.");


        Scanner scan = new Scanner(System.in);
        int numCreaturePayee = scan.nextInt();

        while (numCreaturePayee != -1) {
			
			
			this.printPioche();
				if(numCreaturePayee >=this.pioche.size() || numCreaturePayee <-1){ // y a un défaut de numéro
					System.out.println("ENTREZ UN N° VALIDE SVP");
					System.out.println("SI VOUS VOULEZ PAYER UNE CREATURE, SAISISSEZ SON N° ; SINON PASSEZ EN TAPANT -1.");
					System.out.println();
					System.out.print("MON MANA: ");
					this.printMana(); // rajouter un get parce que c'est propre au joueur
					System.out.println();
					
					numCreaturePayee = scan.nextInt();
				}else { // soit ça marche, soit y a un défaut de prix
					int prix = this.pioche.get(numCreaturePayee).getPrix();
            
					if(prix<=this.mana && prix>=0){ // ici ça marche

						Creature creaturePayee=this.pioche.get(numCreaturePayee);

						this.champBataille.add(creaturePayee);
						this.pioche.remove(numCreaturePayee);
						this.mana=this.mana - creaturePayee.getPrix();
						System.out.println();
						System.out.print("MON MANA: ");
						this.printMana();
						System.out.println();
						System.out.println("SI VOUS VOULEZ PAYER UNE CREATURE, SAISISSEZ SON N° ; SINON PASSEZ EN TAPANT -1.");
						
						numCreaturePayee = scan.nextInt();
					}

            
					else{ // ici ça marche pas parce que problème de Prix 
							System.out.println("VOUS N'AVEZ PAS ASSEZ DE MANA POUR PAYER CETTE CREATURE.");
							System.out.println();
							System.out.print("MON MANA: ");
							this.printMana();
							System.out.println();
							System.out.println("SI VOUS VOULEZ PAYER UNE CREATURE, SAISISSEZ SON N° ; SINON PASSEZ EN TAPANT -1.");
							
							numCreaturePayee = scan.nextInt();
					}
				}
			}

        System.out.println();
        System.out.println("* * * PHASE D'ATTAQUE * * *");
        System.out.println();
        
        this.printPioche();
    }
  
    public void genereMainDepart() {
        for (int i=0; i<7; i++){
            pioche.add(new Creature());
        }
    }

    public void printPioche() {
        System.out.println("MAIN JOUEUR");
        for(int i=0;i<this.pioche.size();i++){
            System.out.println("Carte n°" + i + ":"+ this.pioche.get(i).getNom()+" / Prix: " +this.pioche.get(i).getPrix() + " Force: " + this.pioche.get(i).getForce());
        }
        System.out.println();
        System.out.println("***");
        System.out.println();

    }

    public void printChampBataille() {
        System.out.println("CHAMP DE BATAILLE");
        for(int i=0;i<this.champBataille.size();i++){
            System.out.println("Carte n°" + i + ":"+ this.champBataille.get(i).getNom()+ ": Force: " + this.champBataille.get(i).getForce());
        }
        System.out.println();
        System.out.println("***");
        System.out.println();
    }

    public void addMana() {
        this.mana=numTour;
    }
    
    public void attaque(){

        boolean empty = this.champBataille.isEmpty();

        if (empty == true) {
            System.out.println("VOUS N'AVEZ PAS DE CREATURE SUR LE CHAMP DE BATAILLE, FIN DE VOTRE TOUR");
            entreeContinuer();
        }

        else {
			
			int x = this.champBataille.size();
			
			if (x>=3){
				x = 3;
			}
			
			for(int i = 0;i<x;i++){
		    System.out.println("CHOISISSEZ CREATURE ATTAQUANTE N°"+(i+1)); // on attaque avec une carte Ã  la fois 
            Scanner scan = new Scanner(System.in);
            int numCreatureAttaquante = scan.nextInt();

            System.out.println();
			Creature creatureAttaquante=this.champBataille.get(numCreatureAttaquante);
		
            if (Math.random()< creatureAttaquante.getReussite()){  // attaque reussit
                System.out.println("*Rick astley danse*");
                System.out.println("votre attaque réussit");
                this.adversaire.pv=this.adversaire.pv-creatureAttaquante.getForce();
			
            }
            else if (Math.random()<0.5){ // l'attaque ne réussit pas la crÃ©ature se détruit
                
                System.out.println("WASTED LA NUCLEARITE DES ROLLERS A DETRUIT VOTRE CARTE"); // eddy malou n'est pas fier de vous
                this.champBataille.remove(numCreatureAttaquante);			
                
            }
            else { // il ne se passe rien
                System.out.println ("c'est comme dans plus belle la vie : il ne se passe rien");
            
            }
            
            System.out.println();
            System.out.println("***");
            System.out.println();

            entreeContinuer();
           }
        }
	}
    
     public void entreeContinuer() { // méthode cool on a juste à appuyer sur Entree pour passer à l'étape d'après
        String s = "ENTREE POUR CONTINUER";
        System.out.println(s);
        Scanner passer = new Scanner(System.in);
        passer.nextLine();
    }
    
    public int getPV () { // methodes relatives aux PV
        return this.pv;
    }

    public void printPV () {
        System.out.print(this.pv);
    }

    public void printMana() { // methodes relatives au mana
        System.out.print(this.mana);
    }
    
    public int getMana () {
        return this.mana;
    }
    
    public void setMana (int a) {
        this.mana=a;
    }

     
    public String getNomJoueur(){ // méthode relative au nom du joueur
		return this.nomJoueur;
	}
	
	
	public int getNumTour () { // méthodes relatives au numéro du tour propre à chaque joueur 
        return this.numTour;
    }
    
         
     public void setNumTour (int b) {
        this.numTour=b;
    }
    
    public void setAdversaire (Joueur a) { // méthode relative à l'adversaire
        this.adversaire=a;
    }
    
    public Joueur getAdversaire (){
		return this.adversaire;
	}
    
    public ArrayList<Creature> getPioche() { // méthode qui renvoie la pioche d'un joueur
		return this.pioche;
	}
    
}
