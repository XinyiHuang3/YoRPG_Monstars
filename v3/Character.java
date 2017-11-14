public class Character{
    protected int HP;
    protected int strength;
    protected int defense;
    protected double attackRating;
    
    protected boolean isAlive(){
        return (HP>0); 
    }
    protected int getDefense(){
	return defense;
    }
    protected void lowerHP(int hp_dec){
	HP -= hp_dec;
    }
    protected int attack(Monster monster){
	int damage= 0;
	damage= (int) (strength*attackRating - monster.getDefense()); 
	return damage;
    }
}
