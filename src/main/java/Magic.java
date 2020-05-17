public class Magic {
    public static void main(String[] args){ 
        Partie nouvellePartie=new Partie();
        nouvellePartie.initialisation();

        while (nouvellePartie.joueur1.getPV() >0 && nouvellePartie.joueur2.getPV()>0){
            nouvellePartie.partie();
        }

        nouvellePartie.partieEstTerminée(nouvellePartie.joueur1, nouvellePartie.joueur2);
    }
}
