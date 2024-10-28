public class Ferrari extends Team{

    public Ferrari(Staff strateeg, Staff monteur,Staff raceengineer,Staff coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,raceengineer,coureur,auto,teamnaam);
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
