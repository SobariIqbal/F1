public class Mclaren extends Team {

    public Mclaren(Staff strateeg, Staff monteur,Staff raceengineer,Staff coureur , int auto, String teamnaam, int motor) { 
        super(strateeg, monteur,raceengineer,coureur, auto, teamnaam, motor);
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
