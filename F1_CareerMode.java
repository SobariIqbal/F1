import java.util.Random;
import java.util.concurrent.TimeUnit;
public class F1_CareerMode {
  
    private Team mercedes = null;
    private Team ferrari = null;
    private Team mclaren = null;
    private Team player1 = null;

    protected String naamspeler;

    Random rand = new Random();
    private int[] snelheden = {100, 110, 120, 130, 150, 160, 170, 180, 190, 200};

    protected int totaal = 0; 
    protected int totaal2 = 0;
    protected int totaal3 = 0;
    protected int totaal4 = 0;

  

    public F1_CareerMode(String naam, String teamnaam, int team, int auto, int motor) {
        naamspeler = naam;

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
        mercedes = new Mercedes(new Strateeg(), new Monteur(), new RaceEngineer(), new Coureur(), 1, null, 1);
        ferrari = new Ferrari(new Strateeg(), new Monteur(), new RaceEngineer(), new Coureur(), 2, null, 2);
        mclaren = new Mclaren(new Strateeg(), new Monteur(), new RaceEngineer(), new Coureur(), 3, null, 3);
    }

    

    public void startRace() {
        System.out.println("De race start in 3, 2, 1, GO!");

        for (int lap = 1; lap < 5; lap++) {
            System.out.println(" ");
            System.out.println("Lap " + lap);

            
                int random = rand.nextInt(10);
                int random2 = rand.nextInt(10);
                int random3 = rand.nextInt(10);
                // int random4 = rand.nextInt(10);

                System.out.println(player1.getTeamname()+ " :");  
                player1.auto.snelheid(snelheden[random]);
                System.out.println(ferrari.getTeamname()+ " :");
                ferrari.auto.snelheid(snelheden[random2]);
                System.out.println(mclaren.getTeamname()+ " :");
                mclaren.auto.snelheid(snelheden[random3]);
                // System.out.println(mercedes.getTeamname()+ " :");
                // mercedes.auto.snelheid(snelheden[random4]);

                totaal += snelheden[random];
                totaal2 += snelheden[random2];
                totaal3 += snelheden[random3];
                // totaal4 += snelheden[random4];
                // try {
                //     TimeUnit.SECONDS.sleep(3);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                // }

              

            


        }

        System.out.println(" ");
        System.out.println(player1.getTeamname() + " heeft " + totaal + " aantal punten");
        System.out.println(ferrari.getTeamname() + " heeft " + totaal2 + " aantal punten");
        System.out.println(mclaren.getTeamname() + " heeft " + totaal3 + " aantal punten");
        // System.out.println(mercedes.getTeamname() + " heeft " + totaal4 + " aantal punten");


 
    }

    public void winnaarBerekenen(){
        System.out.println(" ");
        if (totaal > totaal2 && totaal > totaal3 && totaal > totaal4){
            System.out.println(player1.getTeamname() + " heeft gewonnen!");
        }
        if (totaal2 > totaal && totaal2 > totaal3 && totaal2 > totaal4){
            System.out.println(ferrari.getTeamname() + " heeft gewonnen!");
        }
        if (totaal3 > totaal && totaal3 > totaal2 && totaal3 > totaal4){
            System.out.println(mclaren.getTeamname() + " heeft gewonnen!");
        }
        // if (totaal4 > totaal && totaal4 > totaal2 && totaal4 > totaal3){
        //     System.out.println(mercedes.getTeamname() + " heeft gewonnen!");
        // }

        //bij gelijk spel
        if (totaal == totaal2 && totaal > totaal3 && totaal > totaal4){
            System.out.println(player1.getTeamname() + " en " + ferrari.getTeamname() + " hebben gelijk gespeeld!");
        }
        if (totaal == totaal3 && totaal > totaal2 && totaal > totaal4){
            System.out.println(player1.getTeamname() + " en " + mclaren.getTeamname() + " hebben gelijk gespeeld!");
        }
        if (totaal2 == totaal3 && totaal2 > totaal && totaal2 > totaal4){
            System.out.println(ferrari.getTeamname() + " en " + mclaren.getTeamname() + " hebben gelijk gespeeld!");
        }

    }

        

    

    public void verstuurbericht() {

        
    }


        

}
