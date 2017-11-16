// Team Monstars: Xinyi Huang, Shafali Gupta, Max Millar
// APCS1 pd8
// HW 28 -- Ye Olde Role Playing Game
// 2017-11-08

public class Monster extends Character{
    protected String name; 
    
    public Monster(){
	super();
	HP= 150;
	strength= (int)(Math.random()*20 + 45);
	defense= 20;
	attackRating= 1;
	name = "Mon";;
    }

    public Monster(String n){
	this();
	name = n;
    }
   
    public String getName(){
	return name;
    }

     public boolean isAlive(){
	return HP>0;
    }
    public int getDefense(){
	return defense;
    }
    

    public void lowerHP(int n){
	HP -= n;
    }
    public int attack(Protagonist protagonist){
	int damage = 0; 
	damage= (int)( strength*attackRating) -  protagonist.getDefense();
	protagonist.lowerHP(damage); 
	return damage;
    }
    public static void main(String [] args){}
}
