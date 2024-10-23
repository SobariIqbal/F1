public class Ferrari extends Team{

    public Ferrari(Staff strateeg, Staff monteur,Staff raceengineer,Staff coureur , int auto, String teamnaam, int motor) { 
        super(strateeg, monteur,raceengineer,coureur,auto,teamnaam,motor);
    }

    public String getTeam(){
        return "Ferrari";
    }

   

    public String getTeamname(){
        if (teamname == null){
            return "Ferrari";
        }
        return teamname;
    }
 

}
