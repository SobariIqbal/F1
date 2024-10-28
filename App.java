import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //uitleg van het spel
        //Je begint eerste met het kiezen van je team. Je hebt keuze uit 3 teams: Mercedes, Ferrari en Mclaren. 
        //Vervolgens kies je een auto. Daarbij heb je keuze uit 3 auto's: MC60, W15 en SF_24.
        //Als laatste kies je een motor. Daarbij heb je keuze uit 3 motoren: Renault_20, Ferrari_065 en Honda_RA620H.
        //Vervolgens wordt de auto gemaakt en krijg je een lijst met tegenstanders.
        //Het spel werkt als volgt: elke auto begint met de snelheid 200 km/h.
        //Elke lap heeft elke auto de keuze om een strategie te kiezen behalve de eerste lap. Je hebt keuze uit 3 strategieën:
        //1. Undercut: Je krijgt +100 km/h snelheid. Maar mag je 1 lap geen strategie kiezen.
        //2. Overcut: De tegenstanders krijgen -25 km/h snelheid.
        //3. One stop strategie: Je krijgt +50 km/h snelheid.
        //De auto die met de hoogste snelheid over de finish komt rijdt heeft gewonnen.
        //Aan het einde van de race mag je een bericht sturen naar je fans via de volgende platformen: Twitter, Instagram, Facebook en Postduif.
        //Veel plezier met het spelen van het spel!

        System.out.println("F1");
        System.out.println("");
        Facom fac = new Facom();
        
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
        F1_CareerMode player1 = new F1_CareerMode(naam, teamnaam);

       

        
        
        System.out.println("");
        player1.geselecteerdeKeuzes(naam,teamnaam , auto, motor, team);
        fac.goedkoop();
        fac.duur();
        System.out.println("");
        player1.maakAuto();
        player1.tegenstanders();
        player1.startRace();
        player1.winnaarBerekenen();
        player1.verstuurbericht();




        
        myObj.close();
        myObj2.close();
        myObj3.close();
        myObj4.close();
        myObj5.close();
    }
}
