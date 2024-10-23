import java.util.Scanner;
public class F1_CareerMode {
  
    protected Team mercedes = null;
    protected Team ferrari = null;
    protected Team mclaren = null;
    protected Team player1 = null; 
    private String naam;

  

    public F1_CareerMode(String naam, String teamnaam, int team, int auto, int motor) {
        this.naam = naam;

        if (team == 1) {
            player1 = new Mercedes(new Strateeg(), new Monteur(), new RaceEngineer(), new Coureur(), auto, teamnaam, motor);
        }

        if (team == 2) {
            player1 = new Ferrari(new Strateeg(), new Monteur(), new RaceEngineer(), new Coureur(), auto, teamnaam, motor);
        }

        if (team == 3) {
            player1 = new Mclaren(new Strateeg(), new Monteur(), new RaceEngineer(), new Coureur(), auto, teamnaam, motor);
        }   

        
        System.out.println(naam + " heeft gekozen voor team " + player1.getTeam() + " met als auto "+ player1.auto.getAuto()+ " en met de motor " + player1.auto.m.getMotorType()+ " onder de teamnaam " + teamnaam);
        System.out.println(" "); 
        
    }
    


    public void tegenstanders() {
        ferrari = new Ferrari(new Strateeg(), new Monteur(), new RaceEngineer(), new Coureur(), 2, null, 2);
        mclaren = new Mclaren(new Strateeg(), new Monteur(), new RaceEngineer(), new Coureur(), 3, null, 3);
    }

    

    public void startRace() {
        System.out.println("De race start in 3, 2, 1, GO!");

        for (int lap = 1; lap < 30; lap++) {
            System.out.println("Lap " + lap);

            if (lap == 1) {
                System.out.println(player1.getTeamname()+ " :");  
                player1.auto.snelheid(90);
                System.out.println(ferrari.getTeamname()+ " :");
                ferrari.auto.snelheid(100);
                System.out.println(mclaren.getTeamname()+ " :");
                mclaren.auto.snelheid(120);
            }

            if (lap == 7) {
                System.out.println(player1.getTeamname()+ " :");
                player1.auto.snelheid(160);
            }


            if (lap == 10) {
                System.out.println(ferrari.getTeamname()+ " :");
                ferrari.auto.snelheid(150);
            }

            if (lap == 12) {
                System.out.println(mclaren.getTeamname()+ " :");
                mclaren.auto.snelheid(155);
            }

            if (lap == 15) {
                System.out.println(player1.getTeamname()+ " :");
                player1.auto.snelheid(130);
            }



         



            
           

            

            
        }

        

    }

    public void verstuurbericht() {

        
    }


        

}
