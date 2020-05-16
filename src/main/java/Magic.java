public class Magic {
    public static void main(String[] args){ 
        Joueur joueur1=new Joueur(); 
        joueur1.genereMainDepart();
        joueur1.printPioche();

        joueur1.payerCreature();
        joueur1.printPioche();
        joueur1.printChampBataille();
    }
}
