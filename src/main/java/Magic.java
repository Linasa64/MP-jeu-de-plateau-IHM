public class Magic {
    public static void main(String[] args){ 
        Partie nouvellePartie=new Partie();
        nouvellePartie.initialisation();

        while (nouvellePartie.getJoueur1().getPV() >0 && nouvellePartie.getJoueur2().getPV()>0){
            nouvellePartie.partie();
        }

        nouvellePartie.partieEstTerminee(nouvellePartie.getJoueur1(), nouvellePartie.getJoueur2());
    }
}
