import java.util.Scanner;

public class Game3{

    public static boolean cheatMode = false;
    public static int comWins;
    public static int userWins;

    public enum InputType{
        SCHERE,
        STEIN,
        PAPIER,
        WRONG_DATA
    }

    public enum PlayerType{
        USER,
        COM
    }

    public Game3(){
        //Install
        Scanner sc = new Scanner(System.in);
        GameHandler.reset();
        System.out.print("\f");
        System.out.println("Willkommen bei \"Schere, Stein, Papier\".");

        //Handle
        while(true){
            String input = sc.next();
            GameHandler.handle(input);
        }
    }

    public static class GameHandler
    {   

        public static void reset(){
            comWins = 0;
            userWins = 0;
        }

        public static void win(PlayerType player){
            if(player == PlayerType.USER){
                userWins += 1;
                System.out.println("Der User hat gewonnen! Gratulation.");
                System.out.println("User > "+userWins+":"+comWins+" < Com");
            }else if(player == PlayerType.COM){
                comWins += 1;
                System.out.println("Der Com hat gewonnen! Gratulation.");
                System.out.println("User > "+userWins+":"+comWins+" < Com");
            }
        }

        public static void win(){
            System.out.println("Niemand hat gewonnen!");
            System.out.println("User > "+userWins+":"+comWins+" < Com");
        }

        /**
         * handles the game and creates the computers choice and calcs the winner
         * @param userInput the user input to handle
         */
        public static void handle(String userInput){
            if(isCommand(userInput)){
                handleCommand(userInput);
            }else{
                System.out.print("\f");
                InputType userType = convert(userInput);
                if(userType == InputType.WRONG_DATA){
                    System.out.println("[GameHandler] Wrong data! Allowed inputs are: SCHERE, STEIN or PAPIER!");
                }else{
                    InputType comType = generateChoice(Game3.cheatMode, userType);

                    if(userType == InputType.SCHERE && comType == InputType.PAPIER){
                        win(PlayerType.USER);
                    }else if(userType == InputType.SCHERE && comType == InputType.STEIN){
                        win(PlayerType.COM);
                    }else if(userType == InputType.SCHERE && comType == InputType.SCHERE){
                        win();
                    }else if(userType == InputType.PAPIER && comType == InputType.SCHERE){
                        win(PlayerType.COM);
                    }else if(userType == InputType.PAPIER && comType == InputType.STEIN){
                        win(PlayerType.USER);
                    }else if(userType == InputType.PAPIER && comType == InputType.PAPIER){
                        win();
                    }else if(userType == InputType.STEIN && comType == InputType.SCHERE){
                        win(PlayerType.USER);
                    }else if(userType == InputType.STEIN && comType == InputType.PAPIER){
                        win(PlayerType.COM);
                    }else if(userType == InputType.STEIN && comType == InputType.STEIN){
                        win();
                    }
                    System.out.println("[GameHandler] Com: "+comType.toString());
                }
            }
        }

        public static boolean isCommand(String command){

            if(command.contains("/")) return true;

            return false;
        }

        public static void handleCommand(String command){
            if(command.equalsIgnoreCase("/reset")){
                System.out.println("\f");
                comWins = 0;
                userWins = 0;
            }else if(command.equalsIgnoreCase("/cheatmode true")){
                Game3.cheatMode = true;
                System.out.println("[GameSettings] Game.cheatMode is now true");
            }else if(command.equalsIgnoreCase("/cheatmode false")){
                Game3.cheatMode = false;
                System.out.println("[GameSettings] Game.cheatMode is now false");
            }else if(command.equalsIgnoreCase("/help")){
                System.out.println("[Help] This is the help page:");
            }
        }

        /**
         * generates the computers choice as an InputType
         * @param cheat if the computer should cheat
         */
        public static InputType generateChoice(boolean cheat, InputType userType){
            if(cheat){
                if(userType == InputType.SCHERE) return InputType.STEIN;
                if(userType == InputType.STEIN) return InputType.PAPIER;
                if(userType == InputType.PAPIER) return InputType.SCHERE;
            }else{
                int random = (int)(Math.random() * 3);
                if(random == 0) return InputType.SCHERE;
                if(random == 1) return InputType.STEIN;
                if(random == 2) return InputType.PAPIER;
            }
            return null;
        }

        /**
         * converts a string into a {@link InputType}
         * @param toConvert the input to convert
         */
        private static InputType convert(String toConvert){
            if(toConvert.equalsIgnoreCase("Schere")) return InputType.SCHERE;
            if(toConvert.equalsIgnoreCase("Stein")) return InputType.STEIN;
            if(toConvert.equalsIgnoreCase("Papier")) return InputType.PAPIER;
            if(toConvert.contains("/")){
                handleCommand(toConvert);
                return null; 
            }
            return InputType.WRONG_DATA;
        }
    }

}
