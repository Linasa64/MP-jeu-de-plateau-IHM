public class Creature {
    int nCarte;
    int prix;
    int force;

    public Creature (){
        this.prix=(int)(Math.random()*7)+1;
        this.force=this.prix;
    }
}