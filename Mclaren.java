public class Mclaren extends Team {

    public Mclaren(Staff strateeg, Staff monteur,Staff raceengineer,Staff coureur , Auto auto, String teamnaam) { 
        super(strateeg, monteur,raceengineer,coureur, auto, teamnaam);
    }

    public String getTeam(){
        return "Mclaren";
    }

   

    public String getTeamname(){
        if (teamname == null){
            return "Mclaren";
        }
        return teamname;
    }
}
