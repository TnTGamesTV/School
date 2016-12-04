public class Weapon {
	
	private int damageMultiplier;
	private Material material;
	private Magic magic;
	private int durability;
	
	public Weapon(Material material, Magic magic){
		this.material = material;
		this.magic = magic;
		this.updateDamageMultiplier();
		this.durability = (magic.getStrength() + material.getType()) * 10;
	}
	
	/**
	 * @return the damageMultiplier
	 */
	public int getDamageMultiplier() {
		return damageMultiplier;
	}
	
	public void updateDamageMultiplier(){
		int m = material.toInt();
		int m2 = magic.getStrength();
		
		int damageMulti = m + m2;
		this.setDamageMultiplier(damageMulti);
	}
	
	/**
	 * @param damageMultiplier the damageMultiplier to set
	 */
	public void setDamageMultiplier(int damageMultiplier) {
		this.damageMultiplier = damageMultiplier;
	}

	/**
	 * @return the material
	 */
	public Material getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(Material material) {
		this.material = material;
	}

	/**
	 * @return the magic
	 */
	public Magic getMagic() {
		return magic;
	}

	/**
	 * @param magic the magic to set
	 */
	public void setMagic(Magic magic) {
		this.magic = magic;
	}

	/**
	 * @return the durability
	 */
	public int getDurability() {
		return durability;
	}

	/**
	 * @param durability the durability to set
	 */
	public void setDurability(int durability) {
		this.durability = durability;
	}
	
	/**
	 * 
	 */
	public void hit(){
		this.setDurability(getDurability()-1);
	}
}
