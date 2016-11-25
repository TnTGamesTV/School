import java.util.*;
/**
 * This class provides a set of games, ready to select & play
 * @author TnTGamesTV
 */
public class Spielesammlung
{
    public static void main (String [] args){
        while(true){
            System.out.println("\f");         // Hier wirde der Bildschirm der Konsole freigeräumt.

            System.out.println("Wähle eines der folgenden Spiele aus, indem du die entsprechende Nummer eingibst:");
            System.out.println("1 Krümelmonster");
            System.out.println("2 Zahlenraten");
            System.out.println("3 Schere-Stein-Papier");
            System.out.println("4 Mäxchen");
            System.out.println("-----------------------------------------------");

            // Hier wird ein Scannerobjekt erstellt, mit dessen Hilfe man über die Tastatur etwas eingeben kann.
            Scanner eingabe = new Scanner(System.in);
            //Die Variable spielnummer speichert die eingegebene Zahl und man kann damit schließlich einen Vergleich starten.
            if(eingabe.hasNextInt()){
                int spielnr = eingabe.nextInt();
                /*Variable anzahlSpiel nimmt später immer die entsprechende Tastatureingabe auf und speichert sie. siehe unten */
                int anzahlSpiel = 0;

                // Verzweigung, bisher nur Spieloption 1! Man könnte auch mit switch abreiten!
                if ( spielnr == 1) {
                    System.out.println("Du startest das Spiel Kruemelmonster mit einem Guthaben von 4 Keksen.");
                    System.out.println("Pro Spiel musst du zwei Kekse einsetzen. Du kannst aber welche hinzugewinnen.");
                    System.out.println("4 Kekse beim 3er Pasch, 2 Kekse beim 2er Pasch, 1 Keks wenn die Summe der Augen aller Würfel zwischen 8 und 12  liegt.");
                    System.out.println("Wie oft möchtest du das Spiel spielen?");

                    //Die Tastatureingabe wird in der Variablen anzahlSpiel gespeichert 
                    anzahlSpiel = eingabe.nextInt();    

                    /* Der Konstruktor der Klasse Kruemelmonster verlangt einen Parameter, um die Startanzahl des Keksguthabens
                    festzulegen. D.h. es wird ein Objekt der Klasse Kruemelmonster erzeugt und in einer Variablen k des Datentyps
                    Kruemelmonster gespeichert. */
                    Game1 g1 = new Game1(4);

                    g1.play(anzahlSpiel);
                } else if( spielnr == 2){
                    System.out.println("Du startest das Spiel Zahlenraten mit einer Anzahl von 5 Versuchen");
                    System.out.println("Du hast wie erw\u00e4hnt f\u00fcnf Versuche um eine Zahl zu erraten.");
                    System.out.println("Am Anfang kannst du das Maximum der Zufallszahl einstellen.");
                    System.out.println("Viel Spa\u00df");

                    Game2 g2 = new Game2(5);
                    g2.play();
                } else if (spielnr == 3) {
                    System.out.println("Du hast das Spiel Schere, Stein, Papier geöffnet.");
                    System.out.println("Du spielst unendlich lange gegen einen Computer");
                    System.out.println("Um zu beenden, gebe '/end' in die Konsole");
                    System.out.println("Viel Spa\u00df");
                    
                    Game3 g3 = new Game3();
                } else if (spielnr == 4) {
                    System.out.println("Du startest das Spiel M\u00e4xchen mit 0 Startpunkten.");
                    System.out.println("Pro Runde hast du die Chance auf bis zu 1000 Punkte. ");
                    System.out.println("Du w\u00fcrfelst zwei Mal pro Runde.");
                    System.out.println("Wenn du eine Eins und eine Zwei hast bekommst du 1000 Punkte.");
                    System.out.println("Wenn deine gew\u00fcrfelten Zahlen nicht gleich sind, bekommst du die h\u00f6chste W\u00fcrfelzahl mal 10, plus die kleinere Zahl.");
                    System.out.println("Wenn deine Zahlen gleich sind,bekommst du einer der Zahlen mal 100 zu deinen Punkten dazu.");
                    System.out.println("Viel Spa\u00df");

                    Game4 g4 = new Game4();
                    g4.play();
                }
            }
        }
    }
}
