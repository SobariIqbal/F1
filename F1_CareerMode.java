import java.util.Random;
import java.util.Scanner;
public class F1_CareerMode {
  
    private Team mercedes = null;
    private Team ferrari = null;
    private Team mclaren = null;
    private Team player1 = null;

    private String naam;
    private String teamnaam;

    Random rand = new Random();
    
    
    private int snelheid = 200; 
    private int snelheid2 = 200;
    private int snelheid3 = 200;
    

    protected boolean stop = false;
    protected boolean stop2 = false;
    protected boolean stop3 = false;
    

  

    public F1_CareerMode(String naam, String teamnaam) {
        this.teamnaam = naam;
        this.teamnaam = teamnaam;

  
        
    }

    public void geselecteerdeKeuzes(String naam, String teamnaam,int autoKeuze,int motorKeuze, int team) {
        Motoren motor = null;
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
        player1.monteur.gebruik();
        System.out.println(" ");

    }
        
    
    


    public void tegenstanders() {
        ferrari = new Ferrari(new Strateeg(null), new Monteur(new DureMomentsleutel(), new DureSlagmoersleutel()), new Coureur(), new W15(new Ferrari_065()), null);
        mclaren = new Mclaren(new Strateeg(null), new Monteur(new DureMomentsleutel(), new DureSlagmoersleutel()), new Coureur(), new SF_24(new Honda_RA620H()), null);

        System.out.println(" tegenstanders zijn: ");
        System.out.println("Team "+ ferrari.getTeam() + " met als auto "+ ferrari.auto.getAuto()+ " en met de motor " + ferrari.auto.m.getMotorType());
        System.out.println("Team "+ mclaren.getTeam() + " met als auto "+ mclaren.auto.getAuto()+ " en met de motor " + mclaren.auto.m.getMotorType());
        System.out.println(" ");
        
    }

    

    public void startRace() {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Druk op 1 om de race te starten");
        int nummer_ = myObj.nextInt();
        System.out.println(" ");
        if (nummer_ == 1) {
            System.out.println("De race start in 3, 2, 1, GO!");
            int teller = 0;
            int teller2 = 0;
            int teller3 = 0;
            
           
    
            for (int lap = 1; lap < 11; lap++) {
                Scanner myObj3 = new Scanner(System.in); 
               
                System.out.println(" ");
                System.out.println("Lap " + lap);
                System.out.println(" ");
                
                int rand2 = rand.nextInt(2);
                int rand3 = rand.nextInt(2);
    
    
                if (lap == 1) {
                         System.out.println(player1.getTeamname()+ " :");  
                         System.out.println(ferrari.getTeamname()+ " :");
                         System.out.println(mclaren.getTeamname()+ " :");
                         
                         
                
                
                           
    
                }else{
                    System.out.println("kies uit de volgende strategieen: 1. Undercut 2. Overcut 3. One stop strategie");
                    
                    int nummer = myObj3.nextInt();
                    System.out.println("Strategieen: ");
                    System.out.println(" ");
                    if (stop == false) {
                        if (nummer == 1) {
                            System.out.println(player1.getTeamname()+ " :"); 
                            player1.strateeg.zetStrategie(new Undercut());
                            snelheid += (Integer)player1.strateeg.gebruik();
                            stop = true;
                            teller = 0;
                            
                        }
                        if (nummer == 2) {
                            System.out.println(player1.getTeamname()+ " :"); 
                            player1.strateeg.zetStrategie(new Overcut());
                            snelheid2 += (Integer)player1.strateeg.gebruik();
                            snelheid3 += (Integer)player1.strateeg.gebruik();
                            
                        }
                        if (nummer == 3) {
                            System.out.println(player1.getTeamname()+ " :"); 
                            player1.strateeg.zetStrategie(new One_stop_strategie());
                            snelheid += (Integer)player1.strateeg.gebruik();
                            
                            
                        }
                    }else{
                        if (teller == 1) {
                            stop = false;
                        }
                    }
                    
                    if (stop2 == false) {
                        if (rand2 == 0) {
                            System.out.println(ferrari.getTeamname()+ " :");
                            ferrari.strateeg.zetStrategie(new Undercut());
                            snelheid2 += (Integer) ferrari.strateeg.gebruik();
                            stop2 = true;
                            teller2 = 0;
                            
                        }
                        if (rand2 == 1) {
                            System.out.println(ferrari.getTeamname()+ " :");
                            ferrari.strateeg.zetStrategie(new Overcut());
                            snelheid += (Integer)ferrari.strateeg.gebruik();
                            snelheid3 += (Integer)ferrari.strateeg.gebruik();
                            
                        }
                        if (rand2 == 2) {
                            System.out.println(ferrari.getTeamname()+ " :");
                            ferrari.strateeg.zetStrategie(new One_stop_strategie());
                            snelheid2 += (Integer)ferrari.strateeg.gebruik();
                            
                           
                        }
        
                    }else{
                        if (teller2 == 1) {
                            stop2 = false;
                        }
                    }
                    
                    if (stop3 == false) {
                        if (rand3 == 0) {
                            System.out.println(mclaren.getTeamname()+ " :");
                            mclaren.strateeg.zetStrategie(new Undercut());
                            snelheid3 += (Integer)mclaren.strateeg.gebruik();
                            stop3 = true;
                            teller3 = 0;
                            
                        }
                        if (rand3 == 1) {
                            System.out.println(mclaren.getTeamname()+ " :");
                            mclaren.strateeg.zetStrategie(new Overcut());
                            snelheid += (Integer)mclaren.strateeg.gebruik();
                            snelheid2 += (Integer)mclaren.strateeg.gebruik();
                            
                        }
                        if (rand3 == 2) {
                            System.out.println(mclaren.getTeamname()+ " :");
                            mclaren.strateeg.zetStrategie(new One_stop_strategie());
                            snelheid3 += (Integer)mclaren.strateeg.gebruik();
                            
                            
                        }
                        
                    }else{
                        if (teller3 == 1) {
                            stop3 = false;
                        }
                    }
                    
                   
                }
                System.out.println(" ");
                System.out.println("Snelheden: ");
                System.out.println(" ");
                System.out.println(player1.getTeamname()+ " :");  
                player1.auto.snelheid(snelheid);
                System.out.println(ferrari.getTeamname()+ " :");
                ferrari.auto.snelheid(snelheid2);
                System.out.println(mclaren.getTeamname()+ " :");
                mclaren.auto.snelheid(snelheid3);
    
                //print de standen uit in 1 printlijn
                System.out.println(" ");
                System.out.println("Standen: ");
                System.out.println(" ");
                System.out.println(player1.getTeamname()+ " : " + snelheid + " km/u");
                System.out.println(ferrari.getTeamname()+ " : " + snelheid2 + " km/u");
                System.out.println(mclaren.getTeamname()+ " : " + snelheid3 + " km/u");
                
    
                teller++;
                teller2++;
                teller3++;
                       
    
            }
    
            System.out.println(" ");
            System.out.println("Einde van de race");
            System.out.println(" ");
         
    
            
            
        }





 
    }

