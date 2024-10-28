import java.util.Random;
import java.util.Scanner;
public class Race {

    Random rand = new Random();
    
    
    private int snelheid = 200; 
    private int snelheid2 = 200;
    private int snelheid3 = 200;
    

    protected boolean stop = false;
    protected boolean stop2 = false;
    protected boolean stop3 = false;
   

    protected void start(Team player1, Team ferrari, Team mclaren) {

        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Druk op 1 om de race te starten");
        int nummer_ = myObj.nextInt();
        System.out.println(" ");
        System.out.println(player1.getTeamname());
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

    public void winnaarBerekenen(Team player1, Team ferrari, Team mclaren){
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

}
