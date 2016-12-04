public class Magic {
	
	private int strength;
	private int type;
	
	public Magic(int strength, int type){
		this.strength = strength;
		this.type = type;
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
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	
}
