public class Partie {
    Joueur joueur1;
    Joueur joueur2;
    int numTour;

    public void partieEstTerminée (Joueur a, Joueur b) {
        if(a.pv<=0){
            System.out.println(a.nomJoueur + "a perdu, I hear CHEH in my oreillette");
        }
        else if(b.pv<=0){
            System.out.println(b.nomJoueur + "a perdu, I hear CHEH in my oreillette");
        }
    }

    public void initialisation (){

        Joueur joueur1=new Joueur(); 
        Joueur joueur2=new Joueur();

        joueur1.adversaire=joueur2;
        joueur2.adversaire=joueur1;

        joueur1.genereMainDepart();
        joueur2.genereMainDepart();

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
        System.out.println(a.pioche);
        System.out.println(a.champBataille);
        
        a.payerCreature();
        System.out.println(a.champBataille);
        a.attaque();
        System.out.println(a.champBataille);

    }

}