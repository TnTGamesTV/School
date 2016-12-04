import java.util.*;

public class Game2
{    
    private int rZ;
    private int trys;
    private int uZ;
    private int max;
    private Scanner sc;

    public Game2(int trys, int max){
        this.sc = new Scanner(System.in);
        this.rZ = -1;
        this.trys = trys;
        this.uZ = -1;
        this.max = max;
    }
    
    public void play(){
       this.rZ = (int)(Math.random() * this.max) + 1;
       while(this.trys > 0) {
           System.out.println("Geben Sie eine Zahl zwischen 1 und " + this.max + " ein.");
           this.uZ = sc.nextInt();
           if ( this.rZ < this.uZ ){ 
               System.out.println("Ihre eingegebene Zahl ist zu groß.");
           } else if ( this.rZ > this.uZ ){ 
               System.out.println("Ihre eingegebene Zahl ist zu klein.");
           }
           this.trys--;
           
           if(this.trys > 0){
               System.out.println("Sie haben noch " + this.trys + " Versuche.");
           }
           
           if (this.uZ == this.rZ){
               this.trys = -1;
               break;
           }
        }
        
        if(this.trys == -1){
            System.out.println("Super. Sie haben die Zufallszahl erraten.");
        }else{
            System.out.println("Sie haben keine Versuche mehr.");
        }
        
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
