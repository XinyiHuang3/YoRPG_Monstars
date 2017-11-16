public class Archer extends Protagonist{
        public Archer(){
	super();
	strength += 10;
    }

    public String about(){
	return "Archer has a higher strength.";
    }
     public void normalize(){
	//	prepares the Protagonist to preform a normal attack
	defense = 40;
	attackRating = 0.4;
}
     public void specialize(){
	//prepares the Protagonist to preform a special attack
	defense -= 5;
	attackRating += 5;
    }
}
