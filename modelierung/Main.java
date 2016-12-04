public class Main {
	
	public static void p(String out){
		System.out.println("Game: " + out);
	}
	
	public static void pP(String out){
		System.out.println(out);
	}
	
	public static void c(){
		System.out.println("\f");
	}
	
	public static void main(String[] args){
		Weapon weapon = new Weapon(MaterialType.MATERIAL_IRON, MagicType.MAGIC_FIRE);
		Hero hero = new Hero(5, 5, weapon, "Dieter");
		Monster monster = new Monster(5, 5);
		
		monster.fight(hero);
	}
}
