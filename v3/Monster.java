// Team Monstars: Xinyi Huang, Shafali Gupta, Max Millar
// APCS1 pd8
// HW 28 -- Ye Olde Role Playing Game
// 2017-11-08

public class Monster extends Character{
    protected String name; 

    
    Monster(){
	HP= 150;
	strength= (int)(Math.random()*20 + 45);
	defense= 20;
	attackRating= 1;
	name = "Mon";;
    }

    public String getName(){
	return name;
    }
    
    public static void main(String [] args){}
}
