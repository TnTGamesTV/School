import java.util.Scanner;

public class Game4{
	
	private int points;
	
	public Game4(){
		this.points = 0;
	}
	
	public void setPoints(int pointsN){
		this.points = pointsN;
	}
	
	public void addPoints(int points){
		int pointsN = getPoints();
		pointsN += points;
		setPoints(pointsN);
	}
	
	public int getPoints(){
		return this.points;
	}
	
	/**
	 * Play
	 */
	public void play(){
		Scanner sc = new Scanner(System.in);
		while(getPoints() < 10000){
			int w1 = (int) ((Math.random() * 6) + 1);
			int w2 = (int) ((Math.random() * 6) + 1);
			
			
			System.out.println("Weiter? (y)");
			
			if(sc.next().equalsIgnoreCase("y")){
				int pointsToAdd = factor(w1, w2);
				setPoints(pointsToAdd);
				System.out.println("Würfel 1: " + w1 + "; Würfel 2: " + w2);
				System.out.println("Aktueller Punktestand: " + getPoints());
			}
		}
		sc.close();
		
		System.out.println("Es hat jemand gewonnen! Punktestand: " + getPoints());
	}
	
	private int factor(int w1, int w2){
		int pointsN = getPoints();
		
		if(w1 == 2 && w2 == 1 || w1 == 2 && w2 == 1) pointsN += 1000;
		if(w1 != w2) pointsN += (Math.max(w1, w2) * 10) + Math.min(w1, w2);
		if(w1 == w2) pointsN += w1 * 100; //pointsN = pointsN + w1 * 100;
		
		return pointsN;
	}
}