    public void winnaarBerekenen(){
        //als 1 iemand wint
        System.out.println(" ");
        if (snelheid > snelheid2 && snelheid > snelheid3){
            System.out.println(player1.getTeamname() + " heeft gewonnen! Hij ging met de snelheid van " + snelheid + " km/u over de finish");
            
        }
        if (snelheid2 > snelheid && snelheid2 > snelheid3){
            System.out.println(ferrari.getTeamname() + " heeft gewonnen! Hij ging met de snelheid van " + snelheid2 + " km/u over de finish");
            
        }
        if (snelheid3 > snelheid && snelheid3 > snelheid2){
            System.out.println(mclaren.getTeamname() + " heeft gewonnen! Hij ging met de snelheid van " + snelheid3 + " km/u over de finish");
           
        }
       
        //bij gelijk spel
        if (snelheid == snelheid2 && snelheid > snelheid3){
            System.out.println(player1.getTeamname() + " en " + ferrari.getTeamname() + " hebben gelijk gespeeld! ze gingen beide met een snelheid van " + snelheid + " km/u over de finish");
            
        }
        if (snelheid == snelheid3 && snelheid > snelheid2 ){
            System.out.println(player1.getTeamname() + " en " + mclaren.getTeamname() + " hebben gelijk gespeeld! ze gingen beide met een snelheid van " + snelheid + " km/u over de finish");
            
        }
        if (snelheid2 == snelheid3 && snelheid2 > snelheid){
            System.out.println(ferrari.getTeamname() + " en " + mclaren.getTeamname() + " hebben gelijk gespeeld! ze gingen beide met een snelheid van " + snelheid2 + " km/u over de finish");
            
        }

        //bij gelijk spel iedereen
        if (snelheid == snelheid2 && snelheid == snelheid3){
            System.out.println(player1.getTeamname() + " en " + ferrari.getTeamname() + " en " + mclaren.getTeamname() + " hebben gelijk gespeeld! ze gingen allemaal met een snelheid van " + snelheid + " km/u over de finish");
           
        }

        


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
