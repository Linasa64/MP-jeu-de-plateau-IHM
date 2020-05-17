public class Magic {
    public static void main(String[] args){ 
        Joueur joueur1=new Joueur(); 
        Joueur joueur2=new Joueur();
        
        joueur1.adversaire=joueur2;
        joueur2.adversaire=joueur1;
        
        joueur1.genereMainDepart();
        joueur1.printPioche();

        joueur1.payerCreature();
        joueur1.printPioche();
        joueur1.printChampBataille();
        joueur1.attaque();
        
        System.out.println(joueur2.pv);
        joueur1.printChampBataille();
    }
}
