public class Warrior extends Protagonist{
    public Warrior(){
	super();
	defense += 10;
    }

    public String about(){
	return "Warrior has a higher defense.";
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
