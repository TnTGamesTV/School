public class Monster {
	
	private int attack;
	private int health;
	
	public Monster(int health, int attack){
		this.attack = attack;
		this.health = health;
	}
	
	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}
	
	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	
	public void fight(Hero hero){
		Fight fight = new Fight(hero, this);
		Main.p("A monster is attacking the hero.");
		fight.start();
	}
	
	public boolean isDead(){
		
		if(this.health < 1){
			return true;
		}
		
		return false;
	}
}
