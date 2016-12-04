public class Material {
	
	private int type;
	private String name;
	
	public Material(int type, String name){
		this.type = type;
		this.name = name;
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
	
	public int toInt(){
		int rndm = (int) ((Math.random() * type) + 1);
		return rndm;
	}
}
