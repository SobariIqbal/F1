import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("F1");
        System.out.println("");
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Voer je naam in: ");
        String naam = myObj.nextLine(); 

        Scanner myObj2 = new Scanner(System.in); 
        System.out.println("Voer je teamnaam in: ");
        String teamnaam = myObj2.nextLine(); 

        Scanner myObj3 = new Scanner(System.in); 
        System.out.println("kies uit de volgende teams: 1. Mercedes 2. Ferrari 3. Mclaren");
        int team = myObj3.nextInt();

        Scanner myObj4 = new Scanner(System.in);
        System.out.println("kies uit de volgende auto's: 1. MC60 2. W15 3. SF_24");
        int auto = myObj4.nextInt();

        Scanner myObj5 = new Scanner(System.in);
        System.out.println("kies uit de volgende motoren: 1. Renault_20 2. Ferrari_065 3. Honda_RA620H");
        int motor = myObj5.nextInt();

        System.out.println("");
        F1_CareerMode player1 = new F1_CareerMode(naam, teamnaam, team, auto, motor);
        player1.tegenstanders();
        player1.startRace();
        player1.verstuurbericht();
    }
}
