public class Fight {
    
    private Hero hero;
    private Monster monster;
    
    public Fight(Hero hero, Monster monster){
        this.hero = hero;
        this.monster = monster;
    }
    
    /**
     * @return the held
     */
    public Hero getHero() {
        return hero;
    }
    
    /**
     * @param held the held to set
     */
    public void setHeld(Hero hero) {
        this.hero = hero;
    }

    /**
     * @return the monster
     */
    public Monster getMonster() {
        return monster;
    }

    /**
     * @param monster the monster to set
     */
    public void setMonster(Monster monster) {
        this.monster = monster;
    }
    
    public void start(){
        int healthHero = this.hero.getHealth();
        int healthMonster = this.monster.getHealth();

        
        
        Main.p("The fight is starting.");
        
        while(healthHero > 0 && healthMonster > 0){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.hero.updateAttack();
            
            previewFight();
            
            int heroA = this.hero.getAttack();
            int monsterA = this.monster.getAttack();
            
            int multiplierWho = (int) (Math.random() * 2);
            int boostSmall = (int) (Math.random() * 6) + 1;
            int boostBig = (int) (Math.random() * 10) + 1;
            
            if(multiplierWho == 0){
//              Main.p("The hero got the big attackbooster.");
                heroA += boostBig;
                monsterA += boostSmall;
            }else if(multiplierWho == 1){
//              Main.p("The monster got the big attackbooster.");
                monsterA += boostBig;
                heroA += boostSmall;    
            }else{
//              Main.p("No one got the big or small attackbooster.");
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            
            drawFight((multiplierWho == 0));
            
            if(heroA > monsterA){

//              Main.p("The hero damaged the monster.");
                this.monster.setHealth(this.monster.getHealth()-1);
                
                if(this.monster.isDead()){
//                  Main.p("The monster died.");
//                  Main.p("The hero won the fight!");
                }
                
            } else if (heroA < monsterA) {
                
//              Main.p("The hero got damaged by the monster.");
                this.hero.setHealth(this.hero.getHealth()-1);
                
                if(this.hero.isDead()){
//                  Main.p("The hero died. RIP");
//                  Main.p("The monster won the fight!");
                }
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            drawFight((multiplierWho == 0));
            
            healthHero = this.hero.getHealth();
            healthMonster = this.monster.getHealth();
        }
        
        
    }
    
    private void drawFight(boolean heroBoosted){
        String tab = "\t\t\t\t";
        Main.c();
        if(this.hero.getHealth() > 0 && this.monster.getHealth() > 0){
            Main.pP("Hero " + this.hero.getName());
            Main.pP("HP: " + this.hero.getHealth());
            Main.pP("Booster: " + (heroBoosted ? "Big" : "Small"));
            Main.pP("");
            Main.pP(tab + "Monster");
            Main.pP(tab + "HP: " + this.monster.getHealth());
            Main.pP(tab + "Booster: " + (heroBoosted ? "Small" : "Big"));
        }else   if(this.hero.getHealth() < 1 && this.monster.getHealth() > 0){
            Main.pP("Hero " + this.hero.getName());
            Main.pP("HP: Dead");
            Main.pP("Booster: " + (heroBoosted ? "Big" : "Small"));
            Main.pP("");
            Main.pP(tab + "Monster");
            Main.pP(tab + "HP: " + this.monster.getHealth());
            Main.pP(tab + "Booster: " + (heroBoosted ? "Small" : "Big"));
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            drawWin(false);
        }else if(this.hero.getHealth() > 0 && this.monster.getHealth() < 1){
            Main.pP("Hero " + this.hero.getName());
            Main.pP("HP: " + this.hero.getHealth());
            Main.pP("Booster: xxx");
            Main.pP("");
            Main.pP(tab + "Monster");
            Main.pP(tab + "HP: Dead");
            Main.pP(tab + "Booster: xxx");
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            drawWin(true);
        }
    }
    
    private void previewFight(){
        String tab = "\t\t\t\t";
        Main.c();
        Main.pP("Hero " + this.hero.getName());
        Main.pP("HP: " + this.hero.getHealth());
        Main.pP("Booster: ???");
        Main.pP("");
        Main.pP(tab + "Monster");
        Main.pP(tab + "HP: " + this.monster.getHealth());
        Main.pP(tab + "Booster: ???");
    }
    
    private void drawWin(boolean heroWin){
        String tab = "\t\t";
        Main.c();
        if(heroWin){
            Main.pP("");
            Main.pP("");
            Main.pP(tab + "The hero won the fight. :)");
            Main.pP("");
            Main.pP("");
        }else if(!heroWin){
            Main.pP("");
            Main.pP("");
            Main.pP(tab + "The monster won the fight. :)");
            Main.pP("");
            Main.pP("");
        }
    }
}
