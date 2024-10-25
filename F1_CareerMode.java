import java.util.Random;
import java.util.Scanner;
public class F1_CareerMode {
  
    private Team mercedes = null;
    private Team ferrari = null;
    private Team mclaren = null;
    private Team player1 = null;

    protected String naamspeler;

    Random rand = new Random();
    
    
    protected int snelheid = 200; 
    protected int snelheid2 = 200;
    protected int snelheid3 = 200;
    protected int snelheid4 = 200;

    protected boolean stop = false;
    protected boolean stop2 = false;
    protected boolean stop3 = false;
    

  

    public F1_CareerMode(String naam, String teamnaam, int team, int auto, int motor) {
        naamspeler = naam;

        if (team == 1) {
            player1 = new Mercedes(new Strateeg(null), new Monteur(), new RaceEngineer(), new Coureur(), auto, teamnaam, motor);
        }

        if (team == 2) {
            player1 = new Ferrari(new Strateeg(null), new Monteur(), new RaceEngineer(), new Coureur(), auto, teamnaam, motor);
        }

        if (team == 3) {
            player1 = new Mclaren(new Strateeg(null), new Monteur(), new RaceEngineer(), new Coureur(), auto, teamnaam, motor);
        }   

        
        System.out.println(naam + " heeft gekozen voor team " + player1.getTeam() + " met als auto "+ player1.auto.getAuto()+ " en met de motor " + player1.auto.m.getMotorType()+ " onder de teamnaam " + teamnaam);
        System.out.println(" "); 
        
    }
    


    public void tegenstanders() {
        mercedes = new Mercedes(new Strateeg(null), new Monteur(), new RaceEngineer(), new Coureur(), 1, null, 1);
        ferrari = new Ferrari(new Strateeg(null), new Monteur(), new RaceEngineer(), new Coureur(), 2, null, 2);
        mclaren = new Mclaren(new Strateeg(null), new Monteur(), new RaceEngineer(), new Coureur(), 3, null, 3);
    }

    

    public void startRace() {
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
                        snelheid += player1.strateeg.gebruik();
                        stop = true;
                        teller = 0;
                        
                    }
                    if (nummer == 2) {
                        System.out.println(player1.getTeamname()+ " :"); 
                        player1.strateeg.zetStrategie(new Overcut());
                        snelheid2 += player1.strateeg.gebruik();
                        snelheid3 += player1.strateeg.gebruik();
                        
                    }
                    if (nummer == 3) {
                        System.out.println(player1.getTeamname()+ " :"); 
                        player1.strateeg.zetStrategie(new One_stop_strategie());
                        snelheid += player1.strateeg.gebruik();
                        
                        
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
                        snelheid2 += ferrari.strateeg.gebruik();
                        stop2 = true;
                        teller2 = 0;
                        
                    }
                    if (rand2 == 1) {
                        System.out.println(ferrari.getTeamname()+ " :");
                        ferrari.strateeg.zetStrategie(new Overcut());
                        snelheid += ferrari.strateeg.gebruik();
                        snelheid3 += ferrari.strateeg.gebruik();
                        
                    }
                    if (rand2 == 2) {
                        System.out.println(ferrari.getTeamname()+ " :");
                        ferrari.strateeg.zetStrategie(new One_stop_strategie());
                        snelheid2 += ferrari.strateeg.gebruik();
                        
                       
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
                        snelheid3 += mclaren.strateeg.gebruik();
                        stop3 = true;
                        teller3 = 0;
                        
                    }
                    if (rand3 == 1) {
                        System.out.println(mclaren.getTeamname()+ " :");
                        mclaren.strateeg.zetStrategie(new Overcut());
                        snelheid += mclaren.strateeg.gebruik();
                        snelheid2 += mclaren.strateeg.gebruik();
                        
                    }
                    if (rand3 == 2) {
                        System.out.println(mclaren.getTeamname()+ " :");
                        mclaren.strateeg.zetStrategie(new One_stop_strategie());
                        snelheid3 += mclaren.strateeg.gebruik();
                        
                        
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
        System.out.println(player1.getTeamname() + " heeft " + snelheid + " aantal punten");
        System.out.println(ferrari.getTeamname() + " heeft " + snelheid2 + " aantal punten");
        System.out.println(mclaren.getTeamname() + " heeft " + snelheid3 + " aantal punten");
        // System.out.println(mercedes.getTeamname() + " heeft " + totaal4 + " aantal punten");


 
    }

    public void winnaarBerekenen(){
        System.out.println(" ");
        if (snelheid > snelheid2 && snelheid > snelheid3 && snelheid > snelheid4){
            System.out.println(player1.getTeamname() + " heeft gewonnen! Hij ging met de snelheid van " + snelheid + " km/u over de finish");
        }
        if (snelheid2 > snelheid && snelheid2 > snelheid3 && snelheid2 > snelheid4){
            System.out.println(ferrari.getTeamname() + " heeft gewonnen! Hij ging met de snelheid van " + snelheid2 + " km/u over de finish");
        }
        if (snelheid3 > snelheid && snelheid3 > snelheid2 && snelheid3 > snelheid4){
            System.out.println(mclaren.getTeamname() + " heeft gewonnen! Hij ging met de snelheid van " + snelheid3 + " km/u over de finish");
        }
        // if (totaal4 > totaal && totaal4 > totaal2 && totaal4 > totaal3){
        //     System.out.println(mercedes.getTeamname() + " heeft gewonnen!");
        // }

        //bij gelijk spel
        if (snelheid == snelheid2 && snelheid > snelheid3 && snelheid > snelheid4){
            System.out.println(player1.getTeamname() + " en " + ferrari.getTeamname() + " hebben gelijk gespeeld! ze gingen beide met een snelheid van " + snelheid + " km/u over de finish");
        }
        if (snelheid == snelheid3 && snelheid > snelheid2 && snelheid > snelheid4){
            System.out.println(player1.getTeamname() + " en " + mclaren.getTeamname() + " hebben gelijk gespeeld! ze gingen beide met een snelheid van " + snelheid + " km/u over de finish");
        }
        if (snelheid2 == snelheid3 && snelheid2 > snelheid && snelheid2 > snelheid4){
            System.out.println(ferrari.getTeamname() + " en " + mclaren.getTeamname() + " hebben gelijk gespeeld! ze gingen beide met een snelheid van " + snelheid2 + " km/u over de finish");
        }

    }

        

    

    public void verstuurbericht() {

        
    }


        

}
