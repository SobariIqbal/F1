import java.util.Random;
import java.util.Scanner;
public class F1_CareerMode {

    private Team ferrari = null;
    private Team mclaren = null;
    private Team player1 = null;
    private Race race = new Race();

    private String naam;
    private String teamnaam;

    
    
   
    

  

    public F1_CareerMode(String naam, String teamnaam) {
        this.teamnaam = naam;
        this.teamnaam = teamnaam;

  
        
    }

    public void geselecteerdeKeuzes(String naam, String teamnaam,int autoKeuze,int motorKeuze, int team) {
        Motor motor = null;
        Auto auto = null;
        if (motorKeuze == 1) {
            motor = new Renault_20();
        }
        if(motorKeuze == 2) {
            motor = new Ferrari_065();
        }
        if (motorKeuze == 3) {
            motor = new Honda_RA620H();
        }
        if (autoKeuze == 1) {
             auto = new MCL60(motor);
        }
        if (autoKeuze == 2) { 
            auto = new W15(motor);
        }
        if (autoKeuze == 3) {
             auto = new SF_24(motor);
        }

        if (team == 1) {
            player1 = new Mercedes(new Strateeg(null), new Monteur(new DureMomentsleutel(), new DureSlagmoersleutel()), new Coureur(), auto, teamnaam);
        }

        if (team == 2) {
            player1 = new Ferrari(new Strateeg(null), new Monteur(new DureMomentsleutel(), new DureSlagmoersleutel()),  new Coureur(), auto, teamnaam);
        }

        if (team == 3) {
            player1 = new Mclaren(new Strateeg(null), new Monteur(new DureMomentsleutel(), new DureSlagmoersleutel()), new Coureur(), auto, teamnaam);
        }   

        
        System.out.println(naam + " heeft gekozen voor team " + player1.getTeam() + " met als auto "+ player1.auto.getAuto()+ " en met de motor " + player1.auto.m.getMotorType()+ " onder de teamnaam " + teamnaam);
        System.out.println(" "); 




    }

    public void maakAuto(){
        System.out.println(player1.monteur.getNaam() + " heeft de volgende gereedschappen gebruikt om de auto te maken: ");
        player1.monteur.gebruikMomemsleutel();
        player1.monteur.gebruikSlagmoersleutel();
        System.out.println(" ");

    }
        
    
    


    public void tegenstanders() {
        ferrari = new Ferrari(new Strateeg(null), new Monteur(new DureMomentsleutel(), new DureSlagmoersleutel()), new Coureur(), new W15(new Ferrari_065()), null);
        mclaren = new Mclaren(new Strateeg(null), new Monteur(new DureMomentsleutel(), new DureSlagmoersleutel()), new Coureur(), new SF_24(new Honda_RA620H()), null);

        System.out.println("Jouw tegenstanders zijn: ");
        System.out.println("Team "+ ferrari.getTeam() + " met als auto "+ ferrari.auto.getAuto()+ " en met de motor " + ferrari.auto.m.getMotorType());
        System.out.println("Team "+ mclaren.getTeam() + " met als auto "+ mclaren.auto.getAuto()+ " en met de motor " + mclaren.auto.m.getMotorType());
        System.out.println(" ");
        
    }

    

    public void startRace() {

        race.start(player1, ferrari, mclaren);

        

    }

    public void winnaarBerekenen(){
        race.winnaarBerekenen(player1, ferrari, mclaren);

        


    }

        

    

    public void verstuurbericht() {
        Scanner myObj4 = new Scanner(System.in); 
        Scanner myObj3 = new Scanner(System.in); 

        while(true){
            
            
            System.out.println(" ");
            System.out.println("Wil je een bericht versturen naar je fans? 1. Ja 2. Nee");
            int nummer2 = myObj4.nextInt();
            
            if (nummer2 == 1){
                
           
        
                System.out.println(" ");
        System.out.println("Kies uit de volgende social media platformen: 1. Twitter 2. Instagram 3. Whatsapp 4. Postduif");	
        
         int nummer = myObj3.nextInt();

        if(nummer == 1){
            player1.coureur.zetCommunicatiemethode(new Twitter());
        }

        if(nummer == 2){
            player1.coureur.zetCommunicatiemethode(new Instagram());
        }

        if(nummer == 3){
            player1.coureur.zetCommunicatiemethode(new Facebook());
        }
        
        if(nummer == 4){
            player1.coureur.zetCommunicatiemethode(new Postduif());
        }
        System.out.println(player1.coureur.gebruik()); 
                

            }
            if (nummer2 == 2){
                break;
            }

            
           

        }

          
    }


        

}
