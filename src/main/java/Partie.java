public class Partie {
    Joueur joueur1;
    Joueur joueur2;
    int numTour;

    public void partieEstTerminee (Joueur a, Joueur b) {
        if(a.pv<=0){
            System.out.println(a.nomJoueur + " a perdu, I hear CHEH in my oreillette");
        }
        else if(b.pv<=0){
            System.out.println(b.nomJoueur + " a perdu, I hear CHEH in my oreillette");
        }
    }

    public void initialisation (){

        this.joueur1=new Joueur(); 
        this.joueur2=new Joueur();

        this.joueur1.adversaire=joueur2;
        this.joueur2.adversaire=joueur1;

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

        this.numTour=this.numTour+1;

        a.numTour=a.numTour+1;
        a.mana=a.numTour;

        a.pioche.add(new Creature());
        a.printPioche();
        a.printChampBataille();
        
        a.payerCreature();
        a.printChampBataille();
        a.attaque();

        System.out.print("MES PV: ");
        a.printPV();
        System.out.print(" ; PV DE MON ADVERSAIRE: ");
        a.adversaire.printPV();
        System.out.println();
        a.printChampBataille();


    }

}
