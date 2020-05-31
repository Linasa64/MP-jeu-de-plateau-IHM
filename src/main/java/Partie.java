public class Partie {
    private Joueur joueur1;
    private Joueur joueur2;
    private int numTour;

    public void partieEstTerminee (Joueur a, Joueur b) {
        if(a.getPV()<=0){
            System.out.println(a.getNomJoueur() + " a perdu, I hear CHEH in my oreillette");
        }
        else if(b.getPV()<=0){
            System.out.println(b.getNomJoueur() + " a perdu, I hear CHEH in my oreillette");
        }
    }

    public void initialisation (){

        this.joueur1=new Joueur(); 
        this.joueur2=new Joueur();

        this.joueur1.setAdversaire(joueur2);
        this.joueur2.setAdversaire(joueur1);

        this.joueur1.genereMainDepart();
        this.joueur2.genereMainDepart();

    }

    public void partie () {

        if(this.numTour%2==0){
            tour(joueur1);
        }
        else{
            tour(joueur2);
        }
    }

    public void tour (Joueur a){

        printNomJoueur(a);

        this.numTour=this.numTour+1;

        a.setNumTour(a.getNumTour()+1);
        a.setMana(a.getMana()+a.getNumTour());

        System.out.print("MON MANA: ");
        a.printMana();
        System.out.println();
        
        a.getPioche().add(new Creature());
        a.printPioche();
        a.printChampBataille();
        
        a.payerCreature();
        a.printChampBataille();
        a.attaque();

        System.out.print("MES PV: ");
        a.printPV();
        System.out.print(" ; PV DE MON ADVERSAIRE: ");
        a.getAdversaire().printPV();

        System.out.println();
        a.printChampBataille();


    }
    public void printNomJoueur(Joueur a){
        System.out.println();
        System.out.println("* * * TOUR DE " + a.getNomJoueur() + " * * *");
        System.out.println();

    }
    
    public Joueur getJoueur1 () {
        return this.joueur1;
    }
    
    public Joueur getJoueur2 () {
        return this.joueur2;
    }

}
