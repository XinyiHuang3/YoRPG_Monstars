public class Character{
    public int HP;
    public int strength;
    public int defense;
    public double attackRating;
    
    public boolean isAlive(){
        return (HP>0); 
    }
    public int getDefense(){
	return defense;
    }
    public void	lowerHP(int hp_dec){
	HP -= hp_dec;
    }
    public int attack(Monster monster){
	int damage= 0;
	damage= (int) (strength*attackRating - monster.getDefense()); 
	return damage;
    }
}
