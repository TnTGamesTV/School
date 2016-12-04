public class Hero {
	
	private int health;
	private int strength;
	private int attack;
	private Weapon weapon;
	private String name;
	
	public Hero(int health, int strength, Weapon weapon, String name){
		this.health = health;
		this.strength = strength;
		this.weapon = weapon;
		this.name = name;
		this.updateAttack();
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

	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
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
	 * @return the weapon
	 */
	public Weapon getWeapon() {
		return weapon;
	}

	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void updateAttack(){
		int a1 = this.strength;
		int a2 = this.weapon.getDamageMultiplier();
		int attack = a1 + a2;
		
		this.setAttack(attack);
	}
	
	public boolean isDead(){
		
		if(this.health < 1){
			return true;
		}
		
		return false;
	}
}
