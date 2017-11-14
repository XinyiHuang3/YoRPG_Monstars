// Team Monstars: Xinyi Huang, Shafali Gupta, Max Millar
// APCS1 pd8
// HW 28 -- Ye Olde Role Playing Game
// 2017-11-08

public class Protagonist extends Character{
    protected String name;

    
    public Protagonist(){
	name = "Pro"; 
	HP= 125;
	strength= 100;
	defense= 40;
	attackRating= 0.4;
    }
    public Protagonist(String n){
	this(); 
	name = n;}
    

    public String getName(){
	return name;
    }
    
 
    public void specialize(){
	//prepares the Protagonist to preform a special attack
	defense -= 5;
	attackRating += 5;
    }
    public void normalize(){
	//prepares the Protagonist to preform a normal attack
	defense = 40;
	attackRating = 0.4;
    }
	
    public static void main(String [] args){}
} 
