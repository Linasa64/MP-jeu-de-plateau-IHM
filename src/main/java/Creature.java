public class Creature {
    int nCarte;
    int prix;
    int force;
    double reussite; // associé à la proba de réussite de la carte lors de l'attaque
    String nomCreature; // pour faire plus accueillant
    

    public Creature (){
        this.prix=(int)(Math.random()*7)+1;
        this.force=this.prix;
        this.reussite=1-(this.force*0.1); // pour avoir une proba de réussite inversement proportionnelle à la force
          
          if (this.force==1){
			  this.nomCreature= "Gobelin serrurier";
		  }
		  else if  (this.force==2){
			  this.nomCreature= "Elfe de l'agroforesterie";
		  }
		  else if (this.force==3){
			  this.nomCreature= "Centaure busqué";
		  }
		  else if (this.force==4){
			  this.nomCreature= "Griffon hirsute";
		  }
		  else if (this.force==5){
			  this.nomCreature=  "Hydre emberlificotée";
		  }
		  else if (this.force==6){
			  this.nomCreature= "Dragon tournebroche";
		  }
		  else {
			  this.nomCreature= "licorne hypermétrope";
		  }
    }
    

    public int getPrix () {
        return this.prix;
    }
    
    public String getNom() {
		return this.nomCreature;
	}

    public int getForce () {
        return this.force;
    }
    
    public double getReussite(){
		return this.reussite;
	}
	

}
