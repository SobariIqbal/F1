import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void toonMenu() {
        
        System.out.println("Welkom bij het spel! Hier zijn de spelregels:");
        System.out.println("Je begint eerste met het kiezen van je team. Je hebt keuze uit 3 teams: Mercedes, Ferrari en Mclaren.");
        System.out.println("Vervolgens kies je een auto: MC60, W15 of SF_24, en daarna een motor: Renault_20, Ferrari_065 of Honda_RA620H.");
        System.out.println("Elke auto begint met de snelheid van 200 km/h. De race bestaat uit 10 laps.");
        System.out.println("Elke lap mag je kiezen uit een strategie kiezen. Undercut, Overcut of one stop strategie");
        System.out.println("Undercut: je krijgt +100 km/u, maar je mag een lap geen strategie kiezen.");
        System.out.println("Overcut: tegenstanders krijgen allemaal -30 km/u snelheid.");
        System.out.println("One stop strategie: je krijgt +50 km/u.");
        System.out.println("De auto met de hoogste snelheid aan het eind wint de race!");
        System.out.println("Aan het einde van de race mag je een bericht sturen naar je fans via Twitter, Instagram, Facebook of Postduif.");
        System.out.println("Veel plezier met het spelen van het spel!\n");


        while (true) {
            System.out.println("Wil je beginnen? 1. Ja 2. Nee");
            int keuze = scanner.nextInt();
            if (keuze == 1) {
                startGame();
                break;
            } else if (keuze == 2) {
                System.out.println("Jammer! Tot de volgende keer.");
                break;
            } else {
                System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }
    }

    private void startGame() {
        Facom fac = new Facom();

        System.out.println("\nF1 Career Mode\n");

        System.out.print("Voer je naam in: ");
        String naam = scanner.next();

        System.out.print("Voer je teamnaam in: ");
        String teamnaam = scanner.next();

        int team = selecteerTeam();
        int auto = selecteerAuto();
        int motor = selecteerMotor();

        F1_CareerMode player1 = new F1_CareerMode(naam, teamnaam);
        player1.geselecteerdeKeuzes(auto, motor, team);

        fac.goedkoop();
        fac.duur();

        System.out.println("");
        player1.maakAuto();
        player1.tegenstanders();
        player1.startRace();
        player1.verstuurBericht();
    }

    private int selecteerTeam() {
        while (true) {
            System.out.println("Kies uit de volgende teams: 1. Mercedes 2. Ferrari 3. Mclaren");
            int team = scanner.nextInt();
            switch (team) {
                case 1, 2, 3 -> {
                    return team;
                }
                default -> System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }
    }

    private int selecteerAuto() {
        while (true) {
            System.out.println("Kies uit de volgende auto's: 1. MC60 2. W15 3. SF_24");
            int auto = scanner.nextInt();
            switch (auto) {
                case 1, 2, 3 -> {
                    return auto;
                }
                default -> System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }
    }

    private int selecteerMotor() {
        while (true) {
            System.out.println("Kies uit de volgende motoren: 1. Renault_20 2. Ferrari_065 3. Honda_RA620H");
            int motor = scanner.nextInt();
            switch (motor) {
                case 1, 2, 3 -> {
                    return motor;
                }
                default -> System.out.println("Ongeldige keuze, probeer opnieuw.");
            }
        }
    }
}
