import java.util.Scanner;

public class F1_CareerMode {
    //aggregraties
    private Team ferrari = null;
    private Team mclaren = null;
    private Team player1 = null;
    private Race race = new Race();

    private String naam;
    private String teamnaam;

    public F1_CareerMode(String naam, String teamnaam) {
        this.naam = naam;
        this.teamnaam = teamnaam;
    }
    public String getNaam(){
        return naam;
    }

    public String getTeamnaam(){
        return teamnaam;
    }

    public void geselecteerdeKeuzes(int autoKeuze, int motorKeuze, int team) {
        Motor motor;
        Auto auto;
        
        switch (motorKeuze) {
            case 1 -> motor = new Renault_20();
            case 2 -> motor = new Ferrari_065();
            case 3 -> motor = new Honda_RA620H();
            default -> {
                System.out.println("Ongeldige motor keuze.");
                return;
            }
        }
        
       
        switch (autoKeuze) {
            case 1 -> auto = new MCL60(motor);
            case 2 -> auto = new W15(motor);
            case 3 -> auto = new SF_24(motor);
            default -> {
                System.out.println("Ongeldige auto keuze.");
                return;
            }
        }
    
 
        switch (team) {
            case 1 -> player1 = new Mercedes(
                new Strateeg(null), 
                new Monteur(new GoedkopeMomentsleutel(), new DureSlagmoersleutel()), 
                new Coureur(), 
                auto, 
                teamnaam
            );
            case 2 -> player1 = new Ferrari(
                new Strateeg(null), 
                new Monteur(new DureMomentsleutel(), new GoedkopeSlagmoersleutel()),  
                new Coureur(), 
                auto, 
                teamnaam
            );
            case 3 -> player1 = new Mclaren(
                new Strateeg(null), 
                new Monteur(new DureMomentsleutel(), new DureSlagmoersleutel()), 
                new Coureur(), 
                auto, 
                teamnaam
            );
            default -> {
                System.out.println("Ongeldige team keuze.");
                return;
            }
        }
    
      
        System.out.println(naam + " heeft gekozen voor team " + player1.getTeam() + 
            " met als auto " + player1.auto.getAuto() + 
            " en met de motor " + player1.auto.m.getMotorType() + 
            " onder de teamnaam " + teamnaam);
        System.out.println(" "); 
    }
    

    public void maakAuto(){
        System.out.println(player1.monteur.getNaam() + " heeft de volgende gereedschappen gebruikt om de banden te monteren: ");
        player1.monteur.gebruikMomemsleutel();
        player1.monteur.gebruikSlagmoersleutel();
        System.out.println(" ");

    }
        
    
    


    public void tegenstanders() {
        ferrari = new Ferrari(new Strateeg(null), new Monteur(new GoedkopeSlagmoersleutel(), new GoedkopeSlagmoersleutel()), new Coureur(), new W15(new Ferrari_065()), null);
        mclaren = new Mclaren(new Strateeg(null), new Monteur(new GoedkopeMomentsleutel(), new GoedkopeSlagmoersleutel()), new Coureur(), new SF_24(new Honda_RA620H()), null);

        System.out.println("Jouw tegenstanders zijn: ");
        System.out.println("Team "+ ferrari.getTeam() + " met als auto "+ ferrari.auto.getAuto()+ " en met de motor " + ferrari.auto.m.getMotorType());
        System.out.println("Team "+ mclaren.getTeam() + " met als auto "+ mclaren.auto.getAuto()+ " en met de motor " + mclaren.auto.m.getMotorType());
        System.out.println(" ");
        
    }

    

    public void startRace() {
        race.start(player1, ferrari, mclaren);
        race.winnaarBerekenen(player1, ferrari, mclaren);
    }


  

    public void verstuurBericht() {
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            System.out.println("\nWil je een bericht versturen naar je fans? 1. Ja 2. Nee");
            int keuzeVersturen = scanner.nextInt();
    
            if (keuzeVersturen == 1) {
                System.out.println("\nKies uit de volgende social media platformen: 1. Twitter 2. Instagram 3. Facebook 4. Postduif");
                int keuzePlatform = scanner.nextInt();
    
                switch (keuzePlatform) {
                    case 1 -> {
                        player1.coureur.zetCommunicatiemethode(new Twitter());
                    }
                    case 2 -> {
                        player1.coureur.zetCommunicatiemethode(new Instagram());
                    }
                    case 3 -> {
                        player1.coureur.zetCommunicatiemethode(new Facebook());
                    }
                    case 4 -> {
                        player1.coureur.zetCommunicatiemethode(new Postduif());
                    }
                    default -> System.out.println("Ongeldige keuze, probeer het opnieuw.");
                }
    
                System.out.println(player1.coureur.gebruik());  
    
            } else if (keuzeVersturen == 2) {
                break;  
            } else {
                System.out.println("Ongeldige keuze, probeer het opnieuw.");
            }
        }
    }


        

}
